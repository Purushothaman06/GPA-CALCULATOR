package GPA.MHT;

/**
 * @author Praveenkumar
 * @co-author Purushothaman
 */
public class MHT_SEM6 extends javax.swing.JFrame {

    static float ME8591 = 0, MT8601 = 0, ME8593 = 0, MT8602 = 0, MG8591 = 0, ProfEle1 = 0, MT8611= 0, MT8612 = 0, ME8682 = 0;
    static float grade1 = 0, grade2 = 0, grade3 = 0, grade4 = 0, grade5 = 0, grade6 = 0, grade7 = 0, grade8 = 0, grade9 = 0;
    static float totalcredits = 24, credit1 = 3 , credit2 = 3 , credit3 = 3 , credit4 = 3 , credit5 = 3 , credit6 = 3 , credit7 = 2 , credit8 = 2, credit9 = 2;
    static String num1, num2, num3, num4, num5, num6, num7, num8, num9 ;
    static float gpa6 = 0;
    static javax.swing.JFrame jframe6 = new javax.swing.JFrame();

    /**
     * Creates new form GPA.MHT.MHT_SEM6
     */
    public MHT_SEM6() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelGPACalc = new javax.swing.JLabel();
        javax.swing.JLabel jLabelME8591 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelMT8601 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelME8593 = new javax.swing.JLabel();
        javax.swing.JLabel jLabelMT8602 = new javax.swing.JLabel();
        jComboBoxME8591 = new javax.swing.JComboBox<>();
        jComboBoxMT8601 = new javax.swing.JComboBox<>();
        jComboBoxME8593 = new javax.swing.JComboBox<>();
        jComboBoxMT8602 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelMG8591 = new javax.swing.JLabel();
        jComboBoxMG8591 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelProfEle1 = new javax.swing.JLabel();
        jComboBoxProfEle1 = new javax.swing.JComboBox<>();
        javax.swing.JButton jButtonCalcGPA = new javax.swing.JButton();
        javax.swing.JLabel jLabelMT8611 = new javax.swing.JLabel();
        jComboBoxMT8611 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelMT8612 = new javax.swing.JLabel();
        jComboBoxMT8612 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabelME8682 = new javax.swing.JLabel();
        jComboBoxME8682 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabelGPACalc.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 26));
        jLabelGPACalc.setText("GPA CALCULATOR");

        jLabelME8591.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8591.setText("ME8591");

        jLabelMT8601.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMT8601.setText("MT8601");

        jLabelME8593.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8593.setText("ME8593");

        jLabelMT8602.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMT8602.setText("MT8602");

        jComboBoxME8591.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8591.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8591.addActionListener(evt -> jComboBoxME8591ActionPerformed());

        jComboBoxMT8601.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMT8601.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMT8601.addActionListener(evt -> jComboBoxMT8601ActionPerformed());

        jComboBoxME8593.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8593.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8593.addActionListener(evt -> jComboBoxME8593ActionPerformed());

        jComboBoxMT8602.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMT8602.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMT8602.addActionListener(evt -> jComboBoxMT8602ActionPerformed());

        jLabelMG8591.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMG8591.setText("MG8591");

        jComboBoxMG8591.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMG8591.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMG8591.addActionListener(evt -> jComboBoxMG8591ActionPerformed());

        jLabelProfEle1.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelProfEle1.setText("ProfEle1");

        jComboBoxProfEle1.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxProfEle1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxProfEle1.addActionListener(evt -> jComboBoxProfEle1ActionPerformed());

        jButtonCalcGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 22));
        jButtonCalcGPA.setText("CALCULATE ");
        jButtonCalcGPA.addActionListener(evt -> jButtonCalcGPAActionPerformed());

        jLabelMT8611.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMT8611.setText("MT8611");

        jComboBoxMT8611.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMT8611.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMT8611.addActionListener(evt -> jComboBoxMT8611ActionPerformed());

        jLabelMT8612.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelMT8612.setText("MT8612");

        jComboBoxMT8612.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxMT8612.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxMT8612.addActionListener(evt -> jComboBoxMT8612ActionPerformed());

        jLabelME8682.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jLabelME8682.setText("ME8682");

        jComboBoxME8682.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 18));
        jComboBoxME8682.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "O", "A+", "A", "B+", "B", "U" }));
        jComboBoxME8682.addActionListener(evt -> jComboBoxME8682ActionPerformed());

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
                                                                .addComponent(jLabelME8682, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(35, 35, 35))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelME8591, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelMT8601, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelME8593, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelMT8602, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxMT8601, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxME8591, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxME8593, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxMT8602, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(58, 58, 58)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxME8682, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelMG8591, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelProfEle1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelMT8611, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelMT8612, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(36, 36, 36)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBoxMG8591, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxProfEle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxMT8611, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxMT8612, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                                        .addComponent(jLabelME8591, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxME8591, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelMT8601, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxMT8601, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelME8593, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxME8593, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelMT8602, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxMT8602, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(62, 62, 62)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelProfEle1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxProfEle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(29, 29, 29)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabelMT8611, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxMT8611, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabelMG8591, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBoxMG8591, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelMT8612, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxMT8612, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelME8682, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxME8682, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addComponent(jButtonCalcGPA)
                                .addGap(52, 52, 52))
        );
        setBounds(0, 0, 755, 621);
    }

    private void jComboBoxME8591ActionPerformed() {
        // TODO add your handling code here:
        try {
            num1 = ((String) jComboBoxME8591.getSelectedItem());
            if ("O".equalsIgnoreCase(num1)) {
                ME8591 = 10;
            } else if ("A+".equalsIgnoreCase(num1)) {
                ME8591 = 9;
            } else if ("A".equalsIgnoreCase(num1)) {
                ME8591 = 8;
            } else if ("B+".equalsIgnoreCase(num1)) {
                ME8591 = 7;
            } else if ("B".equalsIgnoreCase(num1)) {
                ME8591 = 6;
            } else if ("U".equalsIgnoreCase(num1)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade1 = ME8591 * credit1;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxMT8601ActionPerformed() {
        // TODO add your handling code here:
        try {
            num2 = ((String) jComboBoxMT8601.getSelectedItem());
            if ("O".equalsIgnoreCase(num2)) {
                MT8601 = 10;
            } else if ("A+".equalsIgnoreCase(num2)) {
                MT8601 = 9;
            } else if ("A".equalsIgnoreCase(num2)) {
                MT8601 = 8;
            } else if ("B+".equalsIgnoreCase(num2)) {
                MT8601 = 7;
            } else if ("B".equalsIgnoreCase(num2)) {
                MT8601 = 6;
            } else if ("U".equalsIgnoreCase(num2)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade2 = MT8601 * credit2;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxME8593ActionPerformed() {
        // TODO add your handling code here:
        try {
            num3 = ((String) jComboBoxME8593.getSelectedItem());
            if ("O".equalsIgnoreCase(num3)) {
                ME8593 = 10;
            } else if ("A+".equalsIgnoreCase(num3)) {
                ME8593 = 9;
            } else if ("A".equalsIgnoreCase(num3)) {
                ME8593 = 8;
            } else if ("B+".equalsIgnoreCase(num3)) {
                ME8593 = 7;
            } else if ("B".equalsIgnoreCase(num3)) {
                ME8593 = 6;
            } else if ("U".equalsIgnoreCase(num3)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade3 = ME8593 * credit3;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxMT8602ActionPerformed() {
        // TODO add your handling code here:
        try {
            num4 = ((String) jComboBoxMT8602.getSelectedItem());
            if ("O".equalsIgnoreCase(num4)) {
                MT8602 = 10;
            } else if ("A+".equalsIgnoreCase(num4)) {
                MT8602 = 9;
            } else if ("A".equalsIgnoreCase(num4)) {
                MT8602 = 8;
            } else if ("B+".equalsIgnoreCase(num4)) {
                MT8602 = 7;
            } else if ("B".equalsIgnoreCase(num4)) {
                MT8602 = 6;
            } else if ("U".equalsIgnoreCase(num4)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade4 = MT8602 * credit4;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxMG8591ActionPerformed() {
        // TODO add your handling code here:
        try {
            num5 = ((String) jComboBoxMG8591.getSelectedItem());
            if ("O".equalsIgnoreCase(num5)) {
                MG8591 = 10;
            } else if ("A+".equalsIgnoreCase(num5)) {
                MG8591 = 9;
            } else if ("A".equalsIgnoreCase(num5)) {
                MG8591 = 8;
            } else if ("B+".equalsIgnoreCase(num5)) {
                MG8591 = 7;
            } else if ("B".equalsIgnoreCase(num5)) {
                MG8591 = 6;
            } else if ("U".equalsIgnoreCase(num5)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade5 = MG8591 * credit5;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxProfEle1ActionPerformed() {
        // TODO add your handling code here:
        try {
            num6 = ((String) jComboBoxProfEle1.getSelectedItem());
            if ("O".equalsIgnoreCase(num6)) {
                ProfEle1 = 10;
            } else if ("A+".equalsIgnoreCase(num6)) {
                ProfEle1 = 9;
            } else if ("A".equalsIgnoreCase(num6)) {
                ProfEle1 = 8;
            } else if ("B+".equalsIgnoreCase(num6)) {
                ProfEle1 = 7;
            } else if ("B".equalsIgnoreCase(num6)) {
                ProfEle1 = 6;
            } else if ("U".equalsIgnoreCase(num6)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade6 = ProfEle1 * credit6;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxMT8611ActionPerformed() {
        // TODO add your handling code here:
        try {
            num7 = ((String) jComboBoxMT8611.getSelectedItem());
            if ("O".equalsIgnoreCase(num7)) {
                MT8611 = 10;
            } else if ("A+".equalsIgnoreCase(num7)) {
                MT8611 = 9;
            } else if ("A".equalsIgnoreCase(num7)) {
                MT8611 = 8;
            } else if ("B+".equalsIgnoreCase(num7)) {
                MT8611 = 7;
            } else if ("B".equalsIgnoreCase(num7)) {
                MT8611 = 6;
            } else if ("U".equalsIgnoreCase(num7)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade7 = MT8611 * credit7;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxMT8612ActionPerformed() {
        // TODO add your handling code here:
        try {
            num8 = ((String) jComboBoxMT8612.getSelectedItem());
            if ("O".equalsIgnoreCase(num8)) {
                MT8612 = 10;
            } else if ("A+".equalsIgnoreCase(num8)) {
                MT8612 = 9;
            } else if ("A".equalsIgnoreCase(num8)) {
                MT8612 = 8;
            } else if ("B+".equalsIgnoreCase(num8)) {
                MT8612 = 7;
            } else if ("B".equalsIgnoreCase(num8)) {
                MT8612 = 6;
            } else if ("U".equalsIgnoreCase(num8)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade8 = MT8612 * credit8;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jComboBoxME8682ActionPerformed() {
        // TODO add your handling code here:
        try {
            num9 = ((String) jComboBoxME8682.getSelectedItem());
            if ("O".equalsIgnoreCase(num9)) {
                ME8682 = 10;
            } else if ("A+".equalsIgnoreCase(num9)) {
                ME8682 = 9;
            } else if ("A".equalsIgnoreCase(num9)) {
                ME8682 = 8;
            } else if ("B+".equalsIgnoreCase(num9)) {
                ME8682 = 7;
            } else if ("B".equalsIgnoreCase(num9)) {
                ME8682 = 6;
            } else if ("U".equalsIgnoreCase(num9)) {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "You Have Arrears !");
            } else {
                javax.swing.JOptionPane.showMessageDialog(jframe6, "Error ! Select Any Grade");
            }
            grade9 = ME8682 * credit9;
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    private void jButtonCalcGPAActionPerformed() {
        // TODO add your handling code here:
        try {
            gpa6 = (grade1 + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8 + grade9);
            float result = gpa6 / totalcredits;
            javax.swing.JOptionPane.showMessageDialog(jframe6, "Your GPA Is :-  " + result);
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(jframe6, e.getMessage());
        }
        System.gc();
    }

    // Variables declaration
    private static javax.swing.JComboBox<String> jComboBoxMT8601;
    private static javax.swing.JComboBox<String> jComboBoxProfEle1;
    private static javax.swing.JComboBox<String> jComboBoxMT8612;
    private static javax.swing.JComboBox<String> jComboBoxMT8611;
    private static javax.swing.JComboBox<String> jComboBoxME8593;
    private static javax.swing.JComboBox<String> jComboBoxMT8602;
    private static javax.swing.JComboBox<String> jComboBoxMG8591;
    private static javax.swing.JComboBox<String> jComboBoxME8682;
    private static javax.swing.JComboBox<String> jComboBoxME8591;
    // End of variables declaration
}