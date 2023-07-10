package GPA.CVL;

/**
 * @author Praveenkumar
 * @co-author Purushothaman
 */
public class CVL_SEM8 extends javax.swing.JFrame {

    static float ProfElective4 = 0, ProfElective5 = 0, CE8811 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0;
    static float totalcredits = 16, credit1 = 3, credit2 = 3, credit3 = 10;
    static String num1, num2, num3;
    static float gpa8 = 0;
    static javax.swing.JFrame jframe8 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.CVL.CVL_SEM8
     */
    public CVL_SEM8() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */

    public void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabelGPAHead = new javax.swing.JLabel();
        javax.swing.JLabel jLabelProfELe4 = new javax.swing.JLabel();
        jComboBoxProfEle4 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelProfEle5 = new javax.swing.JLabel();
        jComboBoxProfEle5 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelCE8811 = new javax.swing.JLabel();
        jComboBoxCE8811 = new javax.swing.JComboBox<>();
        javax.swing.JButton jButtonCalcGPA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPAHead.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPAHead.setText("GPA CALCULATOR");

        jLabelProfELe4.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfELe4.setText("Prof. Elec. IV");

        jComboBoxProfEle4.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfEle4.addActionListener(evt -> jComboBoxProfEle4ActionPerformed());

        jLabelProfEle5.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle5.setText("Prof. Elec. V");

        jComboBoxProfEle5.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfEle5.addActionListener(evt -> jComboBoxProfEle5ActionPerformed());

        jLabelCE8811.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCE8811.setText("CE8811");

        jComboBoxCE8811.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCE8811.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCE8811.addActionListener(evt -> jComboBoxProjectActionPerformed());

        jButtonCalcGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 20));
        jButtonCalcGPA.setText("CALCULATE GPA");
        jButtonCalcGPA.addActionListener(evt -> jButtonCalcGPAActionPerformed());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(261, 261, 261)
                                                .addComponent(jLabelGPAHead))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(127, 127, 127)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelProfELe4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelProfEle5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelCE8811, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(55, 55, 55)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jComboBoxProfEle4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBoxProfEle5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBoxCE8811, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(274, 274, 274)
                                                .addComponent(jButtonCalcGPA)))
                                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabelGPAHead)
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelProfELe4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxProfEle4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelProfEle5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxProfEle5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelCE8811, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxCE8811, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addComponent(jButtonCalcGPA)
                                .addContainerGap(151, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
    }

    private void jComboBoxProfEle4ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxProfEle4.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                ProfElective4 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                ProfElective4 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                ProfElective4 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                ProfElective4 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                ProfElective4 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "Error ! Select Any Grade");
            }
            grade1 = ProfElective4 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe8, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxProfEle5ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxProfEle5.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                ProfElective5 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                ProfElective5 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                ProfElective5 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                ProfElective5 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                ProfElective5 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "Error ! Select Any Grade");
            }
            grade2 = ProfElective5 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe8, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxProjectActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxCE8811.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                CE8811 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                CE8811 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                CE8811 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                CE8811 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                CE8811 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "Error ! Select Any Grade");
            }
            grade3 = CE8811 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe8, e.getMessage());
        }
        System.gc();
    }

    private void jButtonCalcGPAActionPerformed() {
        // TODO add your handling code here:
        try {
            gpa8 = (grade1 + grade2 + grade3);
            float result = gpa8 / totalcredits;
            javax.swing.JOptionPane.showMessageDialog(jframe8, "Your GPA Is :-  " + result);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe8, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxProfEle4;
    private static javax.swing.JComboBox<String> jComboBoxProfEle5;
    private static javax.swing.JComboBox<String> jComboBoxCE8811;
    // End of variables declaration
}