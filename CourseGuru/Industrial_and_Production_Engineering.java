import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;


public class Industrial_and_Production_Engineering extends JFrame {


    public Industrial_and_Production_Engineering() {
        initComponents();
    }

    public void getSum()
    {
        int sum = 0;
        for(int i = 0; i < New_Table.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(New_Table.getValueAt(i, 3).toString());
        }

        Credit_Sum_value.setText(Integer.toString(sum));
    }



    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel3 = new JLabel();
        jLabel13 = new JLabel();
        Profile = new JLabel();
        Logout = new JLabel();
        Home = new JLabel();
        Exit = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jPanel2 = new JPanel();
        jScrollPane2 = new JScrollPane();
        New_Table = new JTable();
        Add_Course = new JButton();
        Calculate_Fee = new JButton();
        Total_Tuition_Fee_Sum_value = new JLabel();
        Total_Credits_Counts = new JLabel();
        Per_Credit_Cost_Info = new JLabel();
        Total_Credits_Counts1 = new JLabel();
        Total_Credits_Info = new JLabel();
        Credit_Sum_value = new JLabel();
        AIUB_Industrial_and_Production_Engineering_Course_Label = new JLabel();
        AIUB_CSE_Course_Label1 = new JLabel();
        Remove_Course = new JButton();
        Total_Credits_Counts2 = new JLabel();
        Old_Total_Tuition_Fee_Sum_value = new JLabel();
        Per_Credit_Cost_Info1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        Industrial_Production_Engineering_Default_Table = new JTable();
        jLabel2 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new Color(25, 118, 211));
        jPanel1.setLayout(null);

        jLabel3.setFont(new Font("Arial", 1, 48));
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("CourseGuru");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, -10, 300, 100);

        jLabel13.setFont(new Font("Arial", 0, 18));
        jLabel13.setForeground(new Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel13.setText("Your course choosing partner");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 70, 420, 22);

        Profile.setFont(new Font("Arial", 0, 24));
        Profile.setForeground(new Color(255, 255, 255));
        Profile.setText("Profile");
        Profile.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Profile.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                ProfileMouseClicked(evt);
            }
        });
        jPanel1.add(Profile);
        Profile.setBounds(1420, 40, 68, 28);

        Logout.setFont(new Font("Arial", 0, 24));
        Logout.setForeground(new Color(255, 255, 255));
        Logout.setText("Logout");
        Logout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Logout.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent evt) {
                LogoutMouseMoved(evt);
            }
        });
        Logout.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        jPanel1.add(Logout);
        Logout.setBounds(1730, 40, 74, 30);

        Home.setFont(new Font("Arial", 0, 24));
        Home.setForeground(new Color(255, 255, 255));
        Home.setText("Home");
        Home.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Home.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        jPanel1.add(Home);
        Home.setBounds(1580, 40, 63, 30);

        Exit.setFont(new Font("Segoe UI", 0, 18));
        Exit.setForeground(new Color(255, 255, 255));
        Exit.setHorizontalAlignment(SwingConstants.CENTER);
        Exit.setText("X");
        Exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Exit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(1880, 0, 40, 29);

        jLabel4.setFont(new Font("Segoe UI", 0, 36));
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setText("I");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1680, 0, 40, 100);

        jLabel5.setFont(new Font("Segoe UI", 0, 36));
        jLabel5.setForeground(new Color(255, 255, 255));
        jLabel5.setText("I");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1530, 0, 40, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 100);

        jPanel2.setBackground(new Color(25, 118, 211));
        jPanel2.setLayout(null);

        New_Table.setFont(new Font("Arial", 0, 12));
        New_Table.setForeground(new Color(25, 118, 211));
        New_Table.setModel(new table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Semester", "Course Name", "Cradit", "Tuition Fee", "Pre-Requisite"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(New_Table);
        if (New_Table.getColumnModel().getColumnCount() > 0) {
            New_Table.getColumnModel().getColumn(0).setResizable(false);
            New_Table.getColumnModel().getColumn(0).setPreferredWidth(80);
            New_Table.getColumnModel().getColumn(1).setResizable(false);
            New_Table.getColumnModel().getColumn(1).setPreferredWidth(370);
            New_Table.getColumnModel().getColumn(2).setResizable(false);
            New_Table.getColumnModel().getColumn(3).setResizable(false);
            New_Table.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(930, 60, 690, 260);

        Add_Course.setFont(new Font("Arial", 0, 12));
        Add_Course.setForeground(new Color(25, 118, 211));
        Add_Course.setText("Add Course");
        Add_Course.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Add_CourseActionPerformed(evt);
            }
        });
        jPanel2.add(Add_Course);
        Add_Course.setBounds(780, 80, 130, 60);

        Calculate_Fee.setFont(new Font("Arial", 0, 12));
        Calculate_Fee.setForeground(new Color(25, 118, 211));
        Calculate_Fee.setText("Calculate Fee");
        Calculate_Fee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Calculate_FeeActionPerformed(evt);
            }
        });
        jPanel2.add(Calculate_Fee);
        Calculate_Fee.setBounds(780, 250, 130, 60);

        Total_Tuition_Fee_Sum_value.setFont(new Font("Arial", 1, 24));
        Total_Tuition_Fee_Sum_value.setForeground(new Color(255, 255, 255));
        Total_Tuition_Fee_Sum_value.setText("0");
        jPanel2.add(Total_Tuition_Fee_Sum_value);
        Total_Tuition_Fee_Sum_value.setBounds(1260, 410, 240, 30);

        Total_Credits_Counts.setFont(new Font("Arial", 1, 24));
        Total_Credits_Counts.setForeground(new Color(255, 255, 255));
        Total_Credits_Counts.setText("Total Tuition Fee Counts:");
        jPanel2.add(Total_Credits_Counts);
        Total_Credits_Counts.setBounds(950, 420, 292, 28);

        Per_Credit_Cost_Info.setFont(new Font("Arial", 1, 24));
        Per_Credit_Cost_Info.setForeground(new Color(255, 255, 255));
        Per_Credit_Cost_Info.setText("Per Credit Cost: 6000 (From 2023 - till)");
        jPanel2.add(Per_Credit_Cost_Info);
        Per_Credit_Cost_Info.setBounds(80, 420, 433, 28);

        Total_Credits_Counts1.setFont(new Font("Arial", 1, 24));
        Total_Credits_Counts1.setForeground(new Color(255, 255, 255));
        Total_Credits_Counts1.setText("Total Credits Counts:");
        jPanel2.add(Total_Credits_Counts1);
        Total_Credits_Counts1.setBounds(950, 370, 244, 28);

        Total_Credits_Info.setFont(new Font("Arial", 1, 24));
        Total_Credits_Info.setForeground(new Color(255, 255, 255));
        Total_Credits_Info.setText("Total Credits: 143");
        jPanel2.add(Total_Credits_Info);
        Total_Credits_Info.setBounds(80, 370, 200, 28);

        Credit_Sum_value.setFont(new Font("Arial", 1, 24));
        Credit_Sum_value.setForeground(new Color(255, 255, 255));
        Credit_Sum_value.setText("0");
        jPanel2.add(Credit_Sum_value);
        Credit_Sum_value.setBounds(1210, 370, 240, 30);

        AIUB_Industrial_and_Production_Engineering_Course_Label.setFont(new Font("Arial", 1, 24));
        AIUB_Industrial_and_Production_Engineering_Course_Label.setForeground(new Color(255, 255, 255));
        AIUB_Industrial_and_Production_Engineering_Course_Label.setText("AIUB Industrial and Production Engineering Course");
        jPanel2.add(AIUB_Industrial_and_Production_Engineering_Course_Label);
        AIUB_Industrial_and_Production_Engineering_Course_Label.setBounds(125, 20, 600, 28);

        AIUB_CSE_Course_Label1.setFont(new Font("Arial", 1, 24));
        AIUB_CSE_Course_Label1.setForeground(new Color(255, 255, 255));
        AIUB_CSE_Course_Label1.setText("Your Course Plan");
        jPanel2.add(AIUB_CSE_Course_Label1);
        AIUB_CSE_Course_Label1.setBounds(1210, 20, 201, 28);

        Remove_Course.setFont(new Font("Arial", 0, 12));
        Remove_Course.setForeground(new Color(25, 118, 211));
        Remove_Course.setText("Remove Course");
        Remove_Course.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Remove_CourseActionPerformed(evt);
            }
        });
        jPanel2.add(Remove_Course);
        Remove_Course.setBounds(780, 170, 130, 60);

        Total_Credits_Counts2.setFont(new Font("Arial", 1, 24));
        Total_Credits_Counts2.setForeground(new Color(255, 255, 255));
        Total_Credits_Counts2.setText("(Old)Total Tuition Fee Counts:");
        jPanel2.add(Total_Credits_Counts2);
        Total_Credits_Counts2.setBounds(890, 470, 360, 28);

        Old_Total_Tuition_Fee_Sum_value.setFont(new Font("Arial", 1, 24));
        Old_Total_Tuition_Fee_Sum_value.setForeground(new Color(255, 255, 255));
        Old_Total_Tuition_Fee_Sum_value.setText("0");
        jPanel2.add(Old_Total_Tuition_Fee_Sum_value);
        Old_Total_Tuition_Fee_Sum_value.setBounds(1260, 470, 240, 30);

        Per_Credit_Cost_Info1.setFont(new Font("Arial", 1, 24));
        Per_Credit_Cost_Info1.setForeground(new Color(255, 255, 255));
        Per_Credit_Cost_Info1.setText("Per Credit Cost: 5500 (Old Students)");
        jPanel2.add(Per_Credit_Cost_Info1);
        Per_Credit_Cost_Info1.setBounds(80, 470, 413, 28);

        Industrial_Production_Engineering_Default_Table.setForeground(new Color(25, 118, 211));
        Industrial_Production_Engineering_Default_Table.setModel(new DefaultTableModel(
            new Object [][] {
                {"2", "INTEGRAL CALCULUS & ORD. DIFF EQUATION", "      3",  18000, "MAT1102"},
                {"2", "ENGLISH WRITING SKILLS & COMMUNICATIONS", "      3",  18000, "ENG1101 "},
                {"2", "INTRODUCTION TO ELECTRICAL ENGINEERING", "      1",  , "PHY1101"},
                {"2", "INTRODUCTION TO ELECTRICAL ENGINEERING LAB", "      1",  , "PHY1101 "},
                {"2", "COMPUTER AIDED DESIGN IN MANUFACTURING AND PRODUCTION PROCESS 	", "      3",  18000, "INEN1101 "},
                {"2", "COMPUTER AIDED DESIGN IN MANUFACTURING AND PRODUCTION PROCESS LAB", "      1",  , "INEN1101 "},
                {"2", "ENGINEERING MECHANICS I", "      3",  18000, "INEN1104"},
                {"2", "ENGINEERING MECHANICS I LAB", "      1",  , "INEN1104"},
                {"2", "MACHINE JOB SHOP- II (SHEET METAL FORMING AND CASTING)", "      1",  , "INEN1104"},
                {"3", "COMPLEX VARIABLE,LAPLACE & Z-TRANSFORMATION", "      3",  18000, "MAT1205"},
                {"3", "PHYSICS 2", "      3",  18000, "PHY1101 "},
                {"3", "PHYSICS 2 LAB", "      1",  , "PHY2102 "},
                {"3", "PROGRAMMING LANGUAGE 1 (STRUCTURED PROGRAMMING LANGUAGE) ", "      3",  18000, "INEN1205 "},
                {"3", "ENGINEERING MECHANICS II", "      3",  18000, "BAE1203 "},
                {"3", "ENGINEERING MECHANICS II LAB", "      1",  , "BAE1204"},
                {"3", "PRINCIPLES OF ACCOUNTING [IPE]", "      2",  12000, "MAT1205"},
                {"3", "MANUFACTURING AND PRODUCTION PROCESS I", "      3",  18000, "INEN1208"},
                {"3", "MANUFACTURING AND PRODUCTION PROCESS I LAB", "      1",  , "INEN1208 "},
                {"4", "MATRICES, VECTORS, FOURIER ANALYSIS", "      3",  18000, "MAT 2102"},
                {"4", "PRINCIPLES OF ECONOMICS", "      2",  12000, "BBA1102"},
                {"4", "COMPUTER APPLICATION IN IE", "      3",  18000, "CSE2113"},
                {"4", "COMPUTER APPLICATION IN IE LAB ", "      1",  , "CSE2113"},
                {"4", "STATISTICAL DECISION MAKING FOR ENGINEERS", "      3",  18000, "MAT2102 "},
                {"4", "INDUSTRIAL & OPERATIONS MANAGEMENT", "      3",  18000, "IPEN2101"},
                {"4", "MACHINE TOOLS ", "      3",  18000, "BAE2101"},
                {"4", "MACHINE TOOLS LAB", "      1",  , "BAE2102"},
                {"5", "TOTAL QUALITY MANAGEMENT", "      3",  18000, "BBA3113 "},
                {"5", "ENGINEERING MATERIALS & PROCESSES", "      3",  18000, "IPEN2205"},
                {"5", "ENGINEERING MATERIALS & PROCESSES LAB", "      1",  , "IPEN2206"},
                {"5", "PROJECT & ENVIRONMENTAL MANAGEMENT AND ORGANIZATION", "      3",  18000, "INEN2203"},
                {"5", "PRODUCTION & INVENTORY CONTROL", "      3",  18000, "INEN2203"},
                {"5", "WORK DESIGN", "      3",  18000, "IPEN2205"},
                {"5", "TECH MAJOR 1", "      3",  18000, "INEN2201"},
                {"6", "MODERN CONTROL SYSTEMS", "      3 ",  18000, "MAT2202"},
                {"6", "MODERN CONTROL SYSTEMS LAB", "      1",  , "MAT2202"},
                {"6", "INDUSTRIAL, ERGONOMICS AND PRODUCTION SAFETY", "      3 ",  18000, "INEN3105"},
                {"6", "MANUFACTURING AND PRODUCTION PROCESS II", "      3",  18000, "INEN3105"},
                {"6", "MANUFACTURING AND PRODUCTION PROCESS II LAB", "      1",  , "INEN3105"},
                {"6", "COMPUTER INTEGRATED MANUFACTURING", "      3",  18000, "INEN2203"},
                {"6", "COMPUTER INTEGRATED MANUFACTURING LAB", "      1",  18000, "INEN2203"},
                {"6", "TECH MAJOR 2", "      3",  18000, "INEN3211"},
                {"7", "SUPPLY CHAIN MANAGEMENT", "      3",  18000, "BBA3115"},
                {"7", "BUSINESS COMMUNICATION", "      3",  18000, "ENG1202"},
                {"7", "MEASUREMENT AND QUALITY CONTROL", "      3",  18000, "EEE4101"},
                {"7", "INDUSTRIAL TRAINING / SEMINAR / WORKSHOPS", "      1",  , "OSCM4001"},
                {"7", "TECH MAJOR 3", "      3",  18000, "IPEN3201"},
                {"7", "CAPSTONE PROJECT [IPE]", "      3",  18000, "INEN3107 "},
                {"8", "ENGINEERING ETHICS AND ENVIRONMENTAL PROTECTION", "      1",  , "INEN2201"},
                {"8", "SIMULATION AND DESIGN IN IE", "      3",  18000, "IPEN3201"},
                {"8", "SIMULATION AND DESIGN IN IE", "      1",  , "IPEN3202"},
                {"8", "MANUFACTURING AND PRODUCTION RESOURCE PLANNING", "      3",  18000, "OSCM4001"},
                {"8", "INTERNSHIP", "      1",  , "INEN4103"},
                {"8", "TECH MAJOR 4", "      3",  18000, "INEN4101"},
                {null, "", null, null, ""},
                {null, null, null, null, null}
            },
            new String [] {
                "Semester", "Course Name", "Credit", "Tuition Fee", "Pre-Requisite"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Industrial_Production_Engineering_Default_Table);
        if (Industrial_Production_Engineering_Default_Table.getColumnModel().getColumnCount() > 0) {
            Industrial_Production_Engineering_Default_Table.getColumnModel().getColumn(0).setMinWidth(80);
            Industrial_Production_Engineering_Default_Table.getColumnModel().getColumn(0).setPreferredWidth(80);
            Industrial_Production_Engineering_Default_Table.getColumnModel().getColumn(0).setMaxWidth(80);
            Industrial_Production_Engineering_Default_Table.getColumnModel().getColumn(1).setMinWidth(370);
            Industrial_Production_Engineering_Default_Table.getColumnModel().getColumn(1).setPreferredWidth(370);
            Industrial_Production_Engineering_Default_Table.getColumnModel().getColumn(1).setMaxWidth(370);
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(60, 60, 700, 260);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(110, 220, 1690, 670);

        jLabel2.setIcon(new ImageIcon(getClass().getResource("/icon/loadingPage.jpg")));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 100, 1920, 980);

        setSize(new Dimension(1920, 1080));
        setLocationRelativeTo(null);
    }

    private void LogoutMouseClicked(MouseEvent evt) {

        Login l = new Login();
        l.setVisible(true);
        setVisible(false);
    }

    private void HomeMouseClicked(MouseEvent evt) {

        Dashboard d = new Dashboard();
        d.setVisible(true);
        setVisible(false);
    }

    private void LogoutMouseMoved(MouseEvent evt) {

    }

    private void ExitMouseClicked(MouseEvent evt) {
        System.exit(0);
    }

    private void ProfileMouseClicked(MouseEvent evt) {

        Profile p = new Profile();
        p.setVisible(true);
        setVisible(false);
    }

    private void Add_CourseActionPerformed(ActionEvent evt) {

        TableModel model1 = Industrial_Production_Engineering_Default_Table.getModel();
       int [] indexs = Industrial_Production_Engineering_Default_Table.getSelectedRows();
       Object [] row = new Object[5];
       DefaultTableModel model2 = (DefaultTableModel) New_Table.getModel();
       for (int i=0; i < indexs.length; i++)
       {
           row[0] = model1.getValueAt(indexs[i],0);
           row[1] = model1.getValueAt(indexs[i],1);
           row[2] = model1.getValueAt(indexs[i],2);
           row[3] = model1.getValueAt(indexs[i],3);
           row[4] = model1.getValueAt(indexs[i],4);
           model2.addRow(row);
       }
    }

    private void Calculate_FeeActionPerformed(ActionEvent evt) {
        

        int numrow = New_Table.getRowCount();

        double TotalTutuionFee = 0;
        int TotalCredit = 0;
        double OldTotalTutuionFee = 0;
        for (int i = 0; i < numrow; i++) {
            if(TotalCredit<17){
            double val = Double.parseDouble(New_Table.getValueAt(i, 3).toString());
            double credit = Double.parseDouble(New_Table.getValueAt(i, 2).toString());
            TotalTutuionFee += val;
            TotalCredit += credit;
            OldTotalTutuionFee += credit*5500;
            }
            else{
                JOptionPane.showMessageDialog(null,"Sorry Total Credit limit is 18");
            }
        }
        Total_Tuition_Fee_Sum_value.setText(Double.toString(TotalTutuionFee));
        Credit_Sum_value.setText(Integer.toString(TotalCredit));
        Old_Total_Tuition_Fee_Sum_value.setText(Double.toString(OldTotalTutuionFee));
        if(TotalCredit>=18){
            Add_Course.setEnabled(false);
        }
        else{
            Add_Course.setEnabled(true);
        }
    }

    private void Remove_CourseActionPerformed(ActionEvent evt) {

        DefaultTableModel model = (DefaultTableModel) New_Table.getModel();

        try{
       int SelectedRowIndex = New_Table.getSelectedRow();
       model.removeRow(SelectedRowIndex);
       }catch(Exception ex)
       {
           JOptionPane.showMessageDialog(null, "Please Select the Course you want to Remove");
       }
    }

    public static void main(String args[]) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Industrial_and_Production_Engineering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Industrial_and_Production_Engineering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Industrial_and_Production_Engineering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Industrial_and_Production_Engineering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

       
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Industrial_and_Production_Engineering().setVisible(true);
            }
        });
    }


    private JLabel AIUB_CSE_Course_Label1;
    private JLabel AIUB_Industrial_and_Production_Engineering_Course_Label;
    private JButton Add_Course;
    private JButton Calculate_Fee;
    private JLabel Credit_Sum_value;
    private JLabel Exit;
    private JLabel Home;
    private JTable Industrial_Production_Engineering_Default_Table;
    private JLabel Logout;
    private JTable New_Table;
    private JLabel Old_Total_Tuition_Fee_Sum_value;
    private JLabel Per_Credit_Cost_Info;
    private JLabel Per_Credit_Cost_Info1;
    private JLabel Profile;
    private JButton Remove_Course;
    private JLabel Total_Credits_Counts;
    private JLabel Total_Credits_Counts1;
    private JLabel Total_Credits_Counts2;
    private JLabel Total_Credits_Info;
    private JLabel Total_Tuition_Fee_Sum_value;
    private JLabel jLabel13;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;

}
