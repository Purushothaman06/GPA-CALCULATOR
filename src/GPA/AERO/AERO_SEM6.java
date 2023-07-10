package GPA.AERO;

/**
 *
 * @author Tanish
 * @co-author Purushothaman
 */
public class AERO_SEM6 extends javax.swing.JFrame {

    static float AE8601 = 0, AE8602 = 0, AE8603 = 0, AE8604 = 0, AE8605 = 0, ProfEle1 = 0, AE8611 = 0, AE8612 = 0, AE8613 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0, grade9 = 0;
    static float totalcredits = 23, credit1 = 3, credit2 = 3, credit3 = 3, credit4 = 3, credit5 = 3, credit6 = 3, credit7 = 2, credit8 = 2, credit9 = 1;
    static String num1, num2, num3, num4, num5, num6, num7, num8, num9;
    static float gpa6 = 0;
    static javax.swing.JFrame jframe6 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.AERO.AERO_SEM6
     */
    public AERO_SEM6() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPACalc = new javax.swing.JLabel();
        javax.swing.JLabel jLabelAE8601 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelAE8602 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelAE8603 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelAE8604 = new javax.swing.JLabel();
        jComboBoxAE8601 = new javax.swing.JComboBox<>();
        jComboBoxAE8602 = new javax.swing.JComboBox<>();
        jComboBoxAE8603 = new javax.swing.JComboBox<>();
        jComboBoxAE8604 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelAE8605 = new javax.swing.JLabel();
        jComboBoxAE8605 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelAE8611 = new javax.swing.JLabel();
        jComboBoxAE8611 = new javax.swing.JComboBox<>();
        javax.swing.JButton jButtonCalcGPA = new javax.swing.JButton();
        javax.swing.JLabel jLabelProfEle1 = new javax.swing.JLabel();
        jComboBoxProfEle1 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelAE8612 = new javax.swing.JLabel();
        jComboBoxAE8612 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelAE8613 = new javax.swing.JLabel();
        jComboBoxAE8613 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPACalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPACalc.setText("GPA CALCULATOR");

        jLabelAE8601.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelAE8601.setText("AE8601");

        jLabelAE8602.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelAE8602.setText("AE8602");

        jLabelAE8603.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelAE8603.setText("AE8603");

        jLabelAE8604.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelAE8604.setText("AE8604");

        jComboBoxAE8601.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxAE8601.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"-Select-", "O", "A+", "A", "B+", "B", "U"}));
        jComboBoxAE8601.addActionListener(evt -> jComboBoxAE8601ActionPerformed());

        jComboBoxAE8602.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxAE8602.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"-Select-", "O", "A+", "A", "B+", "B", "U"}));
        jComboBoxAE8602.addActionListener(evt -> jComboBoxAE8602ActionPerformed());

        jComboBoxAE8603.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxAE8603.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"-Select-", "O", "A+", "A", "B+", "B", "U"}));
        jComboBoxAE8603.addActionListener(evt -> jComboBoxAE8603ActionPerformed());

        jComboBoxAE8604.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxAE8604.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"-Select-", "O", "A+", "A", "B+", "B", "U"}));
        jComboBoxAE8604.addActionListener(evt -> jComboBoxAE8604ActionPerformed());

        jLabelAE8605.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelAE8605.setText("AE8605");

        jComboBoxAE8605.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxAE8605.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"-Select-", "O", "A+", "A", "B+", "B", "U"}));
        jComboBoxAE8605.addActionListener(evt -> jComboBoxAE8605ActionPerformed());

        jLabelAE8611.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelAE8611.setText("AE8611");

        jComboBoxAE8611.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxAE8611.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"-Select-", "O", "A+", "A", "B+", "B", "U"}));
        jComboBoxAE8611.addActionListener(evt -> jComboBoxAE8611ActionPerformed());

        jButtonCalcGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalcGPA.setText("CALCULATE ");
        jButtonCalcGPA.addActionListener(evt -> jButtonCalcGPAActionPerformed());

        jLabelProfEle1.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle1.setText("ProfEle1");

        jComboBoxProfEle1.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"-Select-", "O", "A+", "A", "B+", "B", "U"}));
        jComboBoxProfEle1.addActionListener(evt -> jComboBoxProfEle1ActionPerformed());

        jLabelAE8612.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelAE8612.setText("AE8612");

        jComboBoxAE8612.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxAE8612.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"-Select-", "O", "A+", "A", "B+", "B", "U"}));
        jComboBoxAE8612.addActionListener(evt -> jComboBoxAE8612ActionPerformed());

        jLabelAE8613.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelAE8613.setText("AE8613");

        jComboBoxAE8613.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxAE8613.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"-Select-", "O", "A+", "A", "B+", "B", "U"}));
        jComboBoxAE8613.addActionListener(evt -> jComboBoxAE8613ActionPerformed());

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
                                                                .addComponent(jLabelAE8613, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(35, 35, 35))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelAE8601, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelAE8602, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelAE8603, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelAE8604, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxAE8602, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxAE8601, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxAE8603, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxAE8604, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(58, 58, 58)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxAE8613, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelAE8605, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelAE8611, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelProfEle1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelAE8612, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxAE8605, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxAE8611, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxProfEle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxAE8612, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                                        .addComponent(jLabelAE8601, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxAE8601, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelAE8602, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxAE8602, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelAE8603, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxAE8603, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelAE8604, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxAE8604, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(62, 62, 62)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelAE8611, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxAE8611, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(29, 29, 29)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelProfEle1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxProfEle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabelAE8605, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBoxAE8605, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelAE8612, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxAE8612, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelAE8613, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxAE8613, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addComponent(jButtonCalcGPA)
                                .addGap(52, 52, 52))
        );
        setBounds(0, 0, 755, 621);
    }

    private void jComboBoxAE8601ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxAE8601.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                AE8601 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                AE8601 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                AE8601 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                AE8601 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                AE8601 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade1 = AE8601 * credit1;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAE8602ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxAE8602.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                AE8602 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                AE8602 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                AE8602 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                AE8602 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                AE8602 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade2 = AE8602 * credit2;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAE8603ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxAE8603.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                AE8603 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                AE8603 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                AE8603 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                AE8603 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                AE8603 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade3 = AE8603 * credit3;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAE8604ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxAE8604.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                AE8604 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                AE8604 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                AE8604 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                AE8604 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                AE8604 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade4 = AE8604 * credit4;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAE8605ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxAE8605.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                AE8605 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                AE8605 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                AE8605 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                AE8605 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                AE8605 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade5 = AE8605 * credit5;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxProfEle1ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxProfEle1.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                ProfEle1 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                ProfEle1 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                ProfEle1 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                ProfEle1 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                ProfEle1 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade6 = ProfEle1 * credit6;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAE8611ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxAE8611.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                AE8611 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                AE8611 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                AE8611 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                AE8611 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                AE8611 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade7 = AE8611 * credit7;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAE8612ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxAE8612.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                AE8612 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                AE8612 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                AE8612 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                AE8612 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                AE8612 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade8 = AE8612 * credit8;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAE8613ActionPerformed() {
        // TODO add your handling code here:
        try {
            num9 = ((String) jComboBoxAE8613.getSelectedItem());
            if ("O".equalsIgnoreCase(num9)) {
                AE8613 = 10;
            } else if ("A+".equalsIgnoreCase(num9)) {
                AE8613 = 9;
            } else if ("A".equalsIgnoreCase(num9)) {
                AE8613 = 8;
            } else if ("B+".equalsIgnoreCase(num9)) {
                AE8613 = 7;
            } else if ("B".equalsIgnoreCase(num9)) {
                AE8613 = 6;
            } else if ("U".equalsIgnoreCase(num9)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade9 = AE8613 * credit9;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jButtonCalcGPAActionPerformed() {
        // TODO add your handling code here:
        try {
            gpa6 = (grade1 + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8 + grade9);
            float result = gpa6 / totalcredits;
            javax.swing.JOptionPane.showMessageDialog(jframe6, "Your GPA Is :-  " + result);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxAE8602;
    private static javax.swing.JComboBox<String> jComboBoxAE8611;
    private static javax.swing.JComboBox<String> jComboBoxAE8612;
    private static javax.swing.JComboBox<String> jComboBoxProfEle1;
    private static javax.swing.JComboBox<String> jComboBoxAE8603;
    private static javax.swing.JComboBox<String> jComboBoxAE8604;
    private static javax.swing.JComboBox<String> jComboBoxAE8605;
    private static javax.swing.JComboBox<String> jComboBoxAE8613;
    private static javax.swing.JComboBox<String> jComboBoxAE8601;
    // End of variables declaration
}

