package GPA.EEE;

/**
 * @author Praveenkumar
 * @co-author Purushothaman
 */
public class EEE_SEM8 extends javax.swing.JFrame {

    static float ProfElective5 = 0, ProfElective6 = 0, EE8811 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0;
    static float totalcredits = 16, credit1 = 3, credit2 = 3, credit3 = 10;
    static String num1, num2, num3;
    static float gpa8 = 0;
    static javax.swing.JFrame jframe8 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.EEE.EEE_SEM8
     */
    public EEE_SEM8() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabelGPAHead = new javax.swing.JLabel();
        javax.swing.JLabel jLabelProfEle5 = new javax.swing.JLabel();
        jComboBoxProfEle5 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelProfEle6 = new javax.swing.JLabel();
        jComboBoxProfEle6 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelEE8811 = new javax.swing.JLabel();
        jComboBoxEE8811 = new javax.swing.JComboBox<>();
        javax.swing.JButton jButtonCalcGPA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPAHead.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPAHead.setText("GPA CALCULATOR");

        jLabelProfEle5.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle5.setText("Prof. Elec. IV");

        jComboBoxProfEle5.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfEle5.addActionListener(evt -> jComboBoxProfEle5ActionPerformed());

        jLabelProfEle6.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle6.setText("Prof. Elec. V");

        jComboBoxProfEle6.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfEle6.addActionListener(evt -> jComboBoxProfEle6ActionPerformed());

        jLabelEE8811.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEE8811.setText("EE8811");

        jComboBoxEE8811.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEE8811.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEE8811.addActionListener(evt -> jComboBoxEE8811ActionPerformed());

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
                                                        .addComponent(jLabelProfEle5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelProfEle6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelEE8811, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(55, 55, 55)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jComboBoxProfEle5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBoxProfEle6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBoxEE8811, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                                        .addComponent(jLabelProfEle5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxProfEle5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelProfEle6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxProfEle6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelEE8811, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxEE8811, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jComboBoxProfEle5ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxProfEle5.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                ProfElective5 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                ProfElective5 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                ProfElective5 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                ProfElective5 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                ProfElective5 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "Error ! Select Any Grade");
            }
            grade1 = ProfElective5 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe8, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxProfEle6ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxProfEle6.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                ProfElective6 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                ProfElective6 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                ProfElective6 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                ProfElective6 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                ProfElective6 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "Error ! Select Any Grade");
            }
            grade2 = ProfElective6 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe8, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEE8811ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxEE8811.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                EE8811 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                EE8811 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                EE8811 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                EE8811 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                EE8811 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "Error ! Select Any Grade");
            }
            grade3 = EE8811 * credit3;
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
    private static javax.swing.JComboBox<String> jComboBoxProfEle5;
    private static javax.swing.JComboBox<String> jComboBoxProfEle6;
    private static javax.swing.JComboBox<String> jComboBoxEE8811;
    //End of variables declaration
}