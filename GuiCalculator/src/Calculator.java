/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.event.KeyAdapter; 
import java.awt.event.KeyEvent;

public class Calculator extends javax.swing.JFrame {

    //setting the value and variable
    String bt0 = "0";
    String bt1 = "1";
    String bt2 = "2";
    String bt3 = "3";
    String bt4 = "4";
    String bt5 = "5";
    String bt6 = "6";
    String bt7 = "7";
    String bt8 = "8";
    String bt9 = "9";
    String btMinus ="-" ;
    String btAdd ="+" ;
    String btBahagi ="/" ;
    String btDarab ="*" ;
    String soalan, jawapan;
    
    
    public Calculator() {//Creates the form called CAlculator
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        answer = new javax.swing.JTextField();
        tajuk = new javax.swing.JLabel();
        menusimbol = new javax.swing.JLabel();
        b4 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        add = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        Bahagi = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        Question = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(51, 51, 51));

        answer.setEditable(false);
        answer.setBackground(new java.awt.Color(51, 51, 51));
        answer.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        answer.setForeground(new java.awt.Color(255, 255, 255));
        answer.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        answer.setBorder(null);
        answer.setCaretColor(new java.awt.Color(255, 255, 255));

        tajuk.setBackground(new java.awt.Color(51, 51, 51));
        tajuk.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tajuk.setForeground(new java.awt.Color(255, 255, 255));
        tajuk.setText("Standard Calculator");

        menusimbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-menu-30.png"))); // NOI18N

        b4.setBackground(new java.awt.Color(102, 102, 102));
        b4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b4.setForeground(new java.awt.Color(255, 255, 255));
        b4.setText("4");
        b4.setBorder(null);
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b4MouseClicked(evt);
            }
        });

        b1.setBackground(new java.awt.Color(102, 102, 102));
        b1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("1");
        b1.setBorder(null);
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });

        b2.setBackground(new java.awt.Color(102, 102, 102));
        b2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("2");
        b2.setBorder(null);
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });

        b3.setBackground(new java.awt.Color(102, 102, 102));
        b3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.setText("3");
        b3.setBorder(null);
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3MouseClicked(evt);
            }
        });

        b5.setBackground(new java.awt.Color(102, 102, 102));
        b5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b5.setForeground(new java.awt.Color(255, 255, 255));
        b5.setText("5");
        b5.setBorder(null);
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b5MouseClicked(evt);
            }
        });

        b6.setBackground(new java.awt.Color(102, 102, 102));
        b6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b6.setForeground(new java.awt.Color(255, 255, 255));
        b6.setText("6");
        b6.setBorder(null);
        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b6MouseClicked(evt);
            }
        });

        b9.setBackground(new java.awt.Color(102, 102, 102));
        b9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b9.setForeground(new java.awt.Color(255, 255, 255));
        b9.setText("9");
        b9.setBorder(null);
        b9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b9MouseClicked(evt);
            }
        });

        b7.setBackground(new java.awt.Color(102, 102, 102));
        b7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b7.setForeground(new java.awt.Color(255, 255, 255));
        b7.setText("7");
        b7.setBorder(null);
        b7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b7MouseClicked(evt);
            }
        });

        b8.setBackground(new java.awt.Color(102, 102, 102));
        b8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b8.setForeground(new java.awt.Color(255, 255, 255));
        b8.setText("8");
        b8.setBorder(null);
        b8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b8MouseClicked(evt);
            }
        });

        add.setBackground(new java.awt.Color(102, 102, 102));
        add.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("+");
        add.setBorder(null);
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });

        minus.setBackground(new java.awt.Color(102, 102, 102));
        minus.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        minus.setForeground(new java.awt.Color(255, 255, 255));
        minus.setText("-");
        minus.setBorder(null);
        minus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minusMouseClicked(evt);
            }
        });

        Bahagi.setBackground(new java.awt.Color(102, 102, 102));
        Bahagi.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Bahagi.setForeground(new java.awt.Color(255, 255, 255));
        Bahagi.setText("/");
        Bahagi.setBorder(null);
        Bahagi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BahagiMouseClicked(evt);
            }
        });

        b0.setBackground(new java.awt.Color(102, 102, 102));
        b0.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b0.setForeground(new java.awt.Color(255, 255, 255));
        b0.setText("0");
        b0.setBorder(null);
        b0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b0MouseClicked(evt);
            }
        });

        reset.setBackground(new java.awt.Color(102, 102, 102));
        reset.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("c");
        reset.setBorder(null);
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });

        equal.setBackground(new java.awt.Color(102, 102, 102));
        equal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        equal.setForeground(new java.awt.Color(255, 255, 255));
        equal.setText("=");
        equal.setBorder(null);
        equal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equalMouseClicked(evt);
            }
        });

        multiply.setBackground(new java.awt.Color(102, 102, 102));
        multiply.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        multiply.setForeground(new java.awt.Color(255, 255, 255));
        multiply.setText("*");
        multiply.setBorder(null);
        multiply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiplyMouseClicked(evt);
            }
        });

        Question.setEditable(false);
        Question.setBackground(new java.awt.Color(51, 51, 51));
        Question.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Question.setForeground(new java.awt.Color(255, 255, 255));
        Question.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Question.setBorder(null);
        Question.setCaretColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(answer, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(menusimbol, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(tajuk, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BackgroundLayout.createSequentialGroup()
                                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(BackgroundLayout.createSequentialGroup()
                                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(BackgroundLayout.createSequentialGroup()
                                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Bahagi, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(Question, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tajuk)
                    .addComponent(menusimbol))
                .addGap(31, 31, 31)
                .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(answer, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Bahagi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        // TODO add your handling code here:
        Question.setText("");
    }//GEN-LAST:event_resetMouseClicked

    private void b0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b0MouseClicked
        // TODO add your handling code here:
        soalan = Question.getText();
       Question.setText(soalan + bt0);

    }//GEN-LAST:event_b0MouseClicked

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        // TODO add your handling code here:
        soalan = Question.getText();
        Question.setText(soalan + bt1);
    }//GEN-LAST:event_b1MouseClicked

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
        // TODO add your handling code here:
        soalan = Question.getText();
        Question.setText(soalan + bt2);
    }//GEN-LAST:event_b2MouseClicked

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseClicked
        // TODO add your handling code here:
        soalan = Question.getText();
        Question.setText(soalan + bt3);
    }//GEN-LAST:event_b3MouseClicked

    private void minusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMouseClicked
        // TODO add your handling code here:
        soalan = Question.getText();
        Question.setText(soalan + btMinus);
    }//GEN-LAST:event_minusMouseClicked

    private void b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseClicked
        // TODO add your handling code here:
        soalan = Question.getText();
        Question.setText(soalan+ bt4);
    }//GEN-LAST:event_b4MouseClicked

    private void b5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseClicked
        // TODO add your handling code here:
        soalan = Question.getText();
        Question.setText(soalan + bt5);
    }//GEN-LAST:event_b5MouseClicked

    private void b6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseClicked
        // TODO add your handling code here:
        soalan = Question.getText();
        Question.setText(soalan + bt6);
    }//GEN-LAST:event_b6MouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // TODO add your handling code here:
        soalan = Question.getText();
        Question.setText(soalan + btAdd);
    }//GEN-LAST:event_addMouseClicked

    private void multiplyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplyMouseClicked
        // TODO add your handling code here:
        soalan = Question.getText();
        Question.setText(soalan + btDarab);
    }//GEN-LAST:event_multiplyMouseClicked

    private void b7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b7MouseClicked
        // TODO add your handling code here:
        soalan = Question.getText();
        Question.setText(soalan + bt7);
    }//GEN-LAST:event_b7MouseClicked

    private void b8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b8MouseClicked
        // TODO add your handling code here:
        soalan = Question.getText();
        Question.setText(soalan + bt8);
    }//GEN-LAST:event_b8MouseClicked

    private void b9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b9MouseClicked
        // TODO add your handling code here:
        soalan = Question.getText();
        Question.setText(soalan + bt9);
    }//GEN-LAST:event_b9MouseClicked

    private void BahagiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BahagiMouseClicked
        // TODO add your handling code here:
        soalan = Question.getText();
        Question.setText(soalan + btBahagi);
    }//GEN-LAST:event_BahagiMouseClicked

    private void equalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalMouseClicked
        // TODO add your handling code here:
        calculateResult();        
    }//GEN-LAST:event_equalMouseClicked

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Calculator().setVisible(true);                
            }
        });
        
        Calculator Calc = new Calculator();
        
        Calc.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                Calculator calc = new Calculator();
          
                int keyCode = e.getKeyCode();
      
                if (keyCode == KeyEvent.VK_0) {
                    calc.soalan = calc.Question.getText();
                    calc.Question.setText(calc.soalan + calc.bt0);
                }
                else if (keyCode == KeyEvent.VK_1) {
                    calc.soalan = calc.Question.getText();
                    calc.Question.setText(calc.soalan + calc.bt1);
                }
                else if (keyCode == KeyEvent.VK_2) {
                    calc.soalan = calc.Question.getText();
                    calc.Question.setText(calc.soalan + calc.bt2); 
                }
                else if (keyCode == KeyEvent.VK_3) {
                   calc.soalan = calc.Question.getText();
                   calc.Question.setText(calc.soalan + calc.bt3);
                }
            }
        });
        
    }
    
    public void calculateResult(){
        //get the current question string entered
         String ayatsoalan = Question.getText();
         
         //Split the string if there is operator
         String[] dahsplit = ayatsoalan.split("[\\+\\-\\*\\/]");
        
        if (dahsplit.length != 2){
            Question.setText("Error");
            
        }
        double num1 = Double.parseDouble(dahsplit[0]);
        double num2 = Double.parseDouble(dahsplit[1]);
        double result = 0;
        
        //Determine the operator
        if(ayatsoalan.contains("+")){
            result = num1 + num2;
        }
        else if(ayatsoalan.contains("-")){
            result = num1 - num2;
        }
        else if(ayatsoalan.contains("/")){
            if (num2 == 0) {
                // Handle division by zero here (e.g., display an error message)
                Question.setText("Error: Division by zero");
             }
            else{
            result = num1 / num2;
            }
        }
        else if(ayatsoalan.contains("*")){             
            result = num1 * num2; 
        }
        answer.setText(""+result);
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton Bahagi;
    private javax.swing.JTextField Question;
    private javax.swing.JButton add;
    private javax.swing.JTextField answer;
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton equal;
    private javax.swing.JLabel menusimbol;
    private javax.swing.JButton minus;
    private javax.swing.JButton multiply;
    private javax.swing.JButton reset;
    private javax.swing.JLabel tajuk;
    // End of variables declaration//GEN-END:variables
}
