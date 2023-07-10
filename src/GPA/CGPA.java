package GPA;

/**
 *
 * @author Purushothaman
 * @co-author Tanish
 */
public class CGPA extends javax.swing.JFrame {

    static float sem1 = 0, sem2 = 0, sem3 = 0, sem4 = 0, sem5 = 0, sem6 = 0, sem7 = 0, sem8 = 0;
    static float totalGPA = 0, result = 0;
    static float count = 0;
    static javax.swing.JFrame jframe;

    /**
     * Creates new form CGPA
     */
    public CGPA() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */

    public void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelSem1GPA = new javax.swing.JLabel();
        jTextFieldSem1GPA = new javax.swing.JTextField();
        jButtonLockGPA1 = new javax.swing.JButton();
        javax.swing.JLabel jLabelSem2GPA = new javax.swing.JLabel();
        jTextFieldSem2GPA = new javax.swing.JTextField();
        jButtonLockGPA2 = new javax.swing.JButton();
        javax.swing.JLabel jLabelSem3GPA = new javax.swing.JLabel();
        jTextFieldSem3GPA = new javax.swing.JTextField();
        jButtonLockGPA3 = new javax.swing.JButton();
        javax.swing.JLabel jLabelSem4GPA = new javax.swing.JLabel();
        jTextFieldSem4GPA = new javax.swing.JTextField();
        jButtonLockGPA4 = new javax.swing.JButton();
        javax.swing.JLabel jLabelSem5GPA = new javax.swing.JLabel();
        jTextFieldSem5GPA = new javax.swing.JTextField();
        jButtonLockGPA5 = new javax.swing.JButton();
        javax.swing.JLabel jLabelSem6GPA = new javax.swing.JLabel();
        jTextFieldSem6GPA = new javax.swing.JTextField();
        jButtonLockGPA6 = new javax.swing.JButton();
        javax.swing.JLabel jLabelSem7GPA = new javax.swing.JLabel();
        jTextFieldSem7GPA = new javax.swing.JTextField();
        jButtonLockGPA7 = new javax.swing.JButton();
        javax.swing.JLabel jLabelSem8GPA = new javax.swing.JLabel();
        jTextFieldSem8GPA = new javax.swing.JTextField();
        jButtonLockGPA8 = new javax.swing.JButton();
        jButtonCalcGPA = new javax.swing.JButton();
        jButtonCLEAR = new javax.swing.JButton();

        setTitle("Anna University Regulation - 2017");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabel1.setText("CGPA CALCULATOR");

        jLabelSem1GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelSem1GPA.setText("Enter Semester 1 GPA :-");

        jTextFieldSem1GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 12));

        jButtonLockGPA1.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 20));
        jButtonLockGPA1.setText("LOCK GPA");
        jButtonLockGPA1.addActionListener(this::jButtonLockGPA1ActionPerformed);

        jLabelSem2GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelSem2GPA.setText("Enter Semester 2 GPA :-");

        jTextFieldSem2GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 12));

        jButtonLockGPA2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 20));
        jButtonLockGPA2.setText("LOCK GPA");
        jButtonLockGPA2.addActionListener(this::jButtonLockGPA2ActionPerformed);

        jLabelSem3GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelSem3GPA.setText("Enter Semester 3 GPA :-");

        jTextFieldSem3GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 12));

        jButtonLockGPA3.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 20));
        jButtonLockGPA3.setText("LOCK GPA");
        jButtonLockGPA3.addActionListener(this::jButtonLockGPA3ActionPerformed);

        jLabelSem4GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelSem4GPA.setText("Enter Semester 4 GPA :-");

        jTextFieldSem4GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 12));

        jButtonLockGPA4.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 20));
        jButtonLockGPA4.setText("LOCK GPA");
        jButtonLockGPA4.addActionListener(this::jButtonLockGPA4ActionPerformed);

        jLabelSem5GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelSem5GPA.setText("Enter Semester 5 GPA :-");

        jTextFieldSem5GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 12));

        jButtonLockGPA5.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 20));
        jButtonLockGPA5.setText("LOCK GPA");
        jButtonLockGPA5.addActionListener(this::jButtonLockGPA5ActionPerformed);

        jLabelSem6GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelSem6GPA.setText("Enter Semester 6 GPA :-");

        jTextFieldSem6GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 12));

        jButtonLockGPA6.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 20));
        jButtonLockGPA6.setText("LOCK GPA");
        jButtonLockGPA6.addActionListener(this::jButtonLockGPA6ActionPerformed);

        jLabelSem7GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelSem7GPA.setText("Enter Semester 7 GPA :-");

        jTextFieldSem7GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 12));

        jButtonLockGPA7.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 20));
        jButtonLockGPA7.setText("LOCK GPA");
        jButtonLockGPA7.addActionListener(this::jButtonLockGPA7ActionPerformed);

        jLabelSem8GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelSem8GPA.setText("Enter Semester 8 GPA :-");

        jTextFieldSem8GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 12));

        jButtonLockGPA8.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 20));
        jButtonLockGPA8.setText("LOCK GPA");
        jButtonLockGPA8.addActionListener(this::jButtonLockGPA8ActionPerformed);

        jButtonCalcGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 20));
        jButtonCalcGPA.setText("CALCULATE CGPA");
        jButtonCalcGPA.addActionListener(this::jButtonCalcGPAActionPerformed);

        jButtonCLEAR.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 20));
        jButtonCLEAR.setText("CLEAR");
        jButtonCLEAR.addActionListener(this::jButtonCLEARActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabelSem6GPA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelSem5GPA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelSem1GPA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelSem2GPA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelSem3GPA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelSem4GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabelSem7GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelSem8GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldSem2GPA, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                        .addComponent(jTextFieldSem1GPA)
                                        .addComponent(jTextFieldSem7GPA)
                                        .addComponent(jTextFieldSem6GPA)
                                        .addComponent(jTextFieldSem5GPA)
                                        .addComponent(jTextFieldSem4GPA)
                                        .addComponent(jTextFieldSem3GPA)
                                        .addComponent(jTextFieldSem8GPA))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButtonLockGPA7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(jButtonLockGPA1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonLockGPA2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonLockGPA3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonLockGPA4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonLockGPA5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonLockGPA6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonLockGPA8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(25, 25, 25))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCLEAR)
                                .addGap(90, 90, 90)
                                .addComponent(jButtonCalcGPA)
                                .addGap(115, 115, 115))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelSem1GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldSem1GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonLockGPA1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelSem2GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldSem2GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonLockGPA2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelSem3GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldSem3GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonLockGPA3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelSem4GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldSem4GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonLockGPA4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelSem5GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldSem5GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonLockGPA5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelSem6GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldSem6GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonLockGPA6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelSem7GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldSem7GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonLockGPA7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelSem8GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldSem8GPA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonLockGPA8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonCLEAR)
                                        .addComponent(jButtonCalcGPA))
                                .addContainerGap(41, Short.MAX_VALUE))
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

    private void jButtonLockGPA2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (evt.getSource() == jButtonLockGPA2){
            String CSE2 = jTextFieldSem2GPA.getText();
            sem2 = Float.parseFloat(CSE2);
            count++;
        }
    }

    private void jButtonLockGPA3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (evt.getSource() == jButtonLockGPA3){
            String CSE3 = jTextFieldSem3GPA.getText();
            sem3 = Float.parseFloat(CSE3);
            count++;
        }
    }

    private void jButtonLockGPA6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (evt.getSource() == jButtonLockGPA6){
            String CSE6 = jTextFieldSem6GPA.getText();
            sem6 = Float.parseFloat(CSE6);
            count++;
        }
    }
    private void jButtonLockGPA7ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (evt.getSource() == jButtonLockGPA7){
            String CSE7 = jTextFieldSem7GPA.getText();
            sem7 = Float.parseFloat(CSE7);
            count++;
        }
    }

    private void jButtonLockGPA8ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (evt.getSource() == jButtonLockGPA8){
            String CSE8 = jTextFieldSem8GPA.getText();
            sem8 = Float.parseFloat(CSE8);
            count++;
        }
    }

    private void jButtonLockGPA1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (evt.getSource() == jButtonLockGPA1){
            String CSE1 = jTextFieldSem1GPA.getText();
            sem1 = Float.parseFloat(CSE1);
            count++;
        }
    }

    private void jButtonLockGPA4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (evt.getSource() == jButtonLockGPA4){
            String CSE4 = jTextFieldSem4GPA.getText();
            sem4 = Float.parseFloat(CSE4);
            count++;
        }
    }

    private void jButtonLockGPA5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (evt.getSource() == jButtonLockGPA5){
            String CSE5 = jTextFieldSem5GPA.getText();
            sem5 = Float.parseFloat(CSE5);
            count++;
        }
    }

    private void jButtonCLEARActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(evt.getSource() == jButtonCLEAR){
            setZero();
        }
        System.gc();
    }

    private void jButtonCalcGPAActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try {
            if (evt.getSource() == jButtonCalcGPA) {
                totalGPA = (sem1 + sem2 + sem3 + sem4 + sem5 + sem6 + sem7 + sem8);
                result = totalGPA / count;
                javax.swing.JOptionPane.showMessageDialog(jframe, "Your CGPA Is :-  " + result);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe,e.getMessage());
        }
        System.gc();
    }

    public void setZero(){
        jTextFieldSem1GPA.setText("");
        jTextFieldSem2GPA.setText("");
        jTextFieldSem3GPA.setText("");
        jTextFieldSem4GPA.setText("");
        jTextFieldSem5GPA.setText("");
        jTextFieldSem6GPA.setText("");
        jTextFieldSem7GPA.setText("");
        jTextFieldSem8GPA.setText("");
        count = 0;
    }

    // Variables declaration
    private static javax.swing.JButton jButtonCLEAR;
    private static javax.swing.JButton jButtonCalcGPA;
    private static javax.swing.JButton jButtonLockGPA1;
    private static javax.swing.JButton jButtonLockGPA2;
    private static javax.swing.JButton jButtonLockGPA3;
    private static javax.swing.JButton jButtonLockGPA4;
    private static javax.swing.JButton jButtonLockGPA5;
    private static javax.swing.JButton jButtonLockGPA6;
    private static javax.swing.JButton jButtonLockGPA7;
    private static javax.swing.JButton jButtonLockGPA8;
    private static javax.swing.JTextField jTextFieldSem1GPA;
    private static javax.swing.JTextField jTextFieldSem2GPA;
    private static javax.swing.JTextField jTextFieldSem3GPA;
    private static javax.swing.JTextField jTextFieldSem4GPA;
    private static javax.swing.JTextField jTextFieldSem5GPA;
    private static javax.swing.JTextField jTextFieldSem6GPA;
    private static javax.swing.JTextField jTextFieldSem7GPA;
    private static javax.swing.JTextField jTextFieldSem8GPA;
    // End of variables declaration
}
