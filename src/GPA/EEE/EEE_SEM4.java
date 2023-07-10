package GPA.EEE;

/**
 * @author Praveenkumar
 * @co-author Purushothaman
 */
public class EEE_SEM4 extends javax.swing.JFrame {

    static float MA8491 = 0, EE8401 = 0, EE8402 = 0, EE8403 = 0, EE8451 = 0, IC8451 = 0, EE8411 = 0, EE8461 = 0, EE8412 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0, grade9 = 0;
    static float totalcredits = 25, credit1 = 4 , credit2 = 3 , credit3 = 3 , credit4 = 3 , credit5 = 3 , credit6 = 4 , credit7 = 2 , credit8 = 2, credit9 = 1;
    static String num1, num2, num3, num4, num5, num6, num7, num8, num9 ;
    static float gpa4 = 0;
    static javax.swing.JFrame jframe4 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.EEE.EEE_SEM4
     */
    public EEE_SEM4() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPACalc = new javax.swing.JLabel();
        javax.swing.JLabel jLabelMA8491 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEE8401 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEE8402 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelEE8403 = new javax.swing.JLabel();
        jComboBoxMA8491 = new javax.swing.JComboBox<>();
        jComboBoxEE8401 = new javax.swing.JComboBox<>();
        jComboBoxEE8402 = new javax.swing.JComboBox<>();
        jComboBoxEE8403 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelEE8451 = new javax.swing.JLabel();
        jComboBoxEE8451 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelIC8451 = new javax.swing.JLabel();
        jComboBoxIC8451 = new javax.swing.JComboBox<>();
        javax.swing.JButton jButtonCalcGPA = new javax.swing.JButton();
        javax.swing.JLabel jLabelEE8411 = new javax.swing.JLabel();
        jComboBoxEE8411 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelEE8461 = new javax.swing.JLabel();
        jComboBoxEE8461 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelEE8412 = new javax.swing.JLabel();
        jComboBoxEE8412 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPACalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPACalc.setText("GPA CALCULATOR");

        jLabelMA8491.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMA8491.setText("MA8491");

        jLabelEE8401.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEE8401.setText("EE8401");

        jLabelEE8402.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEE8402.setText("EE8402");

        jLabelEE8403.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEE8403.setText("EE8403");

        jComboBoxMA8491.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMA8491.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMA8491.addActionListener(evt -> jComboBoxMA8491ActionPerformed());

        jComboBoxEE8401.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEE8401.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEE8401.addActionListener(evt -> jComboBoxEE8401ActionPerformed());

        jComboBoxEE8402.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEE8402.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEE8402.addActionListener(evt -> jComboBoxEE8402ActionPerformed());

        jComboBoxEE8403.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEE8403.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEE8403.addActionListener(evt -> jComboBoxEE8403ActionPerformed());

        jLabelEE8451.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEE8451.setText("EE8451");

        jComboBoxEE8451.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEE8451.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEE8451.addActionListener(evt -> jComboBoxEE8451ActionPerformed());

        jLabelIC8451.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelIC8451.setText("Prof Ele 1");

        jComboBoxIC8451.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxIC8451.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxIC8451.addActionListener(evt -> jComboBoxIC8451ActionPerformed());

        jButtonCalcGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalcGPA.setText("CALCULATE ");
        jButtonCalcGPA.addActionListener(evt -> jButtonCalcGPAActionPerformed());

        jLabelEE8411.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEE8411.setText("EE8411");

        jComboBoxEE8411.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEE8411.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEE8411.addActionListener(evt -> jComboBoxEE8411ActionPerformed());

        jLabelEE8461.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEE8461.setText("EE8461");

        jComboBoxEE8461.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEE8461.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEE8461.addActionListener(evt -> jComboBoxEE8461ActionPerformed());

        jLabelEE8412.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEE8412.setText("EE8412");

        jComboBoxEE8412.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEE8412.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEE8412.addActionListener(evt -> jComboBoxEE8412ActionPerformed());

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
                                                                .addComponent(jLabelEE8412, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(35, 35, 35))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelMA8491, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelEE8401, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelEE8402, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelEE8403, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxEE8401, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxMA8491, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxEE8402, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxEE8403, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(58, 58, 58)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxEE8412, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelEE8451, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelIC8451, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelEE8411, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelEE8461, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxEE8451, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxIC8451, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxEE8411, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxEE8461, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                                        .addComponent(jLabelMA8491, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxMA8491, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelEE8401, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxEE8401, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelEE8402, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxEE8402, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelEE8403, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxEE8403, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(62, 62, 62)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelIC8451, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxIC8451, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(29, 29, 29)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelEE8411, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxEE8411, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabelEE8451, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBoxEE8451, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelEE8461, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxEE8461, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelEE8412, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxEE8412, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addComponent(jButtonCalcGPA)
                                .addGap(52, 52, 52))
        );
        setBounds(0, 0, 755, 621);
    }

    private void jComboBoxMA8491ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxMA8491.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                MA8491 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                MA8491 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                MA8491 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                MA8491 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                MA8491 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade1 = MA8491 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEE8401ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxEE8401.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                EE8401 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                EE8401 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                EE8401 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                EE8401 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                EE8401 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade2 = EE8401 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEE8402ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxEE8402.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                EE8402 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                EE8402 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                EE8402 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                EE8402 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                EE8402 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade3 = EE8402 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEE8403ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxEE8403.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                EE8403 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                EE8403 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                EE8403 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                EE8403 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                EE8403 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade4 = EE8403 * credit4;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEE8451ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxEE8451.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                EE8451 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                EE8451 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                EE8451 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                EE8451 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                EE8451 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade5 = EE8451 * credit5;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxIC8451ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxIC8451.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                IC8451 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                IC8451 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                IC8451 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                IC8451 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                IC8451 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade6 = IC8451 * credit6;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEE8411ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxEE8411.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                EE8411 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                EE8411 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                EE8411 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                EE8411 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                EE8411 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade7 = EE8411 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEE8461ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxEE8461.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                EE8461 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                EE8461 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                EE8461 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                EE8461 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                EE8461 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade8 = EE8461 * credit8;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe4, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEE8412ActionPerformed() {
        // TODO add your handling code here:
        try {
            num9 = ((String) jComboBoxEE8412.getSelectedItem());
            if ("O".equalsIgnoreCase(num9)) {
                EE8412 = 10;
            } else if ("A+".equalsIgnoreCase(num9)) {
                EE8412 = 9;
            } else if ("A".equalsIgnoreCase(num9)) {
                EE8412 = 8;
            } else if ("B+".equalsIgnoreCase(num9)) {
                EE8412 = 7;
            } else if ("B".equalsIgnoreCase(num9)) {
                EE8412 = 6;
            } else if ("U".equalsIgnoreCase(num9)) {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe4, "Error ! Select Any Grade");
            }
            grade9 = EE8412 * credit9;
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
    private static javax.swing.JComboBox<String> jComboBoxEE8403;
    private static javax.swing.JComboBox<String> jComboBoxEE8461;
    private static javax.swing.JComboBox<String> jComboBoxEE8411;
    private static javax.swing.JComboBox<String> jComboBoxEE8401;
    private static javax.swing.JComboBox<String> jComboBoxEE8402;
    private static javax.swing.JComboBox<String> jComboBoxEE8451;
    private static javax.swing.JComboBox<String> jComboBoxIC8451;
    private static javax.swing.JComboBox<String> jComboBoxEE8412;
    private static javax.swing.JComboBox<String> jComboBoxMA8491;
    //End of the variables declaration
}