package GPA.IT;

/**
 *
 * @author Tanish
 * @co-author Purushothaman
 */
public class IT_SEM2 extends javax.swing.JFrame {

    static float HS8251 = 0, MA8251 = 0, PH8252 = 0, BE8255 = 0, IT8201 = 0, CS8251 = 0, GE8261 = 0, CS8261 = 0, IT8211 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0 , grade9 = 0;
    static float totalcredits = 25, credit1 = 4 , credit2 = 4 , credit3 = 3 , credit4 = 3 , credit5 = 3 , credit6 = 3 , credit7 = 2 , credit8 = 2 , credit9 = 1;
    static String num1, num2, num3, num4, num5, num6, num7, num8, num9;
    static float gpa2 = 0;
    static javax.swing.JFrame jframe2 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.IT.IT_SEM2
     */
    public IT_SEM2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelSem2GPACalc = new javax.swing.JLabel();
        javax.swing.JLabel jLabelHS8251 = new javax.swing.JLabel();
        jComboBoxHS8251 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelMA8251 = new javax.swing.JLabel();
        jComboBoxMA8251 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelPH8252 = new javax.swing.JLabel();
        jComboBoxPH8252 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelBE8255 = new javax.swing.JLabel();
        jComboBoxBE8255 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelIT8201 = new javax.swing.JLabel();
        jComboBoxIT8201 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelCS8251 = new javax.swing.JLabel();
        jComboBoxCS8251 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelGE8261 = new javax.swing.JLabel();
        jComboBoxGE8261 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelCS8261 = new javax.swing.JLabel();
        jComboBoxCS8261 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelIT8211 = new javax.swing.JLabel();
        jComboBoxIT8211 = new javax.swing.JComboBox<>();
        javax.swing.JButton jButtonSem2GPA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setAutoRequestFocus(false);

        jLabelSem2GPACalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelSem2GPACalc.setText("GPA CALCULATOR");

        jLabelHS8251.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelHS8251.setText("HS8251");

        jComboBoxHS8251.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxHS8251.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B", "B+", "U" }));
        jComboBoxHS8251.addActionListener(evt -> jComboBoxHS8251ActionPerformed());

        jLabelMA8251.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMA8251.setText("MA8251");

        jComboBoxMA8251.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMA8251.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B", "B+", "U" }));
        jComboBoxMA8251.addActionListener(evt -> jComboBoxMA8251ActionPerformed());

        jLabelPH8252.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelPH8252.setText("PH8252");

        jComboBoxPH8252.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxPH8252.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B", "B+", "U" }));
        jComboBoxPH8252.addActionListener(evt -> jComboBoxPH8252ActionPerformed());

        jLabelBE8255.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelBE8255.setText("BE8255");

        jComboBoxBE8255.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxBE8255.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B", "B+", "U" }));
        jComboBoxBE8255.addActionListener(evt -> jComboBoxBE8255ActionPerformed());

        jLabelIT8201.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelIT8201.setText("IT8201");

        jComboBoxIT8201.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxIT8201.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B", "B+", "U" }));
        jComboBoxIT8201.addActionListener(e -> jComboBoxIT8201ActionPerformed());

        jLabelCS8251.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCS8251.setText("CS8251");

        jComboBoxCS8251.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCS8251.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B", "B+", "U" }));
        jComboBoxCS8251.addActionListener(evt -> jComboBoxCS8251ActionPerformed());

        jLabelGE8261.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelGE8261.setText("GE8261");

        jComboBoxGE8261.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxGE8261.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B", "B+", "U" }));
        jComboBoxGE8261.addActionListener(e -> jComboBoxGE8261ActionPerformed());

        jLabelCS8261.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCS8261.setText("CS8261");

        jComboBoxCS8261.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCS8261.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B", "B+", "U" }));
        jComboBoxCS8261.addActionListener(e -> jComboBoxCS8261ActionPerformed());

        jLabelIT8211.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelIT8211.setText("IT8211");

        jComboBoxIT8211.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxIT8211.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B", "B+", "U" }));
        jComboBoxIT8211.addActionListener(e -> jComboBoxIT8211ActionPerformed());

        jButtonSem2GPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 20));
        jButtonSem2GPA.setText("CALCULATE");
        jButtonSem2GPA.addActionListener(this::jButtonSem2GPAActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabelBE8255, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabelPH8252, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(36, 36, 36)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jComboBoxPH8252, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxBE8255, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabelGE8261)
                                                        .addComponent(jLabelCS8261))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxCS8261, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxGE8261, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelHS8251)
                                                                .addGap(34, 34, 34)
                                                                .addComponent(jComboBoxHS8251, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jLabelMA8251)
                                                                .addGap(34, 34, 34)
                                                                .addComponent(jComboBoxMA8251, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jLabelIT8201, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(34, 34, 34)
                                                                .addComponent(jComboBoxIT8201, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(39, 39, 39)
                                                                .addComponent(jLabelCS8251)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxCS8251, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(54, 54, 54))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabelSem2GPACalc)
                                                .addGap(179, 179, 179))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButtonSem2GPA)
                                                .addGap(214, 214, 214))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabelIT8211)
                                                .addGap(37, 37, 37)
                                                .addComponent(jComboBoxIT8211, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(165, 165, 165))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabelSem2GPACalc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelHS8251)
                                        .addComponent(jComboBoxHS8251, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelIT8201)
                                        .addComponent(jComboBoxIT8201, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelMA8251)
                                        .addComponent(jLabelCS8251)
                                        .addComponent(jComboBoxCS8251, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxMA8251, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelPH8252)
                                        .addComponent(jComboBoxPH8252, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelGE8261)
                                        .addComponent(jComboBoxGE8261, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelBE8255)
                                        .addComponent(jComboBoxBE8255, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelCS8261)
                                        .addComponent(jComboBoxCS8261, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelIT8211)
                                        .addComponent(jComboBoxIT8211, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(jButtonSem2GPA)
                                .addContainerGap(35, Short.MAX_VALUE))
        );
        pack();
    }

    private void jComboBoxHS8251ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxHS8251.getSelectedItem());
            if("O".equalsIgnoreCase(num1)) {
                HS8251 = 10;
            }else if ("A+".equalsIgnoreCase(num1)) {
                HS8251 = 9;
            }else if ("A".equalsIgnoreCase(num1)) {
                HS8251 = 8;
            }else if ("B+".equalsIgnoreCase(num1)) {
                HS8251 = 7;
            }else if ("B".equalsIgnoreCase(num1)) {
                HS8251 = 6;
            }else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "You Have Arrears !");
            }else {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "Error ! Select Any Grade");
            }
            grade1 = HS8251 * credit1;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe2, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxMA8251ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxMA8251.getSelectedItem());
            if("O".equalsIgnoreCase(num2)) {
                MA8251 = 10;
            }else if ("A+".equalsIgnoreCase(num2)) {
                MA8251 = 9;
            }else if ("A".equalsIgnoreCase(num2)) {
                MA8251 = 8;
            }else if ("B+".equalsIgnoreCase(num2)) {
                MA8251 = 7;
            }else if ("B".equalsIgnoreCase(num2)) {
                MA8251 = 6;
            }else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "You Have Arrears !");
            }else {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "Error ! Select Any Grade");
            }
            grade2 = MA8251 * credit2;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe2, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxPH8252ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxPH8252.getSelectedItem());
            if("O".equalsIgnoreCase(num3)) {
                PH8252 = 10;
            }else if ("A+".equalsIgnoreCase(num3)) {
                PH8252 = 9;
            }else if ("A".equalsIgnoreCase(num3)) {
                PH8252 = 8;
            }else if ("B+".equalsIgnoreCase(num3)) {
                PH8252 = 7;
            }else if ("B".equalsIgnoreCase(num3)) {
                PH8252 = 6;
            }else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "You Have Arrears !");
            }else {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "Error ! Select Any Grade");
            }
            grade3 = PH8252 * credit3;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe2, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxBE8255ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxBE8255.getSelectedItem());
            if("O".equalsIgnoreCase(num4)) {
                BE8255 = 10;
            }else if ("A+".equalsIgnoreCase(num4)) {
                BE8255 = 9;
            }else if ("A".equalsIgnoreCase(num4)) {
                BE8255 = 8;
            }else if ("B+".equalsIgnoreCase(num4)) {
                BE8255 = 7;
            }else if ("B".equalsIgnoreCase(num4)) {
                BE8255 = 6;
            }else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "You Have Arrears !");
            }else {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "Error ! Select Any Grade");
            }
            grade4 = BE8255 * credit4;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe2, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxIT8201ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxIT8201.getSelectedItem());
            if("O".equalsIgnoreCase(num5)) {
                IT8201 = 10;
            }else if ("A+".equalsIgnoreCase(num5)) {
                IT8201 = 9;
            }else if ("A".equalsIgnoreCase(num5)) {
                IT8201 = 8;
            }else if ("B+".equalsIgnoreCase(num5)) {
                IT8201 = 7;
            }else if ("B".equalsIgnoreCase(num5)) {
                IT8201 = 6;
            }else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "You Have Arrears !");
            }else {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "Error ! Select Any Grade");
            }
            grade5 = IT8201 * credit5;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe2, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCS8251ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxCS8251.getSelectedItem());
            if("O".equalsIgnoreCase(num6)) {
                CS8251 = 10;
            }else if ("A+".equalsIgnoreCase(num6)) {
                CS8251 = 9;
            }else if ("A".equalsIgnoreCase(num6)) {
                CS8251 = 8;
            }else if ("B+".equalsIgnoreCase(num6)) {
                CS8251 = 7;
            }else if ("B".equalsIgnoreCase(num6)) {
                CS8251 = 6;
            }else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "You Have Arrears !");
            }else {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "Error ! Select Any Grade");
            }
            grade6 = CS8251 * credit6;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe2, e.getMessage());
        }
        System.gc();
    }


    private void jComboBoxGE8261ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxGE8261.getSelectedItem());
            if("O".equalsIgnoreCase(num7)) {
                GE8261 = 10;
            }else if ("A+".equalsIgnoreCase(num7)) {
                GE8261 = 9;
            }else if ("A".equalsIgnoreCase(num7)) {
                GE8261 = 8;
            }else if ("B+".equalsIgnoreCase(num7)) {
                GE8261 = 7;
            }else if ("B".equalsIgnoreCase(num7)) {
                GE8261 = 6;
            }else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "You Have Arrears !");
            }else {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "Error ! Select Any Grade");
            }
            grade7 = GE8261 * credit7;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe2, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCS8261ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxCS8261.getSelectedItem());
            if("O".equalsIgnoreCase(num8)) {
                CS8261 = 10;
            }else if ("A+".equalsIgnoreCase(num8)) {
                CS8261 = 9;
            }else if ("A".equalsIgnoreCase(num8)) {
                CS8261 = 8;
            }else if ("B+".equalsIgnoreCase(num8)) {
                CS8261 = 7;
            }else if ("B".equalsIgnoreCase(num8)) {
                CS8261 = 6;
            }else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "You Have Arrears !");
            }else {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "Error ! Select Any Grade");
            }
            grade8 = CS8261 * credit8;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe2, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxIT8211ActionPerformed() {
        // TODO add your handling code here:
        try {
            num9 = ((String) jComboBoxIT8211.getSelectedItem());
            if("O".equalsIgnoreCase(num9)) {
                IT8211 = 10;
            }else if ("A+".equalsIgnoreCase(num9)) {
                IT8211 = 9;
            }else if ("A".equalsIgnoreCase(num9)) {
                IT8211 = 8;
            }else if ("B+".equalsIgnoreCase(num9)) {
                IT8211 = 7;
            }else if ("B".equalsIgnoreCase(num9)) {
                IT8211 = 6;
            }else if ("U".equalsIgnoreCase(num9)) {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "You Have Arrears !");
            }else {
                javax.swing.JOptionPane.showMessageDialog(jframe2, "Error ! Select Any Grade");
            }
            grade9 = IT8211 * credit9;
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe2, e.getMessage());
        }
        System.gc();
    }

    private void jButtonSem2GPAActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try {
            gpa2 = (grade1 + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8 + grade9);
            float result = gpa2 / totalcredits;
            javax.swing.JOptionPane.showMessageDialog(jframe2, "Your GPA Is :-  " + result);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(jframe2, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxBE8255;
    private static javax.swing.JComboBox<String> jComboBoxCS8251;
    private static javax.swing.JComboBox<String> jComboBoxCS8261;
    private static javax.swing.JComboBox<String> jComboBoxGE8261;
    private static javax.swing.JComboBox<String> jComboBoxHS8251;
    private static javax.swing.JComboBox<String> jComboBoxIT8201;
    private static javax.swing.JComboBox<String> jComboBoxIT8211;
    private static javax.swing.JComboBox<String> jComboBoxMA8251;
    private static javax.swing.JComboBox<String> jComboBoxPH8252;
    // End of variables declaration
}
