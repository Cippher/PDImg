package jlabel;

import converte.GrayScale;
import converte.TransformacaoGeometrica;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

public class NewJFrameImg extends javax.swing.JFrame {

    public NewJFrameImg() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        labelImgOriginal = new javax.swing.JLabel();
        botaoConverter = new javax.swing.JButton();
        txtImagemOriginal = new javax.swing.JLabel();
        txtImagemEditada = new javax.swing.JLabel();
        labelMediana = new javax.swing.JLabel();
        labeMedSuperior = new javax.swing.JLabel();
        labelMedInferior = new javax.swing.JLabel();
        labelImgEditada = new javax.swing.JLabel();
        labelVariancia = new javax.swing.JLabel();
        botaoEspelharHorizontal = new javax.swing.JButton();
        botaoEspelharVertical = new javax.swing.JButton();
        anguloRotacao = new javax.swing.JSlider();
        labelRotacao = new javax.swing.JLabel();
        escala = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        offsetX = new javax.swing.JSpinner();
        offsetY = new javax.swing.JSpinner();
        labelOffSetX = new javax.swing.JLabel();
        labelOffSetY = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        arquivoAbrir = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ConverIMG");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.white);

        labelImgOriginal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botaoConverter.setText("Converter");
        botaoConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConverterActionPerformed(evt);
            }
        });

        txtImagemOriginal.setText("Imagem original");

        txtImagemEditada.setText("Imagem editada");

        labelMediana.setText("Mediana: ");

        labeMedSuperior.setText("Média da metade superior: ");

        labelMedInferior.setText("Moda da metade inferior: ");

        labelImgEditada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelVariancia.setText("Variância: ");

        botaoEspelharHorizontal.setText("Espelhar Horizontalmente");
        botaoEspelharHorizontal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEspelharHorizontalActionPerformed(evt);
            }
        });

        botaoEspelharVertical.setText("Espelhar Verticalmente");
        botaoEspelharVertical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEspelharVerticalActionPerformed(evt);
            }
        });

        anguloRotacao.setMaximum(360);
        anguloRotacao.setValue(0);
        anguloRotacao.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                anguloRotacaoStateChanged(evt);
            }
        });

        labelRotacao.setText("Rotacionar");

        escala.setMaximum(200);
        escala.setValue(100);
        escala.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                escalaStateChanged(evt);
            }
        });

        jLabel2.setText("Escala");

        offsetX.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                offsetXStateChanged(evt);
            }
        });

        offsetY.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                offsetYStateChanged(evt);
            }
        });

        labelOffSetX.setText("Offset X");

        labelOffSetY.setText("Offset Y");

        menuArquivo.setText("Arquivo");

        arquivoAbrir.setText("Abrir");
        arquivoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arquivoAbrirActionPerformed(evt);
            }
        });
        menuArquivo.add(arquivoAbrir);

        barraMenu.add(menuArquivo);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtImagemOriginal)
                    .addComponent(labelImgOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoConverter, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelMediana)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelVariancia))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoEspelharHorizontal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelRotacao))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoEspelharVertical, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(anguloRotacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(escala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtImagemEditada))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelMedInferior)
                                .addGap(110, 110, 110)
                                .addComponent(labeMedSuperior))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelOffSetX)
                                    .addComponent(labelOffSetY))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(offsetX, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(offsetY)))
                            .addComponent(labelImgEditada, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtImagemOriginal)
                    .addComponent(txtImagemEditada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelImgOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(labelImgEditada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVariancia)
                    .addComponent(labelMedInferior)
                    .addComponent(labelMediana)
                    .addComponent(labeMedSuperior)
                    .addComponent(botaoConverter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botaoEspelharHorizontal)
                                .addComponent(labelRotacao))
                            .addComponent(anguloRotacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botaoEspelharVertical)
                                .addComponent(jLabel2))
                            .addComponent(escala, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(offsetX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelOffSetX))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(offsetY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelOffSetY))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelImgOriginal.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    BufferedImage imagem_original = null;
    BufferedImage imagem_editada = null;
    
    GrayScale escala_cinza = new GrayScale();
    TransformacaoGeometrica transfoma = new TransformacaoGeometrica();
    private void botaoConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConverterActionPerformed
        imagem_editada = escala_cinza.convert(imagem_original);
        labelImgEditada.setIcon(new ImageIcon(imagem_editada.getScaledInstance(550, 394, Image.SCALE_DEFAULT)));
        calculos();
    }//GEN-LAST:event_botaoConverterActionPerformed

    private void arquivoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arquivoAbrirActionPerformed
        imagem_original = escala_cinza.loadImg();
        //Copia a imagem
        imagem_editada = escala_cinza.copiaImagem(imagem_original);
        //Sets dos labels com escalas
        labelImgOriginal.setIcon(new ImageIcon(imagem_original.getScaledInstance(550, 394, Image.SCALE_DEFAULT)));
        labelImgEditada.setIcon(new ImageIcon(imagem_editada.getScaledInstance(550, 394, Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_arquivoAbrirActionPerformed

    private void botaoEspelharHorizontalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEspelharHorizontalActionPerformed
        imagem_editada = transfoma.espelha_horizontal(imagem_original);
        labelImgEditada.setIcon(new ImageIcon(imagem_editada.getScaledInstance(550, 394, Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_botaoEspelharHorizontalActionPerformed

    private void botaoEspelharVerticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEspelharVerticalActionPerformed
        imagem_editada = transfoma.espelha_vertical(imagem_original);
        labelImgEditada.setIcon(new ImageIcon(imagem_editada.getScaledInstance(550, 394, Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_botaoEspelharVerticalActionPerformed

    private void anguloRotacaoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_anguloRotacaoStateChanged
        imagem_editada = transfoma.rotaciona_imagem(imagem_original, anguloRotacao.getValue());
        labelImgEditada.setIcon(new ImageIcon(imagem_editada.getScaledInstance(550, 394, Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_anguloRotacaoStateChanged

    private void escalaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_escalaStateChanged
        imagem_editada = transfoma.redimensiona_imagem(imagem_original, escala.getValue());
        labelImgEditada.setIcon(new ImageIcon(imagem_editada.getScaledInstance(550, 394, Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_escalaStateChanged

    private void offsetXStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_offsetXStateChanged
        imagem_editada = transfoma.move_imagem(imagem_original, (int) offsetX.getValue(), (int) offsetY.getValue());
        labelImgEditada.setIcon(new ImageIcon(imagem_editada.getScaledInstance(550, 394, Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_offsetXStateChanged

    private void offsetYStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_offsetYStateChanged
        imagem_editada = transfoma.move_imagem(imagem_original, (int) offsetX.getValue(), (int) offsetY.getValue());
        labelImgEditada.setIcon(new ImageIcon(imagem_editada.getScaledInstance(550, 394, Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_offsetYStateChanged
    private void calculos(){
        //Cálculos
        labelMedInferior.setText("Moda da metade inferior: " + Integer.toString(escala_cinza.getModa()));
        labeMedSuperior.setText("Média da metade superior: " + Double.toString(escala_cinza.getMedia()));
        escala_cinza.criaGraficoHistograma();
        labelMediana.setText("Mediana: " + Integer.toString(escala_cinza.getMediana()));
        labelVariancia.setText("Variância: " + Integer.toString(escala_cinza.getVariancia()));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrameImg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrameImg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrameImg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrameImg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrameImg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider anguloRotacao;
    private javax.swing.JMenuItem arquivoAbrir;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton botaoConverter;
    private javax.swing.JButton botaoEspelharHorizontal;
    private javax.swing.JButton botaoEspelharVertical;
    private javax.swing.JSlider escala;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labeMedSuperior;
    private javax.swing.JLabel labelImgEditada;
    private javax.swing.JLabel labelImgOriginal;
    private javax.swing.JLabel labelMedInferior;
    private javax.swing.JLabel labelMediana;
    private javax.swing.JLabel labelOffSetX;
    private javax.swing.JLabel labelOffSetY;
    private javax.swing.JLabel labelRotacao;
    private javax.swing.JLabel labelVariancia;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JSpinner offsetX;
    private javax.swing.JSpinner offsetY;
    private javax.swing.JLabel txtImagemEditada;
    private javax.swing.JLabel txtImagemOriginal;
    // End of variables declaration//GEN-END:variables
}
