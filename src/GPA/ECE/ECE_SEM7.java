package GPA.ECE;

/**
 * @author Praveenkumar
 * @co-author Purushothaman
 */
public class ECE_SEM7 extends javax.swing.JFrame {

    static float EC8701 = 0, EC8751 = 0, EC8791 = 0, EC8702 = 0, ProfEle3 = 0, OpenEle2 = 0,EC8711 = 0, EC8761 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0;
    static float totalcredits = 22, credit1 = 3 , credit2 = 3 , credit3 = 3 , credit4 = 3 , credit5 = 3 , credit6 = 3 , credit7 = 2 , credit8 = 2;
    static String num1, num2, num3, num4, num5, num6, num7, num8 ;
    static float GPA7 = 0;
    static javax.swing.JFrame jframe7 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.ECE.ECE_SEM7
     */
    public ECE_SEM7() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPA = new javax.swing.JLabel();
        javax.swing.JButton jButtonCalculate = new javax.swing.JButton();
        javax.swing.JLabel jLabelEC8701 = new javax.swing.JLabel();
        jComboBoxOpenEle2 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelEC8751 = new javax.swing.JLabel();
        jComboBoxEC8791 = new javax.swing.JComboBox<>();
        jComboBoxEC8701 = new javax.swing.JComboBox<>();
        jComboBoxEC8702 = new javax.swing.JComboBox<>();
        jComboBoxProfEle3 = new javax.swing.JComboBox<>();
        jComboBoxEC8751 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelEC8791 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelProfEle3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelOpenEle2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEC8702 = new javax.swing.JLabel();
        jComboBoxEC8761 = new javax.swing.JComboBox<>();
        jComboBoxEC8711 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelEC8711 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEC8761 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPA.setText("GPA CALCULATOR");

        jButtonCalculate.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalculate.setText("CALCULATE");
        jButtonCalculate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCalculate.addActionListener(evt -> jButtonCalculateActionPerformed());

        jLabelEC8701.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8701.setText("EC8701");

        jComboBoxOpenEle2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxOpenEle2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxOpenEle2.addActionListener(evt -> jComboBoxOpenEle2ActionPerformed());

        jLabelEC8751.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8751.setText("EC8751");

        jComboBoxEC8791.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8791.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8791.addActionListener(evt -> jComboBoxEC8791ActionPerformed());

        jComboBoxEC8701.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8701.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8701.addActionListener(evt -> jComboBoxEC8701ActionPerformed());

        jComboBoxEC8702.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8702.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8702.addActionListener(evt -> jComboBoxEC8702ActionPerformed());

        jComboBoxProfEle3.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfEle3.addActionListener(evt -> jComboBoxProfEle3ActionPerformed());

        jComboBoxEC8751.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8751.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8751.addActionListener(evt -> jComboBoxEC8751ActionPerformed());

        jLabelEC8791.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8791.setText("EC8791");

        jLabelProfEle3.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle3.setText("ProfEle3");

        jLabelOpenEle2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelOpenEle2.setText("OpenEle2");

        jLabelEC8702.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8702.setText("EC8702");

        jComboBoxEC8761.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8761.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8761.addActionListener(evt -> jComboBoxEC8761ActionPerformed());

        jComboBoxEC8711.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8711.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8711.addActionListener(evt -> jComboBoxEC8711ActionPerformed());

        jLabelEC8711.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8711.setText("EC8711");

        jLabelEC8761.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8761.setText("EC8761");

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
                                                .addComponent(jLabelEC8701))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabelEC8711))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelEC8791, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabelProfEle3, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBoxEC8711, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxEC8761, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabelEC8702)
                                                                        .addComponent(jLabelEC8751))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxEC8751, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxEC8702, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxEC8791, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxProfEle3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxEC8701, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(74, 74, 74)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelEC8761)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelOpenEle2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxOpenEle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                                                        .addComponent(jComboBoxEC8751, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelEC8751))
                                                                .addGap(97, 97, 97))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jComboBoxEC8701, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelEC8701))
                                                                .addGap(32, 32, 32)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabelEC8702)
                                                                                .addComponent(jComboBoxEC8702, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBoxEC8791, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabelEC8791))
                                                                .addGap(35, 35, 35)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelOpenEle2)
                                                                        .addComponent(jComboBoxOpenEle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(133, 133, 133))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelProfEle3)
                                                                        .addComponent(jComboBoxProfEle3))
                                                                .addGap(43, 43, 43)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelEC8711)
                                                                        .addComponent(jComboBoxEC8711, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelEC8761)
                                                                        .addComponent(jComboBoxEC8761, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            GPA7 = (grade1  + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8 ) ;
            float result = GPA7 / totalcredits;
            javax.swing.JOptionPane.showMessageDialog(jframe7,"Your GPA Is :-  " + result);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8701ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxEC8701.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                EC8701 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                EC8701 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                EC8701 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                EC8701 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                EC8701 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade1 = EC8701 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8751ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxEC8751.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                EC8751 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                EC8751 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                EC8751 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                EC8751 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                EC8751 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade2 = EC8751 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8791ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxEC8791.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                EC8791 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                EC8791 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                EC8791 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                EC8791 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                EC8791 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade3 = EC8791 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8702ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxEC8702.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                EC8702 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                EC8702 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                EC8702 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                EC8702 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                EC8702 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade4 = EC8702 * credit4;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxProfEle3ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxProfEle3.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                ProfEle3 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                ProfEle3 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                ProfEle3 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                ProfEle3 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                ProfEle3 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade5 = ProfEle3 * credit5;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxOpenEle2ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxOpenEle2.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                OpenEle2 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                OpenEle2 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                OpenEle2 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                OpenEle2 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                OpenEle2 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade6 = OpenEle2 * credit6;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8711ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxEC8711.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                EC8711 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                EC8711 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                EC8711 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                EC8711 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                EC8711 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade7 =EC8711 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8761ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxEC8761.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                EC8761 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                EC8761 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                EC8761 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                EC8761 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                EC8761 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade8 = EC8761 * credit8;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxEC8702;
    private static javax.swing.JComboBox<String> jComboBoxOpenEle2;
    private static javax.swing.JComboBox<String> jComboBoxEC8761;
    private static javax.swing.JComboBox<String> jComboBoxEC8711;
    private static javax.swing.JComboBox<String> jComboBoxProfEle3;
    private static javax.swing.JComboBox<String> jComboBoxEC8701;
    private static javax.swing.JComboBox<String> jComboBoxEC8751;
    private static javax.swing.JComboBox<String> jComboBoxEC8791;
    // End of variables declaration
}