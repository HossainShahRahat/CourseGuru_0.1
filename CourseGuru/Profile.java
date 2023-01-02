import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;


public class Profile extends JFrame {

    public Profile() {
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
        jLabel2 = new JLabel();
        jLabel4 = new JLabel();
        jPanel2 = new JPanel();
        jLabel1 = new JLabel();
        UserNameLabel = new JLabel();
        EmailLabel = new JLabel();
        username = new JLabel();
        Email = new JLabel();
        jLabel6 = new JLabel();

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

        jLabel2.setFont(new Font("Segoe UI", 0, 36));
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText("I");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1680, 0, 40, 100);

        jLabel4.setFont(new Font("Segoe UI", 0, 36));
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setText("I");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1530, 0, 40, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 100);

        jPanel2.setLayout(null);

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/icon/avatar.jpg")));
        jLabel1.setPreferredSize(new Dimension(300, 250));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(166, 40, 563, 354);

        UserNameLabel.setFont(new Font("Arial", 1, 24));
        UserNameLabel.setForeground(new Color(255, 255, 255));
        UserNameLabel.setText("User Name:");
        jPanel2.add(UserNameLabel);
        UserNameLabel.setBounds(166, 441, 130, 28);

        EmailLabel.setFont(new Font("Arial", 1, 24));
        EmailLabel.setForeground(new Color(255, 255, 255));
        EmailLabel.setText("Email:");
        jPanel2.add(EmailLabel);
        EmailLabel.setBounds(166, 523, 71, 28);

        username.setFont(new Font("Arial", 0, 18));
        username.setForeground(new Color(255, 255, 255));
        jPanel2.add(username);
        username.setBounds(314, 441, 350, 28);

        Email.setFont(new Font("Arial", 0, 18));
        Email.setForeground(new Color(255, 255, 255));
        jPanel2.add(Email);
        Email.setBounds(255, 523, 390, 28);

        jLabel6.setIcon(new ImageIcon(getClass().getResource("/icon/loadingPage.jpg")));
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 0, 1920, 980);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 100, 1920, 980);

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

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

       
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }


    private JLabel Email;
    private JLabel EmailLabel;
    private JLabel Exit;
    private JLabel Home;
    private JLabel Logout;
    private JLabel Profile;
    private JLabel UserNameLabel;
    private JLabel jLabel1;
    private JLabel jLabel13;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel6;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JLabel username;

}
