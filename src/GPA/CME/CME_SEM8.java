package GPA.CME;

/**
 *
 * @author Tanish
 * @co-author Purushothaman
 */
public class CME_SEM8 extends javax.swing.JFrame {

    static float ProfEle5 = 0, ProfEle6 = 0, CH8811 = 0, CH8812 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0;
    static float totalcredits = 18, credit1 = 3, credit2 = 3, credit3 = 10, credit4 = 2;
    static String num1, num2, num3, num4;
    static float gpa8 = 0;
    static javax.swing.JFrame jframe8 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.CME.CME_SEM8
     */
    public CME_SEM8() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPACalc = new javax.swing.JLabel();
        javax.swing.JLabel jLabelProfEle5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelProfEle6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCH8811 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCH8812 = new javax.swing.JLabel();
        jComboBoxProfEle5 = new javax.swing.JComboBox<>();
        jComboBoxProfEle6 = new javax.swing.JComboBox<>();
        jComboBoxCH8811 = new javax.swing.JComboBox<>();
        jComboBoxCH8812 = new javax.swing.JComboBox<>();
        javax.swing.JButton jButtonCalc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPACalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPACalc.setText("GPA CALCULATOR");

        jLabelProfEle5.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle5.setText("Prof. Ele. 5");

        jLabelProfEle6.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle6.setText("Prof. Ele. 6");

        jLabelCH8811.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCH8811.setText("CH8811");

        jLabelCH8812.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCH8812.setText("CH8812");

        jComboBoxProfEle5.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfEle5.addActionListener(evt -> jComboBoxProfEle5ActionPerformed());

        jComboBoxProfEle6.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfEle6.addActionListener(evt -> jComboBoxProfEle6ActionPerformed());

        jComboBoxCH8811.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCH8811.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCH8811.addActionListener(evt -> jComboBoxCH8811ActionPerformed());

        jComboBoxCH8812.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCH8812.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCH8812.addActionListener(evt -> jComboBoxCH8812ActionPerformed());

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
                                                        .addComponent(jLabelProfEle5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelProfEle6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelCH8811, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelCH8812, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(71, 71, 71)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jComboBoxProfEle5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxCH8811, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxProfEle6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxCH8812, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                        .addComponent(jComboBoxProfEle5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelProfEle5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelProfEle6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxProfEle6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelCH8811, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxCH8811, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelCH8812)
                                        .addComponent(jComboBoxCH8812, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addComponent(jButtonCalc)
                                .addContainerGap(68, Short.MAX_VALUE))
        );
        pack();
    }

    private void jComboBoxProfEle5ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxProfEle5.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                ProfEle5 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                ProfEle5 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                ProfEle5 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                ProfEle5 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                ProfEle5 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "Error ! Select Any Grade");
            }
            grade1 = ProfEle5 * credit1;
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
                ProfEle6 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                ProfEle6 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                ProfEle6 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                ProfEle6 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                ProfEle6 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "Error ! Select Any Grade");
            }
            grade2 = ProfEle6 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe8, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCH8811ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxCH8811.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                CH8811 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                CH8811 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                CH8811 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                CH8811 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                CH8811 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "Error ! Select Any Grade");
            }
            grade3 = CH8811 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe8, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCH8812ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxCH8812.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                CH8812 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                CH8812 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                CH8812 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                CH8812 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                CH8812 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe8, "Error ! Select Any Grade");
            }
            grade4 = CH8812 * credit4;
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

    private static javax.swing.JComboBox<String> jComboBoxProfEle5;
    private static javax.swing.JComboBox<String> jComboBoxProfEle6;
    private static javax.swing.JComboBox<String> jComboBoxCH8811;
    private static javax.swing.JComboBox<String> jComboBoxCH8812;
    // End of variables declaration
}