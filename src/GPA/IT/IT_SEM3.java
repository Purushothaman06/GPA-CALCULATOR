package GPA.IT;

/**
 * @author Tanish
 * @co-author Purushothaman
 */
public class IT_SEM3 extends javax.swing.JFrame {

    static float MA8351 = 0, CS8351 = 0, CS8391 = 0, CS8392 = 0, EC8394 = 0, CS8381 = 0, CS8383= 0, CS8382 = 0, HS8381 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0, grade9 = 0;
    static float totalcredits = 24, credit1 = 4 , credit2 = 4 , credit3 = 3 , credit4 = 3 , credit5 = 3 , credit6 = 2 , credit7 = 2 , credit8 = 2, credit9 = 1;
    static String num1, num2, num3, num4, num5, num6, num7, num8, num9 ;
    static float gpa3 = 0;
    static javax.swing.JFrame jframe3 = new javax.swing.JFrame();

    public IT_SEM3() {
        initComponents();
    }

    public void initComponents() {

        javax.swing.JLabel jLabelGPACalc = new javax.swing.JLabel();
        javax.swing.JLabel jLabelMA8351 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCS8351 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCS8391 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCS8392 = new javax.swing.JLabel();
        jComboBoxMA8351 = new javax.swing.JComboBox<>();
        jComboBoxCS8351 = new javax.swing.JComboBox<>();
        jComboBoxCS8391 = new javax.swing.JComboBox<>();
        jComboBoxCS8392 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelEC8394 = new javax.swing.JLabel();
        jComboBoxEC8394 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelCS8381 = new javax.swing.JLabel();
        jComboBoxCS8381 = new javax.swing.JComboBox<>();
        javax.swing.JButton jButtonCalcGPA = new javax.swing.JButton();
        javax.swing.JLabel jLabelCS8383 = new javax.swing.JLabel();
        jComboBoxCS8383 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelCS8382 = new javax.swing.JLabel();
        jComboBoxCS8382 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelHS8381 = new javax.swing.JLabel();
        jComboBoxHS8381 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPACalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPACalc.setText("GPA CALCULATOR");

        jLabelMA8351.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMA8351.setText("MA8351");

        jLabelCS8351.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCS8351.setText("CS8351");

        jLabelCS8391.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCS8391.setText("CS8391");

        jLabelCS8392.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCS8392.setText("CS8392");

        jComboBoxMA8351.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMA8351.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMA8351.addActionListener(evt -> jComboBoxMA8351ActionPerformed());

        jComboBoxCS8351.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCS8351.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCS8351.addActionListener(evt -> jComboBoxCS8351ActionPerformed());

        jComboBoxCS8391.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCS8391.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCS8391.addActionListener(evt -> jComboBoxCS8391ActionPerformed());

        jComboBoxCS8392.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCS8392.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCS8392.addActionListener(evt -> jComboBoxCS8392ActionPerformed());

        jLabelEC8394.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEC8394.setText("EC8394");

        jComboBoxEC8394.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEC8394.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEC8394.addActionListener(evt -> jComboBoxEC8394ActionPerformed());

        jLabelCS8381.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCS8381.setText("CS8381");

        jComboBoxCS8381.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCS8381.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCS8381.addActionListener(evt -> jComboBoxCS8381ActionPerformed());

        jButtonCalcGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalcGPA.setText("CALCULATE ");
        jButtonCalcGPA.addActionListener(evt -> jButtonCalcGPAActionPerformed());

        jLabelCS8383.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCS8383.setText("CS8383");

        jComboBoxCS8383.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCS8383.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCS8383.addActionListener(evt -> jComboBoxCS8383ActionPerformed());

        jLabelCS8382.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCS8382.setText("CS8382");

        jComboBoxCS8382.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCS8382.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCS8382.addActionListener(evt -> jComboBoxCS8382ActionPerformed());

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
                                                                        .addComponent(jLabelMA8351, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelCS8351, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelCS8391, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelCS8392, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxCS8351, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxMA8351, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxCS8391, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxCS8392, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(58, 58, 58)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxHS8381, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelEC8394, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelCS8381, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelCS8383, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelCS8382, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxEC8394, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxCS8381, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxCS8383, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxCS8382, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                                        .addComponent(jLabelMA8351, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxMA8351, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelCS8351, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxCS8351, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelCS8391, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxCS8391, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelCS8392, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxCS8392, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(62, 62, 62)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelCS8381, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxCS8381, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(29, 29, 29)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelCS8383, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxCS8383, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabelEC8394, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBoxEC8394, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelCS8382, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxCS8382, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    private void jComboBoxMA8351ActionPerformed() {
        // TODO add your handling code here:
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

    private void jComboBoxCS8351ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxCS8351.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                CS8351 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                CS8351 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                CS8351 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                CS8351 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                CS8351 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade2 = CS8351 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCS8391ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxCS8391.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                CS8391 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                CS8391 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                CS8391 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                CS8391 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                CS8391 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade3 = CS8391 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCS8392ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxCS8392.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                CS8392 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                CS8392 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                CS8392 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                CS8392 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                CS8392 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade4 = CS8392 * credit4;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEC8394ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxEC8394.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                EC8394 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                EC8394 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                EC8394 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                EC8394 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                EC8394 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade5 = EC8394 * credit5;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCS8381ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxCS8381.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                CS8381 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                CS8381 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                CS8381 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                CS8381 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                CS8381 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade6 = CS8381 * credit6;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCS8383ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxCS8383.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                CS8383 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                CS8383 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                CS8383 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                CS8383 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                CS8383 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade7 = CS8383 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCS8382ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxCS8382.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                CS8382 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                CS8382 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                CS8382 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                CS8382 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                CS8382 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade8 = CS8392 * credit8;
        } catch (Exception e){
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

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxCS8351;
    private static javax.swing.JComboBox<String> jComboBoxCS8381;
    private static javax.swing.JComboBox<String> jComboBoxCS8382;
    private static javax.swing.JComboBox<String> jComboBoxCS8383;
    private static javax.swing.JComboBox<String> jComboBoxCS8391;
    private static javax.swing.JComboBox<String> jComboBoxCS8392;
    private static javax.swing.JComboBox<String> jComboBoxEC8394;
    private static javax.swing.JComboBox<String> jComboBoxHS8381;
    private static javax.swing.JComboBox<String> jComboBoxMA8351;
    // End of variables declaration
}