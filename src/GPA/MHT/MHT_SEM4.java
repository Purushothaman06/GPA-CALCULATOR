package GPA.MHT;

/**
 *
 * @author Purushothaman
 */
public class MHT_SEM4 extends javax.swing.JFrame {

    static float MA8452 = 0, ME8392 = 0, MT8491 = 0, ME8492 = 0, MT8401 = 0, MT8411 = 0, ME8461 = 0, ME8381 = 0, HS8461 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0, grade9 = 0;
    static float totalcredits = 23, credit1 = 4 , credit2 = 3 , credit3 = 3 , credit4 = 3 , credit5 = 3 , credit6 = 2 , credit7 = 2 , credit8 = 2, credit9 = 1;
    static String num1, num2, num3, num4, num5, num6, num7, num8, num9 ;
    static float gpa4 = 0;
    static javax.swing.JFrame jframe4 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.MHT.MHT_SEM4
     */
    public MHT_SEM4() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPACalc = new javax.swing.JLabel();
        javax.swing.JLabel jLabelMA8452 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelME8392 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelMT8491 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelME8492 = new javax.swing.JLabel();
        jComboBoxMA8452 = new javax.swing.JComboBox<>();
        jComboBoxME8392 = new javax.swing.JComboBox<>();
        jComboBoxMT8491 = new javax.swing.JComboBox<>();
        jComboBoxME8492 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelMT8401 = new javax.swing.JLabel();
        jComboBoxMT8401 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelMT8411 = new javax.swing.JLabel();
        jComboBoxMT8411 = new javax.swing.JComboBox<>();
        javax.swing.JButton jButtonCalcGPA = new javax.swing.JButton();
        javax.swing.JLabel jLabelME8461 = new javax.swing.JLabel();
        jComboBoxME8461 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelME8381 = new javax.swing.JLabel();
        jComboBoxME8381 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelHS8461 = new javax.swing.JLabel();
        jComboBoxHS8461 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPACalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPACalc.setText("GPA CALCULATOR");

        jLabelMA8452.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMA8452.setText("MA8452");

        jLabelME8392.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8392.setText("ME8392");

        jLabelMT8491.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMT8491.setText("MT8491");

        jLabelME8492.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8492.setText("ME8492");

        jComboBoxMA8452.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMA8452.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMA8452.addActionListener(evt -> jComboBoxMA8452ActionPerformed());

        jComboBoxME8392.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8392.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8392.addActionListener(evt -> jComboBoxME8392ActionPerformed());

        jComboBoxMT8491.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMT8491.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMT8491.addActionListener(evt -> jComboBoxMT8491ActionPerformed());

        jComboBoxME8492.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8492.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8492.addActionListener(evt -> jComboBoxME8492ActionPerformed());

        jLabelMT8401.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMT8401.setText("MT8401");

        jComboBoxMT8401.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMT8401.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMT8401.addActionListener(evt -> jComboBoxMT8401ActionPerformed());

        jLabelMT8411.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMT8411.setText("MT8411");

        jComboBoxMT8411.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMT8411.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMT8411.addActionListener(evt -> jComboBoxMT8411ActionPerformed());

        jButtonCalcGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalcGPA.setText("CALCULATE ");
        jButtonCalcGPA.addActionListener(evt -> jButtonCalcGPAActionPerformed());

        jLabelME8461.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8461.setText("ME8461");

        jComboBoxME8461.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD |java.awt.Font.ITALIC, 18));
        jComboBoxME8461.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8461.addActionListener(evt -> jComboBoxME8461ActionPerformed());

        jLabelME8381.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8381.setText("ME8381");

        jComboBoxME8381.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8381.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8381.addActionListener(evt -> jComboBoxME8381ActionPerformed());

        jLabelHS8461.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelHS8461.setText("HS8461");

        jComboBoxHS8461.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxHS8461.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxHS8461.addActionListener(evt -> jComboBoxHS8461ActionPerformed());

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
                                                                .addComponent(jLabelHS8461, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(35, 35, 35))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelMA8452, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelME8392, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelMT8491, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelME8492, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxME8392, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxMA8452, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxMT8491, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxME8492, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(58, 58, 58)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxHS8461, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelMT8401, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelMT8411, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelME8461, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelME8381, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxMT8401, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxMT8411, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxME8461, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxME8381, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                                        .addComponent(jLabelMA8452, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxMA8452, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelME8392, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxME8392, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelMT8491, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxMT8491, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelME8492, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxME8492, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(62, 62, 62)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelMT8411, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxMT8411, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(29, 29, 29)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelME8461, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxME8461, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabelMT8401, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBoxMT8401, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelME8381, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxME8381, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelHS8461, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxHS8461, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addComponent(jButtonCalcGPA)
                                .addGap(52, 52, 52))
        );
        setBounds(0, 0, 755, 621);
    }

    private void jComboBoxMA8452ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxMA8452.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                MA8452 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                MA8452 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                MA8452 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                MA8452 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                MA8452 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade1 = MA8452 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxME8392ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxME8392.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                ME8392 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                ME8392 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                ME8392 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                ME8392 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                ME8392 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade2 = ME8392 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxMT8491ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxMT8491.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                MT8491 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                MT8491 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                MT8491 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                MT8491 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                MT8491 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade3 = MT8491 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxME8492ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxME8492.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                ME8492 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                ME8492 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                ME8492 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                ME8492 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                ME8492 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade4 = ME8492 * credit4;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxMT8401ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxMT8401.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                MT8401 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                MT8401 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                MT8401 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                MT8401 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                MT8401 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade5 = MT8401 * credit5;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxMT8411ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxMT8411.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                MT8411 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                MT8411 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                MT8411 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                MT8411 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                MT8411 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade6 = MT8411 * credit6;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxME8461ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxME8461.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                ME8461 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                ME8461 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                ME8461 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                ME8461 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                ME8461 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade7 = ME8461 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxME8381ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxME8381.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                ME8381 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                ME8381 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                ME8381 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                ME8381 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                ME8381 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade8 = ME8381 * credit8;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxHS8461ActionPerformed() {
        // TODO add your handling code here:
        try {
            num9 = ((String) jComboBoxHS8461.getSelectedItem());
            if ("O".equalsIgnoreCase(num9)) {
                HS8461 = 10;
            } else if ("A+".equalsIgnoreCase(num9)) {
                HS8461 = 9;
            } else if ("A".equalsIgnoreCase(num9)) {
                HS8461 = 8;
            } else if ("B+".equalsIgnoreCase(num9)) {
                HS8461 = 7;
            } else if ("B".equalsIgnoreCase(num9)) {
                HS8461 = 6;
            } else if ("U".equalsIgnoreCase(num9)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade9 = HS8461 * credit9;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jButtonCalcGPAActionPerformed() {
        // TODO add your handling code here:
        try {
            gpa4 = (grade1 + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8 + grade9);
            float result = gpa4 / totalcredits;
            javax.swing.JOptionPane.showMessageDialog(jframe4, "Your GPA Is :-  " + result);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxME8492;
    private static javax.swing.JComboBox<String> jComboBoxME8381;
    private static javax.swing.JComboBox<String> jComboBoxME8461;
    private static javax.swing.JComboBox<String> jComboBoxME8392;
    private static javax.swing.JComboBox<String> jComboBoxMT8491;
    private static javax.swing.JComboBox<String> jComboBoxMT8401;
    private static javax.swing.JComboBox<String> jComboBoxMT8411;
    private static javax.swing.JComboBox<String> jComboBoxHS8461;
    private static javax.swing.JComboBox<String> jComboBoxMA8452;
    // End of variables declaration
}
