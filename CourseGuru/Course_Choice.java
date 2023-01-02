import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;


public class Course_Choice extends JFrame {


    public Course_Choice() {
        initComponents();
    }



    private void initComponents() {

        jPanel_1 = new JPanel();
        jLabel3 = new JLabel();
        jLabel13 = new JLabel();
        Profile3 = new JLabel();
        Logout = new JLabel();
        Home = new JLabel();
        Exit = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        Graduate = new JButton();
        Undergraduate = new JButton();
        jLabel2 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel_1.setBackground(new Color(25, 118, 211));
        jPanel_1.setLayout(null);

        jLabel3.setFont(new Font("Arial", 1, 48));
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("CourseGuru");
        jPanel_1.add(jLabel3);
        jLabel3.setBounds(20, -10, 300, 100);

        jLabel13.setFont(new Font("Arial", 0, 18));
        jLabel13.setForeground(new Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel13.setText("Your course choosing partner");
        jPanel_1.add(jLabel13);
        jLabel13.setBounds(10, 70, 420, 22);

        Profile3.setFont(new Font("Arial", 0, 24));
        Profile3.setForeground(new Color(255, 255, 255));
        Profile3.setText("Profile");
        Profile3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Profile3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                ProfileMouseClicked(evt);
            }
        });
        jPanel_1.add(Profile3);
        Profile3.setBounds(1420, 40, 68, 28);

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
        jPanel_1.add(Home);
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
        jPanel_1.add(Exit);
        Exit.setBounds(1880, 0, 40, 29);

        jLabel4.setFont(new Font("Segoe UI", 0, 36));
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setText("I");
        jPanel_1.add(jLabel4);
        jLabel4.setBounds(1680, 0, 40, 100);

        jLabel5.setFont(new Font("Segoe UI", 0, 36));
        jLabel5.setForeground(new Color(255, 255, 255));
        jLabel5.setText("I");
        jPanel_1.add(jLabel5);
        jLabel5.setBounds(1530, 0, 40, 100);

        getContentPane().add(jPanel_1);
        jPanel_1.setBounds(0, 0, 1920, 100);

        Graduate.setBackground(new Color(25, 118, 211));
        Graduate.setFont(new Font("Arial", 1, 24));
        Graduate.setForeground(new Color(255, 255, 255));
        Graduate.setText("Graduate");
        Graduate.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Graduate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                GraduateActionPerformed(evt);
            }
        });
        getContentPane().add(Graduate);
        Graduate.setBounds(730, 370, 240, 190);

        Undergraduate.setBackground(new Color(25, 118, 211));
        Undergraduate.setFont(new Font("Arial", 1, 24));
        Undergraduate.setForeground(new Color(255, 255, 255));
        Undergraduate.setText("Undergraduate");
        Undergraduate.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Undergraduate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UndergraduateActionPerformed(evt);
            }
        });
        getContentPane().add(Undergraduate);
        Undergraduate.setBounds(310, 370, 240, 190);

        jLabel2.setIcon(new ImageIcon(getClass().getResource("/icon/loadingPage.jpg")));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 100, 1920, 980);

        setSize(new Dimension(1920, 1080));
        setLocationRelativeTo(null);
    }

    private void UndergraduateActionPerformed(ActionEvent evt) {

        Undergraduate_AIUB_Course UC = new Undergraduate_AIUB_Course();
        UC.setVisible(true);
        setVisible(false);
    }

    private void GraduateActionPerformed(ActionEvent evt) {

        Graduate_AIUB_Course GC = new Graduate_AIUB_Course();
        GC.setVisible(true);
        setVisible(false);
    }

    private void ExitMouseClicked(MouseEvent evt) {
        System.exit(0);
    }

    private void HomeMouseClicked(MouseEvent evt) {

        Dashboard d = new Dashboard();
        d.setVisible(true);
        setVisible(false);
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
                new Course_Choice().setVisible(true);
            }
        });
    }


    private JLabel CourseGuruLogo;
    private JLabel CourseGuruLogo1;
    private JLabel CourseGuruLogo2;
    private JLabel CourseGuruText;
    private JLabel CourseGuruText1;
    private JLabel CourseGuruText2;
    private JLabel Exit;
    private JButton Graduate;
    private JLabel Home;
    private JLabel Logout;
    private JLabel Profile;
    private JLabel Profile1;
    private JLabel Profile2;
    private JLabel Profile3;
    private JButton Undergraduate;
    private JLabel jLabel13;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel_1;

}
