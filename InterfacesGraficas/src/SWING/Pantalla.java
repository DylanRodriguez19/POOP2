package SWING;


public class Pantalla extends javax.swing.JPanel {

    public Pantalla() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SWING = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Entrada1 = new javax.swing.JTextArea();
        boton1 = new javax.swing.JButton();
        Texto1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Texto2 = new javax.swing.JTextArea();

        Entrada1.setColumns(20);
        Entrada1.setRows(5);
        jScrollPane2.setViewportView(Entrada1);

        boton1.setText("Copiar el Texto");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        Texto1.setText("Ingrese un numero");

        Texto2.setColumns(20);
        Texto2.setRows(5);
        jScrollPane1.setViewportView(Texto2);

        javax.swing.GroupLayout SWINGLayout = new javax.swing.GroupLayout(SWING);
        SWING.setLayout(SWINGLayout);
        SWINGLayout.setHorizontalGroup(
            SWINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SWINGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SWINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Texto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        SWINGLayout.setVerticalGroup(
            SWINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SWINGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SWING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SWING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
       String Texto = Entrada1.getText();
       Texto2.setText(Texto);
    }//GEN-LAST:event_boton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Entrada1;
    private javax.swing.JPanel SWING;
    private javax.swing.JTextField Texto1;
    private javax.swing.JTextArea Texto2;
    private javax.swing.JButton boton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
