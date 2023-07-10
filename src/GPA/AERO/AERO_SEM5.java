package GPA.AERO;

/**
 *
 * @author Tanish
 * @co-author Purushothaman
 */
public class AERO_SEM5 extends javax.swing.JFrame {

    static float AE8501 = 0, AE8502 = 0, AE8503 = 0, AE8504 = 0, AE8505 = 0, OpenEle1 = 0, AE8511 = 0, AE8512 = 0, HS8581 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0, grade9 = 0;
    static float totalcredits = 24, credit1 = 4, credit2 = 4, credit3 = 3, credit4 = 3, credit5 = 3, credit6 = 3, credit7 = 2, credit8 = 1, credit9 = 1;
    static String num1, num2, num3, num4, num5, num6, num7, num8, num9;
    static float gpa5 = 0;
    static javax.swing.JFrame jframe5 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.AERO.AERO_SEM5
     */
    public AERO_SEM5() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPACalc = new javax.swing.JLabel();
        javax.swing.JLabel jLabelAE8501 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelAE8502 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelAE8503 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelAE8504 = new javax.swing.JLabel();
        jComboBoxAE8501 = new javax.swing.JComboBox<>();
        jComboBoxAE8502 = new javax.swing.JComboBox<>();
        jComboBoxAE8503 = new javax.swing.JComboBox<>();
        jComboBoxAE8504 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelAE8505 = new javax.swing.JLabel();
        jComboBoxAE8505 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelAE8511 = new javax.swing.JLabel();
        jComboBoxAE8511 = new javax.swing.JComboBox<>();
        javax.swing.JButton jButtonCalcGPA = new javax.swing.JButton();
        javax.swing.JLabel jLabelOpenEle1 = new javax.swing.JLabel();
        jComboBoxOpenEle1 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelAE8512 = new javax.swing.JLabel();
        jComboBoxAE8512 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelHS8581 = new javax.swing.JLabel();
        jComboBoxHS8581 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPACalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPACalc.setText("GPA CALCULATOR");

        jLabelAE8501.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelAE8501.setText("AE8501");

        jLabelAE8502.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelAE8502.setText("AE8502");

        jLabelAE8503.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelAE8503.setText("AE8503");

        jLabelAE8504.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelAE8504.setText("AE8504");

        jComboBoxAE8501.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxAE8501.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"-Select-", "O", "A+", "A", "B+", "B", "U"}));
        jComboBoxAE8501.addActionListener(evt -> jComboBoxAE8501ActionPerformed());

        jComboBoxAE8502.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxAE8502.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"-Select-", "O", "A+", "A", "B+", "B", "U"}));
        jComboBoxAE8502.addActionListener(evt -> jComboBoxAE8502ActionPerformed());

        jComboBoxAE8503.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxAE8503.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"-Select-", "O", "A+", "A", "B+", "B", "U"}));
        jComboBoxAE8503.addActionListener(evt -> jComboBoxAE8503ActionPerformed());

        jComboBoxAE8504.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxAE8504.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"-Select-", "O", "A+", "A", "B+", "B", "U"}));
        jComboBoxAE8504.addActionListener(evt -> jComboBoxAE8504ActionPerformed());

        jLabelAE8505.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelAE8505.setText("AE8505");

        jComboBoxAE8505.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxAE8505.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"-Select-", "O", "A+", "A", "B+", "B", "U"}));
        jComboBoxAE8505.addActionListener(evt -> jComboBoxAE8505ActionPerformed());

        jLabelAE8511.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelAE8511.setText("AE8511");

        jComboBoxAE8511.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxAE8511.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"-Select-", "O", "A+", "A", "B+", "B", "U"}));
        jComboBoxAE8511.addActionListener(evt -> jComboBoxAE8511ActionPerformed());

        jButtonCalcGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalcGPA.setText("CALCULATE ");
        jButtonCalcGPA.addActionListener(evt -> jButtonCalcGPAActionPerformed());

        jLabelOpenEle1.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelOpenEle1.setText("OpenEle1");

        jComboBoxOpenEle1.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxOpenEle1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"-Select-", "O", "A+", "A", "B+", "B", "U"}));
        jComboBoxOpenEle1.addActionListener(evt -> jComboBoxOpenEle1ActionPerformed());

        jLabelAE8512.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelAE8512.setText("AE8512");

        jComboBoxAE8512.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxAE8512.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"-Select-", "O", "A+", "A", "B+", "B", "U"}));
        jComboBoxAE8512.addActionListener(evt -> jComboBoxAE8512ActionPerformed());

        jLabelHS8581.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelHS8581.setText("HS8581");

        jComboBoxHS8581.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxHS8581.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"-Select-", "O", "A+", "A", "B+", "B", "U"}));
        jComboBoxHS8581.addActionListener(evt -> jComboBoxHS8581ActionPerformed());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonCalcGPA)
                                .addGap(277, 277, 277))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(266, 266, 266)
                                                                .addComponent(jLabelHS8581, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(35, 35, 35))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelAE8501, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelAE8502, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelAE8503, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelAE8504, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxAE8502, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxAE8501, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxAE8503, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxAE8504, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(58, 58, 58)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxHS8581, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelAE8505, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelAE8511, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelOpenEle1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelAE8512, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxAE8505, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxAE8511, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxOpenEle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxAE8512, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelGPACalc)
                                                .addGap(159, 159, 159)))
                                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabelGPACalc)
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelAE8501, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxAE8501, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelAE8502, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxAE8502, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelAE8503, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxAE8503, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelAE8504, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxAE8504, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(62, 62, 62)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelAE8511, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxAE8511, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(29, 29, 29)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelOpenEle1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxOpenEle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabelAE8505, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBoxAE8505, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelAE8512, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxAE8512, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelHS8581, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxHS8581, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addComponent(jButtonCalcGPA)
                                .addGap(52, 52, 52))
        );
        setBounds(0, 0, 755, 621);
    }

    private void jComboBoxAE8501ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxAE8501.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                AE8501 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                AE8501 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                AE8501 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                AE8501 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                AE8501 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade1 = AE8501 * credit1;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAE8502ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxAE8502.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                AE8502 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                AE8502 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                AE8502 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                AE8502 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                AE8502 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade2 = AE8502 * credit2;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAE8503ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxAE8503.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                AE8503 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                AE8503 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                AE8503 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                AE8503 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                AE8503 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade3 = AE8503 * credit3;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAE8504ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxAE8504.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                AE8504 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                AE8504 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                AE8504 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                AE8504 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                AE8504 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade4 = AE8504 * credit4;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAE8505ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxAE8505.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                AE8505 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                AE8505 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                AE8505 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                AE8505 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                AE8505 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade5 = AE8505 * credit5;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxOpenEle1ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxOpenEle1.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                OpenEle1 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                OpenEle1 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                OpenEle1 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                OpenEle1 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                OpenEle1 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade6 = OpenEle1 * credit6;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAE8511ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxAE8511.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                AE8511 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                AE8511 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                AE8511 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                AE8511 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                AE8511 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade7 = AE8511 * credit7;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAE8512ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxAE8512.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                AE8512 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                AE8512 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                AE8512 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                AE8512 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                AE8512 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade8 = AE8512 * credit8;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxHS8581ActionPerformed() {
        // TODO add your handling code here:
        try {
            num9 = ((String) jComboBoxHS8581.getSelectedItem());
            if ("O".equalsIgnoreCase(num9)) {
                HS8581 = 10;
            } else if ("A+".equalsIgnoreCase(num9)) {
                HS8581 = 9;
            } else if ("A".equalsIgnoreCase(num9)) {
                HS8581 = 8;
            } else if ("B+".equalsIgnoreCase(num9)) {
                HS8581 = 7;
            } else if ("B".equalsIgnoreCase(num9)) {
                HS8581 = 6;
            } else if ("U".equalsIgnoreCase(num9)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade9 = HS8581 * credit9;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jButtonCalcGPAActionPerformed() {
        // TODO add your handling code here:
        try {
            gpa5 = (grade1 + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8 + grade9);
            float result = gpa5 / totalcredits;
            javax.swing.JOptionPane.showMessageDialog(jframe5, "Your GPA Is :-  " + result);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxAE8502;
    private static javax.swing.JComboBox<String> jComboBoxAE8511;
    private static javax.swing.JComboBox<String> jComboBoxAE8512;
    private static javax.swing.JComboBox<String> jComboBoxOpenEle1;
    private static javax.swing.JComboBox<String> jComboBoxAE8503;
    private static javax.swing.JComboBox<String> jComboBoxAE8504;
    private static javax.swing.JComboBox<String> jComboBoxAE8505;
    private static javax.swing.JComboBox<String> jComboBoxHS8581;
    private static javax.swing.JComboBox<String> jComboBoxAE8501;
    // End of variables declaration
}

