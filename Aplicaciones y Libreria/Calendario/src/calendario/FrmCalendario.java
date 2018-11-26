
package calendario;

import java.awt.Color;


public class FrmCalendario extends javax.swing.JFrame {

   Control mControl;
   
    public FrmCalendario() {
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
        mControl = new Control();
        mControl.Suscribir();
        mControl.Enviar_Mensaje("ENCENDER");
        
    }

  public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCalendario().setVisible(true);
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSCalendar2 = new rojeru_san.componentes.RSCalendar();
        rSLabelFecha1 = new rojeru_san.componentes.RSLabelFecha();
        jLabel2 = new javax.swing.JLabel();
        BtnVerClima = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        rSCalendar2.setBackground(new java.awt.Color(0, 0, 0));
        rSCalendar2.setForeground(new java.awt.Color(255, 255, 255));
        rSCalendar2.setColorBackground(new java.awt.Color(51, 51, 51));
        rSCalendar2.setColorButtonHover(new java.awt.Color(102, 0, 102));
        rSCalendar2.setColorDiaActual(new java.awt.Color(102, 0, 102));
        rSCalendar2.setFgText(new java.awt.Color(255, 255, 255));
        rSCalendar2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rSCalendar2.setFuenteFilas(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rSCalendar2.setFuenteHead(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        rSLabelFecha1.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelFecha1.setFormato("dd MMMM yyyy");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FECHA ACTUAL ");

        BtnVerClima.setBackground(new java.awt.Color(51, 51, 51));
        BtnVerClima.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnVerClima.setForeground(new java.awt.Color(255, 255, 255));
        BtnVerClima.setText("VER CLIMA");
        BtnVerClima.setActionCommand("");
        BtnVerClima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerClimaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CALENDARIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnVerClima)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rSCalendar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)))
                .addGap(25, 25, 25)
                .addComponent(rSCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(BtnVerClima, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVerClimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerClimaActionPerformed
        mControl.Enviar_Mensaje("CLIMA");
        
    }//GEN-LAST:event_BtnVerClimaActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnVerClima;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private rojeru_san.componentes.RSCalendar rSCalendar2;
    private rojeru_san.componentes.RSLabelFecha rSLabelFecha1;
    // End of variables declaration//GEN-END:variables
}
