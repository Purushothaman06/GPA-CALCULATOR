package GPA.MECH;

/**
 *
 * @author Purushothaman
 */
public class MECH_SEM6 extends javax.swing.JFrame {

    static float ME8651 = 0, ME8691 = 0, ME8693 = 0, ME8692 = 0, ME8694 = 0, ProfEle1 = 0, ME8681 = 0, ME8682 = 0, HS8581 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0, grade9 = 0;
    static float totalcredits = 24, credit1 = 3 , credit2 = 3 , credit3 = 4 , credit4 = 3 , credit5 = 3 , credit6 = 3 , credit7 = 2 , credit8 = 2, credit9 = 1;
    static String num1, num2, num3, num4, num5, num6, num7, num8, num9 ;
    static float gpa6 = 0;
    static javax.swing.JFrame jframe6 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.MECH.MECH_SEM6
     */
    public MECH_SEM6() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPACalc = new javax.swing.JLabel();
        javax.swing.JLabel jLabelME8651 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelME8691 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelME8693 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelME8692 = new javax.swing.JLabel();
        jComboBoxME8651 = new javax.swing.JComboBox<>();
        jComboBoxME8691 = new javax.swing.JComboBox<>();
        jComboBoxME8693 = new javax.swing.JComboBox<>();
        jComboBoxME8692 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelME8694 = new javax.swing.JLabel();
        jComboBoxME8694 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelProfEle1 = new javax.swing.JLabel();
        jComboBoxProfEle1 = new javax.swing.JComboBox<>();
        javax.swing.JButton jButtonCalcGPA = new javax.swing.JButton();
        javax.swing.JLabel jLabelME8681 = new javax.swing.JLabel();
        jComboBoxME8681 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelME8682 = new javax.swing.JLabel();
        jComboBoxME8682 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelHS8581 = new javax.swing.JLabel();
        jComboBoxHS8581 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPACalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPACalc.setText("GPA CALCULATOR");

        jLabelME8651.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8651.setText("ME8651");

        jLabelME8691.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8691.setText("ME8691");

        jLabelME8693.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8693.setText("ME8693");

        jLabelME8692.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8692.setText("ME8692");

        jComboBoxME8651.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8651.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8651.addActionListener(evt -> jComboBoxME8651ActionPerformed());

        jComboBoxME8691.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8691.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8691.addActionListener(evt -> jComboBoxME8691ActionPerformed());

        jComboBoxME8693.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8693.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8693.addActionListener(evt -> jComboBoxME8693ActionPerformed());

        jComboBoxME8692.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8692.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8692.addActionListener(evt -> jComboBoxME8692ActionPerformed());

        jLabelME8694.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8694.setText("ME8694");

        jComboBoxME8694.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8694.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8694.addActionListener(evt -> jComboBoxME8694ActionPerformed());

        jLabelProfEle1.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle1.setText("Prof.Ele.I");

        jComboBoxProfEle1.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfEle1.addActionListener(evt -> jComboBoxProfEle1ActionPerformed());

        jButtonCalcGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalcGPA.setText("CALCULATE ");
        jButtonCalcGPA.addActionListener(evt -> jButtonCalcGPAActionPerformed());

        jLabelME8681.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8681.setText("ME8681");

        jComboBoxME8681.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8681.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8681.addActionListener(evt -> jComboBoxME8681ActionPerformed());

        jLabelME8682.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8682.setText("ME8682");

        jComboBoxME8682.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8682.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8682.addActionListener(evt -> jComboBoxME8682ActionPerformed());

        jLabelHS8581.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelHS8581.setText("HS8581");

        jComboBoxHS8581.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxHS8581.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
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
                                                                        .addComponent(jLabelME8651, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelME8691, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelME8693, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelME8692, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxME8691, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxME8651, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxME8693, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxME8692, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(58, 58, 58)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxHS8581, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelME8694, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelProfEle1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelME8681, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelME8682, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxME8694, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxProfEle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxME8681, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxME8682, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                                        .addComponent(jLabelME8651, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxME8651, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelME8691, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxME8691, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelME8693, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxME8693, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelME8692, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxME8692, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(62, 62, 62)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelProfEle1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxProfEle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(29, 29, 29)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelME8681, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxME8681, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabelME8694, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBoxME8694, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelME8682, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxME8682, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    private void jComboBoxME8651ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxME8651.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                ME8651 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                ME8651 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                ME8651 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                ME8651 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                ME8651 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade1 = ME8651 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxME8691ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxME8691.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                ME8691 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                ME8691 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                ME8691 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                ME8691 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                ME8691 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade2 = ME8691 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxME8693ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxME8693.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                ME8693 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                ME8693 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                ME8693 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                ME8693 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                ME8693 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade3 = ME8693 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxME8692ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxME8692.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                ME8692 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                ME8692 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                ME8692 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                ME8692 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                ME8692 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade4 = ME8692 * credit4;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxME8694ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxME8694.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                ME8694 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                ME8694 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                ME8694 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                ME8694 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                ME8694 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade5 = ME8694 * credit5;
        } catch (Exception e){
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
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxME8681ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxME8681.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                ME8681 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                ME8681 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                ME8681 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                ME8681 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                ME8681 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade7 = ME8681 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxME8682ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxME8682.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                ME8682 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                ME8682 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                ME8682 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                ME8682 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                ME8682 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade8 = ME8682 * credit8;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
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
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade9 = HS8581 * credit9;
        } catch (Exception e){
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
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxME8692;
    private static javax.swing.JComboBox<String> jComboBoxME8682;
    private static javax.swing.JComboBox<String> jComboBoxME8681;
    private static javax.swing.JComboBox<String> jComboBoxME8691;
    private static javax.swing.JComboBox<String> jComboBoxME8693;
    private static javax.swing.JComboBox<String> jComboBoxME8694;
    private static javax.swing.JComboBox<String> jComboBoxProfEle1;
    private static javax.swing.JComboBox<String> jComboBoxHS8581;
    private static javax.swing.JComboBox<String> jComboBoxME8651;
    // End of variables declaration
}

