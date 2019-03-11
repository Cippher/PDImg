package converte;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

/**
 *
 * @author 0196611
 */
public class GrayScale {

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
        
        double med = 0;
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
                
                pixel = (alpha << 24) | (media << 16) | (media << 8) | media;
                
                med = med + media;
                count++;

                img.setRGB(x, y, pixel);
            }
        }
        //ShakerSort
        for (int i = 0; i < mediana.length/2; i++) {
            boolean swapped = false;
            for (int j = i; j < mediana.length - i - 1; j++) {
                if (mediana[j] < mediana[j+1]) {
                    int tmp = mediana[j];
                    mediana[j] = mediana[j+1];
                    mediana[j+1] = tmp;
                    swapped = true;
                }
            }
            for (int j = mediana.length - 2 - i; j > i; j--) {
                if (mediana[j] > mediana[j-1]) {
                    int tmp = mediana[j];
                    mediana[j] = mediana[j-1];
                    mediana[j-1] = tmp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }        
        System.out.println(mediana[count / 2]);
        
        med = med / count;
        System.out.println(med);
        return img;
    }
}
