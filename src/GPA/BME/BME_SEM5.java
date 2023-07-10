package GPA.BME;

/**
 *
 * @author Purushothaman
 */
public class BME_SEM5 extends javax.swing.JFrame {

    static float EC8394 = 0, BM8501 = 0, BM8502 = 0, EC8553 = 0, ProfEle1 = 0, OpenEle1 = 0, EC8562= 0, BM8511 = 0, HS8381 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0, grade9 = 0;
    static float totalcredits = 25, credit1 = 3 , credit2 = 4 , credit3 = 3 , credit4 = 4 , credit5 = 3 , credit6 = 3 , credit7 = 2 , credit8 = 2, credit9 = 1;
    static String num1, num2, num3, num4, num5, num6, num7, num8, num9 ;
    static float gpa5 = 0;
    static javax.swing.JFrame jframe5 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.BME.BME_SEM5
     */
    public BME_SEM5() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPACalc = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEC8394 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelBM8501 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelBM8502 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEC8553 = new javax.swing.JLabel();
        jComboBoxEC8394 = new javax.swing.JComboBox<>();
        jComboBoxBM8501 = new javax.swing.JComboBox<>();
        jComboBoxBM8502 = new javax.swing.JComboBox<>();
        jComboBoxEC8553 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelProfEle1 = new javax.swing.JLabel();
        jComboBoxProfEle1 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelOpenEle1 = new javax.swing.JLabel();
        jComboBoxOpenEle1 = new javax.swing.JComboBox<>();
        javax.swing.JButton jButtonCalcGPA = new javax.swing.JButton();
        javax.swing.JLabel jLabelEC8562 = new javax.swing.JLabel();
        jComboBoxEC8562 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelBM8511 = new javax.swing.JLabel();
        jComboBoxBM8511 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelHS8381 = new javax.swing.JLabel();
        jComboBoxHS8381 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPACalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPACalc.setText("GPA CALCULATOR");

        jLabelEC8394.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8394.setText("EC8394");

        jLabelBM8501.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelBM8501.setText("BM8501");

        jLabelBM8502.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelBM8502.setText("BM8502");

        jLabelEC8553.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8553.setText("EC8553");

        jComboBoxEC8394.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8394.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8394.addActionListener(evt -> jComboBoxEC8394ActionPerformed());

        jComboBoxBM8501.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxBM8501.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxBM8501.addActionListener(evt -> jComboBoxBM8501ActionPerformed());

        jComboBoxBM8502.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxBM8502.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxBM8502.addActionListener(evt -> jComboBoxBM8502ActionPerformed());

        jComboBoxEC8553.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8553.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8553.addActionListener(evt -> jComboBoxEC8553ActionPerformed());

        jLabelProfEle1.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle1.setText("ProfEle1");

        jComboBoxProfEle1.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfEle1.addActionListener(evt -> jComboBoxProfEle1ActionPerformed());

        jLabelOpenEle1.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelOpenEle1.setText("OpenEle1");

        jComboBoxOpenEle1.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxOpenEle1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxOpenEle1.addActionListener(evt -> jComboBoxOpenEle1ActionPerformed());

        jButtonCalcGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalcGPA.setText("CALCULATE ");
        jButtonCalcGPA.addActionListener(evt -> jButtonCalcGPAActionPerformed());

        jLabelEC8562.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8562.setText("EC8562");

        jComboBoxEC8562.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8562.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8562.addActionListener(evt -> jComboBoxEC8562ActionPerformed());

        jLabelBM8511.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelBM8511.setText("BM8511");

        jComboBoxBM8511.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxBM8511.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxBM8511.addActionListener(evt -> jComboBoxBM8511ActionPerformed());

        jLabelHS8381.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelHS8381.setText("HS8381");

        jComboBoxHS8381.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxHS8381.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxHS8381.addActionListener(evt -> jComboBoxHS8381ActionPerformed());

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
                                                                .addComponent(jLabelHS8381, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(35, 35, 35))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelEC8394, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelBM8501, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelBM8502, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelEC8553, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxBM8501, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxEC8394, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxBM8502, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxEC8553, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(58, 58, 58)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxHS8381, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelProfEle1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelOpenEle1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelEC8562, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelBM8511, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxProfEle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxOpenEle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxEC8562, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxBM8511, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                                        .addComponent(jLabelEC8394, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxEC8394, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelBM8501, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxBM8501, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelBM8502, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxBM8502, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelEC8553, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxEC8553, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(62, 62, 62)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelOpenEle1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxOpenEle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(29, 29, 29)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelEC8562, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxEC8562, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabelProfEle1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBoxProfEle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelBM8511, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxBM8511, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelHS8381, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxHS8381, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addComponent(jButtonCalcGPA)
                                .addGap(52, 52, 52))
        );
        setBounds(0, 0, 755, 621);
    }
    
    private void jComboBoxEC8394ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxEC8394.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                EC8394 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                EC8394 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                EC8394 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                EC8394 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                EC8394 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade1 = EC8394 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxBM8501ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxBM8501.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                BM8501 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                BM8501 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                BM8501 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                BM8501 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                BM8501 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade2 = BM8501 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxBM8502ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxBM8502.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                BM8502 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                BM8502 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                BM8502 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                BM8502 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                BM8502 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade3 = BM8502 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8553ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxEC8553.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                EC8553 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                EC8553 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                EC8553 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                EC8553 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                EC8553 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade4 = EC8553 * credit4;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxProfEle1ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxProfEle1.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                ProfEle1 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                ProfEle1 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                ProfEle1 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                ProfEle1 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                ProfEle1 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade5 = ProfEle1 * credit5;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxOpenEle1ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxOpenEle1.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                OpenEle1 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                OpenEle1 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                OpenEle1 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                OpenEle1 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                OpenEle1 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade6 = OpenEle1 * credit6;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8562ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxEC8562.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                EC8562 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                EC8562 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                EC8562 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                EC8562 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                EC8562 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade7 = EC8562 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxBM8511ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxBM8511.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                BM8511 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                BM8511 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                BM8511 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                BM8511 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                BM8511 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade8 = EC8553 * credit8;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxHS8381ActionPerformed() {
        // TODO add your handling code here:
        try {
            num9 = ((String) jComboBoxHS8381.getSelectedItem());
            if ("O".equalsIgnoreCase(num9)) {
                HS8381 = 10;
            } else if ("A+".equalsIgnoreCase(num9)) {
                HS8381 = 9;
            } else if ("A".equalsIgnoreCase(num9)) {
                HS8381 = 8;
            } else if ("B+".equalsIgnoreCase(num9)) {
                HS8381 = 7;
            } else if ("B".equalsIgnoreCase(num9)) {
                HS8381 = 6;
            } else if ("U".equalsIgnoreCase(num9)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade9 = HS8381 * credit9;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jButtonCalcGPAActionPerformed() {
        // TODO add your handling code here:
        try {
            gpa5 = (grade1 + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8 + grade9);
            float result = gpa5 / totalcredits;
            javax.swing.JOptionPane.showMessageDialog(jframe5, "Your GPA Is :-  " + result);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxBM8501;
    private static javax.swing.JComboBox<String> jComboBoxOpenEle1;
    private static javax.swing.JComboBox<String> jComboBoxBM8511;
    private static javax.swing.JComboBox<String> jComboBoxEC8562;
    private static javax.swing.JComboBox<String> jComboBoxBM8502;
    private static javax.swing.JComboBox<String> jComboBoxEC8553;
    private static javax.swing.JComboBox<String> jComboBoxProfEle1;
    private static javax.swing.JComboBox<String> jComboBoxHS8381;
    private static javax.swing.JComboBox<String> jComboBoxEC8394;
    // End of variables declaration
}