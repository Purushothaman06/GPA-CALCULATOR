package GPA.CME;

/**
 *
 * @author Tanish
 * @co-author Purushothaman
 */
public class CME_SEM5 extends javax.swing.JFrame {

    static float CH8591 = 0, CH8502 = 0, CH8501 = 0, CH8551 = 0, OpenEle1 = 0, ProfEle1 = 0, CH8561 = 0, CH8581 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0;
    static float totalcredits = 24, credit1 = 4 , credit2 = 4 , credit3 = 3 , credit4 = 3 , credit5 = 3 , credit6 = 3 , credit7 = 2 , credit8 = 2;
    static String num1, num2, num3, num4, num5, num6, num7, num8 ;
    static float gpa5 = 0;
    static javax.swing.JFrame jframe5 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.CME.CME_SEM5
     */
    public CME_SEM5() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPACalc = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCH8591 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCH8551 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCH8502 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCH8501 = new javax.swing.JLabel();
        jComboBoxCH8591 = new javax.swing.JComboBox<>();
        jComboBoxCH8551 = new javax.swing.JComboBox<>();
        jComboBoxCH8502 = new javax.swing.JComboBox<>();
        jComboBoxCH8501 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelProfEle1 = new javax.swing.JLabel();
        jComboBoxProfEle1 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelCH8561 = new javax.swing.JLabel();
        jComboBoxCH8561 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JButton jButtonCalcGPA = new javax.swing.JButton();
        javax.swing.JLabel jLabelOpenEle1 = new javax.swing.JLabel();
        jComboBoxOpenEle1 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelCH8581 = new javax.swing.JLabel();
        jComboBoxCH8581 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPACalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPACalc.setText("GPA CALCULATOR");

        jLabelCH8591.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCH8591.setText("CH8591");

        jLabelCH8551.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCH8551.setText("CH8551");

        jLabelCH8502.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCH8502.setText("CH8502");

        jLabelCH8501.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCH8501.setText("CH8501");

        jComboBoxCH8591.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCH8591.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCH8591.addActionListener(evt -> jComboBoxCH8591ActionPerformed());

        jComboBoxCH8551.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCH8551.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCH8551.addActionListener(evt -> jComboBoxCH8551ActionPerformed());

        jComboBoxCH8502.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCH8502.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCH8502.addActionListener(evt -> jComboBoxCH8502ActionPerformed());

        jComboBoxCH8501.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCH8501.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCH8501.addActionListener(evt -> jComboBoxCH8501ActionPerformed());

        jLabelProfEle1.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle1.setText("Prof. Ele. 1");

        jComboBoxProfEle1.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfEle1.addActionListener(evt -> jComboBoxProfEle1ActionPerformed());

        jLabelCH8561.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCH8561.setText("CH8561");

        jComboBoxCH8561.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCH8561.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCH8561.addActionListener(evt -> jComboBoxCH8561ActionPerformed());

        jButtonCalcGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalcGPA.setText("CALCULATE ");
        jButtonCalcGPA.addActionListener(evt -> jButtonCalcGPAActionPerformed());

        jLabelOpenEle1.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelOpenEle1.setText("Open Ele. 1");

        jComboBoxOpenEle1.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxOpenEle1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxOpenEle1.addActionListener(evt -> jComboBoxOpenEle1ActionPerformed());

        jLabelCH8581.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCH8581.setText("CH8581");

        jComboBoxCH8581.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCH8581.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCH8581.addActionListener(evt -> jComboBoxCH8581ActionPerformed());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                                .addComponent(jLabelCH8551))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabelCH8561))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelCH8502, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabelProfEle1, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBoxCH8561, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxCH8581, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabelCH8501)
                                                                        .addComponent(jLabelCH8591))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxCH8591, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxCH8501, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxCH8502, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxProfEle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxCH8551, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(74, 74, 74)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelCH8581)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelOpenEle1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxOpenEle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(105, 105, 105))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButtonCalcGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(276, 276, 276))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabelGPACalc, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(255, 255, 255))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabelGPACalc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jComboBoxCH8591, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelCH8591))
                                                                .addGap(97, 97, 97))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jComboBoxCH8551, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelCH8551))
                                                                .addGap(32, 32, 32)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabelCH8501)
                                                                                .addComponent(jComboBoxCH8501, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBoxCH8502, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabelCH8502))
                                                                .addGap(35, 35, 35)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelOpenEle1)
                                                                        .addComponent(jComboBoxOpenEle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(133, 133, 133))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelProfEle1)
                                                                        .addComponent(jComboBoxProfEle1))
                                                                .addGap(43, 43, 43)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelCH8561)
                                                                        .addComponent(jComboBoxCH8561, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelCH8581)
                                                                        .addComponent(jComboBoxCH8581, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addComponent(jButtonCalcGPA)
                                                .addGap(94, 94, 94))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel1)
                                                .addGap(235, 235, 235))))
        );
        pack();
    }

    public void jComboBoxCH8591ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxCH8591.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                CH8591 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                CH8591 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                CH8591 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                CH8591 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                CH8591 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade1 = CH8591 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCH8502ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxCH8502.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                CH8502 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                CH8502 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                CH8502 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                CH8502 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                CH8502 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade2 = CH8502 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCH8501ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxCH8501.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                CH8501 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                CH8501 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                CH8501 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                CH8501 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                CH8501 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade3 = CH8501 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCH8551ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxCH8551.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                CH8551 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                CH8551 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                CH8551 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                CH8551 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                CH8551 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade4 = CH8551 * credit4;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxOpenEle1ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxOpenEle1.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                OpenEle1 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                OpenEle1 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                OpenEle1 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                OpenEle1 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                OpenEle1 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade5 = OpenEle1 * credit5;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
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
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade6 = ProfEle1 * credit6;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCH8561ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxCH8561.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                CH8561 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                CH8561 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                CH8561 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                CH8561 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                CH8561 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade7 = CH8561 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }


    private void jComboBoxCH8581ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxCH8581.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                CH8581 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                CH8581 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                CH8581 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                CH8581 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                CH8581 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade8 = CH8581 * credit8;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jButtonCalcGPAActionPerformed() {
        // TODO add your handling code here:
        try {
            gpa5 = (grade1 + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8);
            float result = gpa5 / totalcredits;
            javax.swing.JOptionPane.showMessageDialog(jframe5, "Your GPA Is :-  " + result);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    // Variable declaration
    private static javax.swing.JComboBox<String> jComboBoxCH8551;
    private static javax.swing.JComboBox<String> jComboBoxCH8561;
    private static javax.swing.JComboBox<String> jComboBoxCH8581;
    private static javax.swing.JComboBox<String> jComboBoxOpenEle1;
    private static javax.swing.JComboBox<String> jComboBoxCH8502;
    private static javax.swing.JComboBox<String> jComboBoxCH8501;
    private static javax.swing.JComboBox<String> jComboBoxProfEle1;
    private static javax.swing.JComboBox<String> jComboBoxCH8591;
    // End of variables declaration
}