package GPA.BME;

/**
 *
 * @author Tanish
 * @co-author Purushothaman
 */
public class BME_SEM4 extends javax.swing.JFrame {

    static float MA8391 = 0, BM8401 = 0, EE8452 = 0, EC8453 = 0, EC8393 = 0, EC8392 = 0, EC8381 = 0, BM8411 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0;
    static float totalcredits = 23, credit1 = 4 , credit2 = 3 , credit3 = 3 , credit4 = 3 , credit5 = 3 , credit6 = 3 , credit7 = 2 , credit8 = 2;
    static String num1, num2, num3, num4, num5, num6, num7, num8 ;
    static float gpa4 = 0;
    static javax.swing.JFrame jframe4 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.BME.BME_SEM4
     */
    public BME_SEM4() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPACalc = new javax.swing.JLabel();
        javax.swing.JLabel jLabelMA8391 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEC8453 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelBM8401 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEE8452 = new javax.swing.JLabel();
        jComboBoxMA8391 = new javax.swing.JComboBox<>();
        jComboBoxEC8453 = new javax.swing.JComboBox<>();
        jComboBoxBM8401 = new javax.swing.JComboBox<>();
        jComboBoxEE8452 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelEC8392 = new javax.swing.JLabel();
        jComboBoxEC8392 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelEC8381 = new javax.swing.JLabel();
        jComboBoxEC8381 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JButton jButtonCalcGPA = new javax.swing.JButton();
        javax.swing.JLabel jLabelEC8393 = new javax.swing.JLabel();
        jComboBoxEC8393 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelBM8411 = new javax.swing.JLabel();
        jComboBoxBM8411 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPACalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPACalc.setText("GPA CALCULATOR");

        jLabelMA8391.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMA8391.setText("MA8391");

        jLabelEC8453.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8453.setText("EC8453");

        jLabelBM8401.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelBM8401.setText("BM8401");

        jLabelEE8452.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEE8452.setText("EE8452");

        jComboBoxMA8391.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMA8391.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMA8391.addActionListener(evt -> jComboBoxMA8391ActionPerformed());

        jComboBoxEC8453.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8453.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8453.addActionListener(evt -> jComboBoxEC8453ActionPerformed());

        jComboBoxBM8401.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxBM8401.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxBM8401.addActionListener(evt -> jComboBoxBM8401ActionPerformed());

        jComboBoxEE8452.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEE8452.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEE8452.addActionListener(evt -> jComboBoxEE8452ActionPerformed());

        jLabelEC8392.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8392.setText("EC8392");

        jComboBoxEC8392.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8392.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8392.addActionListener(evt -> jComboBoxEC8392ActionPerformed());

        jLabelEC8381.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8381.setText("EC8381");

        jComboBoxEC8381.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8381.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8381.addActionListener(evt -> jComboBoxEC8381ActionPerformed());

        jButtonCalcGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalcGPA.setText("CALCULATE ");
        jButtonCalcGPA.addActionListener(evt -> jButtonCalcGPAActionPerformed());

        jLabelEC8393.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8393.setText("EC8393");

        jComboBoxEC8393.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8393.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8393.addActionListener(evt -> jComboBoxEC8393ActionPerformed());

        jLabelBM8411.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelBM8411.setText("BM8411");

        jComboBoxBM8411.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxBM8411.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxBM8411.addActionListener(evt -> jComboBoxBM8411ActionPerformed());

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
                                                .addComponent(jLabelEC8453))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabelEC8381))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelBM8401, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabelEC8392, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBoxEC8381, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxBM8411, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabelEE8452)
                                                                        .addComponent(jLabelMA8391))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxMA8391, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxEE8452, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxBM8401, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxEC8392, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxEC8453, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(74, 74, 74)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelBM8411)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelEC8393)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxEC8393, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                                                        .addComponent(jComboBoxMA8391, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelMA8391))
                                                                .addGap(97, 97, 97))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jComboBoxEC8453, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelEC8453))
                                                                .addGap(32, 32, 32)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabelEE8452)
                                                                                .addComponent(jComboBoxEE8452, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBoxBM8401, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabelBM8401))
                                                                .addGap(35, 35, 35)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelEC8393)
                                                                        .addComponent(jComboBoxEC8393, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(133, 133, 133))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelEC8392)
                                                                        .addComponent(jComboBoxEC8392))
                                                                .addGap(43, 43, 43)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelEC8381)
                                                                        .addComponent(jComboBoxEC8381, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelBM8411)
                                                                        .addComponent(jComboBoxBM8411, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jComboBoxMA8391ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxMA8391.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                MA8391 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                MA8391 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                MA8391 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                MA8391 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                MA8391 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade1 = MA8391 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxBM8401ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxBM8401.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                BM8401 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                BM8401 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                BM8401 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                BM8401 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                BM8401 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade2 = BM8401 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEE8452ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxEE8452.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                EE8452 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                EE8452 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                EE8452 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                EE8452 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                EE8452 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade3 = EE8452 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8453ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxEC8453.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                EC8453 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                EC8453 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                EC8453 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                EC8453 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                EC8453 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade4 = EC8453 * credit4;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8393ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxEC8393.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                EC8393 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                EC8393 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                EC8393 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                EC8393 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                EC8393 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade5 = EC8393 * credit5;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8392ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxEC8392.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                EC8392 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                EC8392 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                EC8392 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                EC8392 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                EC8392 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade6 = EC8392 * credit6;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8381ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxEC8381.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                EC8381 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                EC8381 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                EC8381 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                EC8381 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                EC8381 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade7 = EC8381 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }


    private void jComboBoxBM8411ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxBM8411.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                BM8411 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                BM8411 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                BM8411 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                BM8411 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                BM8411 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade8 = BM8411 * credit8;
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
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxEC8453;
    private static javax.swing.JComboBox<String> jComboBoxEC8381;
    private static javax.swing.JComboBox<String> jComboBoxBM8411;
    private static javax.swing.JComboBox<String> jComboBoxEC8393;
    private static javax.swing.JComboBox<String> jComboBoxBM8401;
    private static javax.swing.JComboBox<String> jComboBoxEE8452;
    private static javax.swing.JComboBox<String> jComboBoxEC8392;
    private static javax.swing.JComboBox<String> jComboBoxMA8391;
    // End of variables declaration
}