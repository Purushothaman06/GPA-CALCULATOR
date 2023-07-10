package GPA.MHT;

/**
 * @author Praveenkumar
 * @co-author Purushothaman
 */
public class MHT_SEM7 extends javax.swing.JFrame {

    static float ME8691 = 0, MT8701 = 0, MT8791 = 0, OpenEle2 = 0, ProfEle2 = 0, ProfEle3 = 0,MT8711 = 0, MT8781 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0;
    static float totalcredits = 22, credit1 = 3 , credit2 = 3 , credit3 = 3 , credit4 = 3 , credit5 = 3 , credit6 = 3 , credit7 = 2 , credit8 = 2;
    static String num1, num2, num3, num4, num5, num6, num7, num8 ;
    static float GPA7 = 0;
    static javax.swing.JFrame jframe7 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.MHT.MHT_SEM7
     */
    public MHT_SEM7() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPA = new javax.swing.JLabel();
        javax.swing.JButton jButtonCalculate = new javax.swing.JButton();
        javax.swing.JLabel jLabelME8691 = new javax.swing.JLabel();
        jComboBoxProfEle3 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelMT8701 = new javax.swing.JLabel();
        jComboBoxMT8791 = new javax.swing.JComboBox<>();
        jComboBoxME8691 = new javax.swing.JComboBox<>();
        jComboBoxOpenEle2 = new javax.swing.JComboBox<>();
        jComboBoxProfEle2 = new javax.swing.JComboBox<>();
        jComboBoxMT8701 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelMT8791 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelProfEle2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelProfEle3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelOpenEle2 = new javax.swing.JLabel();
        jComboBoxMT8781 = new javax.swing.JComboBox<>();
        jComboBoxMT8711 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelMT8711 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelMT8781 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPA.setText("GPA CALCULATOR");

        jButtonCalculate.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalculate.setText("CALCULATE");
        jButtonCalculate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCalculate.addActionListener(evt -> jButtonCalculateActionPerformed());

        jLabelME8691.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8691.setText("ME8691");

        jComboBoxProfEle3.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfEle3.addActionListener(evt -> jComboBoxProfEle3ActionPerformed());

        jLabelMT8701.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMT8701.setText("MT8701");

        jComboBoxMT8791.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMT8791.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMT8791.addActionListener(evt -> jComboBoxMT8791ActionPerformed());

        jComboBoxME8691.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8691.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8691.addActionListener(evt -> jComboBoxME8691ActionPerformed());

        jComboBoxOpenEle2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxOpenEle2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxOpenEle2.addActionListener(evt -> jComboBoxOpenEle2ActionPerformed());

        jComboBoxProfEle2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfEle2.addActionListener(evt -> jComboBoxProfEle2ActionPerformed());

        jComboBoxMT8701.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMT8701.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMT8701.addActionListener(evt -> jComboBoxMT8701ActionPerformed());

        jLabelMT8791.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMT8791.setText("MT8791");

        jLabelProfEle2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle2.setText("ProfEle2");

        jLabelProfEle3.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle3.setText("ProfEle3");

        jLabelOpenEle2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelOpenEle2.setText("OpenEle2");

        jComboBoxMT8781.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMT8781.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMT8781.addActionListener(evt -> jComboBoxMT8781ActionPerformed());

        jComboBoxMT8711.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMT8711.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMT8711.addActionListener(evt -> jComboBoxMT8711ActionPerformed());

        jLabelMT8711.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMT8711.setText("MT8711");

        jLabelMT8781.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMT8781.setText("MT8781");

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
                                                .addComponent(jLabelME8691))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabelMT8711))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelMT8791, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabelProfEle2, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBoxMT8711, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxMT8781, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabelOpenEle2)
                                                                        .addComponent(jLabelMT8701))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxMT8701, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxOpenEle2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxMT8791, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxProfEle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxME8691, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(74, 74, 74)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelMT8781)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelProfEle3)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxProfEle3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                                                        .addComponent(jComboBoxMT8701, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelMT8701))
                                                                .addGap(97, 97, 97))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jComboBoxME8691, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelME8691))
                                                                .addGap(32, 32, 32)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabelOpenEle2)
                                                                                .addComponent(jComboBoxOpenEle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBoxMT8791, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabelMT8791))
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
                                                                        .addComponent(jLabelMT8711)
                                                                        .addComponent(jComboBoxMT8711, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelMT8781)
                                                                        .addComponent(jComboBoxMT8781, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }

    private void jComboBoxME8691ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxME8691.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                ME8691 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                ME8691 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                ME8691 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                ME8691 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                ME8691 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade1 = ME8691 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxMT8701ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxMT8701.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                MT8701 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                MT8701 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                MT8701 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                MT8701 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                MT8701 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade2 = MT8701 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxMT8791ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxMT8791.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                MT8791 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                MT8791 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                MT8791 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                MT8791 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                MT8791 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade3 = MT8791 * credit3;
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

    private void jComboBoxProfEle2ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxProfEle2.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                ProfEle2 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                ProfEle2 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                ProfEle2 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                ProfEle2 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                ProfEle2 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade5 = ProfEle2 * credit5;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxProfEle3ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxProfEle3.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                ProfEle3 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                ProfEle3 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                ProfEle3 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                ProfEle3 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                ProfEle3 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade6 = ProfEle3 * credit6;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxMT8711ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxMT8711.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                MT8711 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                MT8711 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                MT8711 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                MT8711 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                MT8711 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade7 =MT8711 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxMT8781ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxMT8781.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                MT8781 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                MT8781 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                MT8781 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                MT8781 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                MT8781 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade8 = MT8781 * credit8;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxOpenEle2;
    private static javax.swing.JComboBox<String> jComboBoxProfEle3;
    private static javax.swing.JComboBox<String> jComboBoxMT8781;
    private static javax.swing.JComboBox<String> jComboBoxMT8711;
    private static javax.swing.JComboBox<String> jComboBoxProfEle2;
    private static javax.swing.JComboBox<String> jComboBoxME8691;
    private static javax.swing.JComboBox<String> jComboBoxMT8701;
    private static javax.swing.JComboBox<String> jComboBoxMT8791;
    // End of variables declaration
}