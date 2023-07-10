package GPA.MAE;

/**
 *
 * @author Purushothaman
 */
public class MAE_SEM8 extends javax.swing.JFrame {

    static float ME8099 = 0, ProfElec4 = 0, ProfElec5 = 0, AN8811 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0;
    static float totalcredits = 19, credit1 = 3, credit2 = 3, credit3 = 3, credit4 = 10;
    static String num1, num2, num3, num4;
    static float gpa8 = 0;
    static javax.swing.JFrame jframe8 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.MAE.MAE_SEM8
     */
    public MAE_SEM8() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPACalc = new javax.swing.JLabel();
        javax.swing.JLabel jLabelME8099 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelProfElec4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelProfElec5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelAN8811 = new javax.swing.JLabel();
        jComboBoxME8099 = new javax.swing.JComboBox<>();
        jComboBoxProfElec4 = new javax.swing.JComboBox<>();
        jComboBoxProfElec5 = new javax.swing.JComboBox<>();
        jComboBoxAN8811 = new javax.swing.JComboBox<>();
        javax.swing.JButton jButtonCalc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPACalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPACalc.setText("GPA CALCULATOR");

        jLabelME8099.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8099.setText("ME8099");

        jLabelProfElec4.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfElec4.setText("Prof. Elec . IV");

        jLabelProfElec5.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfElec5.setText("Prof. Elec . V");

        jLabelAN8811.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelAN8811.setText("AN8811");

        jComboBoxME8099.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8099.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8099.addActionListener(evt -> jComboBoxME8099ActionPerformed());

        jComboBoxProfElec4.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfElec4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfElec4.addActionListener(evt -> jComboBoxProfElec4ActionPerformed());

        jComboBoxProfElec5.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfElec5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfElec5.addActionListener(evt -> jComboBoxProfElec5ActionPerformed());

        jComboBoxAN8811.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxAN8811.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxAN8811.addActionListener(evt -> jComboBoxAN8811ActionPerformed());

        jButtonCalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 20));
        jButtonCalc.setText("CALCULATE");
        jButtonCalc.addActionListener(evt -> jButtonCalcActionPerformed());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(165, 165, 165)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelME8099, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelProfElec4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelProfElec5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelAN8811, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(71, 71, 71)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jComboBoxProfElec4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxME8099, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxProfElec5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxAN8811, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(240, 240, 240)
                                                .addComponent(jLabelGPACalc, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(259, 259, 259)
                                                .addComponent(jButtonCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabelGPACalc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBoxME8099, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelME8099, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelProfElec4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxProfElec4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelProfElec5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxProfElec5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelAN8811)
                                        .addComponent(jComboBoxAN8811, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addComponent(jButtonCalc)
                                .addContainerGap(68, Short.MAX_VALUE))
        );
        pack();
    }

    private void jComboBoxME8099ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxME8099.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                ME8099 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                ME8099 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                ME8099 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                ME8099 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                ME8099 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "Error ! Select Any Grade");
            }
            grade1 = ME8099 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe8, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxProfElec4ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxProfElec4.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                ProfElec4 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                ProfElec4 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                ProfElec4 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                ProfElec4 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                ProfElec4 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "Error ! Select Any Grade");
            }
            grade2 = ProfElec4 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe8, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxProfElec5ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxProfElec5.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                ProfElec5 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                ProfElec5 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                ProfElec5 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                ProfElec5 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                ProfElec5 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "Error ! Select Any Grade");
            }
            grade3 = ProfElec5 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe8, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAN8811ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxAN8811.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                AN8811 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                AN8811 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                AN8811 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                AN8811 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                AN8811 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "Error ! Select Any Grade");
            }
            grade4 = AN8811 * credit4;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe8, e.getMessage());
        }
        System.gc();
    }

    private void jButtonCalcActionPerformed() {
        // TODO add your handling code here:
        try {
            gpa8 = (grade1 + grade2 + grade3 + grade4);
            float result = gpa8 / totalcredits;
            javax.swing.JOptionPane.showMessageDialog(jframe8, "Your GPA Is :-  " + result);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe8, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxAN8811;
    private static javax.swing.JComboBox<String> jComboBoxME8099;
    private static javax.swing.JComboBox<String> jComboBoxProfElec4;
    private static javax.swing.JComboBox<String> jComboBoxProfElec5;
    // End of variables declaration
}
