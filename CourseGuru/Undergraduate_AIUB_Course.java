import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Undergraduate_AIUB_Course extends JFrame {

    public Undergraduate_AIUB_Course() {
        initComponents();
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
        Reset = new JButton();
        jLabel6 = new JLabel();
        SelectUniversityComboBox = new JComboBox<>();
        jLabel7 = new JLabel();
        SelectFacultyComboBox = new JComboBox<>();
        jLabel8 = new JLabel();
        SelectDepartmentComboBox = new JComboBox<>();
        jLabel1 = new JLabel();
        jLabel9 = new JLabel();
        Next = new JButton();
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
        jPanel2.setForeground(new Color(255, 255, 255));
        jPanel2.setLayout(null);

        Reset.setFont(new Font("Segoe UI", 1, 14));
        Reset.setForeground(new Color(25, 118, 211));
        Reset.setText("Reset");
        Reset.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel2.add(Reset);
        Reset.setBounds(50, 440, 220, 50);

        jLabel6.setForeground(new Color(255, 255, 255));
        jLabel6.setText("_________________________________________");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(130, 50, 420, 20);

        SelectUniversityComboBox.setBackground(new Color(25, 118, 211));
        SelectUniversityComboBox.setFont(new Font("Arial", 0, 18));
        SelectUniversityComboBox.setForeground(new Color(199, 226, 255));
        SelectUniversityComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Select University", "American International University Bangladesh" }));
        SelectUniversityComboBox.setBorder(null);
        SelectUniversityComboBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
        SelectUniversityComboBox.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
        SelectUniversityComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SelectUniversityComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(SelectUniversityComboBox);
        SelectUniversityComboBox.setBounds(60, 140, 400, 26);

        jLabel7.setForeground(new Color(255, 255, 255));
        jLabel7.setText("_______________________________________________________");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(60, 250, 420, 20);

        SelectFacultyComboBox.setBackground(new Color(25, 118, 211));
        SelectFacultyComboBox.setFont(new Font("Arial", 0, 18));
        SelectFacultyComboBox.setForeground(new Color(199, 226, 255));
        SelectFacultyComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Select Faculty" }));
        SelectFacultyComboBox.setBorder(null);
        SelectFacultyComboBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
        SelectFacultyComboBox.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
        SelectFacultyComboBox.setEnabled(false);
        SelectFacultyComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SelectFacultyComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(SelectFacultyComboBox);
        SelectFacultyComboBox.setBounds(60, 240, 400, 26);

        jLabel8.setForeground(new Color(255, 255, 255));
        jLabel8.setText("_______________________________________________________");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(60, 360, 420, 20);

        SelectDepartmentComboBox.setBackground(new Color(25, 118, 211));
        SelectDepartmentComboBox.setFont(new Font("Arial", 0, 18));
        SelectDepartmentComboBox.setForeground(new Color(199, 226, 255));
        SelectDepartmentComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Select Department" }));
        SelectDepartmentComboBox.setBorder(null);
        SelectDepartmentComboBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
        SelectDepartmentComboBox.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
        SelectDepartmentComboBox.setEnabled(false);
        
        jPanel2.add(SelectDepartmentComboBox);
        SelectDepartmentComboBox.setBounds(60, 350, 400, 26);

        jLabel1.setFont(new Font("Arial", 0, 36));
        jLabel1.setForeground(new Color(199, 226, 255));
        jLabel1.setText("Form");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(220, 16, 110, 50);

        jLabel9.setForeground(new Color(255, 255, 255));
        jLabel9.setText("_______________________________________________________");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(60, 150, 420, 20);

        Next.setFont(new Font("Segoe UI", 1, 14));
        Next.setForeground(new Color(25, 118, 211));
        Next.setText("Next");
        Next.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        jPanel2.add(Next);
        Next.setBounds(280, 440, 220, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(660, 340, 550, 610);

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

    private void ExitMouseClicked(MouseEvent evt) {
        System.exit(0);
    }

    private void ProfileMouseClicked(MouseEvent evt) {

        Profile p = new Profile();
        p.setVisible(true);
        setVisible(false);
    }

    private void ResetActionPerformed(ActionEvent evt) {

            SelectUniversityComboBox.removeItem("American International University Bangladesh");
            SelectUniversityComboBox.addItem("American International University Bangladesh");
            SelectFacultyComboBox.setEnabled(false);
            SelectDepartmentComboBox.setEnabled(false);
            SelectFacultyComboBox.removeItem("FACULTY OF SCIENCE and TECHNOLOGY");
            SelectFacultyComboBox.removeItem("FACULTY OF ENGINEERING");
            SelectFacultyComboBox.removeItem("FACULTY OF BUSINESS ADMINISTRATION");
            SelectFacultyComboBox.removeItem("FACULTY OF ARTS AND SOCIAL SCIENCES");
            SelectDepartmentComboBox.removeItem("Department of Computer Science");
            SelectDepartmentComboBox.removeItem("Department of Engineering");
            SelectDepartmentComboBox.removeItem("Department of BBA");
            SelectDepartmentComboBox.removeItem("Department of Media and Mass Communication");
            SelectDepartmentComboBox.removeItem("Department of IPE");



    }

    private void NextActionPerformed(ActionEvent evt) {

        if(SelectDepartmentComboBox.getSelectedItem().equals("Department of Computer Science"))
        {
           CSE aiub = new CSE();
           aiub.setVisible(true);
           setVisible(false);
        }

        else if(SelectDepartmentComboBox.getSelectedItem().equals("Department of Engineering")){
           EEE aiub = new EEE();
           aiub.setVisible(true);
           setVisible(false);
        }

        else if(SelectDepartmentComboBox.getSelectedItem().equals("Department of BBA")){
           BBA aiub = new BBA();
           aiub.setVisible(true);
           setVisible(false);
        }
        else if(SelectDepartmentComboBox.getSelectedItem().equals("Department of Media and Mass Communication")){
           BA_in_Media_and_Mass_Communication aiub = new BA_in_Media_and_Mass_Communication();
           aiub.setVisible(true);
           setVisible(false);
        }

        else if(SelectDepartmentComboBox.getSelectedItem().equals("Department of English")){
           English aiub = new English();
           aiub.setVisible(true);
           setVisible(false);
        }

        else if(SelectDepartmentComboBox.getSelectedItem().equals("Department of IPE")){
            Industrial_and_Production_Engineering aiub = new Industrial_and_Production_Engineering();
            aiub.setVisible(true);
            setVisible(false);
         }
    }

    private void SelectUniversityComboBoxActionPerformed(ActionEvent evt) {

        if(SelectUniversityComboBox.getSelectedItem().equals("Select Univertsity"))
            {
                SelectFacultyComboBox.setEnabled(false);
            }
            else if
          (
                SelectUniversityComboBox.getSelectedItem().equals("American International University Bangladesh")
          )
        {
            SelectFacultyComboBox.setEnabled(true);
            SelectFacultyComboBox.removeItem("FACULTY OF SCIENCE and TECHNOLOGY");
            SelectFacultyComboBox.removeItem("FACULTY OF ENGINEERING");
            SelectFacultyComboBox.removeItem("FACULTY OF BUSINESS ADMINISTRATION");
            SelectFacultyComboBox.removeItem("FACULTY OF ARTS AND SOCIAL SCIENCES");
            
            SelectFacultyComboBox.addItem("FACULTY OF SCIENCE and TECHNOLOGY");
            SelectFacultyComboBox.addItem("FACULTY OF ENGINEERING");
            SelectFacultyComboBox.addItem("FACULTY OF BUSINESS ADMINISTRATION");
            SelectFacultyComboBox.addItem("FACULTY OF ARTS AND SOCIAL SCIENCES");
        }
    }

    private void SelectFacultyComboBoxActionPerformed(ActionEvent evt) {

        if(SelectFacultyComboBox.getSelectedItem().equals("Select Program"))
            {
                SelectDepartmentComboBox.setEnabled(false);
            }
        else if(SelectFacultyComboBox.getSelectedItem().equals("FACULTY OF SCIENCE and TECHNOLOGY") )
        {
            SelectDepartmentComboBox.setEnabled(true);

            SelectDepartmentComboBox.removeItem("Department of Computer Science");
            SelectDepartmentComboBox.removeItem("Department of Engineering");
            SelectDepartmentComboBox.removeItem("Department of BBA");
            SelectDepartmentComboBox.removeItem("Department of Media and Mass Communication");
            SelectDepartmentComboBox.removeItem("Department of English");
            SelectDepartmentComboBox.removeItem("Department of IPE");

            SelectDepartmentComboBox.addItem("Department of Computer Science");
        }
        else if
          (
                SelectFacultyComboBox.getSelectedItem().equals("FACULTY OF ENGINEERING")
          )
        {
            SelectDepartmentComboBox.setEnabled(true);

            SelectDepartmentComboBox.removeItem("Department of Computer Science");
            SelectDepartmentComboBox.removeItem("Department of Engineering");
            SelectDepartmentComboBox.removeItem("Department of BBA");
            SelectDepartmentComboBox.removeItem("Department of Media and Mass Communication");
            SelectDepartmentComboBox.removeItem("Department of English");
            SelectDepartmentComboBox.removeItem("Department of IPE");

            SelectDepartmentComboBox.addItem("Department of Engineering");
            SelectDepartmentComboBox.addItem("Department of IPE");
        }

        else if
          (
                SelectFacultyComboBox.getSelectedItem().equals("FACULTY OF BUSINESS ADMINISTRATION")
          )
        {
            SelectDepartmentComboBox.setEnabled(true);

            SelectDepartmentComboBox.removeItem("Department of Computer Science");
            SelectDepartmentComboBox.removeItem("Department of Engineering");
            SelectDepartmentComboBox.removeItem("Department of BBA");
            SelectDepartmentComboBox.removeItem("Department of Media and Mass Communication");
            SelectDepartmentComboBox.removeItem("Department of English");
            SelectDepartmentComboBox.removeItem("Department of IPE");

            SelectDepartmentComboBox.addItem("Department of BBA");
        }
        else if
          (
                SelectFacultyComboBox.getSelectedItem().equals("FACULTY OF ARTS AND SOCIAL SCIENCES")
          )
        {
            SelectDepartmentComboBox.setEnabled(true);

            SelectDepartmentComboBox.removeItem("Department of Computer Science");
            SelectDepartmentComboBox.removeItem("Department of Engineering");
            SelectDepartmentComboBox.removeItem("Department of BBA");
            SelectDepartmentComboBox.removeItem("Department of Media and Mass Communication");
            SelectDepartmentComboBox.removeItem("Department of English");
            SelectDepartmentComboBox.removeItem("Department of IPE");

            SelectDepartmentComboBox.addItem("Department of Media and Mass Communication");
            SelectDepartmentComboBox.addItem("Department of English");
         }
    }

    public static void main(String args[]) {
       
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Undergraduate_AIUB_Course().setVisible(true);
            }
        });
    }


    private JLabel Exit;
    private JLabel Home;
    private JLabel Logout;
    private JButton Next;
    private JLabel Profile;
    private JButton Reset;
    private JComboBox<String> SelectDepartmentComboBox;
    private JComboBox<String> SelectFacultyComboBox;
    private JComboBox<String> SelectUniversityComboBox;
    private JLabel jLabel1;
    private JLabel jLabel13;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;

}
