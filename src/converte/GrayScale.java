package converte;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
//import org.jfree.ui.RefineryUtilities;

public class GrayScale {
    int medianaCount;
    int moda;
    int repetModa;
    int mediana;
    double med = 0;
    //0:1-51 1:52-103 2:104-155 3:156-207 4:208-255
    int histograma[] = new int[256];

    public BufferedImage loadImg() {
        BufferedImage img = null;
        String filePath = new String();

        final JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(fc);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            filePath = fc.getSelectedFile().getAbsolutePath();
        }

        try {
            img = ImageIO.read(new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }

    public BufferedImage convert(BufferedImage img) {
        int largura = img.getWidth();
        int altura = img.getHeight();
        
        int[] mediana = new int[largura * altura];
        
        int count = 0;
        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < largura; x++) {
                int pixel = img.getRGB(x, y);

                int alpha = (pixel >> 24) & 0xff;
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = pixel & 0xff;

                int media = (red + green + blue) / 3;
                
                mediana[count] = media;
                setMediana(mediana[count]);

                pixel = (alpha << 24) | (media << 16) | (media << 8) | media;
                
                if (y > altura / 2) {
                    histograma[media]++;
                } else {
                    med = med + media;
                }
                count++;
                img.setRGB(x, y, pixel);                
            }   
        } 
        shellSort(mediana);
        System.out.println(mediana[count / 2]);
        
        //soma de todos os pixeis dividido por eles
        med = med / ((largura * altura) / 2);
        System.out.println(med);
        
        medianaCount = mediana[count / 2];
        
        
        moda = 0;
        for(int i=0; i<255; i++){
            if (histograma[i] > histograma[moda]){
                moda = i;
                //System.out.println(histograma[i]);
            }
        }
       
        return img;
    }

    public void criaGraficoHistograma() {
        ///
    }

    public static void shellSort(int[] nums) {
        int h = 1;
        int n = nums.length;
        while (h < n) {
            h = h * 3 + 1;
        }
        h = h / 3;
        int c, j;

        while (h > 0) {
            for (int i = h; i < n; i++) {
                c = nums[i];
                j = i;
                while (j >= h && nums[j - h] > c) {
                    nums[j] = nums[j - h];
                    j = j - h;
                }
                nums[j] = c;
            }
            h = h / 2;
        }
    }


    public int getModa(){
        return moda;
    }
    
    public int getMediana() {
        return medianaCount;
    }
    
    public void setMediana(int mediana) {
        this.mediana = mediana;
    }
    public double getMedia(){
        return med;
    }
}
