import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class BA_in_Media_and_Mass_Communication extends JFrame {


    public BA_in_Media_and_Mass_Communication() {
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
        AIUB_EEE_Course_Label = new JLabel();
        AIUB_CSE_Course_Label1 = new JLabel();
        Remove_Course = new JButton();
        Total_Credits_Counts2 = new JLabel();
        Old_Total_Tuition_Fee_Sum_value = new JLabel();
        Per_Credit_Cost_Info1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        Media_Mass_Communication_Default_Table = new JTable();
        Background = new JLabel();
        jPanel1 = new JPanel();
        CourseGuruLogo = new JLabel();
        CourseGuruText = new JLabel();
        Profile = new JLabel();
        Logout = new JLabel();
        Home = new JLabel();
        Exit = new JLabel();
        Design_Bar_1 = new JLabel();
        Design_Bar_2 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

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
        Total_Credits_Info.setText("Total Credits: 120");
        jPanel2.add(Total_Credits_Info);
        Total_Credits_Info.setBounds(80, 370, 200, 28);

        Credit_Sum_value.setFont(new Font("Arial", 1, 24));
        Credit_Sum_value.setForeground(new Color(255, 255, 255));
        Credit_Sum_value.setText("0");
        jPanel2.add(Credit_Sum_value);
        Credit_Sum_value.setBounds(1210, 370, 240, 30);

        AIUB_EEE_Course_Label.setFont(new Font("Arial", 1, 24));
        AIUB_EEE_Course_Label.setForeground(new Color(255, 255, 255));
        AIUB_EEE_Course_Label.setText("AIUB BA in Media and Mass Communication Course");
        jPanel2.add(AIUB_EEE_Course_Label);
        AIUB_EEE_Course_Label.setBounds(119, 20, 780, 28);

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

        Media_Mass_Communication_Default_Table.setForeground(new Color(25, 118, 211));
        Media_Mass_Communication_Default_Table.setModel(new DefaultTableModel(
            new Object [][] {
                {"2", "BANGLADESH STUDIES", "       3",  18000, "15 credits completed"},
                {"2", "INTRODUCTION TO MASS COMMUNICATION", "       3",  18000, "15 credits completed"},
                {"2", "INTRODUCTION TO DIGITAL TOOLS OF COMMUNICATION", "       3 ",  18000, "15 credits completed"},
                {"2", "INTRODUCTION TO DOCUMENTARY", "       3",  18000, "15 credits completed"},
                {"2", "HISTORY OF JOURNALISM & MASS COMMUNICATION IN JOURNALISM", "       3",  18000, "15 credits completed"},
                {"3", "INTRODUCTION TO ECONOMICS	", "       3",  18000, "30 credits completed"},
                {"3", "QUANTITATIVE RESEARCH METHODS FOR COMMUNICATION", "       3",  18000, "30 credits completed"},
                {"3", "MASS MEDIA & SOCIETY", "       3",  18000, "30 credits completed "},
                {"3", "GRAPHIC COMMUNICATION", "       3",  18000, "30 credits completed"},
                {"3", "INTRODUCTION TO TELEVISION & FILM STUDIES", "       3",  18000, "30 credits completed"},
                {"4", "MEDIA LAWS & ETHICS", "       3",  18000, "45 credits completed"},
                {"4", "ADVERTISING IDEA & CONCEPT", "       3",  18000, "45 credits completed"},
                {"4", "DEVELOPMENT COMMUNICATION & JOURNALISM", "       3",  18000, "45 credits completed"},
                {"4", "QUALITATIVE RESEARCH FOR COMMUNICATION", "       3",  18000, "45 credits completed"},
                {"4", "ADVERTISING AS SOCIAL COMMUNICATION", "       3",  18000, "45 credits completed"},
                {"5", "ARTS & AESTHETICS", "       3",  18000, "60 credits completed"},
                {"5", "PUBLIC RELATIONS", "       3",  18000, "60 credits completed"},
                {"5", "DIGITAL PHOTOGRAPHY", "       3",  18000, "60 credits completed"},
                {"5", "MASS COMMUNICATION THEORIES", "       3",  18000, "60 credits completed"},
                {"5", "VIDEO EDITING", "       3",  18000, "60 credits completed"},
                {"6", "BAE INTERDISCIPLINARY FREE ELECTIVE 1", "       3",  18000, "75 credits completed"},
                {"6", "BAE INTERDISCIPLINARY FREE ELECTIVE 2", "       3",  18000, "75 credits completed"},
                {"6", "BAE INTERDISCIPLINARY FREE ELECTIVE 2", "       3",  18000, "75 credits completed"},
                {"6", "GLOBAL MEDIA SYSTEM	", "       3",  18000, "75 credits completed"},
                {"6", "SOUTH ASIAN CINEMA", "       3",  18000, "75 credits completed"},
                {"7", "BAE ELECTIVE 1", "       3",  18000, "90 credits completed"},
                {"7", "BAE ELECTIVE 2", "       3",  18000, "90 credits completed"},
                {"7", "BAE ELECTIVE 3", "       3",  18000, "90 credits completed"},
                {"7", "BAE ELECTIVE 4", "       3",  18000, "90 credits completed"},
                {"7", "BAE ELECTIVE 5", "       3",  18000, "90 credits completed"},
                {"8", "BAE ELECTIVE 6", "       3",  18000, "90 credits completed"},
                {"8", "BAE ELECTIVE 7", "       3",  18000, "90 credits completed"},
                {"8", "BAE ELECTIVE 8", "       3",  18000, "90 credits completed"},
                {"8", "BAE ELECTIVE 9", "       3",  18000, "90 credits completed"},
                {"8", "INTERNSHIP [BAMMC]", "       3",  18000, "115 credits completed"},
                {null, null, null, null, null}
            },
            new String [] {
                "Semester", "Course Name", "Credit", "Tuition Fee", "Pre-Requisite"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Media_Mass_Communication_Default_Table);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(70, 60, 690, 260);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(120, 220, 1690, 670);

        Background.setIcon(new ImageIcon(getClass().getResource("/icon/loadingPage.jpg")));
        getContentPane().add(Background);
        Background.setBounds(0, 100, 1920, 980);

        jPanel1.setBackground(new Color(25, 118, 211));
        jPanel1.setLayout(null);

        CourseGuruLogo.setFont(new Font("Arial", 1, 48));
        CourseGuruLogo.setForeground(new Color(255, 255, 255));
        CourseGuruLogo.setHorizontalAlignment(SwingConstants.CENTER);
        CourseGuruLogo.setText("CourseGuru");
        jPanel1.add(CourseGuruLogo);
        CourseGuruLogo.setBounds(0, 0, 330, 100);

        CourseGuruText.setFont(new Font("Arial", 0, 18));
        CourseGuruText.setForeground(new Color(255, 255, 255));
        CourseGuruText.setHorizontalAlignment(SwingConstants.CENTER);
        CourseGuruText.setText("Your course choosing partner");
        jPanel1.add(CourseGuruText);
        CourseGuruText.setBounds(90, 30, 240, 100);

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
        Profile.setBounds(1390, 0, 80, 100);

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
        jPanel1.add(Home);
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
        jPanel1.add(Exit);
        Exit.setBounds(1880, 0, 40, 40);

        Design_Bar_1.setFont(new Font("Segoe UI", 0, 36));
        Design_Bar_1.setForeground(new Color(255, 255, 255));
        Design_Bar_1.setText("I");
        jPanel1.add(Design_Bar_1);
        Design_Bar_1.setBounds(1490, 0, 30, 100);

        Design_Bar_2.setFont(new Font("Segoe UI", 0, 36));
        Design_Bar_2.setForeground(new Color(255, 255, 255));
        Design_Bar_2.setText("I");
        jPanel1.add(Design_Bar_2);
        Design_Bar_2.setBounds(1680, 0, 20, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 100);

        setSize(new Dimension(1920, 1080));
        setLocationRelativeTo(null);
    }

    private void Add_CourseActionPerformed(ActionEvent evt) {

        TableModel model1 = Media_Mass_Communication_Default_Table.getModel();
       int [] indexs = Media_Mass_Communication_Default_Table.getSelectedRows();
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

    private void ProfileMouseClicked(MouseEvent evt) {

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
            java.util.logging.Logger.getLogger(BA_in_Media_and_Mass_Communication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BA_in_Media_and_Mass_Communication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BA_in_Media_and_Mass_Communication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BA_in_Media_and_Mass_Communication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

       
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BA_in_Media_and_Mass_Communication().setVisible(true);
            }
        });
    }


    private JLabel AIUB_CSE_Course_Label1;
    private JLabel AIUB_EEE_Course_Label;
    private JButton Add_Course;
    private JLabel Background;
    private JButton Calculate_Fee;
    private JLabel CourseGuruLogo;
    private JLabel CourseGuruText;
    private JLabel Credit_Sum_value;
    private JLabel Design_Bar_1;
    private JLabel Design_Bar_2;
    private JLabel Exit;
    private JLabel Home;
    private JLabel Logout;
    private JTable Media_Mass_Communication_Default_Table;
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
