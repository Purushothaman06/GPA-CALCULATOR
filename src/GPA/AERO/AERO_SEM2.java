package GPA.AERO;

/**
 *
 * @author Tanish
 * @co-author Purushothaman
 */
public class AERO_SEM2 extends javax.swing.JFrame {

    static float HS8251 = 0, MA8251 = 0, PH8251 = 0, BE8253 = 0, GE8291 = 0, GE8292 = 0, GE8261 = 0, BE8261 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0;
    static float total_credits = 25, credit1 = 4 , credit2 = 3 , credit3 = 4 , credit4 = 3 , credit5 = 3 , credit6 = 4 , credit7 = 2 , credit8 = 2;
    static String num1, num2, num3, num4, num5, num6, num7, num8 ;
    static float gpa2 = 0;
    static javax.swing.JFrame jframe2 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.AERO.AERO_SEM2
     */
    public AERO_SEM2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPA = new javax.swing.JLabel();
        javax.swing.JButton jButtonCalculate = new javax.swing.JButton();
        javax.swing.JLabel jLabelHS8251 = new javax.swing.JLabel();
        jComboBoxGE8292 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelMA8251 = new javax.swing.JLabel();
        jComboBoxPH8251 = new javax.swing.JComboBox<>();
        jComboBoxHS8251 = new javax.swing.JComboBox<>();
        jComboBoxBE8253 = new javax.swing.JComboBox<>();
        jComboBoxGE8291 = new javax.swing.JComboBox<>();
        jComboBoxMA8251 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelPH8251 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelGE8291 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelGE8292 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelBE8253 = new javax.swing.JLabel();
        jComboBoxBE8261 = new javax.swing.JComboBox<>();
        jComboBoxGE8261 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelGE8261 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelBE8261 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPA.setText("GPA CALCULATOR");

        jButtonCalculate.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalculate.setText("CALCULATE");
        jButtonCalculate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCalculate.addActionListener(evt -> jButtonCalculateActionPerformed());

        jLabelHS8251.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelHS8251.setText("HS8251");

        jComboBoxGE8292.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxGE8292.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxGE8292.addActionListener(evt -> jComboBoxGE8292ActionPerformed());

        jLabelMA8251.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMA8251.setText("MA8251");

        jComboBoxPH8251.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxPH8251.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxPH8251.addActionListener(evt -> jComboBoxPH8251ActionPerformed());

        jComboBoxHS8251.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxHS8251.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxHS8251.addActionListener(evt -> jComboBoxHS8251ActionPerformed());

        jComboBoxBE8253.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxBE8253.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxBE8253.addActionListener(evt -> jComboBoxBE8253ActionPerformed());

        jComboBoxGE8291.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxGE8291.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxGE8291.addActionListener(evt -> jComboBoxGE8291ActionPerformed());

        jComboBoxMA8251.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMA8251.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMA8251.addActionListener(evt -> jComboBoxMA8251ActionPerformed());

        jLabelPH8251.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelPH8251.setText("PH8251");

        jLabelGE8291.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelGE8291.setText("GE8291");

        jLabelGE8292.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelGE8292.setText("GE8292");

        jLabelBE8253.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelBE8253.setText("BE8253");

        jComboBoxBE8261.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxBE8261.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxBE8261.addActionListener(evt -> jComboBoxBE8261ActionPerformed());

        jComboBoxGE8261.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxGE8261.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxGE8261.addActionListener(evt -> jComboBoxGE8261ActionPerformed());

        jLabelGE8261.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelGE8261.setText("GE8261");

        jLabelBE8261.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelBE8261.setText("BE8261");

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
                                                .addComponent(jLabelHS8251))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabelGE8261))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelPH8251, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabelGE8291, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBoxGE8261, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxBE8261, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabelBE8253)
                                                                        .addComponent(jLabelMA8251))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxMA8251, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxBE8253, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxPH8251, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxGE8291, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxHS8251, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(74, 74, 74)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelBE8261)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelGE8292)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxGE8292, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                                                        .addComponent(jComboBoxMA8251, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelMA8251))
                                                                .addGap(97, 97, 97))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jComboBoxHS8251, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelHS8251))
                                                                .addGap(32, 32, 32)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabelBE8253)
                                                                                .addComponent(jComboBoxBE8253, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBoxPH8251, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabelPH8251))
                                                                .addGap(35, 35, 35)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelGE8292)
                                                                        .addComponent(jComboBoxGE8292, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(133, 133, 133))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelGE8291)
                                                                        .addComponent(jComboBoxGE8291))
                                                                .addGap(43, 43, 43)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelGE8261)
                                                                        .addComponent(jComboBoxGE8261, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelBE8261)
                                                                        .addComponent(jComboBoxBE8261, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            gpa2 = (grade1  + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8 ) ;
            float result = gpa2 / total_credits;
            javax.swing.JOptionPane.showMessageDialog(jframe2,"Your GPA Is :-  " + result);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe2, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxGE8292ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxGE8292.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                GE8292 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                GE8292 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                GE8292 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                GE8292 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                GE8292 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "Error ! Select Any Grade");
            }
            grade1 = GE8292 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe2, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxPH8251ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxPH8251.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                PH8251 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                PH8251 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                PH8251 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                PH8251 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                PH8251 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "Error ! Select Any Grade");
            }
            grade2 = PH8251 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe2, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxHS8251ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxHS8251.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                HS8251 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                HS8251 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                HS8251 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                HS8251 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                HS8251 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "Error ! Select Any Grade");
            }
            grade3 = HS8251 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe2, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxBE8253ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxBE8253.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                BE8253 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                BE8253 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                BE8253 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                BE8253 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                BE8253 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "Error ! Select Any Grade");
            }
            grade4 = BE8253 * credit4;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe2, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxGE8291ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxGE8291.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                GE8291 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                GE8291 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                GE8291 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                GE8291 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                GE8291 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "Error ! Select Any Grade");
            }
            grade5 = GE8291 * credit5;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe2, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxMA8251ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxMA8251.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                MA8251 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                MA8251 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                MA8251 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                MA8251 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                MA8251 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "Error ! Select Any Grade");
            }
            grade6 = MA8251 * credit6;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe2, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxBE8261ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxBE8261.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                BE8261 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                BE8261 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                BE8261 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                BE8261 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                BE8261 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "Error ! Select Any Grade");
            }
            grade7 = BE8261 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe2, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxGE8261ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxGE8261.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                GE8261 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                GE8261 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                GE8261 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                GE8261 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                GE8261 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "Error ! Select Any Grade");
            }
            grade8 = GE8261 * credit8;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe2, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxBE8253;
    private static javax.swing.JComboBox<String> jComboBoxGE8292;
    private static javax.swing.JComboBox<String> jComboBoxBE8261;
    private static javax.swing.JComboBox<String> jComboBoxGE8261;
    private static javax.swing.JComboBox<String> jComboBoxGE8291;
    private static javax.swing.JComboBox<String> jComboBoxHS8251;
    private static javax.swing.JComboBox<String> jComboBoxMA8251;
    private static javax.swing.JComboBox<String> jComboBoxPH8251;
    // End of variables declaration
}
