package GPA.CSE;

/**
 *
 * @author Purushothaman
 */
public class CSE_SEM7 extends javax.swing.JFrame {

    static float MG8591 = 0, CS8792 = 0, CS8791 = 0, OpenElective2 = 0, ProfElective2 = 0, ProfElective3 = 0, CS8711 = 0, IT8761 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0;
    static float totalcredits = 22, credit1 = 3 , credit2 = 3 , credit3 = 3 , credit4 = 3 , credit5 = 3 , credit6 = 3 , credit7 = 2 , credit8 = 2;
    static String num1, num2, num3, num4, num5, num6, num7, num8 ;
    static float gpa7 = 0;
    static javax.swing.JFrame jframe7 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.CSE.CSE_SEM7
     */
    public CSE_SEM7() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPA = new javax.swing.JLabel();
        javax.swing.JButton jButtonCalculate = new javax.swing.JButton();
        javax.swing.JLabel jLabelMG8591 = new javax.swing.JLabel();
        jComboBoxProfEle3 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelCS8792 = new javax.swing.JLabel();
        jComboBoxCS8791 = new javax.swing.JComboBox<>();
        jComboBoxMG8591 = new javax.swing.JComboBox<>();
        jComboBoxOpenEle2 = new javax.swing.JComboBox<>();
        jComboBoxProfEle2 = new javax.swing.JComboBox<>();
        jComboBoxCS8792 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelCS8791 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelProfEle2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelProfEle3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelOpenEle2 = new javax.swing.JLabel();
        jComboBoxIT8761 = new javax.swing.JComboBox<>();
        jComboBoxCS8711 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelCS8711 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelIT8761 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPA.setText("GPA CALCULATOR");

        jButtonCalculate.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalculate.setText("CALCULATE");
        jButtonCalculate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCalculate.addActionListener(evt -> jButtonCalculateActionPerformed());

        jLabelMG8591.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMG8591.setText("MG8591");

        jComboBoxProfEle3.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfEle3.addActionListener(evt -> jComboBoxProfEle3ActionPerformed());

        jLabelCS8792.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCS8792.setText(" CS8792");

        jComboBoxCS8791.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCS8791.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCS8791.addActionListener(evt -> jComboBoxCS8791ActionPerformed());

        jComboBoxMG8591.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMG8591.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMG8591.addActionListener(evt -> jComboBoxMG8591ActionPerformed());

        jComboBoxOpenEle2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxOpenEle2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxOpenEle2.addActionListener(evt -> jComboBoxOpenEle2ActionPerformed());

        jComboBoxProfEle2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfEle2.addActionListener(evt -> jComboBoxProfEle2ActionPerformed());

        jComboBoxCS8792.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCS8792.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCS8792.addActionListener(evt -> jComboBoxCS8792ActionPerformed());

        jLabelCS8791.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCS8791.setText("CS8791");

        jLabelProfEle2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle2.setText("Prof.Ele.II");

        jLabelProfEle3.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle3.setText("Prof.Ele.III");

        jLabelOpenEle2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelOpenEle2.setText(" Open Ele.II");

        jComboBoxIT8761.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxIT8761.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxIT8761.addActionListener(evt -> jComboBoxIT8761ActionPerformed());

        jComboBoxCS8711.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCS8711.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCS8711.addActionListener(evt -> jComboBoxCS8711ActionPerformed());

        jLabelCS8711.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCS8711.setText("CS8711");

        jLabelIT8761.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelIT8761.setText("      IT8761");

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
                        .addComponent(jLabelMG8591))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelCS8711))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCS8791, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelProfEle2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxCS8791, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxProfEle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxMG8591, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addComponent(jLabelProfEle3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxProfEle3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxCS8711, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 12, Short.MAX_VALUE)
                                .addComponent(jLabelIT8761)
                                .addGap(90, 90, 90)
                                .addComponent(jComboBoxIT8761, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelOpenEle2)
                                    .addComponent(jLabelCS8792))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxCS8792, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxOpenEle2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
                                    .addComponent(jComboBoxCS8792, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCS8792))
                                .addGap(97, 97, 97))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxMG8591, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelMG8591))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelOpenEle2)
                                        .addComponent(jComboBoxOpenEle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxCS8791, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelCS8791))
                                .addGap(35, 35, 35)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelProfEle3)
                                    .addComponent(jComboBoxProfEle3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(133, 133, 133))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelProfEle2)
                                    .addComponent(jComboBoxProfEle2))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelCS8711)
                                    .addComponent(jComboBoxCS8711, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelIT8761)
                                    .addComponent(jComboBoxIT8761, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            gpa7 = (grade1 + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8);
            double result = gpa7 / totalcredits;
            javax.swing.JOptionPane.showMessageDialog(jframe7, "Your GPA Is :-  " + result);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxProfEle3ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxProfEle3.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                ProfElective3 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                ProfElective3 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                ProfElective3 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                ProfElective3 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                ProfElective3 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade1 = ProfElective3 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCS8791ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxCS8791.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                CS8791 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                CS8791 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                CS8791 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                CS8791 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                CS8791 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade2 = CS8791 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }                                               

    private void jComboBoxMG8591ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxMG8591.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                MG8591 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                MG8591 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                MG8591 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                MG8591 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                MG8591 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade3 = MG8591 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }                                               

    private void jComboBoxOpenEle2ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxOpenEle2.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                OpenElective2 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                OpenElective2 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                OpenElective2 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                OpenElective2 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                OpenElective2 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade4 = OpenElective2 * credit4;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }                                               

    private void jComboBoxProfEle2ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxProfEle2.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                ProfElective2 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                ProfElective2 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                ProfElective2 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                ProfElective2 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                ProfElective2 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade5 = ProfElective2 * credit5;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }                                               

    private void jComboBoxCS8792ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxCS8792.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                CS8792 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                CS8792 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                CS8792 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                CS8792 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                CS8792 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade6 = CS8792 * credit6;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }                                               

    private void jComboBoxCS8711ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxCS8711.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                CS8711 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                CS8711 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                CS8711 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                CS8711 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                CS8711 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade7 = CS8711 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxIT8761ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxIT8761.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                IT8761 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                IT8761 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                IT8761 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                IT8761 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                IT8761 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade8 = IT8761 * credit8;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxIT8761;
    private static javax.swing.JComboBox<String> jComboBoxOpenEle2;
    private static javax.swing.JComboBox<String> jComboBoxProfEle2;
    private static javax.swing.JComboBox<String> jComboBoxProfEle3;
    private static javax.swing.JComboBox<String> jComboBoxCS8711;
    private static javax.swing.JComboBox<String> jComboBoxMG8591;
    private static javax.swing.JComboBox<String> jComboBoxCS8792;
    private static javax.swing.JComboBox<String> jComboBoxCS8791;
    // End of variables declaration
}
