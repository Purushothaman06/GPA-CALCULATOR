package GPA.CME;

/**
 *
 * @author Tanish
 * @co-author Purushothaman
 */
public class CME_SEM6 extends javax.swing.JFrame {

    static float CH8601 = 0, CH8651 = 0, CH8602 = 0, CH8652 = 0, CH8653 = 0, ProfEle2= 0, CH8611 = 0, CH8612 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0;
    static float totalcredits = 24, credit1 = 4 , credit2 = 4 , credit3 = 3 , credit4 = 3 , credit5 = 3 , credit6 = 3 , credit7 = 2 , credit8 = 2;
    static String num1, num2, num3, num4, num5, num6, num7, num8 ;
    static float gpa6 = 0;
    static javax.swing.JFrame jframe6 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.CME.CME_SEM6
     */
    public CME_SEM6() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPACalc = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCH8601 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelProfEle2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCH8651 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCH8652 = new javax.swing.JLabel();
        jComboBoxCH8601 = new javax.swing.JComboBox<>();
        jComboBoxProfEle2 = new javax.swing.JComboBox<>();
        jComboBoxCH8651 = new javax.swing.JComboBox<>();
        jComboBoxCH8652 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelCH8602 = new javax.swing.JLabel();
        jComboBoxCH8602 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelCH8611 = new javax.swing.JLabel();
        jComboBoxCH8611 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JButton jButtonCalcGPA = new javax.swing.JButton();
        javax.swing.JLabel jLabelCH8653 = new javax.swing.JLabel();
        jComboBoxCH8653 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelCH8612 = new javax.swing.JLabel();
        jComboBoxCH8612 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPACalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPACalc.setText("GPA CALCULATOR");

        jLabelCH8601.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCH8601.setText("CH8601");

        jLabelProfEle2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle2.setText("Prof. Ele. 2");

        jLabelCH8651.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCH8651.setText("CH8651");

        jLabelCH8652.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCH8652.setText("CH8652");

        jComboBoxCH8601.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCH8601.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCH8601.addActionListener(evt -> jComboBoxCH8601ActionPerformed());

        jComboBoxProfEle2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfEle2.addActionListener(evt -> jComboBoxProfEle2ActionPerformed());

        jComboBoxCH8651.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCH8651.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCH8651.addActionListener(evt -> jComboBoxCH8651ActionPerformed());

        jComboBoxCH8652.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCH8652.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCH8652.addActionListener(evt -> jComboBoxCH8652ActionPerformed());

        jLabelCH8602.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCH8602.setText("CH8602");

        jComboBoxCH8602.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCH8602.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCH8602.addActionListener(evt -> jComboBoxCH8602ActionPerformed());

        jLabelCH8611.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCH8611.setText("CH8611");

        jComboBoxCH8611.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCH8611.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCH8611.addActionListener(evt -> jComboBoxCH8611ActionPerformed());

        jButtonCalcGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalcGPA.setText("CALCULATE ");
        jButtonCalcGPA.addActionListener(evt -> jButtonCalcGPAActionPerformed());

        jLabelCH8653.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCH8653.setText("CH8653");

        jComboBoxCH8653.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCH8653.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCH8653.addActionListener(evt -> jComboBoxCH8653ActionPerformed());

        jLabelCH8612.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCH8612.setText("CH8612");

        jComboBoxCH8612.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCH8612.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCH8612.addActionListener(evt -> jComboBoxCH8612ActionPerformed());

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
                                                .addComponent(jLabelProfEle2))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabelCH8611))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelCH8651, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabelCH8602, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBoxCH8611, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxCH8612, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabelCH8652)
                                                                        .addComponent(jLabelCH8601))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxCH8601, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxCH8652, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxCH8651, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxCH8602, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxProfEle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(74, 74, 74)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelCH8612)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelCH8653)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxCH8653, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                                                        .addComponent(jComboBoxCH8601, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelCH8601))
                                                                .addGap(97, 97, 97))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jComboBoxProfEle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelProfEle2))
                                                                .addGap(32, 32, 32)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabelCH8652)
                                                                                .addComponent(jComboBoxCH8652, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBoxCH8651, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabelCH8651))
                                                                .addGap(35, 35, 35)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelCH8653)
                                                                        .addComponent(jComboBoxCH8653, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(133, 133, 133))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelCH8602)
                                                                        .addComponent(jComboBoxCH8602))
                                                                .addGap(43, 43, 43)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelCH8611)
                                                                        .addComponent(jComboBoxCH8611, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelCH8612)
                                                                        .addComponent(jComboBoxCH8612, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jComboBoxCH8601ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxCH8601.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                CH8601 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                CH8601 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                CH8601 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                CH8601 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                CH8601 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade1 = CH8601 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCH8651ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxCH8651.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                CH8651 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                CH8651 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                CH8651 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                CH8651 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                CH8651 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade2 = CH8651 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCH8602ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxCH8602.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                CH8602 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                CH8602 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                CH8602 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                CH8602 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                CH8602 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade3 = CH8602 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCH8652ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxCH8652.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                CH8652 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                CH8652 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                CH8652 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                CH8652 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                CH8652 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade4 = CH8652 * credit4;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCH8653ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxCH8653.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                CH8653 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                CH8653 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                CH8653 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                CH8653 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                CH8653 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade5 = CH8653 * credit5;
        } catch (Exception e){
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
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade6 = ProfEle2 * credit6;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCH8611ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxCH8611.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                CH8611 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                CH8611 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                CH8611 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                CH8611 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                CH8611 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade7 = CH8611 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }


    private void jComboBoxCH8612ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxCH8612.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                CH8612 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                CH8612 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                CH8612 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                CH8612 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                CH8612 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade8 = CH8612 * credit8;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jButtonCalcGPAActionPerformed() {
        // TODO add your handling code here:
        try {
            gpa6 = (grade1 + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8);
            float result = gpa6 / totalcredits;
            javax.swing.JOptionPane.showMessageDialog(jframe6, "Your GPA Is :-  " + result);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxProfEle2;
    private static javax.swing.JComboBox<String> jComboBoxCH8611;
    private static javax.swing.JComboBox<String> jComboBoxCH8612;
    private static javax.swing.JComboBox<String> jComboBoxCH8653;
    private static javax.swing.JComboBox<String> jComboBoxCH8651;
    private static javax.swing.JComboBox<String> jComboBoxCH8652;
    private static javax.swing.JComboBox<String> jComboBoxCH8602;
    private static javax.swing.JComboBox<String> jComboBoxCH8601;
    // End of variables declaration
}