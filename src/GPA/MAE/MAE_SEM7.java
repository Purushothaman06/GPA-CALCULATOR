package GPA.MAE;

/**
 *
 * @author Purushothaman
 */
public class MAE_SEM7 extends javax.swing.JFrame {

    static float AN8701 = 0, ME8094 = 0, ME8791 = 0, OpenEle2 = 0, ProfEle2 = 0, ProfEle3 = 0, ME8761 = 0, ME8781 = 0, AN8711 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0, grade9 = 0;
    static float totalcredits = 23, credit1 = 3 , credit2 = 3 , credit3 = 3 , credit4 = 3 , credit5 = 3 , credit6 = 3 , credit7 = 2 , credit8 = 2, credit9 = 1;
    static String num1, num2, num3, num4, num5, num6, num7, num8, num9 ;
    static float gpa7 = 0;
    static javax.swing.JFrame jframe7 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.MAE.MAE_SEM7
     */
    public MAE_SEM7() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPACalc = new javax.swing.JLabel();
        javax.swing.JLabel jLabelME8792 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelME8793 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelME8791 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelOpenEle2 = new javax.swing.JLabel();
        jComboBoxAN8701 = new javax.swing.JComboBox<>();
        jComboBoxME8094 = new javax.swing.JComboBox<>();
        jComboBoxME8791 = new javax.swing.JComboBox<>();
        jComboBoxOpenEle2 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelProfEle2 = new javax.swing.JLabel();
        jComboBoxProfEle2 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelProfEle3 = new javax.swing.JLabel();
        jComboBoxProfEle3 = new javax.swing.JComboBox<>();
        javax.swing.JButton jButtonCalcGPA = new javax.swing.JButton();
        javax.swing.JLabel jLabelME8711 = new javax.swing.JLabel();
        jComboBoxME8761 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelME8781 = new javax.swing.JLabel();
        jComboBoxME8781 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelME8712 = new javax.swing.JLabel();
        jComboBoxAN8711 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPACalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPACalc.setText("GPA CALCULATOR");

        jLabelME8792.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8792.setText("AN8701");

        jLabelME8793.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8793.setText("ME8094");

        jLabelME8791.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8791.setText("ME8791");

        jLabelOpenEle2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelOpenEle2.setText("Open.Ele.II");

        jComboBoxAN8701.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxAN8701.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxAN8701.addActionListener(evt -> jComboBoxAN8701ActionPerformed());

        jComboBoxME8094.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8094.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8094.addActionListener(evt -> jComboBoxME8094ActionPerformed());

        jComboBoxME8791.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8791.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8791.addActionListener(evt -> jComboBoxME8791ActionPerformed());

        jComboBoxOpenEle2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxOpenEle2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxOpenEle2.addActionListener(evt -> jComboBoxOpenEle2ActionPerformed());

        jLabelProfEle2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle2.setText("Prof.Ele.II");

        jComboBoxProfEle2.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfEle2.addActionListener(evt -> jComboBoxProfEle2ActionPerformed());

        jLabelProfEle3.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle3.setText("Prof.Ele.III");

        jComboBoxProfEle3.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfEle3.addActionListener(evt -> jComboBoxProfEle3ActionPerformed());

        jButtonCalcGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalcGPA.setText("CALCULATE ");
        jButtonCalcGPA.addActionListener(evt -> jButtonCalcGPAActionPerformed());

        jLabelME8711.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8711.setText("ME8761");

        jComboBoxME8761.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8761.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8761.addActionListener(evt -> jComboBoxME8761ActionPerformed());

        jLabelME8781.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8781.setText("ME8781");

        jComboBoxME8781.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8781.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8781.addActionListener(evt -> jComboBoxME8781ActionPerformed());

        jLabelME8712.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8712.setText("AN8711");

        jComboBoxAN8711.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxAN8711.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxAN8711.addActionListener(evt -> jComboBoxAN8711ActionPerformed());

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
                                                                .addComponent(jLabelME8712, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(35, 35, 35))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelME8792, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelME8793, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelME8791, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelOpenEle2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(58, 58, 58)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxME8094, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxAN8701, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxME8791, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxOpenEle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(58, 58, 58)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxAN8711, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelProfEle2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelME8711, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelME8781, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelProfEle3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(58, 58, 58)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxProfEle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxProfEle3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxME8761, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxME8781, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                                        .addComponent(jLabelME8792, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxAN8701, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelME8793, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxME8094, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelME8791, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxME8791, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelOpenEle2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxOpenEle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(62, 62, 62)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelProfEle3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxProfEle3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(29, 29, 29)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelME8711, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxME8761, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabelProfEle2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBoxProfEle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelME8781, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxME8781, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelME8712, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxAN8711, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addComponent(jButtonCalcGPA)
                                .addGap(52, 52, 52))
        );
        setBounds(0, 0, 755, 621);
    }

    private void jComboBoxAN8701ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxAN8701.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                AN8701 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                AN8701 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                AN8701 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                AN8701 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                AN8701 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade1 = AN8701 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxME8094ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxME8094.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                ME8094 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                ME8094 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                ME8094 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                ME8094 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                ME8094 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade2 = ME8094 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxME8791ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxME8791.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                ME8791 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                ME8791 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                ME8791 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                ME8791 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                ME8791 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade3 = ME8791 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxOpenEle2ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxOpenEle2.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                OpenEle2 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                OpenEle2 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                OpenEle2 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                OpenEle2 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                OpenEle2 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade4 = OpenEle2 * credit4;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxProfEle2ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxProfEle2.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                ProfEle2 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                ProfEle2 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                ProfEle2 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                ProfEle2 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                ProfEle2 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade5 = ProfEle2 * credit5;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxProfEle3ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxProfEle3.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                ProfEle3 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                ProfEle3 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                ProfEle3 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                ProfEle3 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                ProfEle3 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade6 = ProfEle3 * credit6;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxME8761ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxME8761.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                ME8761 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                ME8761 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                ME8761 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                ME8761 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                ME8761 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade7 = ME8761 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxME8781ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxME8781.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                ME8781 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                ME8781 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                ME8781 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                ME8781 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                ME8781 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade8 = ME8781 * credit8;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxAN8711ActionPerformed() {
        // TODO add your handling code here:
        try {
            num9 = ((String) jComboBoxAN8711.getSelectedItem());
            if ("O".equalsIgnoreCase(num9)) {
                AN8711 = 10;
            } else if ("A+".equalsIgnoreCase(num9)) {
                AN8711 = 9;
            } else if ("A".equalsIgnoreCase(num9)) {
                AN8711 = 8;
            } else if ("B+".equalsIgnoreCase(num9)) {
                AN8711 = 7;
            } else if ("B".equalsIgnoreCase(num9)) {
                AN8711 = 6;
            } else if ("U".equalsIgnoreCase(num9)) {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe7, "Error ! Select Any Grade");
            }
            grade9 = AN8711 * credit9;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    private void jButtonCalcGPAActionPerformed() {
        // TODO add your handling code here:
        try {
            gpa7 = (grade1 + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8 + grade9);
            float result = gpa7 / totalcredits;
            javax.swing.JOptionPane.showMessageDialog(jframe7, "Your GPA Is :-  " + result);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe7, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxOpenEle2;
    private static javax.swing.JComboBox<String> jComboBoxAN8711;
    private static javax.swing.JComboBox<String> jComboBoxME8781;
    private static javax.swing.JComboBox<String> jComboBoxME8094;
    private static javax.swing.JComboBox<String> jComboBoxProfEle2;
    private static javax.swing.JComboBox<String> jComboBoxME8761;
    private static javax.swing.JComboBox<String> jComboBoxME8791;
    private static javax.swing.JComboBox<String> jComboBoxAN8701;
    private static javax.swing.JComboBox<String> jComboBoxProfEle3;
    // End of variables declaration
}
