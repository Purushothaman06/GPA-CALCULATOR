package GPA.MAE;

/**
 *
 * @author Purushothaman
 */
public class MAE_SEM5 extends javax.swing.JFrame {

    static float CS8492 = 0, ME8593 = 0, ME8591 = 0, AN8501 = 0, OpenEle1 = 0, AN8511 = 0, CS8481 = 0, AN8512 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0;
    static float totalcredits = 21, credit1 = 2 , credit2 = 3 , credit3 = 3 , credit4 = 3 , credit5 = 3 , credit6 = 3 , credit7 = 2 , credit8 = 2;
    static String num1, num2, num3, num4, num5, num6, num7, num8 ;
    static float gpa5 = 0;
    static javax.swing.JFrame jframe5 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.MAE.MAE_SEM5
     */
    public MAE_SEM5() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPA = new javax.swing.JLabel();
        javax.swing.JButton jButtonCalculate = new javax.swing.JButton();
        javax.swing.JLabel jLabelCS8492 = new javax.swing.JLabel();
        jComboBoxAN8511 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelME8593 = new javax.swing.JLabel();
        jComboBoxME8591 = new javax.swing.JComboBox<>();
        jComboBoxCS8492 = new javax.swing.JComboBox<>();
        jComboBoxAN8501 = new javax.swing.JComboBox<>();
        jComboBoxOpenEle1 = new javax.swing.JComboBox<>();
        jComboBoxME8593 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelME8591 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelOpenEle1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelAN8511 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelAN8501 = new javax.swing.JLabel();
        jComboBoxAN8512 = new javax.swing.JComboBox<>();
        jComboBoxCS8481 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelCS8481 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelAN8512 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPA.setText("GPA CALCULATOR");

        jButtonCalculate.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalculate.setText("CALCULATE");
        jButtonCalculate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCalculate.addActionListener(evt -> jButtonCalculateActionPerformed());

        jLabelCS8492.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCS8492.setText("CS8492");

        jComboBoxAN8511.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxAN8511.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxAN8511.addActionListener(evt -> jComboBoxAN8511ActionPerformed());

        jLabelME8593.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8593.setText("ME8593");

        jComboBoxME8591.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8591.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8591.addActionListener(evt -> jComboBoxME8591ActionPerformed());

        jComboBoxCS8492.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCS8492.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCS8492.addActionListener(evt -> jComboBoxCS8492ActionPerformed());

        jComboBoxAN8501.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxAN8501.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxAN8501.addActionListener(evt -> jComboBoxAN8501ActionPerformed());

        jComboBoxOpenEle1.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxOpenEle1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxOpenEle1.addActionListener(evt -> jComboBoxOpenEle1ActionPerformed());

        jComboBoxME8593.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8593.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8593.addActionListener(evt -> jComboBoxME8593ActionPerformed());

        jLabelME8591.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8591.setText("ME8591");

        jLabelOpenEle1.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelOpenEle1.setText("Open.Ele.I");

        jLabelAN8511.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelAN8511.setText("AN8511");

        jLabelAN8501.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelAN8501.setText("AN8501");

        jComboBoxAN8512.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxAN8512.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxAN8512.addActionListener(evt -> jComboBoxAN8512ActionPerformed());

        jComboBoxCS8481.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCS8481.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCS8481.addActionListener(evt -> jComboBoxCS8481ActionPerformed());

        jLabelCS8481.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCS8481.setText("CS8481");

        jLabelAN8512.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelAN8512.setText("AN8512");

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
                                                .addComponent(jLabelCS8492))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabelCS8481))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelME8591, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabelOpenEle1, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBoxCS8481, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxAN8512, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabelAN8501)
                                                                        .addComponent(jLabelME8593))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxME8593, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxAN8501, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxME8591, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxOpenEle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxCS8492, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(74, 74, 74)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelAN8512)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelAN8511)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxAN8511, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                                                        .addComponent(jComboBoxME8593, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelME8593))
                                                                .addGap(97, 97, 97))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jComboBoxCS8492, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelCS8492))
                                                                .addGap(32, 32, 32)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabelAN8501)
                                                                                .addComponent(jComboBoxAN8501, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBoxME8591, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabelME8591))
                                                                .addGap(35, 35, 35)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelAN8511)
                                                                        .addComponent(jComboBoxAN8511, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(133, 133, 133))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelOpenEle1)
                                                                        .addComponent(jComboBoxOpenEle1))
                                                                .addGap(43, 43, 43)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelCS8481)
                                                                        .addComponent(jComboBoxCS8481, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelAN8512)
                                                                        .addComponent(jComboBoxAN8512, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            gpa5 = (grade1  + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8 ) ;
            float result = gpa5 / totalcredits;
            javax.swing.JOptionPane.showMessageDialog(jframe5,"Your GPA Is :-  " + result);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAN8511ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxAN8511.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                AN8511 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                AN8511 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                AN8511 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                AN8511 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                AN8511 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade1 = AN8511 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxME8591ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxME8591.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                ME8591 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                ME8591 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                ME8591 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                ME8591 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                ME8591 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade2 = ME8591 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCS8492ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxCS8492.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                CS8492 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                CS8492 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                CS8492 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                CS8492 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                CS8492 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade3 = CS8492 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAN8501ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxAN8501.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                AN8501 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                AN8501 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                AN8501 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                AN8501 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                AN8501 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade4 = AN8501 * credit4;
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

    private void jComboBoxME8593ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxME8593.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                ME8593 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                ME8593 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                ME8593 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                ME8593 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                ME8593 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade6 = ME8593 * credit6;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAN8512ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxAN8512.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                AN8512 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                AN8512 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                AN8512 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                AN8512 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                AN8512 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade7 = AN8512 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCS8481ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxCS8481.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                CS8481 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                CS8481 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                CS8481 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                CS8481 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                CS8481 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade8 = CS8481 * credit8;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxAN8501;
    private static javax.swing.JComboBox<String> jComboBoxAN8511;
    private static javax.swing.JComboBox<String> jComboBoxAN8512;
    private static javax.swing.JComboBox<String> jComboBoxCS8481;
    private static javax.swing.JComboBox<String> jComboBoxOpenEle1;
    private static javax.swing.JComboBox<String> jComboBoxCS8492;
    private static javax.swing.JComboBox<String> jComboBoxME8593;
    private static javax.swing.JComboBox<String> jComboBoxME8591;
    // End of variables declaration
}

