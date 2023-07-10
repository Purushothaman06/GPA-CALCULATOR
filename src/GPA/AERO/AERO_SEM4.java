package GPA.AERO;

/**
 *
 * @author Tanish
 * @co-author Purushothaman
 */
public class AERO_SEM4 extends javax.swing.JFrame {

    static float AE8403 = 0, MA8491 = 0, AE8401 = 0, AE8402 = 0, PR8451 = 0, AE8404 = 0, ME8381 = 0, AE8411 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0;
    static float total_credits = 24, credit1 = 4 , credit2 = 4 , credit3 = 3 , credit4 = 3 , credit5 = 3 , credit6 = 4 , credit7 = 2 , credit8 = 1;
    static String num1, num2, num3, num4, num5, num6, num7, num8 ;
    static float gpa4 = 0;
    static javax.swing.JFrame jframe4 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.AERO.AERO_SEM4
     */
    public AERO_SEM4() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPA = new javax.swing.JLabel();
        javax.swing.JButton jButtonCalculate = new javax.swing.JButton();
        javax.swing.JLabel jLabelAE8403 = new javax.swing.JLabel();
        jComboBoxAE8404 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelMA8491 = new javax.swing.JLabel();
        jComboBoxAE8401 = new javax.swing.JComboBox<>();
        jComboBoxAE8403 = new javax.swing.JComboBox<>();
        jComboBoxAE8402 = new javax.swing.JComboBox<>();
        jComboBoxPR8451 = new javax.swing.JComboBox<>();
        jComboBoxMA8491 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelAE8401 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelPR8451 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelAE8404 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelAE8402 = new javax.swing.JLabel();
        jComboBoxAE8411 = new javax.swing.JComboBox<>();
        jComboBoxME8381 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelME8381 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelAE8411 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26)); // NOI18N
        jLabelGPA.setText("GPA CALCULATOR");

        jButtonCalculate.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22)); // NOI18N
        jButtonCalculate.setText("CALCULATE");
        jButtonCalculate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCalculate.addActionListener(evt -> jButtonCalculateActionPerformed());

        jLabelAE8403.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jLabelAE8403.setText("AE8403");

        jComboBoxAE8404.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jComboBoxAE8404.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxAE8404.addActionListener(evt -> jComboBoxAE8404ActionPerformed());

        jLabelMA8491.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jLabelMA8491.setText("MA8491");

        jComboBoxAE8401.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jComboBoxAE8401.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxAE8401.addActionListener(evt -> jComboBoxAE8401ActionPerformed());

        jComboBoxAE8403.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jComboBoxAE8403.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxAE8403.addActionListener(evt -> jComboBoxAE8403ActionPerformed());

        jComboBoxAE8402.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jComboBoxAE8402.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxAE8402.addActionListener(evt -> jComboBoxAE8402ActionPerformed());

        jComboBoxPR8451.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jComboBoxPR8451.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxPR8451.addActionListener(evt -> jComboBoxPR8451ActionPerformed());

        jComboBoxMA8491.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jComboBoxMA8491.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMA8491.addActionListener(evt -> jComboBoxMA8491ActionPerformed());

        jLabelAE8401.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jLabelAE8401.setText("AE8401");

        jLabelPR8451.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jLabelPR8451.setText("PR8451");

        jLabelAE8404.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jLabelAE8404.setText("AE8404");

        jLabelAE8402.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jLabelAE8402.setText("AE8402");

        jComboBoxAE8411.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jComboBoxAE8411.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxAE8411.addActionListener(evt -> jComboBoxAE8411ActionPerformed());

        jComboBoxME8381.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jComboBoxME8381.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8381.addActionListener(evt -> jComboBoxME8381ActionPerformed());

        jLabelME8381.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jLabelME8381.setText("ME8381");

        jLabelAE8411.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jLabelAE8411.setText("AE8411");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                                .addComponent(jLabelAE8403))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabelME8381))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelAE8401, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabelPR8451, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBoxME8381, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxAE8411, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabelAE8402)
                                                                        .addComponent(jLabelMA8491))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxMA8491, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxAE8402, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxAE8401, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxPR8451, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxAE8403, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(74, 74, 74)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelAE8411)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelAE8404)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxAE8404, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(105, 105, 105))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButtonCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(276, 276, 276))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabelGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(255, 255, 255))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabelGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jComboBoxMA8491, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelMA8491))
                                                                .addGap(97, 97, 97))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jComboBoxAE8403, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelAE8403))
                                                                .addGap(32, 32, 32)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabelAE8402)
                                                                                .addComponent(jComboBoxAE8402, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBoxAE8401, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabelAE8401))
                                                                .addGap(35, 35, 35)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelAE8404)
                                                                        .addComponent(jComboBoxAE8404, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(133, 133, 133))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelPR8451)
                                                                        .addComponent(jComboBoxPR8451))
                                                                .addGap(43, 43, 43)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelME8381)
                                                                        .addComponent(jComboBoxME8381, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelAE8411)
                                                                        .addComponent(jComboBoxAE8411, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addComponent(jButtonCalculate)
                                                .addGap(94, 94, 94))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel1)
                                                .addGap(235, 235, 235))))
        );

        pack();
    }// </editor-fold>

    private void jButtonCalculateActionPerformed() {
        // TODO add your handling code here:
        try {
            gpa4 = (grade1  + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8 ) ;
            float result = gpa4 / total_credits;
            javax.swing.JOptionPane.showMessageDialog(jframe4,"Your GPA Is :-  " + result);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAE8403ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxAE8403.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                AE8403 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                AE8403 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                AE8403 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                AE8403 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                AE8403 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade1 = AE8403 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxMA8491ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxMA8491.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                MA8491 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                MA8491 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                MA8491 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                MA8491 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                MA8491 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade2 = MA8491 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAE8401ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxAE8401.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                AE8401 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                AE8401 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                AE8401 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                AE8401 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                AE8401 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade3 = AE8401 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAE8402ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxAE8402.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                AE8402 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                AE8402 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                AE8402 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                AE8402 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                AE8402 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade4 = AE8402 * credit4;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxPR8451ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxPR8451.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                PR8451 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                PR8451 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                PR8451 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                PR8451 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                PR8451 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade5 = PR8451 * credit5;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAE8404ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxAE8404.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                AE8404 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                AE8404 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                AE8404 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                AE8404 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                AE8404 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade6 = AE8404 * credit6;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxME8381ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxME8381.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                ME8381 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                ME8381 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                ME8381 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                ME8381 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                ME8381 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade7 = ME8381 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAE8411ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxAE8411.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                AE8411 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                AE8411 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                AE8411 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                AE8411 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                AE8411 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade8 = AE8411 * credit8;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxAE8402;
    private static javax.swing.JComboBox<String> jComboBoxAE8404;
    private static javax.swing.JComboBox<String> jComboBoxAE8411;
    private static javax.swing.JComboBox<String> jComboBoxME8381;
    private static javax.swing.JComboBox<String> jComboBoxPR8451;
    private static javax.swing.JComboBox<String> jComboBoxAE8403;
    private static javax.swing.JComboBox<String> jComboBoxMA8491;
    private static javax.swing.JComboBox<String> jComboBoxAE8401;
    // End of variables declaration
}
