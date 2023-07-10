package GPA.CVL;

/**
 * @author Praveenkumar
 * @co-author Purushothaman
 */
public class CVL_SEM7 extends javax.swing.JFrame {

    static float CE8701 = 0, CE8702 = 0, CE8703 = 0, ProfEle3 = 0, OpenEle2 = 0, CE8711 = 0,CE8712 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0;
    static float totalcredits = 20, credit1 = 3 , credit2 = 3 , credit3 = 4 , credit4 = 3 , credit5 = 3 , credit6 = 2 , credit7 = 2;
    static String num1, num2, num3, num4, num5, num6, num7;
    static float gpa7 = 0;
    static javax.swing.JFrame jframe7 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.CVL.CVL_SEM7
     */
    public CVL_SEM7() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {
        javax.swing.JLabel jLabelGPACalc = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCE8701 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCE8702 = new javax.swing.JLabel();
        jComboBoxCE8701 = new javax.swing.JComboBox<>();
        javax.swing.JButton jButtonCalc = new javax.swing.JButton();
        javax.swing.JLabel jLabelCSE8703 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelProfEle3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelProfEle2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCE8711 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCE8712 = new javax.swing.JLabel();
        jComboBoxCE8702 = new javax.swing.JComboBox<>();
        jComboBoxCE8703 = new javax.swing.JComboBox<>();
        jComboBoxProfEle3 = new javax.swing.JComboBox<>();
        jComboBoxOpenEle2 = new javax.swing.JComboBox<>();
        jComboBoxCE8711 = new javax.swing.JComboBox<>();
        jComboBoxCE8712 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPACalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jLabelGPACalc.setText("GPA CALCULATOR");

        jLabelCE8701.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCE8701.setText("CE8701");

        jLabelCE8702.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCE8702.setText("CE8702");

        jComboBoxCE8701.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCE8701.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCE8701.setToolTipText("");
        jComboBoxCE8701.addActionListener(e -> jComboBoxCE8701ActionPerformed());

        jButtonCalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 20));
        jButtonCalc.setText("CALCULATE");
        jButtonCalc.addActionListener(e -> jButtonCalcActionPerformed());

        jLabelCSE8703.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCSE8703.setText("CE8703");

        jLabelProfEle3.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle3.setText("ProfEle3");

        jLabelProfEle2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle2.setText("OpenEle2");

        jLabelCE8711.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCE8711.setText("CE8711");

        jLabelCE8712.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCE8712.setText("CE8712");

        jComboBoxCE8702.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCE8702.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCE8702.addActionListener(e -> jComboBoxCE8702ActionPerformed());

        jComboBoxCE8703.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCE8703.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCE8703.addActionListener(e -> jComboBoxCE8703ActionPerformed());

        jComboBoxProfEle3.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfEle3.addActionListener(this::jComboBoxProfEle3ActionPerformed);

        jComboBoxOpenEle2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxOpenEle2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxOpenEle2.addActionListener(e -> jComboBoxOpenEle2ActionPerformed());

        jComboBoxCE8711.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCE8711.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCE8711.addActionListener(e -> jComboBoxCE8711ActionPerformed());

        jComboBoxCE8712.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCE8712.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCE8712.addActionListener(e -> jComboBoxCE8712ActionPerformed());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelGPACalc)
                                .addGap(219, 219, 219))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(78, 78, 78)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabelCE8702)
                                                                        .addComponent(jLabelCE8701)
                                                                        .addComponent(jLabelCSE8703))
                                                                .addGap(47, 47, 47)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jComboBoxCE8702, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxCE8701, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxCE8703, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jLabelCE8712))
                                                .addGap(67, 67, 67)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelCE8711)
                                                                        .addComponent(jLabelProfEle3)
                                                                        .addComponent(jLabelProfEle2))
                                                                .addGap(46, 46, 46)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxOpenEle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxCE8711, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxProfEle3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jComboBoxCE8712, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(250, 250, 250)
                                                .addComponent(jButtonCalc)))
                                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabelGPACalc)
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelCE8701)
                                        .addComponent(jComboBoxCE8701, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelProfEle3)
                                        .addComponent(jComboBoxProfEle3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelCE8702)
                                        .addComponent(jComboBoxCE8702, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelProfEle2)
                                        .addComponent(jComboBoxOpenEle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelCSE8703)
                                        .addComponent(jLabelCE8711)
                                        .addComponent(jComboBoxCE8711, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxCE8703, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelCE8712)
                                        .addComponent(jComboBoxCE8712, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addComponent(jButtonCalc)
                                .addGap(40, 40, 40))
        );
        pack();
    }

    private void jButtonCalcActionPerformed() {
        // TODO add your handling code here:
        try {
            gpa7 = (grade1  + grade2 + grade3 + grade4 + grade5 + grade6 + grade7) ;
            float result = gpa7 / totalcredits;
            javax.swing.JOptionPane.showMessageDialog(jframe7,"Your GPA Is :-  " + result);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCE8701ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxCE8701.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)){
                CE8701 =  10;
            }else if ("A+".equalsIgnoreCase(num1)){
                CE8701 =  9;
            }else if ("A".equalsIgnoreCase(num1)){
                CE8701 =  8;
            }else if("B+".equalsIgnoreCase(num1)){
                CE8701 =  7;
            }else if("B".equalsIgnoreCase(num1)){
                CE8701 =  6;
            }else if ("U".equalsIgnoreCase(num1)){
                javax.swing.JOptionPane.showMessageDialog(jframe7,"You Have Arrears !");
            }else {
                javax.swing.JOptionPane.showMessageDialog(jframe7,"Error ! Select Any Grade");
            }
            grade1 = CE8701 * credit1 ;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCE8702ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxCE8702.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)){
                CE8702 =  10;
            }else if ("A+".equalsIgnoreCase(num2)){
                CE8702 =  9;
            }else if ("A".equalsIgnoreCase(num2)){
                CE8702 =  8;
            }else if("B+".equalsIgnoreCase(num2)){
                CE8702 =  7;
            }else if("B".equalsIgnoreCase(num2)){
                CE8702 =  6;
            }else if ("U".equalsIgnoreCase(num2)){
                javax.swing.JOptionPane.showMessageDialog(jframe7,"You Have Arrears !");
            }else {
                javax.swing.JOptionPane.showMessageDialog(jframe7,"Error ! Select Any Grade");
            }
            grade2 = CE8702 * credit2 ;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCE8703ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxCE8703.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)){
                CE8703 =  10;
            }else if ("A+".equalsIgnoreCase(num3)){
                CE8703 =  9;
            }else if ("A".equalsIgnoreCase(num3)){
                CE8703 =  8;
            }else if("B+".equalsIgnoreCase(num3)){
                CE8703 =  7;
            }else if("B".equalsIgnoreCase(num3)){
                CE8703 =  6;
            }else if ("U".equalsIgnoreCase(num3)){
                javax.swing.JOptionPane.showMessageDialog(jframe7,"You Have Arrears !");
            }else {
                javax.swing.JOptionPane.showMessageDialog(jframe7,"Error ! Select Any Grade");
            }
            grade3 = CE8703 * credit3 ;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxProfEle3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxProfEle3.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)){
                ProfEle3 =  10;
            }else if ("A+".equalsIgnoreCase(num4)){
                ProfEle3 =  9;
            }else if ("A".equalsIgnoreCase(num4)){
                ProfEle3 =  8;
            }else if("B+".equalsIgnoreCase(num4)){
                ProfEle3 =  7;
            }else if("B".equalsIgnoreCase(num4)){
                ProfEle3 =  6;
            }else if ("U".equalsIgnoreCase(num4)){
                javax.swing.JOptionPane.showMessageDialog(jframe7,"You Have Arrears !");
            }else {
                javax.swing.JOptionPane.showMessageDialog(jframe7,"Error ! Select Any Grade");
            }
            grade4 = ProfEle3 * credit4 ;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxOpenEle2ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxOpenEle2.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)){
                OpenEle2 =  10;
            }else if ("A+".equalsIgnoreCase(num5)){
                OpenEle2 =  9;
            }else if ("A".equalsIgnoreCase(num5)){
                OpenEle2 =  8;
            }else if("B+".equalsIgnoreCase(num5)){
                OpenEle2 =  7;
            }else if("B".equalsIgnoreCase(num5)){
                OpenEle2 =  6;
            }else if ("U".equalsIgnoreCase(num5)){
                javax.swing.JOptionPane.showMessageDialog(jframe7,"You Have Arrears !");
            }else {
                javax.swing.JOptionPane.showMessageDialog(jframe7,"Error ! Select Any Grade");
            }
            grade5 = OpenEle2 * credit5 ;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCE8711ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxCE8711.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)){
                CE8711 =  10;
            }else if ("A+".equalsIgnoreCase(num6)){
                CE8711 =  9;
            }else if ("A".equalsIgnoreCase(num6)){
                CE8711 =  8;
            }else if("B+".equalsIgnoreCase(num6)){
                CE8711 =  7;
            }else if("B".equalsIgnoreCase(num6)){
                CE8711 =  6;
            }else if ("U".equalsIgnoreCase(num6)){
                javax.swing.JOptionPane.showMessageDialog(jframe7,"You Have Arrears !");
            }else {
                javax.swing.JOptionPane.showMessageDialog(jframe7,"Error ! Select Any Grade");
            }
            grade6 = CE8711 * credit6 ;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCE8712ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxCE8712.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)){
                CE8712 =  10;
            }else if ("A+".equalsIgnoreCase(num7)){
                CE8712 =  9;
            }else if ("A".equalsIgnoreCase(num7)){
                CE8712 =  8;
            }else if("B+".equalsIgnoreCase(num7)){
                CE8712 =  7;
            }else if("B".equalsIgnoreCase(num7)){
                CE8712 =  6;
            }else if ("U".equalsIgnoreCase(num7)){
                javax.swing.JOptionPane.showMessageDialog(jframe7,"You Have Arrears !");
            }else {
                javax.swing.JOptionPane.showMessageDialog(jframe7,"Error ! Select Any Grade");
            }
            grade7 = CE8712 * credit7 ;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxCE8701;
    private static javax.swing.JComboBox<String> jComboBoxCE8702;
    private static javax.swing.JComboBox<String> jComboBoxCE8703;
    private static javax.swing.JComboBox<String> jComboBoxProfEle3;
    private static javax.swing.JComboBox<String> jComboBoxOpenEle2;
    private static javax.swing.JComboBox<String> jComboBoxCE8711;
    private static javax.swing.JComboBox<String> jComboBoxCE8712;
    // End of variables declaration
}
