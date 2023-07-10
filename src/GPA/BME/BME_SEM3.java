package GPA.BME;

/**
 *
 * @author Tanish
 * @co-author Purushothaman
 */
public class BME_SEM3 extends javax.swing.JFrame {

    static float MA8352 = 0, EC8352 = 0, BM8351 = 0, BM8301 = 0, EC8353 = 0, BM8302 = 0, BM8311 = 0, BM8312 = 0, BM8313 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0, grade9 = 0;
    static float totalcredits = 25, credit1 = 4 , credit2 = 4 , credit3 = 3 , credit4 = 3 , credit5 = 3 , credit6 = 3 , credit7 = 2 , credit8 = 2, credit9 = 1;
    static String num1, num2, num3, num4, num5, num6, num7, num8, num9 ;
    static float gpa3 = 0;
    static javax.swing.JFrame jframe3 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.BME.BME_SEM3
     */
    public BME_SEM3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPACalc = new javax.swing.JLabel();
        javax.swing.JLabel jLabelMA8352 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEC8352 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelBM8351 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelBM8301 = new javax.swing.JLabel();
        jComboBoxMA8352 = new javax.swing.JComboBox<>();
        jComboBoxEC8352 = new javax.swing.JComboBox<>();
        jComboBoxBM8351 = new javax.swing.JComboBox<>();
        jComboBoxBM8301 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelEC8353 = new javax.swing.JLabel();
        jComboBoxEC8353 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelBM8311 = new javax.swing.JLabel();
        jComboBoxBM8311 = new javax.swing.JComboBox<>();
        javax.swing.JButton jButtonCalcGPA = new javax.swing.JButton();
        javax.swing.JLabel jLabelBM8302 = new javax.swing.JLabel();
        jComboBoxBM8302 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelBM8312 = new javax.swing.JLabel();
        jComboBoxBM8312 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelBM8313 = new javax.swing.JLabel();
        jComboBoxBM8313 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPACalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26)); // NOI18N
        jLabelGPACalc.setText("GPA CALCULATOR");

        jLabelMA8352.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jLabelMA8352.setText("MA8352");

        jLabelEC8352.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jLabelEC8352.setText("EC8352");

        jLabelBM8351.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jLabelBM8351.setText("BM8351");

        jLabelBM8301.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jLabelBM8301.setText("BM8301");

        jComboBoxMA8352.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jComboBoxMA8352.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMA8352.addActionListener(evt -> jComboBoxMA8352ActionPerformed());

        jComboBoxEC8352.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jComboBoxEC8352.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8352.addActionListener(evt -> jComboBoxEC8352ActionPerformed());

        jComboBoxBM8351.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jComboBoxBM8351.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxBM8351.addActionListener(evt -> jComboBoxBM8351ActionPerformed());

        jComboBoxBM8301.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jComboBoxBM8301.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxBM8301.addActionListener(evt -> jComboBoxBM8301ActionPerformed());

        jLabelEC8353.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jLabelEC8353.setText("EC8353");

        jComboBoxEC8353.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jComboBoxEC8353.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8353.addActionListener(evt -> jComboBoxEC8353ActionPerformed());

        jLabelBM8311.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jLabelBM8311.setText("BM8311");

        jComboBoxBM8311.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jComboBoxBM8311.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxBM8311.addActionListener(evt -> jComboBoxBM8311ActionPerformed());

        jButtonCalcGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22)); // NOI18N
        jButtonCalcGPA.setText("CALCULATE ");
        jButtonCalcGPA.addActionListener(evt -> jButtonCalcGPAActionPerformed());

        jLabelBM8302.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jLabelBM8302.setText("BM8302");

        jComboBoxBM8302.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jComboBoxBM8302.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxBM8302.addActionListener(evt -> jComboBoxBM8302ActionPerformed());

        jLabelBM8312.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jLabelBM8312.setText("BM8312");

        jComboBoxBM8312.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jComboBoxBM8312.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxBM8312.addActionListener(evt -> jComboBoxBM8312ActionPerformed());

        jLabelBM8313.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jLabelBM8313.setText("BM8313");

        jComboBoxBM8313.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18)); // NOI18N
        jComboBoxBM8313.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxBM8313.addActionListener(evt -> jComboBoxBM8313ActionPerformed());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonCalcGPA)
                                .addGap(277, 277, 277))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(266, 266, 266)
                                                                .addComponent(jLabelBM8313, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(35, 35, 35))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelMA8352, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelEC8352, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelBM8351, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelBM8301, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxEC8352, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxMA8352, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxBM8351, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxBM8301, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(58, 58, 58)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxBM8313, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelEC8353, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelBM8311, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelBM8302, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelBM8312, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxEC8353, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxBM8311, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxBM8302, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxBM8312, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelGPACalc)
                                                .addGap(159, 159, 159)))
                                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabelGPACalc)
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelMA8352, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxMA8352, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelEC8352, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxEC8352, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelBM8351, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxBM8351, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelBM8301, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxBM8301, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(62, 62, 62)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelBM8311, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxBM8311, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(29, 29, 29)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelBM8302, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxBM8302, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabelEC8353, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBoxEC8353, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelBM8312, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxBM8312, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelBM8313, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxBM8313, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addComponent(jButtonCalcGPA)
                                .addGap(52, 52, 52))
        );
        setBounds(0, 0, 755, 621);
    }

    private void jComboBoxMA8352ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxMA8352.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                MA8352 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                MA8352 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                MA8352 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                MA8352 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                MA8352 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade1 = MA8352 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8352ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxEC8352.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                EC8352 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                EC8352 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                EC8352 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                EC8352 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                EC8352 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade2 = EC8352 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxBM8351ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxBM8351.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                BM8351 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                BM8351 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                BM8351 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                BM8351 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                BM8351 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade3 = BM8351 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxBM8301ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxBM8301.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                BM8301 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                BM8301 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                BM8301 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                BM8301 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                BM8301 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade4 = BM8301 * credit4;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8353ActionPerformed() {
        // TODO add your handling code here:
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

    private void jComboBoxBM8302ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxBM8302.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                BM8302 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                BM8302 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                BM8302 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                BM8302 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                BM8302 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade6 = BM8302 * credit6;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxBM8311ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxBM8311.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                BM8311 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                BM8311 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                BM8311 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                BM8311 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                BM8311 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade7 = BM8311 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxBM8312ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxBM8312.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                BM8312 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                BM8312 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                BM8312 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                BM8312 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                BM8312 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade8 = BM8312 * credit8;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxBM8313ActionPerformed() {
        // TODO add your handling code here:
        try {
            num9 = ((String) jComboBoxBM8313.getSelectedItem());
            if ("O".equalsIgnoreCase(num9)) {
                BM8313 = 10;
            } else if ("A+".equalsIgnoreCase(num9)) {
                BM8313 = 9;
            } else if ("A".equalsIgnoreCase(num9)) {
                BM8313 = 8;
            } else if ("B+".equalsIgnoreCase(num9)) {
                BM8313 = 7;
            } else if ("B".equalsIgnoreCase(num9)) {
                BM8313 = 6;
            } else if ("U".equalsIgnoreCase(num9)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade9 = BM8313 * credit9;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jButtonCalcGPAActionPerformed() {
        // TODO add your handling code here:
        try {
            gpa3 = (grade1 + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8 + grade9);
            float result = gpa3 / totalcredits;
            javax.swing.JOptionPane.showMessageDialog(jframe3, "Your GPA Is :-  " + result);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    // Variable declaration
    private static javax.swing.JComboBox<String> jComboBoxEC8352;
    private static javax.swing.JComboBox<String> jComboBoxBM8311;
    private static javax.swing.JComboBox<String> jComboBoxBM8312;
    private static javax.swing.JComboBox<String> jComboBoxBM8302;
    private static javax.swing.JComboBox<String> jComboBoxBM8351;
    private static javax.swing.JComboBox<String> jComboBoxBM8301;
    private static javax.swing.JComboBox<String> jComboBoxEC8353;
    private static javax.swing.JComboBox<String> jComboBoxBM8313;
    private static javax.swing.JComboBox<String> jComboBoxMA8352;
    // End of variables declaration
}