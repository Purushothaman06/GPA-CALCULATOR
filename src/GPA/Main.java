package GPA;

/**
 *
 * @author Purushothaman
 *
 */
public class Main extends javax.swing.JFrame {

    public static int Reg, Dept ;
    javax.swing.JFrame Main = new javax.swing.JFrame();

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    public void initComponents() {

        javax.swing.JLabel jLabelCGPAMain = new javax.swing.JLabel();
        jComboBoxSelectRegulation = new javax.swing.JComboBox<>();
        jComboBoxSelectDept = new javax.swing.JComboBox<>();
        jButtonCalcCGPA = new javax.swing.JButton();
        jButtonCalcGPA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("    CGPA  CALCULATOR");
        setResizable(false);
        setAutoRequestFocus(false);

        jLabelCGPAMain.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 36));
        jLabelCGPAMain.setText("CGPA CALCULATOR");

        jComboBoxSelectRegulation.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 24));
        jComboBoxSelectRegulation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Regulation-", "       R-2013    ", "       R-2017    " }));
        jComboBoxSelectRegulation.setFocusable(false);
        jComboBoxSelectRegulation.addActionListener(this::jComboBoxSelectRegulationActionPerformed);

        jComboBoxSelectDept.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD | java.awt.Font.ITALIC, 24));
        jComboBoxSelectDept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Department-", "     B.E - AERO ", "     B.E - BME  ", "     B.E - CME  ", "     B.E - CSE   ", "     B.E - CVL   ", "     B.E - ECE   ", "     B.E - EEE  ", "     B.E - MAE  ", "     B.E - MECH  ","     B.E - MHT   ", "     B.TECH - IT " }));
        jComboBoxSelectDept.addActionListener(this::jComboBoxSelectDeptActionPerformed);

        jButtonCalcCGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 24));
        jButtonCalcCGPA.setText("CALCULATE CGPA");
        jButtonCalcCGPA.addActionListener(this::jButtonCalcCGPAActionPerformed);

        jButtonCalcGPA.setFont(new java.awt.Font("Courier New", java.awt.Font.BOLD, 24)); //
        jButtonCalcGPA.setText("CALCULATE GPA");
        jButtonCalcGPA.addActionListener(this::jButtonCalcGPAActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(125, 125, 125)
                                                .addComponent(jLabelCGPAMain))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButtonCalcCGPA)
                                                                .addGap(30, 30, 30)
                                                                .addComponent(jButtonCalcGPA
                                                                ))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jComboBoxSelectDept, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBoxSelectRegulation, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabelCGPAMain)
                                .addGap(77, 77, 77)
                                .addComponent(jComboBoxSelectRegulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jComboBoxSelectDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonCalcCGPA)
                                        .addComponent(jButtonCalcGPA
                                        ))
                                .addContainerGap(104, Short.MAX_VALUE))
        );
        pack();
    }

    private void jComboBoxSelectRegulationActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        // Get the source from the jComboBoxSelectRegulation
        if(evt.getSource() == jComboBoxSelectRegulation){
            try {   //Store selected Index in Reg
                Reg = jComboBoxSelectRegulation.getSelectedIndex();
            }catch (Exception e) {
                // If any Exception Occurs , throw the Error Message
                javax.swing.JOptionPane.showMessageDialog(Main, e.getMessage());
            }
        }
        System.gc();
    }

    private void jComboBoxSelectDeptActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(evt.getSource() == jComboBoxSelectDept){
            try{
                int Department = jComboBoxSelectDept.getSelectedIndex();

                if (Department == 1){
                    Dept = Department;
                }else if(Department == 2){
                    Dept = Department;
                }else if(Department == 3){
                    Dept = Department;
                }else if(Department == 4){
                    Dept = Department;
                }else if(Department == 5){
                    Dept = Department;
                }else if(Department == 6){
                    Dept = Department;
                }else if(Department == 7){
                    Dept = Department;
                }else if(Department == 8){
                    Dept = Department;
                }else if(Department == 9){
                    Dept = Department;
                }else if(Department == 10){
                    Dept = Department;
                }else {
                    javax.swing.JOptionPane.showMessageDialog(Main, "Select Any Department");
                }
            } catch (Exception e){
                javax.swing.JOptionPane.showMessageDialog(Main, e.getMessage());
            }
        }
        System.gc();
    }

    private void jButtonCalcCGPAActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(evt.getSource() == jButtonCalcCGPA){
            try{
                if (Reg == 1 && Dept == 1){
                    javax.swing.JOptionPane.showMessageDialog(Main,"Will Be Updated Soon!");
                }else if(Reg == 1 && Dept == 2){
                    javax.swing.JOptionPane.showMessageDialog(Main,"Will Be Updated Soon!");
                }else if(Reg == 1 && Dept == 3){
                    javax.swing.JOptionPane.showMessageDialog(Main,"Will Be Updated Soon!");
                }else if(Reg == 1 && Dept == 4){
                    javax.swing.JOptionPane.showMessageDialog(Main,"Will Be Updated Soon!");
                }else if(Reg == 1 && Dept == 5){
                    javax.swing.JOptionPane.showMessageDialog(Main,"Will Be Updated Soon!");
                }else if(Reg == 1 && Dept == 6){
                    javax.swing.JOptionPane.showMessageDialog(Main,"Will Be Updated Soon!");
                }else if(Reg == 1 && Dept == 7){
                    javax.swing.JOptionPane.showMessageDialog(Main,"Will Be Updated Soon!");
                }else if(Reg == 1 && Dept == 8){
                    javax.swing.JOptionPane.showMessageDialog(Main,"Will Be Updated Soon!");
                }else if(Reg == 1 && Dept == 9){
                    javax.swing.JOptionPane.showMessageDialog(Main,"Will Be Updated Soon!");
                }else if(Reg == 1 && Dept == 10){
                    javax.swing.JOptionPane.showMessageDialog(Main,"Will Be Updated Soon!");
                }else if(Reg == 1 && Dept == 11){
                    javax.swing.JOptionPane.showMessageDialog(Main,"Will Be Updated Soon!");
                }else if ( Reg == 2 && Dept == 1){
                    CGPA cgpa = new CGPA();
                    cgpa.setVisible(true);
                    cgpa.setTitle("Anna University Regulation - 2017 (AERO) ");
                    cgpa.setZero();
                }else if( Reg == 2 && Dept == 2){
                    CGPA cgpa = new CGPA();
                    cgpa.setVisible(true);
                    cgpa.setTitle("Anna University Regulation - 2017 (BME) ");
                    cgpa.setZero();
                }else if( Reg == 2 && Dept == 3){
                    CGPA cgpa = new CGPA();
                    cgpa.setVisible(true);
                    cgpa.setTitle("Anna University Regulation - 2017 (CME) ");
                    cgpa.setZero();
                }else if( Reg == 2 && Dept == 4){
                    CGPA cgpa = new CGPA();
                    cgpa.setVisible(true);
                    cgpa.setTitle("Anna University Regulation - 2017 (CSE) ");
                    cgpa.setZero();
                }else if( Reg == 2 && Dept == 5){
                    CGPA cgpa = new CGPA();
                    cgpa.setVisible(true);
                    cgpa.setTitle("Anna University Regulation - 2017 (CVL) ");
                    cgpa.setZero();
                }else if( Reg == 2 && Dept == 6){
                    CGPA cgpa = new CGPA();
                    cgpa.setVisible(true);
                    cgpa.setTitle("Anna University Regulation - 2017 (ECE) ");
                    cgpa.setZero();
                }else if( Reg == 2 && Dept == 7){
                    CGPA cgpa = new CGPA();
                    cgpa.setVisible(true);
                    cgpa.setTitle("Anna University Regulation - 2017 (EEE) ");
                    cgpa.setZero();
                }else if( Reg == 2 && Dept == 8){
                    CGPA cgpa = new CGPA();
                    cgpa.setVisible(true);
                    cgpa.setTitle("Anna University Regulation - 2017 (MAE) ");
                    cgpa.setZero();
                }else if( Reg == 2 && Dept == 9){
                    CGPA cgpa = new CGPA();
                    cgpa.setVisible(true);
                    cgpa.setTitle("Anna University Regulation - 2017 (MECH) ");
                    cgpa.setZero();
                }else if( Reg == 2 && Dept == 10){
                    CGPA cgpa = new CGPA();
                    cgpa.setVisible(true);
                    cgpa.setTitle("Anna University Regulation - 2017 (MHT) ");
                    cgpa.setZero();
                }else if( Reg == 2 && Dept == 11){
                    CGPA cgpa = new CGPA();
                    cgpa.setVisible(true);
                    cgpa.setTitle("Anna University Regulation - 2017 (IT) ");
                    cgpa.setZero();
                }else {
                    javax.swing.JOptionPane.showMessageDialog(Main, "Select Your Department & Regulation ");
                }
            } catch (Exception e){
                javax.swing.JOptionPane.showMessageDialog(Main, e.getMessage());
            }
        }
        System.gc();
    }

    private void jButtonCalcGPAActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(evt.getSource() == jButtonCalcGPA){
            try{
                if (Reg == 1 && Dept == 1){
                    javax.swing.JOptionPane.showMessageDialog(Main,"Will Be Updated Soon!");
                }else if(Reg == 1 && Dept == 2){
                    javax.swing.JOptionPane.showMessageDialog(Main,"Will Be Updated Soon!");
                }else if(Reg == 1 && Dept == 3){
                    javax.swing.JOptionPane.showMessageDialog(Main,"Will Be Updated Soon!");
                }else if(Reg == 1 && Dept == 4){
                    javax.swing.JOptionPane.showMessageDialog(Main,"Will Be Updated Soon!");
                }else if(Reg == 1 && Dept == 5){
                    javax.swing.JOptionPane.showMessageDialog(Main,"Will Be Updated Soon!");
                }else if(Reg == 1 && Dept == 6){
                    javax.swing.JOptionPane.showMessageDialog(Main,"Will Be Updated Soon!");
                }else if(Reg == 1 && Dept == 7){
                    javax.swing.JOptionPane.showMessageDialog(Main,"Will Be Updated Soon!");
                }else if(Reg == 1 && Dept == 8){
                    javax.swing.JOptionPane.showMessageDialog(Main,"Will Be Updated Soon!");
                }else if(Reg == 1 && Dept == 9){
                    javax.swing.JOptionPane.showMessageDialog(Main,"Will Be Updated Soon!");
                }else if(Reg == 1 && Dept == 10){
                    javax.swing.JOptionPane.showMessageDialog(Main,"Will Be Updated Soon!");
                }else if(Reg == 1 && Dept == 11){
                    javax.swing.JOptionPane.showMessageDialog(Main,"Will Be Updated Soon!");
                }else if ( Reg == 2 && Dept == 1){
                    GPA gpa = new GPA();
                    gpa.setVisible(true);
                    gpa.setTitle("Anna University Regulation - 2017 (AERO) ");
                }else if( Reg == 2 && Dept == 2){
                    GPA gpa = new GPA();
                    gpa.setVisible(true);
                    gpa.setTitle("Anna University Regulation - 2017 (BME) ");
                }else if( Reg == 2 && Dept == 3){
                    GPA gpa = new GPA();
                    gpa.setVisible(true);
                    gpa.setTitle("Anna University Regulation - 2017 (CME) ");
                }else if( Reg == 2 && Dept == 4){
                    GPA gpa = new GPA();
                    gpa.setVisible(true);
                    gpa.setTitle("Anna University Regulation - 2017 (CSE) ");
                }else if( Reg == 2 && Dept == 5){
                    GPA gpa = new GPA();
                    gpa.setVisible(true);
                    gpa.setTitle("Anna University Regulation - 2017 (CVL) ");
                }else if( Reg == 2 && Dept == 6){
                    GPA gpa = new GPA();
                    gpa.setVisible(true);
                    gpa.setTitle("Anna University Regulation - 2017 (ECE) ");
                }else if( Reg == 2 && Dept == 7){
                    GPA gpa = new GPA();
                    gpa.setVisible(true);
                    gpa.setTitle("Anna University Regulation - 2017 (EEE) ");
                }else if( Reg == 2 && Dept == 8){
                    GPA gpa = new GPA();
                    gpa.setVisible(true);
                    gpa.setTitle("Anna University Regulation - 2017 (MAE) ");
                }else if( Reg == 2 && Dept == 9){
                    GPA gpa = new GPA();
                    gpa.setVisible(true);
                    gpa.setTitle("Anna University Regulation - 2017 (MECH) ");
                }else if( Reg == 2 && Dept == 10){
                    GPA gpa = new GPA();
                    gpa.setVisible(true);
                    gpa.setTitle("Anna University Regulation - 2017 (MHT) ");
                }else if( Reg == 2 && Dept == 11){
                    GPA gpa = new GPA();
                    gpa.setVisible(true);
                    gpa.setTitle("Anna University Regulation - 2017 (IT) ");
                }else {
                    javax.swing.JOptionPane.showMessageDialog(Main, "Select Your Department & Regulation ");
                }
            } catch (Exception e){
                javax.swing.JOptionPane.showMessageDialog(Main, e.getMessage());
            }
        }
        System.gc();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | javax.swing.UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Main().setVisible(true));
    }

    // Variables declaration
    private static javax.swing.JButton jButtonCalcGPA;
    private static javax.swing.JButton jButtonCalcCGPA;
    private static javax.swing.JComboBox<String> jComboBoxSelectDept;
    private static javax.swing.JComboBox<String> jComboBoxSelectRegulation;
    // End of variables declaration
}
