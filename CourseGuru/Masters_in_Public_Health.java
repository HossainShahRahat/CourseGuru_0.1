import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class Masters_in_Public_Health extends JFrame {


    public Masters_in_Public_Health() {
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
        CourseGuruLogo = new JLabel();
        CourseGuruLogo_Text = new JLabel();
        Profile = new JLabel();
        Logout = new JLabel();
        Home = new JLabel();
        Exit = new JLabel();
        Design_Bar1 = new JLabel();
        Design_Bar2 = new JLabel();
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
        AIUB_Public_Health_Course_Label = new JLabel();
        AIUB_CSE_Course_Label1 = new JLabel();
        Remove_Course = new JButton();
        Total_Credits_Counts2 = new JLabel();
        Old_Total_Tuition_Fee_Sum_value = new JLabel();
        Per_Credit_Cost_Info1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        Masters_in_Public_Health_Default_Table = new JTable();
        Backgroung = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new Color(25, 118, 211));
        jPanel1.setLayout(null);

        CourseGuruLogo.setFont(new Font("Arial", 1, 48));
        CourseGuruLogo.setForeground(new Color(255, 255, 255));
        CourseGuruLogo.setHorizontalAlignment(SwingConstants.CENTER);
        CourseGuruLogo.setText("CourseGuru");
        jPanel1.add(CourseGuruLogo);
        CourseGuruLogo.setBounds(20, -10, 300, 100);

        CourseGuruLogo_Text.setFont(new Font("Arial", 0, 18));
        CourseGuruLogo_Text.setForeground(new Color(255, 255, 255));
        CourseGuruLogo_Text.setHorizontalAlignment(SwingConstants.CENTER);
        CourseGuruLogo_Text.setText("Your course choosing partner");
        jPanel1.add(CourseGuruLogo_Text);
        CourseGuruLogo_Text.setBounds(10, 70, 420, 22);

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

        Design_Bar1.setFont(new Font("Segoe UI", 0, 36));
        Design_Bar1.setForeground(new Color(255, 255, 255));
        Design_Bar1.setText("I");
        jPanel1.add(Design_Bar1);
        Design_Bar1.setBounds(1680, 0, 40, 100);

        Design_Bar2.setFont(new Font("Segoe UI", 0, 36));
        Design_Bar2.setForeground(new Color(255, 255, 255));
        Design_Bar2.setText("I");
        jPanel1.add(Design_Bar2);
        Design_Bar2.setBounds(1530, 0, 40, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 100);

        jPanel2.setBackground(new Color(25, 118, 211));
        jPanel2.setLayout(null);

        New_Table.setFont(new Font("Arial", 0, 12));
        New_Table.setForeground(new Color(25, 118, 211));
        New_Table.setModel(new DefaultTableModel(
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
        Total_Credits_Info.setText("Total Credits: 51");
        jPanel2.add(Total_Credits_Info);
        Total_Credits_Info.setBounds(80, 370, 187, 28);

        Credit_Sum_value.setFont(new Font("Arial", 1, 24));
        Credit_Sum_value.setForeground(new Color(255, 255, 255));
        Credit_Sum_value.setText("0");
        jPanel2.add(Credit_Sum_value);
        Credit_Sum_value.setBounds(1210, 370, 240, 30);

        AIUB_Public_Health_Course_Label.setFont(new Font("Arial", 1, 24));
        AIUB_Public_Health_Course_Label.setForeground(new Color(255, 255, 255));
        AIUB_Public_Health_Course_Label.setText("AIUB MSc in Public Health Course");
        jPanel2.add(AIUB_Public_Health_Course_Label);
        AIUB_Public_Health_Course_Label.setBounds(200, 20, 393, 28);

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

        Masters_in_Public_Health_Default_Table.setForeground(new Color(25, 118, 211));
        Masters_in_Public_Health_Default_Table.setModel(new DefaultTableModel(
            new Object [][] {
                {"1", "Basic Epidemiology", "      3",  18000, "Nil"},
                {"1", "Introduction to Biostatistics", "      3",  18000, "Nil"},
                {"1", "Introduction to Public Health Nutrition", "      3",  18000, "Nil"},
                {"2", "Population Dynamics and Environment", "      3",  18000, "None"},
                {"2", "Research Methodology in Public Health", "      3",  18000, "None"},
                {"2", " Health Economics", "      3",  18000, "None"},
                {"3", "Public Health Education Rights and Ethics", "      3",  18000, "None"},
                {"3", "Application of Biomedical Engineering in Public Health", "      3",  18000, "15 credits completed"},
                {"3", "Reproductive and Sexual Health", "      3",  18000, "15 credits completed"},
                {"4", "Global Health and Emerging Diseases Pattern", "      3",  18000, "18 credits completed"},
                {"4", "Public Health Education Rights and Ethics", "      3",  18000, "18 credits completed"},
                {"4", " Project", "      3",  18000, "30 credits completed"}
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
        jScrollPane1.setViewportView(Masters_in_Public_Health_Default_Table);
        if (Masters_in_Public_Health_Default_Table.getColumnModel().getColumnCount() > 0) {
            Masters_in_Public_Health_Default_Table.getColumnModel().getColumn(0).setMinWidth(80);
            Masters_in_Public_Health_Default_Table.getColumnModel().getColumn(0).setPreferredWidth(80);
            Masters_in_Public_Health_Default_Table.getColumnModel().getColumn(0).setMaxWidth(80);
            Masters_in_Public_Health_Default_Table.getColumnModel().getColumn(1).setMinWidth(370);
            Masters_in_Public_Health_Default_Table.getColumnModel().getColumn(1).setPreferredWidth(370);
            Masters_in_Public_Health_Default_Table.getColumnModel().getColumn(1).setMaxWidth(370);
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(60, 60, 700, 260);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(110, 220, 1690, 670);

        Backgroung.setIcon(new ImageIcon(getClass().getResource("/icon/loadingPage.jpg")));
        getContentPane().add(Backgroung);
        Backgroung.setBounds(0, 100, 1920, 980);

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

        TableModel model1 = Masters_in_Public_Health_Default_Table.getModel();
       int [] indexs = Masters_in_Public_Health_Default_Table.getSelectedRows();
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
            java.util.logging.Logger.getLogger(Masters_in_Public_Health.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Masters_in_Public_Health.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Masters_in_Public_Health.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Masters_in_Public_Health.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

       
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Masters_in_Public_Health().setVisible(true);
            }
        });
    }


    private JLabel AIUB_CSE_Course_Label1;
    private JLabel AIUB_Public_Health_Course_Label;
    private JButton Add_Course;
    private JLabel Backgroung;
    private JButton Calculate_Fee;
    private JLabel CourseGuruLogo;
    private JLabel CourseGuruLogo_Text;
    private JLabel Credit_Sum_value;
    private JLabel Design_Bar1;
    private JLabel Design_Bar2;
    private JLabel Exit;
    private JLabel Home;
    private JLabel Logout;
    private JTable Masters_in_Public_Health_Default_Table;
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
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;

}
