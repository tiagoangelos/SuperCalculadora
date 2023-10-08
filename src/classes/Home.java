package classes;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {
    
    public Home() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        lblTitle = new javax.swing.JLabel();
        lblInstruction = new javax.swing.JLabel();
        jValue = new javax.swing.JSpinner();
        lblIcon = new javax.swing.JLabel();
        lblTxt1 = new javax.swing.JLabel();
        lblTxt2 = new javax.swing.JLabel();
        lblTxt3 = new javax.swing.JLabel();
        lblTxt4 = new javax.swing.JLabel();
        lblTxt5 = new javax.swing.JLabel();
        btnCalc = new javax.swing.JButton();
        lblRestDiv = new javax.swing.JLabel();
        lblHighCubic = new javax.swing.JLabel();
        lblRootSquare = new javax.swing.JLabel();
        lblRootCubic = new javax.swing.JLabel();
        lblAbsolutValue = new javax.swing.JLabel();
        lblTxt6 = new javax.swing.JLabel();
        lblEvenOrOdd = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuAbout = new javax.swing.JMenu();
        menuHelp = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenu();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Super Calculadora");
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 51, 51));
        lblTitle.setText("Super Calculadora");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblInstruction.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInstruction.setForeground(new java.awt.Color(51, 51, 51));
        lblInstruction.setText("Informe Um Valor:");

        jValue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Calculator-icon.png"))); // NOI18N

        lblTxt1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTxt1.setText("Resto da Divisão Por 2:");

        lblTxt2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTxt2.setText("Elevado ao Cubo:");

        lblTxt3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTxt3.setText("Raiz Quadrada:");

        lblTxt4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTxt4.setText("Raiz Cúbica:");

        lblTxt5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTxt5.setText("Valor Absoluto:");

        btnCalc.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnCalc.setForeground(new java.awt.Color(0, 204, 204));
        btnCalc.setText("Calcular");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        lblRestDiv.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblRestDiv.setForeground(new java.awt.Color(255, 51, 51));
        lblRestDiv.setText("0");

        lblHighCubic.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblHighCubic.setForeground(new java.awt.Color(255, 51, 51));
        lblHighCubic.setText("0");

        lblRootSquare.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblRootSquare.setForeground(new java.awt.Color(255, 51, 51));
        lblRootSquare.setText("0");

        lblRootCubic.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblRootCubic.setForeground(new java.awt.Color(255, 51, 51));
        lblRootCubic.setText("0");

        lblAbsolutValue.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblAbsolutValue.setForeground(new java.awt.Color(255, 51, 51));
        lblAbsolutValue.setText("0");

        lblTxt6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTxt6.setText("Par Ou Impar:");

        lblEvenOrOdd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblEvenOrOdd.setForeground(new java.awt.Color(255, 51, 51));
        lblEvenOrOdd.setText("0");

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 51, 51));
        btnExit.setText("Sair");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        menuAbout.setText("Sobre");
        menuAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAboutMouseClicked(evt);
            }
        });
        menuBar.add(menuAbout);

        menuHelp.setText("Ajuda");
        menuHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuHelpMouseClicked(evt);
            }
        });
        menuBar.add(menuHelp);

        menuExit.setText("Sair");
        menuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuExitMouseClicked(evt);
            }
        });
        menuBar.add(menuExit);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblHighCubic, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTxt1)
                                        .addComponent(lblTxt2)
                                        .addComponent(lblTxt3)
                                        .addComponent(lblTxt4)
                                        .addComponent(lblTxt5)
                                        .addComponent(lblTxt6))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(lblRestDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblRootSquare, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblRootCubic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblAbsolutValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblEvenOrOdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnCalc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblInstruction, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jValue, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(138, 138, 138)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitle)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblInstruction)
                            .addComponent(jValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTxt1)
                            .addComponent(lblRestDiv))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTxt2)
                            .addComponent(lblHighCubic))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTxt3)
                            .addComponent(lblRootSquare))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTxt4)
                            .addComponent(lblRootCubic))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTxt5)
                            .addComponent(lblAbsolutValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEvenOrOdd)
                            .addComponent(lblTxt6)))
                    .addComponent(lblIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        int value = (int) jValue.getValue();
        
        int restDiv = value % 2;
        double HighCubic = (double) Math.pow(value, 3);
        double rootSquare = (double) Math.sqrt(value);
        double rootCubic = (double) Math.cbrt(value);
        double absolutValue = (double) Math.abs(value);
        
        lblRestDiv.setText(Double.toString(restDiv));     
        lblHighCubic.setText(String.format("%.2f", HighCubic));
        lblRootSquare.setText(String.format("%.2f", rootSquare));
        lblRootCubic.setText(String.format("%.2f", rootCubic));
        lblAbsolutValue.setText(String.format("%.2f", absolutValue));
        
        if(restDiv == 0){
            lblEvenOrOdd.setText("Par!");
        }else{
            lblEvenOrOdd.setText("Impar!");
        }
    }//GEN-LAST:event_btnCalcActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void menuAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAboutMouseClicked
        JOptionPane.showMessageDialog(null,
                "Sobre\n\n"
              + "Super Calculadora é um simples projeto para\n"
              + "fornecer o máximo de informação matematica\n"
              + "sobre um numero informado."
              , "Sobre", JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_menuAboutMouseClicked

    private void menuHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuHelpMouseClicked
        JOptionPane.showMessageDialog(null,
                "Ajuda\n\n"
              + "Para usar é bem simples informe um numero qualquer\n"
              + "apos isso basta apenas clicar em 'Calcular' e os\n"
              + "resultados serão exibidos abaixo."
              , "Ajuda", JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_menuHelpMouseClicked

    private void menuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menuExitMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnExit;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JSpinner jValue;
    private javax.swing.JLabel lblAbsolutValue;
    private javax.swing.JLabel lblEvenOrOdd;
    private javax.swing.JLabel lblHighCubic;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblInstruction;
    private javax.swing.JLabel lblRestDiv;
    private javax.swing.JLabel lblRootCubic;
    private javax.swing.JLabel lblRootSquare;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTxt1;
    private javax.swing.JLabel lblTxt2;
    private javax.swing.JLabel lblTxt3;
    private javax.swing.JLabel lblTxt4;
    private javax.swing.JLabel lblTxt5;
    private javax.swing.JLabel lblTxt6;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuExit;
    private javax.swing.JMenu menuHelp;
    // End of variables declaration//GEN-END:variables
}