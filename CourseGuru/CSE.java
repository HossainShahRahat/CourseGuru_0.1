import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.event.*;
import javax.swing.table.*;
import javax.swing.text.*;

public class CSE extends JFrame{


    public CSE() {
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

        jPanel_2 = new JPanel();
        jScrollPane2 = new JScrollPane();
        New_Table = new JTable();
        jScrollPane3 = new JScrollPane();
        CSE_Default_Table = new JTable();
        Add_Course = new JButton();
        Calculate_Fee = new JButton();
        Total_Tuition_Fee_Sum_value = new JLabel();
        Total_Credits_Counts = new JLabel();
        Per_Credit_Cost_Info = new JLabel();
        Total_Credits_Counts1 = new JLabel();
        Total_Credits_Info = new JLabel();
        Credit_Sum_value = new JLabel();
        AIUB_CSE_Course_Label = new JLabel();
        AIUB_CSE_Course_Label1 = new JLabel();
        Remove_Course = new JButton();
        Per_Credit_Cost_Info1 = new JLabel();
        Total_Credits_Counts2 = new JLabel();
        Old_Total_Tuition_Fee_Sum_value = new JLabel();
        jLabel2 = new JLabel();
        jPanel_1 = new JPanel();
        CourseGuruLogo2 = new JLabel();
        CourseGuruText2 = new JLabel();
        Profile2 = new JLabel();
        Logout = new JLabel();
        Home = new JLabel();
        Exit = new JLabel();
        Design_Bar_1 = new JLabel();
        Design_Bar_2 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel_2.setBackground(new Color(25, 118, 211));
        jPanel_2.setLayout(null);

        New_Table.setFont(new Font("Arial", 0, 12));
        New_Table.setForeground(new Color(25, 118, 211));
        New_Table.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Semester", "Course Name", "Cradit", "Tuition Fee"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
            New_Table.getColumnModel().getColumn(0).setMinWidth(80);
            New_Table.getColumnModel().getColumn(0).setPreferredWidth(80);
            New_Table.getColumnModel().getColumn(0).setMaxWidth(80);
            New_Table.getColumnModel().getColumn(1).setMinWidth(370);
            New_Table.getColumnModel().getColumn(1).setPreferredWidth(370);
            New_Table.getColumnModel().getColumn(1).setMaxWidth(370);
        }

        jPanel_2.add(jScrollPane2);
        jScrollPane2.setBounds(950, 60, 670, 260);

        CSE_Default_Table.setFont(new Font("Arial", 0, 12));
        CSE_Default_Table.setForeground(new Color(25, 118, 211));
        CSE_Default_Table.setModel(new DefaultTableModel(
            new Object [][] {
                {"2", "DISCRETE MATHEMATICS", "     3",  18000},
                {"2", "INTEGRAL CALCULUS & ORDINARY DIFFERENTIAL EQUATIONS", "     3  ",  18000},
                {"2", "OBJECT ORIENTED PROGRAMMING 10", "     3 ",  18000},
                {"2", "PHYSICS 2", "     3",  18000},
                {"2", "PHYSICS 2 LAB", "     1",  },
                {"2", "ENGLISH WRITING SKILLS & COMMUNICATION", "     3",  18000},
                {"2", "INTRODUCTION TO ELECTRICAL CIRCUITS", "     3",  18000},
                {"2", "	INTRODUCTION TO ELECTRICAL CIRCUITS LAB", "     1 ",  },
                {"3", "CHEMISTRY", "     3",  18000},
                {"3", "COMPLEX VARIABLE,LAPLACE & Z-TRANSFORMATION", "     3",  18000},
                {"3", "INTRODUCTION TO DATABASE", "     3",  18000},
                {"3", "ELECTRONIC DEVICES LAB", "     1",  },
                {"3", "PRINCIPLES OF ACCOUNTING	", "     3",  18000},
                {"3", "ELECTRONIC DEVICES", "     3",  18000},
                {"3", "DATA STRUCTURE", "     3",  18000},
                {"3", "DATA STRUCTURE LAB", "     1",  },
                {"3", "COMPUTER AIDED DESIGN & DRAFTING", "     1",  },
                {"4", "ALGORITHMS", "     3",  18000},
                {"4", "MATRICES, VECTORS, FOURIER ANALYSIS	", "     3",  18000},
                {"4", "OBJECT ORIENTED PROGRAMMING 2", "     3",  18000},
                {"4", "OBJECT ORIENTED ANALYSIS AND DESIGN", "     3",  18000},
                {"4", "	BANGLADESH STUDIES", "     3",  18000},
                {"4", "DIGITAL LOGIC AND CIRCUITS", "     3 ",  18000},
                {"4", "DIGITAL LOGIC AND CIRCUITS LAB", "     1",  },
                {"4", "COMPUTATIONAL STATISTICS AND PROBABILITY", "     3",  18000},
                {"5", "	THEORY OF COMPUTATION", "     3",  18000},
                {"5", "BUSINESS COMMUNICATION", "     3 ",  18000},
                {"5", "PRINCIPLES OF ECONOMICS", "     2",  12000},
                {"5", "DATA COMMUNICATION", "     3",  18000},
                {"5", "MICROPROCESSOR AND EMBEDDED SYSTEM", "     3",  18000},
                {"5", "SOFTWARE ENGINEERING", "     3",  18000},
                {"6", "ARTIFICIAL INTELLIGENCE AND EXPERT SYS.", "     3",  18000},
                {"6", "COMPUTER NETWORKS", "     3",  18000},
                {"6", "COMPUTER ORGANIZATION AND ARCHITECTURE", "     3",  18000},
                {"6", "OPERATING SYSTEM", "     3",  18000},
                {"6", "WEB TECHNOLOGIES", "     3",  18000},
                {"6", "ENGINEERING ETHICS", "     2",  12000},
                {"6", "COMPILER DESIGN", "     3",  18000},
                {"7", "COMPUTER GRAPHICS", "     3",  18000},
                {"7", "COS ELECTIVE 1", "     3",  18000},
                {"7", "ENGINEERING MANAGEMENT", "     3 ",  18000},
                {"7", "RESEARCH METHODOLOGY", "     3",  18000},
                {"7", "CSE MAJOR 1", "     3",  18000},
                {"7", "CSE MAJOR 2", "     3",  18000},
                {"7", "CSE MAJOR 3", "     3",  18000},
                {"8", "	THESIS / PROJECT", "     3",  18000},
                {"8", "COS ELECTIVE 2", "     3",  18000},
                {"8", "INTERNSHIP", "     3",  18000}
            },
            new String [] {
                "Semester", "Course Name", "Cradit", "Tuition Fee"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(CSE_Default_Table);
        if (CSE_Default_Table.getColumnModel().getColumnCount() > 0) {
            CSE_Default_Table.getColumnModel().getColumn(0).setMinWidth(80);
            CSE_Default_Table.getColumnModel().getColumn(0).setPreferredWidth(80);
            CSE_Default_Table.getColumnModel().getColumn(0).setMaxWidth(80);
            CSE_Default_Table.getColumnModel().getColumn(1).setMinWidth(370);
            CSE_Default_Table.getColumnModel().getColumn(1).setPreferredWidth(370);
            CSE_Default_Table.getColumnModel().getColumn(1).setMaxWidth(370);
        }

        jPanel_2.add(jScrollPane3);
        jScrollPane3.setBounds(70, 60, 660, 250);

        Add_Course.setFont(new Font("Arial", 0, 12));
        Add_Course.setForeground(new Color(25, 118, 211));
        Add_Course.setText("Add Course");
        Add_Course.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Add_CourseActionPerformed(evt);
            }
        });
        jPanel_2.add(Add_Course);
        Add_Course.setBounds(780, 80, 130, 60);

        Calculate_Fee.setFont(new Font("Arial", 0, 12));
        Calculate_Fee.setForeground(new Color(25, 118, 211));
        Calculate_Fee.setText("Calculate Fee");
        Calculate_Fee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Calculate_FeeActionPerformed(evt);
            }
        });
        jPanel_2.add(Calculate_Fee);
        Calculate_Fee.setBounds(780, 250, 130, 60);

        Total_Tuition_Fee_Sum_value.setFont(new Font("Arial", 1, 24));
        Total_Tuition_Fee_Sum_value.setForeground(new Color(255, 255, 255));
        Total_Tuition_Fee_Sum_value.setText("0");
        jPanel_2.add(Total_Tuition_Fee_Sum_value);
        Total_Tuition_Fee_Sum_value.setBounds(1260, 420, 240, 30);

        Total_Credits_Counts.setFont(new Font("Arial", 1, 24));
        Total_Credits_Counts.setForeground(new Color(255, 255, 255));
        Total_Credits_Counts.setText("Total Tuition Fee Counts:");
        jPanel_2.add(Total_Credits_Counts);
        Total_Credits_Counts.setBounds(950, 420, 292, 28);

        Per_Credit_Cost_Info.setFont(new Font("Arial", 1, 24));
        Per_Credit_Cost_Info.setForeground(new Color(255, 255, 255));
        Per_Credit_Cost_Info.setText("Per Credit Cost: 6000 (From 2023 - till)");
        jPanel_2.add(Per_Credit_Cost_Info);
        Per_Credit_Cost_Info.setBounds(80, 420, 433, 28);

        Total_Credits_Counts1.setFont(new Font("Arial", 1, 24));
        Total_Credits_Counts1.setForeground(new Color(255, 255, 255));
        Total_Credits_Counts1.setText("Total Credits Counts:");
        jPanel_2.add(Total_Credits_Counts1);
        Total_Credits_Counts1.setBounds(950, 370, 244, 28);

        Total_Credits_Info.setFont(new Font("Arial", 1, 24));
        Total_Credits_Info.setForeground(new Color(255, 255, 255));
        Total_Credits_Info.setText("Total Credits: 148");
        jPanel_2.add(Total_Credits_Info);
        Total_Credits_Info.setBounds(80, 370, 200, 28);

        Credit_Sum_value.setFont(new Font("Arial", 1, 24));
        Credit_Sum_value.setForeground(new Color(255, 255, 255));
        Credit_Sum_value.setText("0");
        jPanel_2.add(Credit_Sum_value);
        Credit_Sum_value.setBounds(1210, 370, 240, 30);

        AIUB_CSE_Course_Label.setFont(new Font("Arial", 1, 24));
        AIUB_CSE_Course_Label.setForeground(new Color(255, 255, 255));
        AIUB_CSE_Course_Label.setText("AIUB CSE Course");
        jPanel_2.add(AIUB_CSE_Course_Label);
        AIUB_CSE_Course_Label.setBounds(300, 20, 203, 28);

        AIUB_CSE_Course_Label1.setFont(new Font("Arial", 1, 24));
        AIUB_CSE_Course_Label1.setForeground(new Color(255, 255, 255));
        AIUB_CSE_Course_Label1.setText("Your Course Plan");
        jPanel_2.add(AIUB_CSE_Course_Label1);
        AIUB_CSE_Course_Label1.setBounds(1160, 20, 201, 28);

        Remove_Course.setFont(new Font("Arial", 0, 12));
        Remove_Course.setForeground(new Color(25, 118, 211));
        Remove_Course.setText("Remove Course");
        Remove_Course.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Remove_CourseActionPerformed(evt);
            }
        });
        jPanel_2.add(Remove_Course);
        Remove_Course.setBounds(780, 170, 130, 60);

        Per_Credit_Cost_Info1.setFont(new Font("Arial", 1, 24));
        Per_Credit_Cost_Info1.setForeground(new Color(255, 255, 255));
        Per_Credit_Cost_Info1.setText("Per Credit Cost: 5500 (Old Students)");
        jPanel_2.add(Per_Credit_Cost_Info1);
        Per_Credit_Cost_Info1.setBounds(80, 470, 413, 28);

        Total_Credits_Counts2.setFont(new Font("Arial", 1, 24));
        Total_Credits_Counts2.setForeground(new Color(255, 255, 255));
        Total_Credits_Counts2.setText("(Old)Total Tuition Fee Counts:");
        jPanel_2.add(Total_Credits_Counts2);
        Total_Credits_Counts2.setBounds(890, 470, 360, 28);

        Old_Total_Tuition_Fee_Sum_value.setFont(new Font("Arial", 1, 24));
        Old_Total_Tuition_Fee_Sum_value.setForeground(new Color(255, 255, 255));
        Old_Total_Tuition_Fee_Sum_value.setText("0");
        jPanel_2.add(Old_Total_Tuition_Fee_Sum_value);
        Old_Total_Tuition_Fee_Sum_value.setBounds(1260, 470, 240, 30);

        getContentPane().add(jPanel_2);
        jPanel_2.setBounds(110, 220, 1690, 670);

        jLabel2.setIcon(new ImageIcon(getClass().getResource("/icon/loadingPage.jpg")));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 100, 1920, 980);

        jPanel_1.setBackground(new Color(25, 118, 211));
        jPanel_1.setLayout(null);

        CourseGuruLogo2.setFont(new Font("Arial", 1, 48));
        CourseGuruLogo2.setForeground(new Color(255, 255, 255));
        CourseGuruLogo2.setHorizontalAlignment(SwingConstants.CENTER);
        CourseGuruLogo2.setText("CourseGuru");
        jPanel_1.add(CourseGuruLogo2);
        CourseGuruLogo2.setBounds(0, 0, 330, 100);

        CourseGuruText2.setFont(new Font("Arial", 0, 18));
        CourseGuruText2.setForeground(new Color(255, 255, 255));
        CourseGuruText2.setHorizontalAlignment(SwingConstants.CENTER);
        CourseGuruText2.setText("Your course choosing partner");
        jPanel_1.add(CourseGuruText2);
        CourseGuruText2.setBounds(90, 30, 240, 100);

        Profile2.setFont(new Font("Arial", 0, 24));
        Profile2.setForeground(new Color(255, 255, 255));
        Profile2.setText("Profile");
        Profile2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Profile2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Profile2MouseClicked(evt);
            }
        });
        jPanel_1.add(Profile2);
        Profile2.setBounds(1390, 0, 80, 100);

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
        jPanel_1.add(Logout);
        Logout.setBounds(1710, 0, 80, 100);

        Home.setFont(new Font("Arial", 0, 24));
        Home.setForeground(new Color(255, 255, 255));
        Home.setText("Home");
        Home.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Home.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        jPanel_1.add(Home);
        Home.setBounds(1550, 0, 80, 100);

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
        jPanel_1.add(Exit);
        Exit.setBounds(1880, 0, 40, 40);

        Design_Bar_1.setFont(new Font("Segoe UI", 0, 36));
        Design_Bar_1.setForeground(new Color(255, 255, 255));
        Design_Bar_1.setText("I");
        jPanel_1.add(Design_Bar_1);
        Design_Bar_1.setBounds(1490, 0, 30, 100);

        Design_Bar_2.setFont(new Font("Segoe UI", 0, 36));
        Design_Bar_2.setForeground(new Color(255, 255, 255));
        Design_Bar_2.setText("I");
        jPanel_1.add(Design_Bar_2);
        Design_Bar_2.setBounds(1680, 0, 20, 100);

        getContentPane().add(jPanel_1);
        jPanel_1.setBounds(0, 0, 1920, 100);

        setSize(new Dimension(1920, 1080));
        setLocationRelativeTo(null);
    }

    private void Add_CourseActionPerformed(ActionEvent evt) {

        TableModel model1 = CSE_Default_Table.getModel();
       int [] indexs = CSE_Default_Table.getSelectedRows();
       Object [] row = new Object[4];
       DefaultTableModel model2 = (DefaultTableModel) New_Table.getModel();
       for (int i=0; i < indexs.length; i++)
       {
           row[0] = model1.getValueAt(indexs[i],0);
           row[1] = model1.getValueAt(indexs[i],1);
           row[2] = model1.getValueAt(indexs[i],2);
           row[3] = model1.getValueAt(indexs[i],3);
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

    private void Profile2MouseClicked(MouseEvent evt) {

        Profile p = new Profile();
        p.setVisible(true);
        setVisible(false);
    }

    private void LogoutMouseMoved(MouseEvent evt) {

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

    private void ExitMouseClicked(MouseEvent evt) {
        System.exit(0);
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
            java.util.logging.Logger.getLogger(CSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

       
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CSE().setVisible(true);
            }
        });
    }


    private JLabel AIUB_CSE_Course_Label;
    private JLabel AIUB_CSE_Course_Label1;
    private JButton Add_Course;
    private JTable CSE_Default_Table;
    private JButton Calculate_Fee;
    private JLabel CourseGuruLogo;
    private JLabel CourseGuruLogo1;
    private JLabel CourseGuruLogo2;
    private JLabel CourseGuruText;
    private JLabel CourseGuruText1;
    private JLabel CourseGuruText2;
    private JLabel Credit_Sum_value;
    private JLabel Design_Bar_1;
    private JLabel Design_Bar_2;
    private JLabel Exit;
    private JLabel Home;
    private JLabel Logout;
    private JTable New_Table;
    private JLabel Old_Total_Tuition_Fee_Sum_value;
    private JLabel Per_Credit_Cost_Info;
    private JLabel Per_Credit_Cost_Info1;
    private JLabel Profile;
    private JLabel Profile1;
    private JLabel Profile2;
    private JButton Remove_Course;
    private JLabel Total_Credits_Counts;
    private JLabel Total_Credits_Counts1;
    private JLabel Total_Credits_Counts2;
    private JLabel Total_Credits_Info;
    private JLabel Total_Tuition_Fee_Sum_value;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JPanel jPanel3;
    private JPanel jPanel_1;
    private JPanel jPanel_2;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;

}
