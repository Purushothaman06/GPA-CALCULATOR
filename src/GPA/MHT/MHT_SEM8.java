package GPA.MHT;

/**
 *
 * @author Praveenkumar
 * @co-author Purushothaman
 */
public class MHT_SEM8 extends javax.swing.JFrame {

    static float MT8801 = 0, ProfEle4 = 0, ProfEle5 = 0, MT8811 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0;
    static float totalcredits = 19, credit1 = 3, credit2 = 3, credit3 = 3, credit4 = 10;
    static String num1, num2, num3, num4;
    static float gpa8 = 0;
    static javax.swing.JFrame jframe8 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.MHT.MHT_SEM8
     */
    public MHT_SEM8() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPACalc = new javax.swing.JLabel();
        javax.swing.JLabel jLabelMT8801 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelProfEle4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelProfEle5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelMT8811 = new javax.swing.JLabel();
        jComboBoxMT8801 = new javax.swing.JComboBox<>();
        jComboBoxProfEle4 = new javax.swing.JComboBox<>();
        jComboBoxProfEle5 = new javax.swing.JComboBox<>();
        jComboBoxMT8811 = new javax.swing.JComboBox<>();
        javax.swing.JButton jButtonCalc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPACalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPACalc.setText("GPA CALCULATOR");

        jLabelMT8801.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMT8801.setText("MT8801");

        jLabelProfEle4.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle4.setText("Prof. Elec . IV");

        jLabelProfEle5.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle5.setText("Prof. Elec . V");

        jLabelMT8811.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMT8811.setText("MT8811");

        jComboBoxMT8801.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMT8801.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMT8801.addActionListener(evt -> jComboBoxMT8801ActionPerformed());

        jComboBoxProfEle4.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfEle4.addActionListener(evt -> jComboBoxProfEle4ActionPerformed());

        jComboBoxProfEle5.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfEle5.addActionListener(evt -> jComboBoxProfEle5ActionPerformed());

        jComboBoxMT8811.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMT8811.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMT8811.addActionListener(evt -> jComboBoxMT8811ActionPerformed());

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
                                                        .addComponent(jLabelMT8801, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelProfEle4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelProfEle5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelMT8811, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(71, 71, 71)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jComboBoxProfEle4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxMT8801, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxProfEle5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxMT8811, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                        .addComponent(jComboBoxMT8801, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelMT8801, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelProfEle4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxProfEle4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelProfEle5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxProfEle5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelMT8811)
                                        .addComponent(jComboBoxMT8811, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addComponent(jButtonCalc)
                                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }

    private void jComboBoxMT8801ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxMT8801.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                MT8801 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                MT8801 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                MT8801 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                MT8801 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                MT8801 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "Error ! Select Any Grade");
            }
            grade1 = MT8801 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe8, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxProfEle4ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxProfEle4.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                ProfEle4 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                ProfEle4 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                ProfEle4 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                ProfEle4 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                ProfEle4 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "Error ! Select Any Grade");
            }
            grade2 = ProfEle4 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe8, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxProfEle5ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxProfEle5.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                ProfEle5 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                ProfEle5 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                ProfEle5 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                ProfEle5 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                ProfEle5 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "Error ! Select Any Grade");
            }
            grade3 = ProfEle5 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe8, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxMT8811ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxMT8811.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                MT8811 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                MT8811 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                MT8811 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                MT8811 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                MT8811 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "Error ! Select Any Grade");
            }
            grade4 = MT8811 * credit4;
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
    private static javax.swing.JComboBox<String> jComboBoxMT8811;
    private static javax.swing.JComboBox<String> jComboBoxMT8801;
    private static javax.swing.JComboBox<String> jComboBoxProfEle4;
    private static javax.swing.JComboBox<String> jComboBoxProfEle5;
    // End of variables declaration
}