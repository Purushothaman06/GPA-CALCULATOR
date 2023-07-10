package GPA.ECE;

/**
 *
 * @author Purushothaman
 */
public class ECE_SEM6 extends javax.swing.JFrame {

    static float EC8691 = 0, EC8095 = 0, EC8652 = 0, MG8591 = 0, EC8651 = 0, ProfEle2 = 0, EC8681= 0, EC8661 = 0, EC8611 = 0, HS8581=0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0, grade9 = 0, grade10 = 0;
    static float totalcredits = 24, credit1 = 3 , credit2 = 3 , credit3 = 3 , credit4 = 3 , credit5 = 3 , credit6 = 3 , credit7 = 2 , credit8 = 2, credit9 = 1, credit10 = 1;
    static String num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
    static float gpa6 = 0;
    static javax.swing.JFrame jframe6 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.ECE.ECE_SEM6
     */
    public ECE_SEM6() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPACalc = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEC8691 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEC8095 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEC8652 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelMG8591 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEC8651 = new javax.swing.JLabel();
        jComboBoxEC8691 = new javax.swing.JComboBox<>();
        jComboBoxEC8095 = new javax.swing.JComboBox<>();
        jComboBoxEC8652 = new javax.swing.JComboBox<>();
        jComboBoxMG8591 = new javax.swing.JComboBox<>();
        jComboBoxEC8651 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelProfEle2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEC8681 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEC8661 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEC8611 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelHS8581 = new javax.swing.JLabel();
        jComboBoxProfEle2 = new javax.swing.JComboBox<>();
        jComboBoxEC8681 = new javax.swing.JComboBox<>();
        jComboBoxEC8661 = new javax.swing.JComboBox<>();
        jComboBoxEC8611 = new javax.swing.JComboBox<>();
        jComboBoxHS8581 = new javax.swing.JComboBox<>();
        javax.swing.JButton jButtonCalc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPACalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 28));
        jLabelGPACalc.setText("GPA CALCULATOR");

        jLabelEC8691.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8691.setText("EC8691");

        jLabelEC8095.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8095.setText("EC8095");

        jLabelEC8652.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8652.setText("EC8652");

        jLabelMG8591.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMG8591.setText("MG8591");

        jLabelEC8651.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8651.setText("EC8651");

        jComboBoxEC8691.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8691.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8691.addActionListener(evt -> jComboBoxEC8691ActionPerformed());

        jComboBoxEC8095.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8095.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8095.addActionListener(evt -> jComboBoxEC8095ActionPerformed());

        jComboBoxEC8652.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8652.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8652.addActionListener(evt -> jComboBoxEC8652ActionPerformed());

        jComboBoxMG8591.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMG8591.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMG8591.addActionListener(evt -> jComboBoxMG8591ActionPerformed());

        jComboBoxEC8651.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8651.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8651.addActionListener(evt -> jComboBoxEC8651ActionPerformed());

        jLabelProfEle2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle2.setText("Prof. Ele. II");

        jLabelEC8681.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8681.setText("EC8681");

        jLabelEC8661.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8661.setText("EC8661");

        jLabelEC8611.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8611.setText("EC8611");

        jLabelHS8581.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelHS8581.setText("HS8581");

        jComboBoxProfEle2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfEle2.addActionListener(evt -> jComboBoxProfEle2ActionPerformed());

        jComboBoxEC8681.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8681.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8681.addActionListener(evt -> jComboBoxEC8681ActionPerformed());

        jComboBoxEC8661.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8661.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8661.addActionListener(evt -> jComboBoxEC8661ActionPerformed());

        jComboBoxEC8611.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8611.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8611.addActionListener(evt -> jComboBoxEC8611ActionPerformed());

        jComboBoxHS8581.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxHS8581.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxHS8581.addActionListener(evt -> jComboBoxHS8581ActionPerformed());

        jButtonCalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 24));
        jButtonCalc.setText("CALCULATE");
        jButtonCalc.addActionListener(evt -> jButtonCalcGPAActionPerformed());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelEC8691, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelEC8095, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelEC8652, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelMG8591, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelEC8651, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jComboBoxMG8591, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxEC8651, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxEC8652, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxEC8095, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxEC8691, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelProfEle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelEC8661, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelEC8681, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelHS8581, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelEC8611, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBoxProfEle2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxEC8681, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxEC8661, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxEC8611, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxHS8581, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(63, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonCalc)
                                .addGap(308, 308, 308))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelGPACalc)
                                .addGap(272, 272, 272))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabelGPACalc)
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelEC8691)
                                        .addComponent(jComboBoxEC8691, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelProfEle2)
                                        .addComponent(jComboBoxProfEle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelEC8095)
                                        .addComponent(jComboBoxEC8095, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelEC8681)
                                        .addComponent(jComboBoxEC8681, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelEC8652)
                                        .addComponent(jComboBoxEC8652, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelEC8661)
                                        .addComponent(jComboBoxEC8661, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelMG8591)
                                        .addComponent(jComboBoxMG8591, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelEC8611)
                                        .addComponent(jComboBoxEC8611, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelEC8651)
                                        .addComponent(jComboBoxEC8651, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelHS8581)
                                        .addComponent(jComboBoxHS8581, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(jButtonCalc)
                                .addGap(32, 32, 32))
        );
        pack();
    }

    private void jComboBoxEC8691ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxEC8691.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                EC8691 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                EC8691 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                EC8691 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                EC8691 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                EC8691 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade1 = EC8691 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8095ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxEC8095.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                EC8095 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                EC8095 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                EC8095 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                EC8095 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                EC8095 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade2 = EC8095 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8652ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxEC8652.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                EC8652 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                EC8652 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                EC8652 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                EC8652 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                EC8652 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade3 = EC8652 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxMG8591ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxMG8591.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                MG8591 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                MG8591 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                MG8591 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                MG8591 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                MG8591 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade4 = MG8591 * credit4;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8651ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxEC8651.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                EC8651 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                EC8651 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                EC8651 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                EC8651 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                EC8651 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade5 = EC8651 * credit5;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxProfEle2ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxProfEle2.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                ProfEle2 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                ProfEle2 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                ProfEle2 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                ProfEle2 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                ProfEle2 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade6 = ProfEle2 * credit6;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8681ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxEC8681.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                EC8681 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                EC8681 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                EC8681 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                EC8681 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                EC8681 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade7 = EC8681 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8661ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxEC8661.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                EC8661 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                EC8661 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                EC8661 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                EC8661 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                EC8661 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade8 = EC8661 * credit8;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8611ActionPerformed() {
        // TODO add your handling code here:
        try {
            num9 = ((String) jComboBoxEC8611.getSelectedItem());
            if ("O".equalsIgnoreCase(num9)) {
                EC8611 = 10;
            } else if ("A+".equalsIgnoreCase(num9)) {
                EC8611 = 9;
            } else if ("A".equalsIgnoreCase(num9)) {
                EC8611 = 8;
            } else if ("B+".equalsIgnoreCase(num9)) {
                EC8611 = 7;
            } else if ("B".equalsIgnoreCase(num9)) {
                EC8611 = 6;
            } else if ("U".equalsIgnoreCase(num9)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade9 = EC8611 * credit9;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxHS8581ActionPerformed() {
        // TODO add your handling code here:
        try {
            num10 = ((String) jComboBoxHS8581.getSelectedItem());
            if ("O".equalsIgnoreCase(num10)) {
                HS8581 = 10;
            } else if ("A+".equalsIgnoreCase(num10)) {
                HS8581 = 9;
            } else if ("A".equalsIgnoreCase(num10)) {
                HS8581 = 8;
            } else if ("B+".equalsIgnoreCase(num10)) {
                HS8581 = 7;
            } else if ("B".equalsIgnoreCase(num10)) {
                HS8581 = 6;
            } else if ("U".equalsIgnoreCase(num10)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade10 = HS8581 * credit10;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jButtonCalcGPAActionPerformed() {
        // TODO add your handling code here:
        try {
            gpa6 = (grade1 + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8 + grade9 + grade10);
            float result = gpa6 / totalcredits;
            javax.swing.JOptionPane.showMessageDialog(jframe6, "Your GPA Is :-  " + result);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private javax.swing.JComboBox<String> jComboBoxEC8691;
    private javax.swing.JComboBox<String> jComboBoxHS8581;
    private javax.swing.JComboBox<String> jComboBoxEC8095;
    private javax.swing.JComboBox<String> jComboBoxEC8652;
    private javax.swing.JComboBox<String> jComboBoxMG8591;
    private javax.swing.JComboBox<String> jComboBoxEC8651;
    private javax.swing.JComboBox<String> jComboBoxProfEle2;
    private javax.swing.JComboBox<String> jComboBoxEC8681;
    private javax.swing.JComboBox<String> jComboBoxEC8661;
    private javax.swing.JComboBox<String> jComboBoxEC8611;
    // End of variables declaration
}
