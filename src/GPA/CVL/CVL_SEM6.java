package GPA.CVL;

/**
 * @author Praveenkumar
 * @co-author Purushothaman
 */
public class CVL_SEM6 extends javax.swing.JFrame {

    static float CE8601 = 0, CE8602 = 0, CE8603 = 0, CE8604 = 0, EN8592 = 0, ProfEle2 = 0, CE8611 = 0, CE8612 = 0;
    static float  grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0;
    static float totalcredits = 23, credit1 = 4 , credit2 = 3 , credit3 = 3 , credit4 = 3 , credit5 = 3 , credit6 = 3 , credit7 = 2 , credit8 = 2;
    static String num1, num2, num3, num4, num5, num6, num7, num8 ;
    static float gpa6 = 0;
    static javax.swing.JFrame jframe6 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.CVL.CVL_SEM6
     */
    public CVL_SEM6() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPA = new javax.swing.JLabel();
        javax.swing.JButton jButtonCalculate = new javax.swing.JButton();
        javax.swing.JLabel jLabelCE8601 = new javax.swing.JLabel();
        jComboBoxProfEle2 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelCE8602 = new javax.swing.JLabel();
        jComboBoxCE8603 = new javax.swing.JComboBox<>();
        jComboBoxCE8601 = new javax.swing.JComboBox<>();
        jComboBoxCE8604 = new javax.swing.JComboBox<>();
        jComboBoxEN8592 = new javax.swing.JComboBox<>();
        jComboBoxCE8602 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelCE8603 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEN8592 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelProfEle2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCE8604 = new javax.swing.JLabel();
        jComboBoxCE8612 = new javax.swing.JComboBox<>();
        jComboBoxCE8611 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelCE8611 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCE8612 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPA.setText("GPA CALCULATOR");

        jButtonCalculate.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalculate.setText("CALCULATE");
        jButtonCalculate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCalculate.addActionListener(evt -> jButtonCalculateActionPerformed());

        jLabelCE8601.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));

        jComboBoxProfEle2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfEle2.addActionListener(evt -> jComboBoxProfEle2ActionPerformed());

        jLabelCE8602.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCE8602.setText("CE8602");

        jComboBoxCE8603.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCE8603.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCE8603.addActionListener(evt -> jComboBoxCE8603ActionPerformed());

        jComboBoxCE8601.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCE8601.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCE8601.addActionListener(evt -> jComboBoxCE8601ActionPerformed());

        jComboBoxCE8604.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCE8604.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCE8604.addActionListener(evt -> jComboBoxCE8604ActionPerformed());

        jComboBoxEN8592.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEN8592.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEN8592.addActionListener(evt -> jComboBoxEN8592ActionPerformed());

        jComboBoxCE8602.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCE8602.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCE8602.addActionListener(evt -> jComboBoxCE8602ActionPerformed());

        jLabelCE8603.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCE8603.setText("CE8603");

        jLabelEN8592.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEN8592.setText("EN8592");

        jLabelProfEle2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle2.setText("ProfEle2");

        jLabelCE8604.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCE8604.setText("CE8604");

        jComboBoxCE8612.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCE8612.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCE8612.addActionListener(evt -> jComboBoxCE8612ActionPerformed());

        jComboBoxCE8611.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCE8611.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCE8611.addActionListener(evt -> jComboBoxCE8611ActionPerformed());

        jLabelCE8611.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCE8611.setText("CE8611");

        jLabelCE8612.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCE8612.setText("CE8612");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelCE8601))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabelCE8611))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelCE8603, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabelEN8592, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxCE8603, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxEN8592, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxCE8601, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(74, 74, 74)
                                                .addComponent(jLabelProfEle2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jComboBoxProfEle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBoxCE8611, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 12, Short.MAX_VALUE)
                                                                .addComponent(jLabelCE8612)
                                                                .addGap(90, 90, 90)
                                                                .addComponent(jComboBoxCE8612, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabelCE8604)
                                                                        .addComponent(jLabelCE8602))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxCE8602, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxCE8604, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(105, 105, 105))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButtonCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(276, 276, 276))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabelGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(255, 255, 255))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabelGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jComboBoxCE8602, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelCE8602))
                                                                .addGap(97, 97, 97))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jComboBoxCE8601, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelCE8601))
                                                                .addGap(32, 32, 32)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabelCE8604)
                                                                                .addComponent(jComboBoxCE8604, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBoxCE8603, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabelCE8603))
                                                                .addGap(35, 35, 35)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelProfEle2)
                                                                        .addComponent(jComboBoxProfEle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(133, 133, 133))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelEN8592)
                                                                        .addComponent(jComboBoxEN8592))
                                                                .addGap(43, 43, 43)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelCE8611)
                                                                        .addComponent(jComboBoxCE8611, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelCE8612)
                                                                        .addComponent(jComboBoxCE8612, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addComponent(jButtonCalculate)
                                                .addGap(94, 94, 94))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel1)
                                                .addGap(235, 235, 235))))
        );
        pack();
    }

    private void jButtonCalculateActionPerformed() {
        // TODO add your handling code here:
        try {
            gpa6 = (grade1  + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8 ) ;
            float result = gpa6 / totalcredits;
            javax.swing.JOptionPane.showMessageDialog(jframe6,"Your GPA Is :-  " + result);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCE8601ActionPerformed() {
        // TODO add your handling code here:
        try{
            num1 = ((String) jComboBoxCE8601.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)){
                CE8601 =  10;
            }else if ("A+".equalsIgnoreCase(num1)){
                CE8601 =  9;
            }else if ("A".equalsIgnoreCase(num1)){
                CE8601 =  8;
            }else if("B+".equalsIgnoreCase(num1)){
                CE8601 =  7;
            }else if("B".equalsIgnoreCase(num1)){
                CE8601 =  6;
            }else if ("U".equalsIgnoreCase(num1)){
                javax.swing.JOptionPane.showMessageDialog(jframe6,"You Have Arrears !");
            }else {
                javax.swing.JOptionPane.showMessageDialog(jframe6,"Error ! Select Any Grade");
            }
            grade1 = CE8601 * credit1 ;
        }catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCE8602ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxCE8602.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)){
                CE8602 =  10;
            }else if ("A+".equalsIgnoreCase(num2)){
                CE8602 =  9;
            }else if ("A".equalsIgnoreCase(num2)){
                CE8602 =  8;
            }else if("B+".equalsIgnoreCase(num2)){
                CE8602 =  7;
            }else if("B".equalsIgnoreCase(num2)){
                CE8602 =  6;
            }else  if ("U".equalsIgnoreCase(num2)){
                javax.swing.JOptionPane.showMessageDialog(jframe6,"You Have Arrears !");
            }else {
                javax.swing.JOptionPane.showMessageDialog(jframe6,"Error ! Select Any Grade");
            }
            grade2 = CE8602 * credit2 ;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCE8603ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxCE8603.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)){
                CE8603 =  10;
            }else if ("A+".equalsIgnoreCase(num3)){
                CE8603 =  9;
            }else if ("A".equalsIgnoreCase(num3)){
                CE8603 =  8;
            }else if("B+".equalsIgnoreCase(num3)){
                CE8603 =  7;
            }else if("B".equalsIgnoreCase(num3)){
                CE8603 =  6;
            } else if ("U".equalsIgnoreCase(num3)){
                javax.swing.JOptionPane.showMessageDialog(jframe6,"You Have Arrears !");
            }else {
                javax.swing.JOptionPane.showMessageDialog(jframe6,"Error ! Select Any Grade");
            }
            grade3 = CE8603 * credit3 ;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCE8604ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxCE8604.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)){
                CE8604 =  10;
            }else if ("A+".equalsIgnoreCase(num4)){
                CE8604 =  9;
            }else if ("A".equalsIgnoreCase(num4)){
                CE8604 =  8;
            }else if("B+".equalsIgnoreCase(num4)){
                CE8604 =  7;
            }else if("B".equalsIgnoreCase(num4)){
                CE8604 =  6;
            }else if ("U".equalsIgnoreCase(num4)){
                javax.swing.JOptionPane.showMessageDialog(jframe6,"You Have Arrears !");
            }else {
                javax.swing.JOptionPane.showMessageDialog(jframe6,"Error ! Select Any Grade");
            }
            grade4 = CE8604 * credit4 ;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEN8592ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxEN8592.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)){
                EN8592 =  10;
            }else if ("A+".equalsIgnoreCase(num5)){
                EN8592 =  9;
            }else if ("A".equalsIgnoreCase(num5)){
                EN8592 =  8;
            }else if("B+".equalsIgnoreCase(num5)){
                EN8592 =  7;
            }else if("B".equalsIgnoreCase(num5)){
                EN8592 =  6;
            }else  if ("U".equalsIgnoreCase(num5)){
                javax.swing.JOptionPane.showMessageDialog(jframe6,"You Have Arrears !");
            }else {
                javax.swing.JOptionPane.showMessageDialog(jframe6,"Error ! Select Any Grade");
            }
            grade5 = EN8592   * credit5 ;
        } catch (Exception e) {
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
            }else if("U".equalsIgnoreCase(num6)){
                javax.swing.JOptionPane.showMessageDialog(jframe6,"You Have Arrears !");
            }else {
                javax.swing.JOptionPane.showMessageDialog(jframe6,"Error ! Select Any Grade");
            }
            grade6 = ProfEle2 * credit6 ;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCE8611ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxCE8611.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)){
                CE8611 =  10;
            }else if ("A+".equalsIgnoreCase(num7)){
                CE8611 =  9;
            }else if ("A".equalsIgnoreCase(num7)){
                CE8611 =  8;
            }else if("B+".equalsIgnoreCase(num7)){
                CE8611 =  7;
            }else if("B".equalsIgnoreCase(num7)){
                CE8611 =  6;
            }else  if ("U".equalsIgnoreCase(num7)){
                javax.swing.JOptionPane.showMessageDialog(jframe6,"You Have Arrears !");
            }else {
                javax.swing.JOptionPane.showMessageDialog(jframe6,"Error ! Select Any Grade");
            }
            grade7 = CE8611 * credit7 ;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCE8612ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxCE8612.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)){
                CE8612 =  10;
            }else if ("A+".equalsIgnoreCase(num8)){
                CE8612 =  9;
            }else if ("A".equalsIgnoreCase(num8)){
                CE8612 =  8;
            }else if("B+".equalsIgnoreCase(num8)){
                CE8612 =  7;
            }else if("B".equalsIgnoreCase(num8)){
                CE8612 =  6;
            }else  if ("U".equalsIgnoreCase(num8)){
                javax.swing.JOptionPane.showMessageDialog(jframe6,"You Have Arrears !");
            }else {
                javax.swing.JOptionPane.showMessageDialog(jframe6,"Error ! Select Any Grade");
            }
            grade8 = CE8612 * credit8 ;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private  static javax.swing.JComboBox<String> jComboBoxCE8612;
    private  static javax.swing.JComboBox<String> jComboBoxCE8604;
    private  static javax.swing.JComboBox<String> jComboBoxEN8592;
    private  static javax.swing.JComboBox<String> jComboBoxProfEle2;
    private  static javax.swing.JComboBox<String> jComboBoxCE8611;
    private  static javax.swing.JComboBox<String> jComboBoxCE8601;
    private  static javax.swing.JComboBox<String> jComboBoxCE8602;
    private  static javax.swing.JComboBox<String> jComboBoxCE8603;
    // End of variables declaration
}
