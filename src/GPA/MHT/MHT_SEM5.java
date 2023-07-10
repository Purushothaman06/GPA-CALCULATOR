package GPA.MHT;

/**
 * @author Praveenkumar
 * @co-author Purushothaman
 */
public class MHT_SEM5 extends javax.swing.JFrame {

    static float EE8552 = 0, MT8591 = 0, ME8594 = 0, EC8391 = 0, OpenEle1 = 0, MT8511 = 0, MT8512 = 0, ME8481 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0;
    static float totalcredits = 22, credit1 = 3 , credit2 = 3 , credit3 = 4 , credit4 = 3 , credit5 = 3 , credit6 = 2 , credit7 = 2 , credit8 = 2;
    static String num1, num2, num3, num4, num5, num6, num7, num8 ;
    static float gpa5 = 0;
    static javax.swing.JFrame jframe5 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.MHT.MHT_SEM5
     */
    public MHT_SEM5() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPA = new javax.swing.JLabel();
        javax.swing.JButton jButtonCalculate = new javax.swing.JButton();
        javax.swing.JLabel jLabelEE8552 = new javax.swing.JLabel();
        jComboBoxMT8511 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelMT8591 = new javax.swing.JLabel();
        jComboBoxME8594 = new javax.swing.JComboBox<>();
        jComboBoxEE8552 = new javax.swing.JComboBox<>();
        jComboBoxEC8391 = new javax.swing.JComboBox<>();
        jComboBoxOpenEle1 = new javax.swing.JComboBox<>();
        jComboBoxMT8591 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelME8592 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelOpenEle1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelMT8511 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEC8391 = new javax.swing.JLabel();
        jComboBoxME8481 = new javax.swing.JComboBox<>();
        jComboBoxMT8512 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelMT8512 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelME8481 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPA.setText("GPA CALCULATOR");

        jButtonCalculate.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalculate.setText("CALCULATE");
        jButtonCalculate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCalculate.addActionListener(evt -> jButtonCalculateActionPerformed());

        jLabelEE8552.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEE8552.setText("EE8552");

        jComboBoxMT8511.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMT8511.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMT8511.addActionListener(evt -> jComboBoxMT8511ActionPerformed());

        jLabelMT8591.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMT8591.setText("MT8591");

        jComboBoxME8594.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8594.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8594.addActionListener(evt -> jComboBoxME8594ActionPerformed());

        jComboBoxEE8552.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEE8552.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEE8552.addActionListener(evt -> jComboBoxEE8552ActionPerformed());

        jComboBoxEC8391.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8391.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8391.addActionListener(evt -> jComboBoxEC8391ActionPerformed());

        jComboBoxOpenEle1.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxOpenEle1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxOpenEle1.addActionListener(evt -> jComboBoxOpenEle1ActionPerformed());

        jComboBoxMT8591.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMT8591.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMT8591.addActionListener(evt -> jComboBoxMT8591ActionPerformed());

        jLabelME8592.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8592.setText("ME8594");

        jLabelOpenEle1.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelOpenEle1.setText("OpenEle1");

        jLabelMT8511.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMT8511.setText("MT8511");

        jLabelEC8391.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8391.setText("EC8391");

        jComboBoxME8481.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8481.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8481.addActionListener(evt -> jComboBoxME8481ActionPerformed());

        jComboBoxMT8512.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMT8512.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMT8512.addActionListener(evt -> jComboBoxMT8512ActionPerformed());

        jLabelMT8512.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMT8512.setText("MT8512");

        jLabelME8481.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8481.setText("ME8481");

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
                                                .addComponent(jLabelEE8552))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabelMT8512))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelME8592, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabelOpenEle1, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBoxMT8512, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxME8481, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabelEC8391)
                                                                        .addComponent(jLabelMT8591))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxMT8591, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxEC8391, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxME8594, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxOpenEle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxEE8552, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(74, 74, 74)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelME8481)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelMT8511)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxMT8511, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                                                        .addComponent(jComboBoxMT8591, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelMT8591))
                                                                .addGap(97, 97, 97))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jComboBoxEE8552, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelEE8552))
                                                                .addGap(32, 32, 32)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabelEC8391)
                                                                                .addComponent(jComboBoxEC8391, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBoxME8594, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabelME8592))
                                                                .addGap(35, 35, 35)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelMT8511)
                                                                        .addComponent(jComboBoxMT8511, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(133, 133, 133))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelOpenEle1)
                                                                        .addComponent(jComboBoxOpenEle1))
                                                                .addGap(43, 43, 43)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelMT8512)
                                                                        .addComponent(jComboBoxMT8512, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelME8481)
                                                                        .addComponent(jComboBoxME8481, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addComponent(jButtonCalculate)
                                                .addGap(94, 94, 94))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel1)
                                                .addGap(235, 235, 235))))
        );
        pack();
    }

    private void jButtonCalculateActionPerformed() {
        // TODO add your handling code here:
        try {
            gpa5 = (grade1  + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8 ) ;
            float result = gpa5 / totalcredits;
            javax.swing.JOptionPane.showMessageDialog(jframe5,"Your GPA Is :-  " + result);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEE8552ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxEE8552.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                EE8552 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                EE8552 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                EE8552 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                EE8552 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                EE8552 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade1 = EE8552 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxMT8591ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxMT8591.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                MT8591 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                MT8591 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                MT8591 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                MT8591 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                MT8591 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade2 = MT8591 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxME8594ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxME8594.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                ME8594 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                ME8594 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                ME8594 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                ME8594 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                ME8594 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade3 = ME8594 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8391ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxEC8391.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                EC8391 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                EC8391 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                EC8391 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                EC8391 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                EC8391 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade4 = EC8391 * credit4;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxOpenEle1ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxOpenEle1.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                OpenEle1 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                OpenEle1 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                OpenEle1 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                OpenEle1 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                OpenEle1 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade5 = OpenEle1 * credit5;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxMT8511ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxMT8511.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                MT8511 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                MT8511 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                MT8511 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                MT8511 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                MT8511 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade6 = MT8511 * credit6;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxMT8512ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxMT8512.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                MT8512 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                MT8512 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                MT8512 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                MT8512 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                MT8512 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade7 = MT8512 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxME8481ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxME8481.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                ME8481 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                ME8481 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                ME8481 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                ME8481 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                ME8481 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade8 = ME8481 * credit8;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxEC8391;
    private static javax.swing.JComboBox<String> jComboBoxMT8511;
    private static javax.swing.JComboBox<String> jComboBoxME8481;
    private static javax.swing.JComboBox<String> jComboBoxMT8512;
    private static javax.swing.JComboBox<String> jComboBoxOpenEle1;
    private static javax.swing.JComboBox<String> jComboBoxEE8552;
    private static javax.swing.JComboBox<String> jComboBoxMT8591;
    private static javax.swing.JComboBox<String> jComboBoxME8594;
    // End of variables declaration
}