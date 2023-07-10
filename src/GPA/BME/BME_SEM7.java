package GPA.BME;

/**
 * @author Purushothaman
 */
public class BME_SEM7 extends javax.swing.JFrame {

    static float BM8701 = 0, EC8093 = 0, BM8702 = 0, OpenEle2 = 0, ProfEle3 = 0, BM8703 = 0, EC8762 = 0, MD8751 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0;
    static float totalcredits = 22, credit1 = 3 , credit2 = 3 , credit3 = 3 , credit4 = 3 , credit5 = 3 , credit6 = 3 , credit7 = 2 , credit8 = 2;
    static String num1, num2, num3, num4, num5, num6, num7, num8 ;
    static float GPA7 = 0;
    static javax.swing.JFrame jframe7 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.BME.BME_SEM7
     */
    public BME_SEM7() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPA = new javax.swing.JLabel();
        javax.swing.JButton jButtonCalculate = new javax.swing.JButton();
        javax.swing.JLabel jLabelBM8701 = new javax.swing.JLabel();
        jComboBoxBM8703 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelEC8093 = new javax.swing.JLabel();
        jComboBoxBM8702 = new javax.swing.JComboBox<>();
        jComboBoxBM8701 = new javax.swing.JComboBox<>();
        jComboBoxOpenEle2 = new javax.swing.JComboBox<>();
        jComboBoxProfEle3 = new javax.swing.JComboBox<>();
        jComboBoxEC8093 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelBM8702 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelProfEle3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelBM8703 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelOpenEle2 = new javax.swing.JLabel();
        jComboBoxMD8751 = new javax.swing.JComboBox<>();
        jComboBoxEC8762 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelEC8762 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelMD8751 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPA.setText("GPA CALCULATOR");

        jButtonCalculate.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalculate.setText("CALCULATE");
        jButtonCalculate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCalculate.addActionListener(evt -> jButtonCalculateActionPerformed());

        jLabelBM8701.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelBM8701.setText("BM8701");

        jComboBoxBM8703.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxBM8703.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxBM8703.addActionListener(evt -> jComboBoxBM8703ActionPerformed());

        jLabelEC8093.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8093.setText("EC8093");

        jComboBoxBM8702.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxBM8702.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxBM8702.addActionListener(evt -> jComboBoxBM8702ActionPerformed());

        jComboBoxBM8701.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxBM8701.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxBM8701.addActionListener(evt -> jComboBoxBM8701ActionPerformed());

        jComboBoxOpenEle2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxOpenEle2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxOpenEle2.addActionListener(evt -> jComboBoxOpenEle2ActionPerformed());

        jComboBoxProfEle3.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfEle3.addActionListener(evt -> jComboBoxProfEle3ActionPerformed());

        jComboBoxEC8093.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8093.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8093.addActionListener(evt -> jComboBoxEC8093ActionPerformed());

        jLabelBM8702.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelBM8702.setText("BM8702");

        jLabelProfEle3.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle3.setText("Prof.Ele.III");

        jLabelBM8703.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelBM8703.setText("BM8703");

        jLabelOpenEle2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelOpenEle2.setText("Open.Ele.II");

        jComboBoxMD8751.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMD8751.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMD8751.addActionListener(evt -> jComboBoxMD8751ActionPerformed());

        jComboBoxEC8762.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8762.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8762.addActionListener(evt -> jComboBoxEC8762ActionPerformed());

        jLabelEC8762.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8762.setText(" EC8762");

        jLabelMD8751.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMD8751.setText("MD8751");

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
                                                .addComponent(jLabelBM8701))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabelEC8762))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelBM8702, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabelProfEle3, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBoxEC8762, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxMD8751, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelOpenEle2)
                                                                        .addComponent(jLabelEC8093))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxEC8093, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxOpenEle2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxBM8702, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxProfEle3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxBM8701, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(74, 74, 74)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelMD8751)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelBM8703)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxBM8703, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                                                        .addComponent(jComboBoxEC8093, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelEC8093))
                                                                .addGap(97, 97, 97))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jComboBoxBM8701, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelBM8701))
                                                                .addGap(32, 32, 32)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabelOpenEle2)
                                                                                .addComponent(jComboBoxOpenEle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBoxBM8702, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabelBM8702))
                                                                .addGap(35, 35, 35)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelBM8703)
                                                                        .addComponent(jComboBoxBM8703, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(133, 133, 133))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelProfEle3)
                                                                        .addComponent(jComboBoxProfEle3))
                                                                .addGap(43, 43, 43)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelEC8762)
                                                                        .addComponent(jComboBoxEC8762, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelMD8751)
                                                                        .addComponent(jComboBoxMD8751, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jComboBoxBM8701ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxBM8701.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                BM8701 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                BM8701 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                BM8701 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                BM8701 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                BM8701 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade1 = BM8701 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8093ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxEC8093.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                EC8093 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                EC8093 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                EC8093 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                EC8093 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                EC8093 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade2 = EC8093 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxBM8702ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxBM8702.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                BM8702 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                BM8702 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                BM8702 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                BM8702 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                BM8702 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade3 = BM8702 * credit3;
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
                OpenEle2 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                OpenEle2 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                OpenEle2 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                OpenEle2 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                OpenEle2 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade4 = OpenEle2 * credit4;
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

    private void jComboBoxBM8703ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxBM8703.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                BM8703 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                BM8703 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                BM8703 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                BM8703 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                BM8703 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade6 = BM8703 * credit6;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8762ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxEC8762.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                EC8762 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                EC8762 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                EC8762 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                EC8762 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                EC8762 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade7 = EC8762 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxMD8751ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxMD8751.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                MD8751 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                MD8751 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                MD8751 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                MD8751 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                MD8751 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade8 = MD8751 * credit8;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxOpenEle2;
    private static javax.swing.JComboBox<String> jComboBoxBM8703;
    private static javax.swing.JComboBox<String> jComboBoxMD8751;
    private static javax.swing.JComboBox<String> jComboBoxEC8762;
    private static javax.swing.JComboBox<String> jComboBoxProfEle3;
    private static javax.swing.JComboBox<String> jComboBoxBM8701;
    private static javax.swing.JComboBox<String> jComboBoxEC8093;
    private static javax.swing.JComboBox<String> jComboBoxBM8702;
    // End of variables declaration
}