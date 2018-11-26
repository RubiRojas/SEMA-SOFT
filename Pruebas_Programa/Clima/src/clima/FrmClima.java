
package clima;

import com.sun.awt.AWTUtilities;
import javax.swing.ImageIcon;


public final class FrmClima extends javax.swing.JFrame {

    
    public FrmClima() {
        initComponents();
        setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        BtnSalir.setOpaque(false);
        BtnSalir.setContentAreaFilled(false);
        BtnSalir.setBorderPainted(false);
        Imagen(28);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        LblClima = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JButton();
        LblImagen = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblClima.setFont(new java.awt.Font("Arial", 1, 72)); // NOI18N
        getContentPane().add(LblClima, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, 60));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel3.setText("°C");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("Rio Grande, Zac.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 190, 40));

        BtnSalir.setBackground(new java.awt.Color(51, 51, 255));
        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir2.png"))); // NOI18N
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 40, 40));
        getContentPane().add(LblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 380, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    public void Imagen(Integer centigrados) {

        if (centigrados >= 28) {
            ImageIcon clima = new ImageIcon(getClass().getResource("/Imagenes/soleado_v3.png"));
            this.LblImagen.setIcon(clima);
            this.LblClima.setText("28");
        } else if (centigrados >= 20 && centigrados < 28) {
            ImageIcon clima = new ImageIcon(getClass().getResource("/Imagenes/parcialmente nublado_v3.png"));
            this.LblImagen.setIcon(clima);
            this.LblClima.setText("20");
        } else if ( centigrados <= 5 && centigrados > 20) {
            ImageIcon clima = new ImageIcon(getClass().getResource("/Imagenes/nublado_v3.png"));
            this.LblImagen.setIcon(clima);
            this.LblClima.setText("6");
        } else if (centigrados < 5) {
            ImageIcon clima = new ImageIcon(getClass().getResource("/Imagenes/nublado1_v3.png"));
            this.LblImagen.setIcon(clima);
            this.LblClima.setText("4");
        }
    }

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmClima().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel LblClima;
    private javax.swing.JLabel LblImagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
