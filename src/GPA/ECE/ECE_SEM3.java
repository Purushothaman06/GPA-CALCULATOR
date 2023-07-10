package GPA.ECE;

/**
 *
 * @author Praveenkumar
 * @co-author Purushothaman
 */
public class ECE_SEM3 extends javax.swing.JFrame {

    static float MA8352 = 0, EC8393 = 0, EC8351 = 0, EC8352 = 0, EC8392 = 0, EC8391 = 0, EC8381= 0, EC8361 = 0, HS8381 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0, grade9 = 0;
    static float totalcredits = 25, credit1 = 4 , credit2 = 3 , credit3 = 3 , credit4 = 4 , credit5 = 3 , credit6 = 3 , credit7 = 2 , credit8 = 2, credit9 = 1;
    static String num1, num2, num3, num4, num5, num6, num7, num8, num9 ;
    static float gpa3 = 0;
    static javax.swing.JFrame jframe3 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.ECE.ECE_SEM3
     */
    public ECE_SEM3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPACalc = new javax.swing.JLabel();
        javax.swing.JLabel jLabelMA8352 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEC8393 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEC8351 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEC8352 = new javax.swing.JLabel();
        jComboBoxMA8352 = new javax.swing.JComboBox<>();
        jComboBoxEC8393 = new javax.swing.JComboBox<>();
        jComboBoxEC8351 = new javax.swing.JComboBox<>();
        jComboBoxEC8352 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelEC8392 = new javax.swing.JLabel();
        jComboBoxEC8392 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelEC8391 = new javax.swing.JLabel();
        jComboBoxEC8391 = new javax.swing.JComboBox<>();
        javax.swing.JButton jButtonCalcGPA = new javax.swing.JButton();
        javax.swing.JLabel jLabelEC8381 = new javax.swing.JLabel();
        jComboBoxEC8381 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelEC8361 = new javax.swing.JLabel();
        jComboBoxEC8361 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelHS8381 = new javax.swing.JLabel();
        jComboBoxHS8381 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPACalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPACalc.setText("GPA CALCULATOR");

        jLabelMA8352.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMA8352.setText("MA8352");

        jLabelEC8393.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8393.setText("EC8393");

        jLabelEC8351.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8351.setText("EC8351");

        jLabelEC8352.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8352.setText("EC8352");

        jComboBoxMA8352.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMA8352.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMA8352.addActionListener(evt -> jComboBoxMA8352ActionPerformed());

        jComboBoxEC8393.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8393.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8393.addActionListener(evt -> jComboBoxEC8393ActionPerformed());

        jComboBoxEC8351.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8351.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8351.addActionListener(evt -> jComboBoxEC8351ActionPerformed());

        jComboBoxEC8352.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8352.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8352.addActionListener(evt -> jComboBoxEC8352ActionPerformed());

        jLabelEC8392.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8392.setText("EC8392");

        jComboBoxEC8392.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8392.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8392.addActionListener(evt -> jComboBoxEC8392ActionPerformed());

        jLabelEC8391.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8391.setText("EC8391");

        jComboBoxEC8391.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8391.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8391.addActionListener(evt -> jComboBoxEC8391ActionPerformed());

        jButtonCalcGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalcGPA.setText("CALCULATE ");
        jButtonCalcGPA.addActionListener(evt -> jButtonCalcGPAActionPerformed());

        jLabelEC8381.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8381.setText("EC8381");

        jComboBoxEC8381.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8381.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8381.addActionListener(evt -> jComboBoxEC8381ActionPerformed());

        jLabelEC8361.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8361.setText("EC8361");

        jComboBoxEC8361.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8361.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8361.addActionListener(evt -> jComboBoxEC8361ActionPerformed());

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
                                                                        .addComponent(jLabelMA8352, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelEC8393, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelEC8351, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelEC8352, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxEC8393, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxMA8352, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxEC8351, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxEC8352, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(58, 58, 58)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxHS8381, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelEC8392, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelEC8391, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelEC8381, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelEC8361, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxEC8392, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxEC8391, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxEC8381, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxEC8361, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                                        .addComponent(jLabelEC8393, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxEC8393, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelEC8351, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxEC8351, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelEC8352, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxEC8352, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(62, 62, 62)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelEC8391, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxEC8391, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(29, 29, 29)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelEC8381, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxEC8381, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabelEC8392, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBoxEC8392, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelEC8361, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxEC8361, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
        }
        catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8393ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxEC8393.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                EC8393 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                EC8393 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                EC8393 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                EC8393 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                EC8393 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade2 = EC8393 * credit2;
        }
        catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8351ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxEC8351.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                EC8351 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                EC8351 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                EC8351 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                EC8351 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                EC8351 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade3 = EC8351 * credit3;
        }
        catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8352ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxEC8352.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                EC8352 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                EC8352 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                EC8352 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                EC8352 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                EC8352 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade4 = EC8352 * credit4;
        }
        catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8392ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxEC8392.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                EC8392 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                EC8392 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                EC8392 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                EC8392 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                EC8392 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade5 = EC8392 * credit5;
        }
        catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8391ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxEC8391.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                EC8391 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                EC8391 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                EC8391 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                EC8391 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                EC8391 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade6 = EC8391 * credit6;
        }
        catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8381ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxEC8381.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                EC8381 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                EC8381 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                EC8381 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                EC8381 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                EC8381 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade7 = EC8381 * credit7;
        }
        catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8361ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxEC8361.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                EC8361 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                EC8361 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                EC8361 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                EC8361 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                EC8361 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade8 = EC8352 * credit8;
        }
        catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
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
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade9 = HS8381 * credit9;
        }
        catch (Exception e){
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
        }
        catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxEC8393;
    private static javax.swing.JComboBox<String> jComboBoxEC8391;
    private static javax.swing.JComboBox<String> jComboBoxEC8361;
    private static javax.swing.JComboBox<String> jComboBoxEC8381;
    private static javax.swing.JComboBox<String> jComboBoxEC8351;
    private static javax.swing.JComboBox<String> jComboBoxEC8352;
    private static javax.swing.JComboBox<String> jComboBoxEC8392;
    private static javax.swing.JComboBox<String> jComboBoxHS8381;
    private static javax.swing.JComboBox<String> jComboBoxMA8352;
    // End of variables declaration
}