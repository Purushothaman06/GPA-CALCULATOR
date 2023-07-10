package GPA.EEE;

/**
 *
 * @author Praveenkumar
 * @co-author Purushothaman
 */
public class EEE_SEM3 extends javax.swing.JFrame {

    static float MA8351 = 0, EE8351 = 0, EE8391 = 0, EE8301 = 0, EC8353 = 0, ME8792 = 0, EC8311 = 0, EE8311 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0;
    static float totalcredits = 23, credit1 = 4 , credit2 = 3 , credit3 = 3 , credit4 = 3 , credit5 = 3 , credit6 = 3 , credit7 = 2 , credit8 = 2;
    static String num1, num2, num3, num4, num5, num6, num7, num8 ;
    static float GPA3 = 0;
    static javax.swing.JFrame jframe3 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.EEE.EEE_SEM3
     */
    public EEE_SEM3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPA = new javax.swing.JLabel();
        javax.swing.JButton jButtonCalculate = new javax.swing.JButton();
        javax.swing.JLabel jLabelMA8351 = new javax.swing.JLabel();
        jComboBoxME8792 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelEE8351 = new javax.swing.JLabel();
        jComboBoxEE8391 = new javax.swing.JComboBox<>();
        jComboBoxMA8351 = new javax.swing.JComboBox<>();
        jComboBoxEE8301 = new javax.swing.JComboBox<>();
        jComboBoxEC8353 = new javax.swing.JComboBox<>();
        jComboBoxEE8351 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelEE8391 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEC8353 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelME8792 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEE8301 = new javax.swing.JLabel();
        jComboBoxEE8311 = new javax.swing.JComboBox<>();
        jComboBoxEC8311 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelEC8311 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEE8311 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPA.setText("GPA CALCULATOR");

        jButtonCalculate.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalculate.setText("CALCULATE");
        jButtonCalculate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCalculate.addActionListener(evt -> jButtonCalculateActionPerformed());

        jLabelMA8351.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMA8351.setText("MA8351");

        jComboBoxME8792.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8792.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8792.addActionListener(evt -> jComboBoxME8792ActionPerformed());

        jLabelEE8351.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEE8351.setText("EE8351");

        jComboBoxEE8391.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEE8391.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEE8391.addActionListener(evt -> jComboBoxEE8391ActionPerformed());

        jComboBoxMA8351.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMA8351.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMA8351.addActionListener(evt -> jComboBoxMA8351ActionPerformed());

        jComboBoxEE8301.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEE8301.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEE8301.addActionListener(evt -> jComboBoxEE8301ActionPerformed());

        jComboBoxEC8353.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8353.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8353.addActionListener(evt -> jComboBoxEC8353ActionPerformed());

        jComboBoxEE8351.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEE8351.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEE8351.addActionListener(evt -> jComboBoxEE8351ActionPerformed());

        jLabelEE8391.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEE8391.setText("EE8391");

        jLabelEC8353.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8353.setText("EC8353");

        jLabelME8792.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8792.setText("ME8792");

        jLabelEE8301.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEE8301.setText("EE8301");

        jComboBoxEE8311.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEE8311.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEE8311.addActionListener(evt -> jComboBoxEE8311ActionPerformed());

        jComboBoxEC8311.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8311.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8311.addActionListener(evt -> jComboBoxEC8311ActionPerformed());

        jLabelEC8311.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8311.setText("EC8311");

        jLabelEE8311.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEE8311.setText("EE8311");

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
                                                .addComponent(jLabelMA8351))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabelEC8311))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelEE8391, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabelEC8353, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBoxEC8311, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxEE8311, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabelEE8301)
                                                                        .addComponent(jLabelEE8351))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxEE8351, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxEE8301, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxEE8391, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxEC8353, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxMA8351, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(74, 74, 74)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelEE8311)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelME8792)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxME8792, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                                                        .addComponent(jComboBoxEE8351, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelEE8351))
                                                                .addGap(97, 97, 97))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jComboBoxMA8351, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelMA8351))
                                                                .addGap(32, 32, 32)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabelEE8301)
                                                                                .addComponent(jComboBoxEE8301, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBoxEE8391, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabelEE8391))
                                                                .addGap(35, 35, 35)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelME8792)
                                                                        .addComponent(jComboBoxME8792, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(133, 133, 133))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelEC8353)
                                                                        .addComponent(jComboBoxEC8353))
                                                                .addGap(43, 43, 43)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelEC8311)
                                                                        .addComponent(jComboBoxEC8311, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelEE8311)
                                                                        .addComponent(jComboBoxEE8311, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        try {
            GPA3 = (grade1  + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8 ) ;
            float result = GPA3 / totalcredits;
            javax.swing.JOptionPane.showMessageDialog(jframe3,"Your GPA Is :-  " + result);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxMA8351ActionPerformed() {
        try {
            num1 = ((String) jComboBoxMA8351.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                MA8351 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                MA8351 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                MA8351 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                MA8351 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                MA8351 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade1 = MA8351 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEE8351ActionPerformed() {
        try {
            num2 = ((String) jComboBoxEE8351.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                EE8351 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                EE8351 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                EE8351 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                EE8351 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                EE8351 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade2 = EE8351 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEE8391ActionPerformed() {
        try {
            num3 = ((String) jComboBoxEE8391.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                EE8391 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                EE8391 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                EE8391 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                EE8391 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                EE8391 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade3 = EE8391 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEE8301ActionPerformed() {
        try {
            num4 = ((String) jComboBoxEE8301.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                EE8301 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                EE8301 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                EE8301 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                EE8301 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                EE8301 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade4 = EE8301 * credit4;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8353ActionPerformed() {
        try {
            num5 = ((String) jComboBoxEC8353.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                EC8353 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                EC8353 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                EC8353 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                EC8353 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                EC8353 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade5 = EC8353 * credit5;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxME8792ActionPerformed() {
        try {
            num6 = ((String) jComboBoxME8792.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                ME8792 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                ME8792 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                ME8792 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                ME8792 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                ME8792 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade6 = ME8792 * credit6;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8311ActionPerformed() {
        try {
            num7 = ((String) jComboBoxEC8311.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                EC8311 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                EC8311 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                EC8311 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                EC8311 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                EC8311 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade7 = EC8311 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEE8311ActionPerformed() {
        try {
            num8 = ((String) jComboBoxEE8311.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                EE8311 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                EE8311 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                EE8311 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                EE8311 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                EE8311 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade8 = EE8311 * credit8;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxEE8301;
    private static javax.swing.JComboBox<String> jComboBoxME8792;
    private static javax.swing.JComboBox<String> jComboBoxEE8311;
    private static javax.swing.JComboBox<String> jComboBoxEC8311;
    private static javax.swing.JComboBox<String> jComboBoxEC8353;
    private static javax.swing.JComboBox<String> jComboBoxMA8351;
    private static javax.swing.JComboBox<String> jComboBoxEE8351;
    private static javax.swing.JComboBox<String> jComboBoxEE8391;
    // End of variables declaration
}