package GPA.CME;

/**
 *
 * @author Tanish
 * @co-author Purushothaman
 */
public class CME_SEM4 extends javax.swing.JFrame {

    static float MA8491 = 0, CH8451 = 0, CH8401 = 0, CH8402 = 0, CH8491 = 0, GE8291 = 0, CH8461 = 0, CY8281 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0;
    static float totalcredits = 23, credit1 = 4 , credit2 = 3 , credit3 = 3 , credit4 = 3 , credit5 = 3 , credit6 = 3 , credit7 = 2 , credit8 = 2;
    static String num1, num2, num3, num4, num5, num6, num7, num8 ;
    static float gpa4 = 0;
    static javax.swing.JFrame jframe4 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.CME.CME_SEM4
     */
    public CME_SEM4() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPACalc = new javax.swing.JLabel();
        javax.swing.JLabel jLabelMA8491 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCH8451 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelGE8291 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCH8401 = new javax.swing.JLabel();
        jComboBoxMA8491 = new javax.swing.JComboBox<>();
        jComboBoxCH8451 = new javax.swing.JComboBox<>();
        jComboBoxGE8291 = new javax.swing.JComboBox<>();
        jComboBoxCH8401 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelCH8491 = new javax.swing.JLabel();
        jComboBoxCH8491 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelCH8461 = new javax.swing.JLabel();
        jComboBoxCH8461 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JButton jButtonCalcGPA = new javax.swing.JButton();
        javax.swing.JLabel jLabelCH8402 = new javax.swing.JLabel();
        jComboBoxCH8402 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelCY8281 = new javax.swing.JLabel();
        jComboBoxCY8281 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPACalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPACalc.setText("GPA CALCULATOR");

        jLabelMA8491.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMA8491.setText("MA8491");

        jLabelCH8451.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCH8451.setText("CH8451");

        jLabelGE8291.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelGE8291.setText("GE8291");

        jLabelCH8401.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCH8401.setText("CH8401");

        jComboBoxMA8491.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMA8491.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMA8491.addActionListener(evt -> jComboBoxMA8491ActionPerformed());

        jComboBoxCH8451.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCH8451.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCH8451.addActionListener(evt -> jComboBoxCH8451ActionPerformed());

        jComboBoxGE8291.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxGE8291.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxGE8291.addActionListener(evt -> jComboBoxGE8291ActionPerformed());

        jComboBoxCH8401.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCH8401.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCH8401.addActionListener(evt -> jComboBoxCH8401ActionPerformed());

        jLabelCH8491.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCH8491.setText("CH8491");

        jComboBoxCH8491.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCH8491.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCH8491.addActionListener(evt -> jComboBoxCH8491ActionPerformed());

        jLabelCH8461.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCH8461.setText("CH8461");

        jComboBoxCH8461.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCH8461.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCH8461.addActionListener(evt -> jComboBoxCH8461ActionPerformed());

        jButtonCalcGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalcGPA.setText("CALCULATE ");
        jButtonCalcGPA.addActionListener(evt -> jButtonCalcGPAActionPerformed());

        jLabelCH8402.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCH8402.setText("CH8402");

        jComboBoxCH8402.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCH8402.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCH8402.addActionListener(evt -> jComboBoxCH8402ActionPerformed());

        jLabelCY8281.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCY8281.setText("CY8281");

        jComboBoxCY8281.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCY8281.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCY8281.addActionListener(evt -> jComboBoxCY8281ActionPerformed());

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
                                                .addComponent(jLabelCH8451))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabelCH8461))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelGE8291, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabelCH8491, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBoxCH8461, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxCY8281, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabelCH8401)
                                                                        .addComponent(jLabelMA8491))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxMA8491, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxCH8401, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxGE8291, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxCH8491, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxCH8451, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(74, 74, 74)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelCY8281)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelCH8402)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxCH8402, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(105, 105, 105))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButtonCalcGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(276, 276, 276))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabelGPACalc, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(255, 255, 255))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabelGPACalc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                                                        .addComponent(jComboBoxCH8451, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelCH8451))
                                                                .addGap(32, 32, 32)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabelCH8401)
                                                                                .addComponent(jComboBoxCH8401, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBoxGE8291, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabelGE8291))
                                                                .addGap(35, 35, 35)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelCH8402)
                                                                        .addComponent(jComboBoxCH8402, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(133, 133, 133))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelCH8491)
                                                                        .addComponent(jComboBoxCH8491))
                                                                .addGap(43, 43, 43)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelCH8461)
                                                                        .addComponent(jComboBoxCH8461, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelCY8281)
                                                                        .addComponent(jComboBoxCY8281, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addComponent(jButtonCalcGPA)
                                                .addGap(94, 94, 94))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel1)
                                                .addGap(235, 235, 235))))
        );
        pack();
    }

    public void jComboBoxMA8491ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxMA8491.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                MA8491 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                MA8491 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                MA8491 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                MA8491 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                MA8491 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade1 = MA8491 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCH8451ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxCH8451.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                CH8451 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                CH8451 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                CH8451 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                CH8451 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                CH8451 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade2 = CH8451 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCH8401ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxCH8401.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                CH8401 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                CH8401 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                CH8401 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                CH8401 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                CH8401 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade3 = CH8401 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCH8402ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxCH8402.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                CH8402 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                CH8402 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                CH8402 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                CH8402 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                CH8402 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade4 = CH8402 * credit4;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCH8491ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxCH8491.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                CH8491 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                CH8491 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                CH8491 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                CH8491 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                CH8491 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade5 = CH8491 * credit5;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxGE8291ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxGE8291.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                GE8291 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                GE8291 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                GE8291 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                GE8291 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                GE8291 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade6 = GE8291 * credit6;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCH8461ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxCH8461.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                CH8461 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                CH8461 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                CH8461 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                CH8461 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                CH8461 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade7 = CH8461 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCY8281ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxCY8281.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                CY8281 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                CY8281 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                CY8281 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                CY8281 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                CY8281 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade8 = CY8281 * credit8;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jButtonCalcGPAActionPerformed() {
        // TODO add your handling code here:
        try {
            gpa4 = (grade1 + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8);
            float result = gpa4 / totalcredits;
            javax.swing.JOptionPane.showMessageDialog(jframe4, "Your GPA Is :-  " + result);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }


    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxCH8451;
    private static javax.swing.JComboBox<String> jComboBoxCH8461;
    private static javax.swing.JComboBox<String> jComboBoxCY8281;
    private static javax.swing.JComboBox<String> jComboBoxCH8402;
    private static javax.swing.JComboBox<String> jComboBoxGE8291;
    private static javax.swing.JComboBox<String> jComboBoxCH8401;
    private static javax.swing.JComboBox<String> jComboBoxCH8491;
    private static javax.swing.JComboBox<String> jComboBoxMA8491;
    // End of variables declaration
}