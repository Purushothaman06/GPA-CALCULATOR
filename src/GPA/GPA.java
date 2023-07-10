package GPA;

import GPA.AERO.*;
import GPA.BME.*;
import GPA.CME.*;
import GPA.CSE.*;
import GPA.CVL.*;
import GPA.ECE.*;
import GPA.EEE.*;
import GPA.IT.*;
import GPA.MAE.*;
import GPA.MECH.*;
import GPA.MHT.*;

import static GPA.Main.Dept;
import static GPA.Main.Reg;

/**
 *
 * @author Purushothaman
 */
public class GPA extends javax.swing.JFrame {

    javax.swing.JFrame GPA = new javax.swing.JFrame();

    /**
     * Creates new form GPA
     */
    public GPA() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */

    public void initComponents() {

        javax.swing.JLabel jLabelGPA = new javax.swing.JLabel();
        jButtonCalcSem1GPA = new javax.swing.JButton();
        jButtonCalcSem2GPA = new javax.swing.JButton();
        jButtonCalcSem3GPA = new javax.swing.JButton();
        jButtonCalcSem4GPA = new javax.swing.JButton();
        jButtonCalcSem5GPA = new javax.swing.JButton();
        jButtonCalcSem6GPA = new javax.swing.JButton();
        jButtonCalcSem7GPA = new javax.swing.JButton();
        jButtonCalcSem8GPA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setAutoRequestFocus(false);

        jLabelGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPA.setText("GPA CALCULATOR");

        jButtonCalcSem1GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 20));
        jButtonCalcSem1GPA.setText("CALCULATE SEM 1 GPA");
        jButtonCalcSem1GPA.addActionListener(this::jButtonCalcSem1GPAActionPerformed);

        jButtonCalcSem2GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 20));
        jButtonCalcSem2GPA.setText("CALCULATE SEM 2 GPA");
        jButtonCalcSem2GPA.addActionListener(this::jButtonCalcSem2GPAActionPerformed);

        jButtonCalcSem3GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 20));
        jButtonCalcSem3GPA.setText("CALCULATE SEM 3 GPA");
        jButtonCalcSem3GPA.addActionListener(this::jButtonCalcSem3GPAActionPerformed);

        jButtonCalcSem4GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 20));
        jButtonCalcSem4GPA.setText("CALCULATE SEM 4 GPA");
        jButtonCalcSem4GPA.addActionListener(this::jButtonCalcSem4GPAActionPerformed);

        jButtonCalcSem5GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 20));
        jButtonCalcSem5GPA.setText("CALCULATE SEM 5 GPA");
        jButtonCalcSem5GPA.addActionListener(this::jButtonCalcSem5GPAActionPerformed);

        jButtonCalcSem6GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 20));
        jButtonCalcSem6GPA.setText("CALCULATE SEM 6 GPA");
        jButtonCalcSem6GPA.addActionListener(this::jButtonCalcSem6GPAActionPerformed);

        jButtonCalcSem7GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 20));
        jButtonCalcSem7GPA.setText("CALCULATE SEM 7 GPA");
        jButtonCalcSem7GPA.addActionListener(this::jButtonCalcSem7GPAActionPerformed);

        jButtonCalcSem8GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 20));
        jButtonCalcSem8GPA.setText("CALCULATE SEM 8 GPA");
        jButtonCalcSem8GPA.addActionListener(this::jButtonCalcSem8GPAActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonCalcSem1GPA)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jButtonCalcSem3GPA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonCalcSem4GPA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jButtonCalcSem2GPA))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButtonCalcSem5GPA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonCalcSem7GPA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonCalcSem8GPA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonCalcSem6GPA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(88, 88, 88))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(259, 259, 259)
                                .addComponent(jLabelGPA)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabelGPA)
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonCalcSem1GPA)
                                        .addComponent(jButtonCalcSem5GPA))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonCalcSem2GPA)
                                        .addComponent(jButtonCalcSem6GPA))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonCalcSem3GPA)
                                        .addComponent(jButtonCalcSem7GPA))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonCalcSem4GPA)
                                        .addComponent(jButtonCalcSem8GPA))
                                .addContainerGap(77, Short.MAX_VALUE))
        );
        pack();
    }

    private void jButtonCalcSem1GPAActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try {

            if (evt.getSource() == jButtonCalcSem1GPA) {
                if (Reg == 2 && Dept == 1) {
                    SEM1 s1 = new SEM1();
                    s1.setVisible(true);
                    s1.setTitle("Anna University Regulation - 2017 (AERO) ");
                } else if (Reg == 2 && Dept == 2) {
                    SEM1 s1 = new SEM1();
                    s1.setVisible(true);
                    s1.setTitle("Anna University Regulation - 2017 (BME) ");
                } else if (Reg == 2 && Dept == 3) {
                    SEM1 s1 = new SEM1();
                    s1.setVisible(true);
                    s1.setTitle("Anna University Regulation - 2017 (CME) ");
                } else if (Reg == 2 && Dept == 4) {
                    SEM1 s1 = new SEM1();
                    s1.setVisible(true);
                    s1.setTitle("Anna University Regulation - 2017 (CSE) ");
                } else if (Reg == 2 && Dept == 5) {
                    SEM1 s1 = new SEM1();
                    s1.setVisible(true);
                    s1.setTitle("Anna University Regulation - 2017 (CVL) ");
                } else if (Reg == 2 && Dept == 6) {
                    SEM1 s1 = new SEM1();
                    s1.setVisible(true);
                    s1.setTitle("Anna University Regulation - 2017 (ECE) ");
                } else if (Reg == 2 && Dept == 7) {
                    SEM1 s1 = new SEM1();
                    s1.setVisible(true);
                    s1.setTitle("Anna University Regulation - 2017 (EEE) ");
                } else if (Reg == 2 && Dept == 8) {
                    SEM1 s1 = new SEM1();
                    s1.setVisible(true);
                    s1.setTitle("Anna University Regulation - 2017 (MAE) ");
                } else if (Reg == 2 && Dept == 9) {
                    SEM1 s1 = new SEM1();
                    s1.setVisible(true);
                    s1.setTitle("Anna University Regulation - 2017 (MECH) ");
                } else if (Reg == 2 && Dept == 10) {
                    SEM1 s1 = new SEM1();
                    s1.setVisible(true);
                    s1.setTitle("Anna University Regulation - 2017 (MHT) ");
                } else if (Reg == 2 && Dept == 11) {
                    SEM1 s1 = new SEM1();
                    s1.setVisible(true);
                    s1.setTitle("Anna University Regulation - 2017 (IT) ");
                } else {
                    javax.swing.JOptionPane.showMessageDialog(GPA, "@Error !");
                }
            }
            System.gc();

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(GPA, e.getMessage());
        }
    }

    private void jButtonCalcSem2GPAActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try {
            if (evt.getSource() == jButtonCalcSem2GPA) {
                if (Reg == 2 && Dept == 1) {
                    AERO_SEM2 s2 = new AERO_SEM2();
                    s2.setVisible(true);
                    s2.setTitle("Anna University Regulation - 2017 (AERO) ");
                } else if (Reg == 2 && Dept == 2) {
                    BME_SEM2 s2 = new BME_SEM2();
                    s2.setVisible(true);
                    s2.setTitle("Anna University Regulation - 2017 (BME) ");
                } else if (Reg == 2 && Dept == 3) {
                    CME_SEM2 s2 = new CME_SEM2();
                    s2.setVisible(true);
                    s2.setTitle("Anna University Regulation - 2017 (CME) ");
                } else if (Reg == 2 && Dept == 4) {
                    CSE_SEM2 s2 = new CSE_SEM2();
                    s2.setVisible(true);
                    s2.setTitle("Anna University Regulation - 2017 (CSE) ");
                } else if (Reg == 2 && Dept == 5) {
                    CVL_SEM2 s2 = new CVL_SEM2();
                    s2.setVisible(true);
                    s2.setTitle("Anna University Regulation - 2017 (CVL) ");
                } else if (Reg == 2 && Dept == 6) {
                    ECE_SEM2 s2 = new ECE_SEM2();
                    s2.setVisible(true);
                    s2.setTitle("Anna University Regulation - 2017 (ECE) ");
                } else if (Reg == 2 && Dept == 7) {
                    EEE_SEM2 s2 = new EEE_SEM2();
                    s2.setVisible(true);
                    s2.setTitle("Anna University Regulation - 2017 (EEE) ");
                } else if (Reg == 2 && Dept == 8) {
                    MAE_SEM2 s2 = new MAE_SEM2();
                    s2.setVisible(true);
                    s2.setTitle("Anna University Regulation - 2017 (MAE) ");
                } else if (Reg == 2 && Dept == 9) {
                    MECH_SEM2 s2 = new MECH_SEM2();
                    s2.setVisible(true);
                    s2.setTitle("Anna University Regulation - 2017 (MECH) ");
                } else if (Reg == 2 && Dept == 10) {
                    MHT_SEM2 s2 = new MHT_SEM2();
                    s2.setVisible(true);
                    s2.setTitle("Anna University Regulation - 2017 (MHT) ");
                } else if (Reg == 2 && Dept == 11) {
                    IT_SEM2 s2 = new IT_SEM2();
                    s2.setVisible(true);
                    s2.setTitle("Anna University Regulation - 2017 (IT) ");
                } else {
                    javax.swing.JOptionPane.showMessageDialog(GPA, "@Error !");
                }
            }
            System.gc();

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(GPA, e.getMessage());
        }
    }

    private void jButtonCalcSem3GPAActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try {
            if (evt.getSource() == jButtonCalcSem3GPA) {
                if (Reg == 2 && Dept == 1) {
                    AERO_SEM3 s3 = new AERO_SEM3();
                    s3.setVisible(true);
                    s3.setTitle("Anna University Regulation - 2017 (AERO) ");
                } else if (Reg == 2 && Dept == 2) {
                    BME_SEM3 s3 = new BME_SEM3();
                    s3.setVisible(true);
                    s3.setTitle("Anna University Regulation - 2017 (BME) ");
                } else if (Reg == 2 && Dept == 3) {
                    CME_SEM3 s3 = new CME_SEM3();
                    s3.setVisible(true);
                    s3.setTitle("Anna University Regulation - 2017 (CME) ");
                } else if (Reg == 2 && Dept == 4) {
                    CSE_SEM3 s3 = new CSE_SEM3();
                    s3.setVisible(true);
                    s3.setTitle("Anna University Regulation - 2017 (CSE) ");
                } else if (Reg == 2 && Dept == 5) {
                    CVL_SEM3 s3 = new CVL_SEM3();
                    s3.setVisible(true);
                    s3.setTitle("Anna University Regulation - 2017 (CVL) ");
                } else if (Reg == 2 && Dept == 6) {
                    ECE_SEM3 s3 = new ECE_SEM3();
                    s3.setVisible(true);
                    s3.setTitle("Anna University Regulation - 2017 (ECE) ");
                } else if (Reg == 2 && Dept == 7) {
                    EEE_SEM3 s3 = new EEE_SEM3();
                    s3.setVisible(true);
                    s3.setTitle("Anna University Regulation - 2017 (EEE) ");
                } else if (Reg == 2 && Dept == 8) {
                    MAE_SEM3 s3 = new MAE_SEM3();
                    s3.setVisible(true);
                    s3.setTitle("Anna University Regulation - 2017 (MAE) ");
                } else if (Reg == 2 && Dept == 9) {
                    MECH_SEM3 s3 = new MECH_SEM3();
                    s3.setVisible(true);
                    s3.setTitle("Anna University Regulation - 2017 (MECH) ");
                } else if (Reg == 2 && Dept == 10) {
                    MHT_SEM3 s3 = new MHT_SEM3();
                    s3.setVisible(true);
                    s3.setTitle("Anna University Regulation - 2017 (MHT) ");
                } else if (Reg == 2 && Dept == 11) {
                    IT_SEM3 s3 = new IT_SEM3();
                    s3.setVisible(true);
                    s3.setTitle("Anna University Regulation - 2017 (IT) ");
                } else {
                    javax.swing.JOptionPane.showMessageDialog(GPA, "@Error !");
                }
            }
            System.gc();

        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(GPA, e.getMessage());
        }
    }

   private void jButtonCalcSem4GPAActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
       try {
           if (evt.getSource() == jButtonCalcSem4GPA) {
               if (Reg == 2 && Dept == 1) {
                   AERO_SEM4 s4 = new AERO_SEM4();
                   s4.setVisible(true);
                   s4.setTitle("Anna University Regulation - 2017 (AERO) ");
               } else if (Reg == 2 && Dept == 2) {
                   BME_SEM4 s4 = new BME_SEM4();
                   s4.setVisible(true);
                   s4.setTitle("Anna University Regulation - 2017 (BME) ");
               } else if (Reg == 2 && Dept == 3) {
                   CME_SEM4 s4 = new CME_SEM4();
                   s4.setVisible(true);
                   s4.setTitle("Anna University Regulation - 2017 (CME) ");
               } else if (Reg == 2 && Dept == 4) {
                   CSE_SEM4 s4 = new CSE_SEM4();
                   s4.setVisible(true);
                   s4.setTitle("Anna University Regulation - 2017 (CSE) ");
               } else if (Reg == 2 && Dept == 5) {
                   CVL_SEM4 s4 = new CVL_SEM4();
                   s4.setVisible(true);
                   s4.setTitle("Anna University Regulation - 2017 (CVL) ");
               } else if (Reg == 2 && Dept == 6) {
                   ECE_SEM4 s4 = new ECE_SEM4();
                   s4.setVisible(true);
                   s4.setTitle("Anna University Regulation - 2017 (ECE) ");
               } else if (Reg == 2 && Dept == 7) {
                   EEE_SEM4 s4 = new EEE_SEM4();
                   s4.setVisible(true);
                   s4.setTitle("Anna University Regulation - 2017 (EEE) ");
               } else if (Reg == 2 && Dept == 8) {
                   MAE_SEM4 s4 = new MAE_SEM4();
                   s4.setVisible(true);
                   s4.setTitle("Anna University Regulation - 2017 (MAE) ");
               } else if (Reg == 2 && Dept == 9) {
                   MECH_SEM4 s4 = new MECH_SEM4();
                   s4.setVisible(true);
                   s4.setTitle("Anna University Regulation - 2017 (MECH) ");
               } else if (Reg == 2 && Dept == 10) {
                   MHT_SEM4 s4 = new MHT_SEM4();
                   s4.setVisible(true);
                   s4.setTitle("Anna University Regulation - 2017 (MHT) ");
               } else if (Reg == 2 && Dept == 11) {
                   IT_SEM4 s4 = new IT_SEM4();
                   s4.setVisible(true);
                   s4.setTitle("Anna University Regulation - 2017 (IT) ");
               } else {
                   javax.swing.JOptionPane.showMessageDialog(GPA, "@Error !");
               }
           }
           System.gc();

       } catch (Exception e){
           javax.swing.JOptionPane.showMessageDialog(GPA, e.getMessage());
       }
    }
    private void jButtonCalcSem5GPAActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try {
            if (evt.getSource() == jButtonCalcSem5GPA) {
                if (Reg == 2 && Dept == 1) {
                    AERO_SEM5 s5 = new AERO_SEM5();
                    s5.setVisible(true);
                    s5.setTitle("Anna University Regulation - 2017 (AERO) ");
                } else if (Reg == 2 && Dept == 2) {
                    BME_SEM5 s5 = new BME_SEM5();
                    s5.setVisible(true);
                    s5.setTitle("Anna University Regulation - 2017 (BME) ");
                } else if (Reg == 2 && Dept == 3) {
                    CME_SEM5 s5 = new CME_SEM5();
                    s5.setVisible(true);
                    s5.setTitle("Anna University Regulation - 2017 (CME) ");
                } else if (Reg == 2 && Dept == 4) {
                    CSE_SEM5 s5 = new CSE_SEM5();
                    s5.setVisible(true);
                    s5.setTitle("Anna University Regulation - 2017 (CSE) ");
                } else if (Reg == 2 && Dept == 5) {
                    CVL_SEM5 s5 = new CVL_SEM5();
                    s5.setVisible(true);
                    s5.setTitle("Anna University Regulation - 2017 (CVL) ");
                } else if (Reg == 2 && Dept == 6) {
                    ECE_SEM5 s5 = new ECE_SEM5();
                    s5.setVisible(true);
                    s5.setTitle("Anna University Regulation - 2017 (ECE) ");
                } else if (Reg == 2 && Dept == 7) {
                    EEE_SEM5 s5 = new EEE_SEM5();
                    s5.setVisible(true);
                    s5.setTitle("Anna University Regulation - 2017 (EEE) ");
                } else if (Reg == 2 && Dept == 8) {
                    MAE_SEM5 s5 = new MAE_SEM5();
                    s5.setVisible(true);
                    s5.setTitle("Anna University Regulation - 2017 (MAE) ");
                } else if (Reg == 2 && Dept == 9) {
                    MECH_SEM5 s5 = new MECH_SEM5();
                    s5.setVisible(true);
                    s5.setTitle("Anna University Regulation - 2017 (MECH) ");
                } else if (Reg == 2 && Dept == 10) {
                    MHT_SEM5 s5 = new MHT_SEM5();
                    s5.setVisible(true);
                    s5.setTitle("Anna University Regulation - 2017 (MHT) ");
                } else if (Reg == 2 && Dept == 11) {
                    IT_SEM5 s5 = new IT_SEM5();
                    s5.setVisible(true);
                    s5.setTitle("Anna University Regulation - 2017 (IT) ");
                } else {
                    javax.swing.JOptionPane.showMessageDialog(GPA, "@Error !");
                }
            }
            System.gc();

        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(GPA, e.getMessage());
        }
    }

    private void jButtonCalcSem6GPAActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try {
            if (evt.getSource() == jButtonCalcSem6GPA) {
                if (Reg == 2 && Dept == 1) {
                    AERO_SEM6 s6 = new AERO_SEM6();
                    s6.setVisible(true);
                    s6.setTitle("Anna University Regulation - 2017 (AERO) ");
                } else if (Reg == 2 && Dept == 2) {
                    BME_SEM6 s6 = new BME_SEM6();
                    s6.setVisible(true);
                    s6.setTitle("Anna University Regulation - 2017 (BME) ");
                } else if (Reg == 2 && Dept == 3) {
                    CME_SEM6 s6 = new CME_SEM6();
                    s6.setVisible(true);
                    s6.setTitle("Anna University Regulation - 2017 (CME) ");
                } else if (Reg == 2 && Dept == 4) {
                    CSE_SEM6 s6 = new CSE_SEM6();
                    s6.setVisible(true);
                    s6.setTitle("Anna University Regulation - 2017 (CSE) ");
                } else if (Reg == 2 && Dept == 5) {
                    CVL_SEM6 s6 = new CVL_SEM6();
                    s6.setVisible(true);
                    s6.setTitle("Anna University Regulation - 2017 (CVL) ");
                } else if (Reg == 2 && Dept == 6) {
                    ECE_SEM6 s6 = new ECE_SEM6();
                    s6.setVisible(true);
                    s6.setTitle("Anna University Regulation - 2017 (ECE) ");
                } else if (Reg == 2 && Dept == 7) {
                    EEE_SEM6 s6 = new EEE_SEM6();
                    s6.setVisible(true);
                    s6.setTitle("Anna University Regulation - 2017 (EEE) ");
                } else if (Reg == 2 && Dept == 8) {
                    MAE_SEM6 s6 = new MAE_SEM6();
                    s6.setVisible(true);
                    s6.setTitle("Anna University Regulation - 2017 (MAE) ");
                } else if (Reg == 2 && Dept == 9) {
                    MECH_SEM6 s6 = new MECH_SEM6();
                    s6.setVisible(true);
                    s6.setTitle("Anna University Regulation - 2017 (MECH) ");
                } else if (Reg == 2 && Dept == 10) {
                    MHT_SEM6 s6 = new MHT_SEM6();
                    s6.setVisible(true);
                    s6.setTitle("Anna University Regulation - 2017 (MHT) ");
                } else if (Reg == 2 && Dept == 11) {
                    IT_SEM6 s6 = new IT_SEM6();
                    s6.setVisible(true);
                    s6.setTitle("Anna University Regulation - 2017 (IT) ");
                } else {
                    javax.swing.JOptionPane.showMessageDialog(GPA, "@Error !");
                }
            }
            System.gc();

        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(GPA, e.getMessage());
        }
    }

    private void jButtonCalcSem7GPAActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try {
            if (evt.getSource() == jButtonCalcSem7GPA) {
                if (Reg == 2 && Dept == 1) {
                    AERO_SEM7 s7 = new AERO_SEM7();
                    s7.setVisible(true);
                    s7.setTitle("Anna University Regulation - 2017 (AERO) ");
                } else if (Reg == 2 && Dept == 2) {
                    BME_SEM7 s7 = new BME_SEM7();
                    s7.setVisible(true);
                    s7.setTitle("Anna University Regulation - 2017 (BME) ");
                } else if (Reg == 2 && Dept == 3) {
                    CME_SEM7 s7 = new CME_SEM7();
                    s7.setVisible(true);
                    s7.setTitle("Anna University Regulation - 2017 (CME) ");
                } else if (Reg == 2 && Dept == 4) {
                    CSE_SEM7 s7 = new CSE_SEM7();
                    s7.setVisible(true);
                    s7.setTitle("Anna University Regulation - 2017 (CSE) ");
                } else if (Reg == 2 && Dept == 5) {
                    CVL_SEM7 s7 = new CVL_SEM7();
                    s7.setVisible(true);
                    s7.setTitle("Anna University Regulation - 2017 (CVL) ");
                } else if (Reg == 2 && Dept == 6) {
                    ECE_SEM7 s7 = new ECE_SEM7();
                    s7.setVisible(true);
                    s7.setTitle("Anna University Regulation - 2017 (ECE) ");
                } else if (Reg == 2 && Dept == 7) {
                    EEE_SEM7 s7 = new EEE_SEM7();
                    s7.setVisible(true);
                    s7.setTitle("Anna University Regulation - 2017 (EEE) ");
                } else if (Reg == 2 && Dept == 8) {
                    MAE_SEM7 s7 = new MAE_SEM7();
                    s7.setVisible(true);
                    s7.setTitle("Anna University Regulation - 2017 (MAE) ");
                } else if (Reg == 2 && Dept == 9) {
                    MECH_SEM7 s7 = new MECH_SEM7();
                    s7.setVisible(true);
                    s7.setTitle("Anna University Regulation - 2017 (MECH) ");
                } else if (Reg == 2 && Dept == 10) {
                    MHT_SEM7 s7 = new MHT_SEM7();
                    s7.setVisible(true);
                    s7.setTitle("Anna University Regulation - 2017 (MHT) ");
                } else if (Reg == 2 && Dept == 11) {
                    IT_SEM7 s7 = new IT_SEM7();
                    s7.setVisible(true);
                    s7.setTitle("Anna University Regulation - 2017 (IT) ");
                } else {
                    javax.swing.JOptionPane.showMessageDialog(GPA, "@Error !");
                }
            }
            System.gc();

        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(GPA, e.getMessage());
        }
    }

    private void jButtonCalcSem8GPAActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try {
            if (evt.getSource() == jButtonCalcSem8GPA) {
                if (Reg == 2 && Dept == 1) {
                    AERO_SEM8 s8 = new AERO_SEM8();
                    s8.setVisible(true);
                    s8.setTitle("Anna University Regulation - 2017 (AERO) ");
                } else if (Reg == 2 && Dept == 2) {
                    BME_SEM8 s8 = new BME_SEM8();
                    s8.setVisible(true);
                    s8.setTitle("Anna University Regulation - 2017 (BME) ");
                } else if (Reg == 2 && Dept == 3) {
                    CME_SEM8 s8 = new CME_SEM8();
                    s8.setVisible(true);
                    s8.setTitle("Anna University Regulation - 2017 (CME) ");
                } else if (Reg == 2 && Dept == 4) {
                    CSE_SEM8 s8 = new CSE_SEM8();
                    s8.setVisible(true);
                    s8.setTitle("Anna University Regulation - 2017 (CSE) ");
                } else if (Reg == 2 && Dept == 5) {
                    CVL_SEM8 s8 = new CVL_SEM8();
                    s8.setVisible(true);
                    s8.setTitle("Anna University Regulation - 2017 (CVL) ");
                } else if (Reg == 2 && Dept == 6) {
                    ECE_SEM8 s8 = new ECE_SEM8();
                    s8.setVisible(true);
                    s8.setTitle("Anna University Regulation - 2017 (ECE) ");
                } else if (Reg == 2 && Dept == 7) {
                    EEE_SEM8 s8 = new EEE_SEM8();
                    s8.setVisible(true);
                    s8.setTitle("Anna University Regulation - 2017 (EEE) ");
                } else if (Reg == 2 && Dept == 8) {
                    MAE_SEM8 s8 = new MAE_SEM8();
                    s8.setVisible(true);
                    s8.setTitle("Anna University Regulation - 2017 (MAE) ");
                } else if (Reg == 2 && Dept == 9) {
                    MECH_SEM8 s8 = new MECH_SEM8();
                    s8.setVisible(true);
                    s8.setTitle("Anna University Regulation - 2017 (MECH) ");
                } else if (Reg == 2 && Dept == 10) {
                    MHT_SEM8 s8 = new MHT_SEM8();
                    s8.setVisible(true);
                    s8.setTitle("Anna University Regulation - 2017 (MHT) ");
                } else if (Reg == 2 && Dept == 11) {
                    IT_SEM8 s8 = new IT_SEM8();
                    s8.setVisible(true);
                    s8.setTitle("Anna University Regulation - 2017 (IT) ");
                } else {
                    javax.swing.JOptionPane.showMessageDialog(GPA, "@Error !");
                }
            }
            System.gc();

        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(GPA, e.getMessage());
        }
    }
    
    // Variables declaration
    private static javax.swing.JButton jButtonCalcSem1GPA;
    private static javax.swing.JButton jButtonCalcSem2GPA;
    private static javax.swing.JButton jButtonCalcSem3GPA;
    private static javax.swing.JButton jButtonCalcSem4GPA;
    private static javax.swing.JButton jButtonCalcSem5GPA;
    private static javax.swing.JButton jButtonCalcSem6GPA;
    private static javax.swing.JButton jButtonCalcSem7GPA;
    private static javax.swing.JButton jButtonCalcSem8GPA;
    // End of variables declaration
}
