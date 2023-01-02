import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;


public class Dashboard extends JFrame {

    public Dashboard() {
        initComponents();
    }



    private void initComponents() {

        jPanel_1 = new JPanel();
        CoureseGuruLogo_Label = new JLabel();
        CourseGuruText_Label = new JLabel();
        Profile1 = new JLabel();
        Logout = new JLabel();
        Home = new JLabel();
        Exit = new JLabel();
        Design_bar_2 = new JLabel();
        Design_bar_1 = new JLabel();
        jPanel2 = new JPanel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        WelcomeLabel = new JLabel();
        BG_DashBoard_Label = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel_1.setBackground(new Color(25, 118, 211));
        jPanel_1.setLayout(null);

        CoureseGuruLogo_Label.setFont(new Font("Arial", 1, 48));
        CoureseGuruLogo_Label.setForeground(new Color(255, 255, 255));
        CoureseGuruLogo_Label.setHorizontalAlignment(SwingConstants.CENTER);
        CoureseGuruLogo_Label.setText("CourseGuru");
        jPanel_1.add(CoureseGuruLogo_Label);
        CoureseGuruLogo_Label.setBounds(20, 0, 300, 80);

        CourseGuruText_Label.setFont(new Font("Arial", 0, 18));
        CourseGuruText_Label.setForeground(new Color(255, 255, 255));
        CourseGuruText_Label.setHorizontalAlignment(SwingConstants.CENTER);
        CourseGuruText_Label.setText("Your course choosing partner");
        jPanel_1.add(CourseGuruText_Label);
        CourseGuruText_Label.setBounds(10, 70, 420, 22);

        Profile1.setFont(new Font("Arial", 0, 24));
        Profile1.setForeground(new Color(199, 226, 255));
        Profile1.setText("Profile");
        Profile1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Profile1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                ProfileMouseClicked(evt);
            }
        });
        jPanel_1.add(Profile1);
        Profile1.setBounds(1420, 50, 68, 28);

        Logout.setFont(new Font("Arial", 0, 24));
        Logout.setForeground(new Color(199, 226, 255));
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
        Logout.setBounds(1730, 50, 74, 30);

        Home.setFont(new Font("Arial", 0, 24));
        Home.setForeground(new Color(199, 226, 255));
        Home.setText("Home");
        Home.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Home.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        jPanel_1.add(Home);
        Home.setBounds(1580, 50, 63, 30);

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
        Exit.setBounds(1880, 10, 40, 29);

        Design_bar_2.setFont(new Font("Segoe UI", 0, 36));
        Design_bar_2.setForeground(new Color(255, 255, 255));
        Design_bar_2.setText("I");
        jPanel_1.add(Design_bar_2);
        Design_bar_2.setBounds(1680, 10, 40, 100);

        Design_bar_1.setFont(new Font("Segoe UI", 0, 36));
        Design_bar_1.setForeground(new Color(255, 255, 255));
        Design_bar_1.setText("I");
        jPanel_1.add(Design_bar_1);
        Design_bar_1.setBounds(1530, 10, 40, 100);

        getContentPane().add(jPanel_1);
        jPanel_1.setBounds(-1, 0, 1920, 100);

        jButton1.setBackground(new Color(25, 118, 211));
        jButton1.setFont(new Font("Arial", 1, 24));
        jButton1.setForeground(new Color(199, 226, 255));
        jButton1.setText("Choose Course");
        jButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new Color(25, 118, 211));
        jButton2.setFont(new Font("Arial", 1, 24));
        jButton2.setForeground(new Color(199, 226, 255));
        jButton2.setText("Manage ID");
        jButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        jButton3.setBackground(new Color(25, 118, 211));
        jButton3.setFont(new Font("Arial", 1, 24));
        jButton3.setForeground(new Color(199, 226, 255));
        jButton3.setText("Add University");
        jButton3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        jButton4.setBackground(new Color(25, 118, 211));
        jButton4.setFont(new Font("Arial", 1, 24));
        jButton4.setForeground(new Color(199, 226, 255));
        jButton4.setText("My Profile");
        jButton4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new Color(25, 118, 211));
        jButton5.setFont(new Font("Arial", 1, 24));
        jButton5.setForeground(new Color(199, 226, 255));
        jButton5.setText("Credits");
        jButton5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        WelcomeLabel.setFont(new Font("Arial", 0, 48));
        WelcomeLabel.setForeground(new Color(255, 255, 255));
        WelcomeLabel.setText("Welcome");

        BG_DashBoard_Label.setIcon(new ImageIcon(getClass().getResource("/icon/loadingPage.jpg")));
        BG_DashBoard_Label.setHorizontalTextPosition(SwingConstants.CENTER);
        BG_DashBoard_Label.setMaximumSize(new Dimension(1920, 1080));
        BG_DashBoard_Label.setMinimumSize(new Dimension(1920, 1080));
        BG_DashBoard_Label.setPreferredSize(new Dimension(1920, 1080));

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(790, 790, 790)
                .addComponent(WelcomeLabel, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(840, 840, 840)
                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1140, 1140, 1140)
                .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1440, 1440, 1440)
                .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE))
            .addComponent(BG_DashBoard_Label, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(WelcomeLabel, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
            .addComponent(BG_DashBoard_Label, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 100, 1920, 980);

        setSize(new Dimension(1920, 1080));
        setLocationRelativeTo(null);
    }

    private void jButton5ActionPerformed(ActionEvent evt) {

        JOptionPane.showMessageDialog(null, "Developer\n_______________\nShah Rahat Hossain\nID:22-47411-2\nTamim Hasan Apurbo\nID:22-47600-2");
    }

    private void jButton4ActionPerformed(ActionEvent evt) {

        Profile p = new Profile();
        p.setVisible(true);
        setVisible(false);
    }

    private void jButton1ActionPerformed(ActionEvent evt) {

        Course_Choice cc = new Course_Choice();
        cc.setVisible(true);
        setVisible(false);
    }

    private void ExitMouseClicked(MouseEvent evt) {
        System.exit(0);
    }

    private void HomeMouseClicked(MouseEvent evt) {


        setVisible(false);
        setVisible(true);
    }

    private void LogoutMouseClicked(MouseEvent evt) {

        Login l = new Login();
        l.setVisible(true);
        setVisible(false);
    }

    private void LogoutMouseMoved(MouseEvent evt) {


    }

    private void ProfileMouseClicked(MouseEvent evt) {

        Profile p = new Profile();
        p.setVisible(true);
        setVisible(false);
    }

    public static void main(String args[]) {

       
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }


    private JLabel BG_DashBoard_Label;
    private JLabel CoureseGuruLogo_Label;
    private JLabel CourseGuruLogo;
    private JLabel CourseGuruText;
    private JLabel CourseGuruText_Label;
    private JLabel Design_bar_1;
    private JLabel Design_bar_2;
    private JLabel Exit;
    private JLabel Home;
    private JLabel Logout;
    private JLabel Profile;
    private JLabel Profile1;
    private JLabel WelcomeLabel;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel_1;

}
