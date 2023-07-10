package GPA;

/**
 *
 * @author Purushothaman
 */
public class SEM1 extends javax.swing.JFrame {

    static float HS8151 = 0, MA8151 = 0, PH8151 = 0, CY8151 = 0, GE8151 = 0, GE8152 = 0, GE8161 = 0, BS8161 = 0;
    static float  grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0;
    static float totalcredits = 25, credit1 = 4 , credit2 = 3 , credit3 = 4 , credit4 = 3 , credit5 = 3 , credit6 = 4 , credit7 = 2 , credit8 = 2;
    static String num1, num2, num3, num4, num5, num6, num7, num8 ;
    static float gpa1 = 0;
    static javax.swing.JFrame jframe1 ;

    /**
     * Creates new form GPA.SEM1
     */
    public SEM1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPA = new javax.swing.JLabel();
        javax.swing.JButton jButtonCalculate = new javax.swing.JButton();
        javax.swing.JLabel jLabelHS8151 = new javax.swing.JLabel();
        jComboBoxGE8152 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelMA8151 = new javax.swing.JLabel();
        jComboBoxPH8151 = new javax.swing.JComboBox<>();
        jComboBoxHS8151 = new javax.swing.JComboBox<>();
        jComboBoxCY8151 = new javax.swing.JComboBox<>();
        jComboBoxGE8151 = new javax.swing.JComboBox<>();
        jComboBoxMA8151 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelPH8151 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelGE8151 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelGE8152 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCY8151 = new javax.swing.JLabel();
        jComboBoxBS8161 = new javax.swing.JComboBox<>();
        jComboBoxGE8161 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelGE8161 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelBS8161 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPA.setText("GPA CALCULATOR");

        jButtonCalculate.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalculate.setText("CALCULATE");
        jButtonCalculate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCalculate.addActionListener(evt -> jButtonCalculateActionPerformed());

        jLabelHS8151.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelHS8151.setText("HS8151");

        jComboBoxGE8152.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jComboBoxGE8152.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxGE8152.addActionListener(evt -> jComboBoxGE8152ActionPerformed());

        jLabelMA8151.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMA8151.setText("MA8151");

        jComboBoxPH8151.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxPH8151.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxPH8151.addActionListener(evt -> jComboBoxPH8151ActionPerformed());

        jComboBoxHS8151.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxHS8151.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxHS8151.addActionListener(evt -> jComboBoxHS8151ActionPerformed());

        jComboBoxCY8151.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCY8151.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCY8151.addActionListener(evt -> jComboBoxCY8151ActionPerformed());

        jComboBoxGE8151.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxGE8151.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxGE8151.addActionListener(evt -> jComboBoxGE8151ActionPerformed());

        jComboBoxMA8151.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMA8151.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMA8151.addActionListener(evt -> jComboBoxMA8151ActionPerformed());

        jLabelPH8151.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelPH8151.setText("PH8151");

        jLabelGE8151.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelGE8151.setText("GE8151");

        jLabelGE8152.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelGE8152.setText("GE8152");

        jLabelCY8151.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCY8151.setText("CY8151");

        jComboBoxBS8161.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxBS8161.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxBS8161.addActionListener(evt -> jComboBoxBS8161ActionPerformed());

        jComboBoxGE8161.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxGE8161.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxGE8161.addActionListener(evt -> jComboBoxGE8161ActionPerformed());

        jLabelGE8161.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelGE8161.setText("GE8161");

        jLabelBS8161.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelBS8161.setText("BS8161");

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
                        .addComponent(jLabelHS8151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelGE8161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPH8151, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelGE8151, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxPH8151, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxGE8151, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxHS8151, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addComponent(jLabelGE8152)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxGE8152, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxGE8161, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 12, Short.MAX_VALUE)
                                .addComponent(jLabelBS8161)
                                .addGap(90, 90, 90)
                                .addComponent(jComboBoxBS8161, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelCY8151)
                                    .addComponent(jLabelMA8151))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxMA8151, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxCY8151, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
                                    .addComponent(jComboBoxMA8151, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelMA8151))
                                .addGap(97, 97, 97))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxHS8151, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelHS8151))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelCY8151)
                                        .addComponent(jComboBoxCY8151, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxPH8151, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelPH8151))
                                .addGap(35, 35, 35)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelGE8152)
                                    .addComponent(jComboBoxGE8152, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(133, 133, 133))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelGE8151)
                                    .addComponent(jComboBoxGE8151))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelGE8161)
                                    .addComponent(jComboBoxGE8161, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelBS8161)
                                    .addComponent(jComboBoxBS8161, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            gpa1 = (grade1 + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8);
            double result = gpa1 / totalcredits;
            javax.swing.JOptionPane.showMessageDialog(jframe1, "Your GPA Is :-  " + result);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe1, e.getMessage());
        }
        System.gc();
    }                                                

    private void jComboBoxGE8152ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxGE8152.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                GE8152 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                GE8152 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                GE8152 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                GE8152 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                GE8152 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe1, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe1, "Error ! Select Any Grade");
            }
            grade1 = GE8152 * credit1;
        }catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe1, e.getMessage());
        }
        System.gc();
    }                                               

    private void jComboBoxPH8151ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxPH8151.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                PH8151 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                PH8151 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                PH8151 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                PH8151 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                PH8151 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe1, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe1, "Error ! Select Any Grade");
            }
            grade2 = PH8151 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe1, e.getMessage());
        }
        System.gc();
    }                                               

    private void jComboBoxHS8151ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxHS8151.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                HS8151 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                HS8151 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                HS8151 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                HS8151 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                HS8151 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe1, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe1, "Error ! Select Any Grade");
            }
            grade3 = HS8151 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe1, e.getMessage());
        }
        System.gc();
    }                                               

    private void jComboBoxCY8151ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxCY8151.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                CY8151 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                CY8151 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                CY8151 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                CY8151 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                CY8151 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe1, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe1, "Error ! Select Any Grade");
            }
            grade4 = CY8151 * credit4;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe1, e.getMessage());
        }
        System.gc();
    }                                               

    private void jComboBoxGE8151ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxGE8151.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                GE8151 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                GE8151 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                GE8151 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                GE8151 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                GE8151 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe1, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe1, "Error ! Select Any Grade");
            }
            grade5 = GE8151 * credit5;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe1, e.getMessage());
        }
        System.gc();
    }                                               

    private void jComboBoxMA8151ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxMA8151.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                MA8151 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                MA8151 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                MA8151 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                MA8151 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                MA8151 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe1, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe1, "Error ! Select Any Grade");
            }
            grade6 = MA8151 * credit6;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe1, e.getMessage());
        }
        System.gc();
    }                                               

    private void jComboBoxBS8161ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxBS8161.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                BS8161 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                BS8161 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                BS8161 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                BS8161 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                BS8161 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe1, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe1, "Error ! Select Any Grade");
            }
            grade7 = BS8161 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe1, e.getMessage());
        }
        System.gc();
    }                                               

    private void jComboBoxGE8161ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxGE8161.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                GE8161 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                GE8161 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                GE8161 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                GE8161 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                GE8161 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe1, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe1, "Error ! Select Any Grade");
            }
            grade8 = GE8161 * credit8;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe1, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private  static javax.swing.JComboBox<String> jComboBoxBS8161;
    private  static javax.swing.JComboBox<String> jComboBoxCY8151;
    private  static javax.swing.JComboBox<String> jComboBoxGE8151;
    private  static javax.swing.JComboBox<String> jComboBoxGE8152;
    private  static javax.swing.JComboBox<String> jComboBoxGE8161;
    private  static javax.swing.JComboBox<String> jComboBoxHS8151;
    private  static javax.swing.JComboBox<String> jComboBoxMA8151;
    private  static javax.swing.JComboBox<String> jComboBoxPH8151;
    // End of variables declaration
}
