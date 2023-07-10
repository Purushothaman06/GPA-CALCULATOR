package GPA.CME;

/**
 *
 * @author Tanish
 * @co-author Purushothaman
 */
public class CME_SEM3 extends javax.swing.JFrame {

    static float MA8391 = 0, CH8351 = 0, CY8291 = 0, CH8301 = 0, EE8352 = 0, CH8302 = 0, EE8361 = 0, ME8362 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0;
    static float totalcredits = 24, credit1 = 4 , credit2 = 4 , credit3 = 3 , credit4 = 3 , credit5 = 3 , credit6 = 3 , credit7 = 2 , credit8 = 2;
    static String num1, num2, num3, num4, num5, num6, num7, num8 ;
    static float gpa3 = 0;
    static javax.swing.JFrame jframe3 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.CME.CME_SEM3
     */
    public CME_SEM3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPACalc = new javax.swing.JLabel();
        javax.swing.JLabel jLabelMA8391 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCH8351 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCY8291 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCH8301 = new javax.swing.JLabel();
        jComboBoxMA8391 = new javax.swing.JComboBox<>();
        jComboBoxCH8351 = new javax.swing.JComboBox<>();
        jComboBoxCY8291 = new javax.swing.JComboBox<>();
        jComboBoxCH8301 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelEE8352 = new javax.swing.JLabel();
        jComboBoxEE8352 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelEE8361 = new javax.swing.JLabel();
        jComboBoxEE8361 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JButton jButtonCalcGPA = new javax.swing.JButton();
        javax.swing.JLabel jLabelCH8302 = new javax.swing.JLabel();
        jComboBoxCH8302 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelME8362 = new javax.swing.JLabel();
        jComboBoxME8362 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPACalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPACalc.setText("GPA CALCULATOR");

        jLabelMA8391.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMA8391.setText("MA8391");

        jLabelCH8351.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCH8351.setText("CH8351");

        jLabelCY8291.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCY8291.setText("CY8291");

        jLabelCH8301.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCH8301.setText("CH8301");

        jComboBoxMA8391.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMA8391.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMA8391.addActionListener(evt -> jComboBoxMA8391ActionPerformed());

        jComboBoxCH8351.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCH8351.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCH8351.addActionListener(evt -> jComboBoxCH8351ActionPerformed());

        jComboBoxCY8291.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCY8291.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCY8291.addActionListener(evt -> jComboBoxCY8291ActionPerformed());

        jComboBoxCH8301.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCH8301.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCH8301.addActionListener(evt -> jComboBoxCH8301ActionPerformed());

        jLabelEE8352.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEE8352.setText("EE8352");

        jComboBoxEE8352.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEE8352.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEE8352.addActionListener(evt -> jComboBoxEE8352ActionPerformed());

        jLabelEE8361.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelEE8361.setText("EE8361");

        jComboBoxEE8361.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxEE8361.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxEE8361.addActionListener(evt -> jComboBoxEE8361ActionPerformed());

        jButtonCalcGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalcGPA.setText("CALCULATE ");
        jButtonCalcGPA.addActionListener(evt -> jButtonCalcGPAActionPerformed());

        jLabelCH8302.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCH8302.setText("CH8302");

        jComboBoxCH8302.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCH8302.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCH8302.addActionListener(evt -> jComboBoxCH8302ActionPerformed());

        jLabelME8362.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8362.setText("ME8362");

        jComboBoxME8362.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8362.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8362.addActionListener(evt -> jComboBoxME8362ActionPerformed());

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
                                                .addComponent(jLabelCH8351))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabelEE8361))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelCY8291, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabelEE8352, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBoxEE8361, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxME8362, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabelCH8301)
                                                                        .addComponent(jLabelMA8391))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxMA8391, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxCH8301, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxCY8291, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxEE8352, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxCH8351, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(74, 74, 74)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelME8362)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelCH8302)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                                                .addComponent(jComboBoxCH8302, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(105, 105, 105))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButtonCalcGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(276, 276, 276))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabelGPACalc, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(255, 255, 255))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabelGPACalc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jComboBoxMA8391, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelMA8391))
                                                                .addGap(97, 97, 97))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jComboBoxCH8351, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelCH8351))
                                                                .addGap(32, 32, 32)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabelCH8301)
                                                                                .addComponent(jComboBoxCH8301, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBoxCY8291, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabelCY8291))
                                                                .addGap(35, 35, 35)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelCH8302)
                                                                        .addComponent(jComboBoxCH8302, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(133, 133, 133))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelEE8352)
                                                                        .addComponent(jComboBoxEE8352))
                                                                .addGap(43, 43, 43)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelEE8361)
                                                                        .addComponent(jComboBoxEE8361, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelME8362)
                                                                        .addComponent(jComboBoxME8362, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addComponent(jButtonCalcGPA)
                                                .addGap(94, 94, 94))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel1)
                                                .addGap(235, 235, 235))))
        );
        pack();
    }

    private void jComboBoxMA8391ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxMA8391.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                MA8391 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                MA8391 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                MA8391 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                MA8391 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                MA8391 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade1 = MA8391 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCH8351ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxCH8351.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                CH8351 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                CH8351 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                CH8351 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                CH8351 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                CH8351 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade2 = CH8351 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCY8291ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxCY8291.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                CY8291 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                CY8291 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                CY8291 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                CY8291 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                CY8291 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade3 = CY8291 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCH8301ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxCH8301.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                CH8301 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                CH8301 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                CH8301 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                CH8301 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                CH8301 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade4 = CH8301 * credit4;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEE8352ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxEE8352.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                EE8352 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                EE8352 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                EE8352 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                EE8352 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                EE8352 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade5 = EE8352 * credit5;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCH8302ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxCH8302.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                CH8302 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                CH8302 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                CH8302 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                CH8302 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                CH8302 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade6 = CH8302 * credit6;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxEE8361ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxEE8361.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                EE8361 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                EE8361 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                EE8361 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                EE8361 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                EE8361 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade7 = EE8361 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxME8362ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxME8362.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                ME8362 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                ME8362 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                ME8362 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                ME8362 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                ME8362 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade8 = ME8362 * credit8;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jButtonCalcGPAActionPerformed() {
        // TODO add your handling code here:
        try {
            gpa3 = (grade1 + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8);
            double result = gpa3 / totalcredits;
            javax.swing.JOptionPane.showMessageDialog(jframe3, "Your GPA Is :-  " + result);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxCH8351;
    private static javax.swing.JComboBox<String> jComboBoxEE8361;
    private static javax.swing.JComboBox<String> jComboBoxME8362;
    private static javax.swing.JComboBox<String> jComboBoxCH8302;
    private static javax.swing.JComboBox<String> jComboBoxCY8291;
    private static javax.swing.JComboBox<String> jComboBoxCH8301;
    private static javax.swing.JComboBox<String> jComboBoxEE8352;
    private static javax.swing.JComboBox<String> jComboBoxMA8391;
    // End of variables declaration
}