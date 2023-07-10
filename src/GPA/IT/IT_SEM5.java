package GPA.IT;

/**
 * @author Purushothaman
 */
public class IT_SEM5 extends javax.swing.JFrame {

    static float MA8551 = 0, CS8591 = 0, EC8691 = 0, IT8501 = 0, CS8494 = 0, OpenEle1 = 0, EC8681= 0, CS8581 = 0, IT8511 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0, grade9 = 0;
    static float totalcredits = 25, credit1 = 4 , credit2 = 3 , credit3 = 3 , credit4 = 3 , credit5 = 3 , credit6 = 3 , credit7 = 2 , credit8 = 2, credit9 = 2;
    static String num1, num2, num3, num4, num5, num6, num7, num8, num9 ;
    static float gpa5 = 0;
    static javax.swing.JFrame jframe5 = new javax.swing.JFrame();

    public IT_SEM5() {
        initComponents();
    }

    public void initComponents() {

        javax.swing.JLabel jLabelGPACalc = new javax.swing.JLabel();
        javax.swing.JLabel jLabelMA8551 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCS8591 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEC8691 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelIT8501 = new javax.swing.JLabel();
        jComboBoxMA8551 = new javax.swing.JComboBox<>();
        jComboBoxCS8591 = new javax.swing.JComboBox<>();
        jComboBoxEC8691 = new javax.swing.JComboBox<>();
        jComboBoxIT8501 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelCS8494 = new javax.swing.JLabel();
        jComboBoxCS8494 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelOpenEle1 = new javax.swing.JLabel();
        jComboBoxOpenEle1 = new javax.swing.JComboBox<>();
        javax.swing.JButton jButtonCalcGPA = new javax.swing.JButton();
        javax.swing.JLabel jLabelEC8681 = new javax.swing.JLabel();
        jComboBoxEC8681 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelCS8581 = new javax.swing.JLabel();
        jComboBoxCS8581 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelIT8511 = new javax.swing.JLabel();
        jComboBoxIT8511 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPACalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPACalc.setText("GPA CALCULATOR");

        jLabelMA8551.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMA8551.setText("MA8551");

        jLabelCS8591.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCS8591.setText("CS8591");

        jLabelEC8691.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8691.setText("EC8691");

        jLabelIT8501.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelIT8501.setText("IT8501");

        jComboBoxMA8551.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMA8551.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMA8551.addActionListener(evt -> jComboBoxMA8551ActionPerformed());

        jComboBoxCS8591.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCS8591.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCS8591.addActionListener(evt -> jComboBoxCS8591ActionPerformed());

        jComboBoxEC8691.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8691.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8691.addActionListener(evt -> jComboBoxEC8691ActionPerformed());

        jComboBoxIT8501.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxIT8501.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxIT8501.addActionListener(evt -> jComboBoxIT8501ActionPerformed());

        jLabelCS8494.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCS8494.setText("CS8494");

        jComboBoxCS8494.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCS8494.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCS8494.addActionListener(evt -> jComboBoxCS8494ActionPerformed());

        jLabelOpenEle1.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelOpenEle1.setText("OpenEle1");

        jComboBoxOpenEle1.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxOpenEle1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxOpenEle1.addActionListener(evt -> jComboBoxOpenEle1ActionPerformed());

        jButtonCalcGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalcGPA.setText("CALCULATE ");
        jButtonCalcGPA.addActionListener(evt -> jButtonCalcGPAActionPerformed());

        jLabelEC8681.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8681.setText("EC8681");

        jComboBoxEC8681.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8681.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8681.addActionListener(evt -> jComboBoxEC8681ActionPerformed());

        jLabelCS8581.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCS8581.setText("CS8581");

        jComboBoxCS8581.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCS8581.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCS8581.addActionListener(evt -> jComboBoxCS8581ActionPerformed());

        jLabelIT8511.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelIT8511.setText("IT8511");

        jComboBoxIT8511.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxIT8511.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxIT8511.addActionListener(evt -> jComboBoxIT8511ActionPerformed());

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
                                                                .addComponent(jLabelIT8511, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(35, 35, 35))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelMA8551, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelCS8591, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelEC8691, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelIT8501, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxCS8591, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxMA8551, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxEC8691, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxIT8501, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(58, 58, 58)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxIT8511, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelCS8494, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelOpenEle1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelEC8681, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelCS8581, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxCS8494, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxOpenEle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxEC8681, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxCS8581, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                                        .addComponent(jLabelMA8551, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxMA8551, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelCS8591, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxCS8591, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelEC8691, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxEC8691, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelIT8501, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxIT8501, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(62, 62, 62)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelOpenEle1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxOpenEle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(29, 29, 29)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelEC8681, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxEC8681, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabelCS8494, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBoxCS8494, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelCS8581, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxCS8581, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelIT8511, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxIT8511, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addComponent(jButtonCalcGPA)
                                .addGap(52, 52, 52))
        );
        setBounds(0, 0, 755, 621);
    }

    private void jComboBoxMA8551ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxMA8551.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                MA8551 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                MA8551 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                MA8551 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                MA8551 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                MA8551 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade1 = MA8551 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCS8591ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxCS8591.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                CS8591 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                CS8591 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                CS8591 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                CS8591 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                CS8591 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade2 = CS8591 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8691ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxEC8691.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                EC8691 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                EC8691 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                EC8691 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                EC8691 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                EC8691 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade3 = EC8691 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxIT8501ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxIT8501.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                IT8501 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                IT8501 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                IT8501 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                IT8501 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                IT8501 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade4 = IT8501 * credit4;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCS8494ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxCS8494.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                CS8494 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                CS8494 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                CS8494 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                CS8494 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                CS8494 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade5 = CS8494 * credit5;
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

    private void jComboBoxEC8681ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxEC8681.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                EC8681 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                EC8681 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                EC8681 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                EC8681 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                EC8681 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade7 = EC8681 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCS8581ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxCS8581.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                CS8581 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                CS8581 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                CS8581 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                CS8581 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                CS8581 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade8 = IT8501 * credit8;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe5, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxIT8511ActionPerformed() {
        // TODO add your handling code here:
        try {
            num9 = ((String) jComboBoxIT8511.getSelectedItem());
            if ("O".equalsIgnoreCase(num9)) {
                IT8511 = 10;
            } else if ("A+".equalsIgnoreCase(num9)) {
                IT8511 = 9;
            } else if ("A".equalsIgnoreCase(num9)) {
                IT8511 = 8;
            } else if ("B+".equalsIgnoreCase(num9)) {
                IT8511 = 7;
            } else if ("B".equalsIgnoreCase(num9)) {
                IT8511 = 6;
            } else if ("U".equalsIgnoreCase(num9)) {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe5, "Error ! Select Any Grade");
            }
            grade9 = IT8511 * credit9;
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
    private static javax.swing.JComboBox<String> jComboBoxCS8591;
    private static javax.swing.JComboBox<String> jComboBoxOpenEle1;
    private static javax.swing.JComboBox<String> jComboBoxCS8581;
    private static javax.swing.JComboBox<String> jComboBoxEC8681;
    private static javax.swing.JComboBox<String> jComboBoxEC8691;
    private static javax.swing.JComboBox<String> jComboBoxIT8501;
    private static javax.swing.JComboBox<String> jComboBoxCS8494;
    private static javax.swing.JComboBox<String> jComboBoxIT8511;
    private static javax.swing.JComboBox<String> jComboBoxMA8551;
    // End of variables declaration
}