package GPA.AERO;

/**
 *
 * @author Tanish
 * @co-author Purushothaman
 */
public class AERO_SEM3 extends javax.swing.JFrame {

    static float MA8353 = 0, CE8394 = 0, ME8392 = 0, AE8301 = 0, CE8395 = 0, AE8302 = 0, CE8381= 0, AE8311 = 0, HS8381 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0, grade9 = 0;
    static float totalcredits = 25, credit1 = 4 , credit2 = 4 , credit3 = 3 , credit4 = 3 , credit5 = 3 , credit6 = 3 , credit7 = 2 , credit8 = 2, credit9 = 1;
    static String num1, num2, num3, num4, num5, num6, num7, num8, num9 ;
    static float gpa3 = 0;
    static javax.swing.JFrame jframe3 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.AERO.AERO_SEM3
     */
    public AERO_SEM3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPACalc = new javax.swing.JLabel();
        javax.swing.JLabel jLabelMA8353 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelCE8394 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelME8392 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelAE8301 = new javax.swing.JLabel();
        jComboBoxMA8353 = new javax.swing.JComboBox<>();
        jComboBoxCE8394 = new javax.swing.JComboBox<>();
        jComboBoxME8392 = new javax.swing.JComboBox<>();
        jComboBoxAE8301 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelCE8395 = new javax.swing.JLabel();
        jComboBoxCE8395 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelCE8381 = new javax.swing.JLabel();
        jComboBoxCE8381 = new javax.swing.JComboBox<>();
        javax.swing.JButton jButtonCalcGPA = new javax.swing.JButton();
        javax.swing.JLabel jLabelAE8302 = new javax.swing.JLabel();
        jComboBoxAE8302 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelAE8311 = new javax.swing.JLabel();
        jComboBoxAE8311 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelHS8381 = new javax.swing.JLabel();
        jComboBoxHS8381 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPACalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPACalc.setText("GPA CALCULATOR");

        jLabelMA8353.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMA8353.setText("MA8353");

        jLabelCE8394.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCE8394.setText("CE8394");

        jLabelME8392.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8392.setText("ME8392");

        jLabelAE8301.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelAE8301.setText("AE8301");

        jComboBoxMA8353.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMA8353.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMA8353.addActionListener(evt -> jComboBoxMA8353ActionPerformed());

        jComboBoxCE8394.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCE8394.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCE8394.addActionListener(evt -> jComboBoxCE8394ActionPerformed());

        jComboBoxME8392.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8392.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8392.addActionListener(evt -> jComboBoxME8392ActionPerformed());

        jComboBoxAE8301.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxAE8301.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxAE8301.addActionListener(evt -> jComboBoxAE8301ActionPerformed());

        jLabelCE8395.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCE8395.setText("CE8395");

        jComboBoxCE8395.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCE8395.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCE8395.addActionListener(evt -> jComboBoxCE8395ActionPerformed());

        jLabelCE8381.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelCE8381.setText("CE8381");

        jComboBoxCE8381.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxCE8381.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxCE8381.addActionListener(evt -> jComboBoxCE8381ActionPerformed());

        jButtonCalcGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalcGPA.setText("CALCULATE ");
        jButtonCalcGPA.addActionListener(evt -> jButtonCalcGPAActionPerformed());

        jLabelAE8302.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelAE8302.setText("AE8302");

        jComboBoxAE8302.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxAE8302.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxAE8302.addActionListener(evt -> jComboBoxAE8302ActionPerformed());

        jLabelAE8311.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelAE8311.setText("AE8311");

        jComboBoxAE8311.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxAE8311.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxAE8311.addActionListener(evt -> jComboBoxAE8311ActionPerformed());

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
                                                                        .addComponent(jLabelMA8353, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelCE8394, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelME8392, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelAE8301, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxCE8394, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxMA8353, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxME8392, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxAE8301, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(58, 58, 58)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxHS8381, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelCE8395, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelCE8381, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelAE8302, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelAE8311, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxCE8395, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxCE8381, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxAE8302, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxAE8311, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                                        .addComponent(jLabelMA8353, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxMA8353, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelCE8394, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxCE8394, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelME8392, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxME8392, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelAE8301, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxAE8301, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(62, 62, 62)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelCE8381, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxCE8381, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(29, 29, 29)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelAE8302, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxAE8302, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabelCE8395, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBoxCE8395, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelAE8311, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxAE8311, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    private void jComboBoxMA8353ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxMA8353.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                MA8353 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                MA8353 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                MA8353 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                MA8353 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                MA8353 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade1 = MA8353 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCE8394ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxCE8394.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                CE8394 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                CE8394 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                CE8394 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                CE8394 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                CE8394 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade2 = CE8394 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxME8392ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxME8392.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                ME8392 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                ME8392 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                ME8392 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                ME8392 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                ME8392 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade3 = ME8392 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAE8301ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxAE8301.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                AE8301 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                AE8301 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                AE8301 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                AE8301 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                AE8301 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade4 = AE8301 * credit4;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCE8395ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxCE8395.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                CE8395 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                CE8395 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                CE8395 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                CE8395 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                CE8395 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade5 = CE8395 * credit5;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAE8302ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxAE8302.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                AE8302 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                AE8302 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                AE8302 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                AE8302 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                AE8302 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade6 = AE8302 * credit6;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxCE8381ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxCE8381.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                CE8381 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                CE8381 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                CE8381 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                CE8381 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                CE8381 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade7 = CE8381 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe3, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAE8311ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxAE8311.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                AE8311 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                AE8311 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                AE8311 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                AE8311 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                AE8311 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe3, "Error ! Select Any Grade");
            }
            grade8 = AE8311 * credit8;
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
    private static javax.swing.JComboBox<String> jComboBoxCE8394;
    private static javax.swing.JComboBox<String> jComboBoxCE8381;
    private static javax.swing.JComboBox<String> jComboBoxAE8311;
    private static javax.swing.JComboBox<String> jComboBoxAE8302;
    private static javax.swing.JComboBox<String> jComboBoxME8392;
    private static javax.swing.JComboBox<String> jComboBoxAE8301;
    private static javax.swing.JComboBox<String> jComboBoxCE8395;
    private static javax.swing.JComboBox<String> jComboBoxHS8381;
    private static javax.swing.JComboBox<String> jComboBoxMA8353;
    // End of variables declaration
}