import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame {

    public Login() {
        initComponents();
    }



    private void initComponents() {

        jPanel1 = new JPanel();
        Developer = new JLabel();
        Background = new JLabel();
        jPanel2 = new JPanel();
        Exit = new JLabel();
        CourseGuruLogo = new JLabel();
        CourseGuruText = new JLabel();
        UsernameLabel = new JLabel();
        Design_bar_1 = new JLabel();
        UsernameIcon = new JLabel();
        PasswordLabel = new JLabel();
        Password = new JPasswordField();
        Design_bar_2 = new JLabel();
        disable = new JLabel();
        show = new JLabel();
        Login = new JButton();
        Signup = new JLabel();
        QuestionLabel = new JLabel();
        LoginLabel = new JLabel();
        Username = new JTextField();
        ErrorLabel = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowOpened(WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setLayout(null);

        Developer.setFont(new Font("Arial", 0, 14));
        Developer.setForeground(new Color(25, 118, 211));
        Developer.setHorizontalAlignment(SwingConstants.CENTER);
        Developer.setText("Created By Rahat and Apurbo");
        jPanel1.add(Developer);
        Developer.setBounds(0, 1040, 1100, 39);

        Background.setIcon(new ImageIcon(getClass().getResource("/icon/bg.png")));
        jPanel1.add(Background);
        Background.setBounds(0, 0, 1100, 1080);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1100, 1080);

        jPanel2.setBackground(new Color(25, 118, 211));
        jPanel2.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setForeground(new Color(255, 255, 255));
        jPanel2.setLayout(null);

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
        jPanel2.add(Exit);
        Exit.setBounds(780, 1, 40, 29);

        CourseGuruLogo.setFont(new Font("Arial", 1, 48));
        CourseGuruLogo.setForeground(new Color(255, 255, 255));
        CourseGuruLogo.setHorizontalAlignment(SwingConstants.CENTER);
        CourseGuruLogo.setText("CourseGuru");
        jPanel2.add(CourseGuruLogo);
        CourseGuruLogo.setBounds(100, 191, 440, 100);

        CourseGuruText.setFont(new Font("Arial", 0, 18));
        CourseGuruText.setForeground(new Color(255, 255, 255));
        CourseGuruText.setHorizontalAlignment(SwingConstants.CENTER);
        CourseGuruText.setText("Your course choosing partner");
        jPanel2.add(CourseGuruText);
        CourseGuruText.setBounds(170, 271, 420, 22);

        UsernameLabel.setFont(new Font("Arial", 1, 18));
        UsernameLabel.setForeground(new Color(199, 226, 255));
        UsernameLabel.setText("Username");
        jPanel2.add(UsernameLabel);
        UsernameLabel.setBounds(170, 421, 341, 22);

        Design_bar_1.setBackground(new Color(25, 118, 211));
        Design_bar_1.setForeground(new Color(255, 255, 255));
        Design_bar_1.setText("_______________________________________________________");
        jPanel2.add(Design_bar_1);
        Design_bar_1.setBounds(170, 470, 420, 20);

        UsernameIcon.setHorizontalAlignment(SwingConstants.CENTER);
        UsernameIcon.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_user_20px_1.png")));
        jPanel2.add(UsernameIcon);
        UsernameIcon.setBounds(560, 451, 40, 39);

        PasswordLabel.setFont(new Font("Arial", 1, 18));
        PasswordLabel.setForeground(new Color(199, 226, 255));
        PasswordLabel.setText("Password");
        jPanel2.add(PasswordLabel);
        PasswordLabel.setBounds(170, 541, 341, 22);

        Password.setBackground(new Color(25, 118, 211));
        Password.setFont(Password.getFont().deriveFont(Password.getFont().getSize()+2f));
        Password.setForeground(new Color(255, 255, 255));
        Password.setBorder(null);
        Password.setCaretColor(new Color(255, 255, 255));
        Password.setSelectedTextColor(new Color(25, 118, 211));
        Password.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                PasswordFocusGained(evt);
            }
        });
        jPanel2.add(Password);
        Password.setBounds(170, 571, 390, 30);

        Design_bar_2.setForeground(new Color(255, 255, 255));
        Design_bar_2.setText("_______________________________________________________");
        jPanel2.add(Design_bar_2);
        Design_bar_2.setBounds(170, 581, 570, 30);

        disable.setHorizontalAlignment(SwingConstants.CENTER);
        disable.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_invisible_20px_1.png")));
        disable.setCursor(new Cursor(Cursor.HAND_CURSOR));
        disable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        jPanel2.add(disable);
        disable.setBounds(560, 571, 40, 40);

        show.setHorizontalAlignment(SwingConstants.CENTER);
        show.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_eye_20px_1.png")));
        show.setCursor(new Cursor(Cursor.HAND_CURSOR));
        show.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel2.add(show);
        show.setBounds(560, 571, 40, 40);

        Login.setFont(new Font("Segoe UI", 1, 14));
        Login.setForeground(new Color(25, 118, 211));
        Login.setText("LOGIN");
        Login.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel2.add(Login);
        Login.setBounds(170, 641, 440, 50);

        Signup.setFont(new Font("Arial", 0, 24));
        Signup.setForeground(new Color(255, 255, 255));
        Signup.setText("Sign Up");
        Signup.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Signup.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                SignupMouseClicked(evt);
            }
        });
        jPanel2.add(Signup);
        Signup.setBounds(436, 787, 122, 28);

        QuestionLabel.setFont(new Font("Arial", 0, 24));
        QuestionLabel.setForeground(new Color(199, 226, 255));
        QuestionLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        QuestionLabel.setText("Don't have an account?");
        jPanel2.add(QuestionLabel);
        QuestionLabel.setBounds(170, 787, 260, 28);

        LoginLabel.setFont(new Font("Arial", 1, 32));
        LoginLabel.setForeground(new Color(255, 255, 255));
        LoginLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LoginLabel.setText("Login");
        jPanel2.add(LoginLabel);
        LoginLabel.setBounds(180, 361, 370, 41);

        Username.setBackground(new Color(25, 118, 211));
        Username.setForeground(new Color(255, 255, 255));
        Username.setBorder(null);
        Username.setCaretColor(new Color(255, 255, 255));
        jPanel2.add(Username);
        Username.setBounds(170, 451, 320, 30);

        ErrorLabel.setFont(new Font("Arial", 1, 14));
        ErrorLabel.setForeground(new Color(235, 0, 0));
        jPanel2.add(ErrorLabel);
        ErrorLabel.setBounds(160, 331, 290, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(1100, 0, 820, 1080);

        setSize(new Dimension(1920, 1080));
        setLocationRelativeTo(null);
    }

    private void ExitMouseClicked(MouseEvent evt) {
        System.exit(0);
    }

    private void disableMouseClicked(MouseEvent evt) {
        Password.setEchoChar((char)0);
        disable.setVisible(false);
        disable.setEnabled(false);
        show.setEnabled(true);
        show.setEnabled(true);
    }

    private void showMouseClicked(MouseEvent evt) {
        Password.setEchoChar((char)8226);
        disable.setVisible(true);
        disable.setEnabled(true);
        show.setEnabled(false);
        show.setEnabled(false);
    }

    private void formWindowOpened(WindowEvent evt) {
        for (double i = 0.0; i <=1.0; i = i+0.1){
            String val = i+ "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void LoginActionPerformed(ActionEvent evt) {


        try {
            File file = new File("/Data_ProjectCourseGuru/Student.txt");
            Scanner sc = new Scanner(file);
            BufferedReader br = new BufferedReader(new FileReader("/Data_ProjectCourseGuru/Student.txt"));

            String line = null;
            boolean login = false;

            String User = Username.getText();
            String Pass = Password.getText();

            try {
                String[] studData = null;
                while ((line = br.readLine()) != null)
                {
                    studData = line.split(" ");
                    if (studData[0].equalsIgnoreCase(User) && studData[1].equalsIgnoreCase(Pass)){
                        login = true;
                    }
                }
                    if (login){
                        Dashboard d = new Dashboard();
                        d.setVisible(true);
                        setVisible(false);
                    }
                    else{
                       ErrorLabel.setText("*Invalid Username or Password");
                    }
                    sc.close();
                }
                catch (IOException ex)
                {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, "Sorry Error 404");
                }
            }
        catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Data file Not found Try Signup to create Data file");
            }
    }

    private void formMouseDragged(MouseEvent evt) {

    }

    private void formMousePressed(MouseEvent evt) {

    }

    private void SignupMouseClicked(MouseEvent evt) {

        Signup su = new Signup();
        su.setVisible(true);
        setVisible(false);
    }

    private void PasswordFocusGained(FocusEvent evt) {

        Password.setText("");
    }

    public static void main(String args[]) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }


    private JLabel Background;
    private JLabel CourseGuruLogo;
    private JLabel CourseGuruText;
    private JLabel Design_bar_1;
    private JLabel Design_bar_2;
    private JLabel Developer;
    private JLabel ErrorLabel;
    private JLabel Exit;
    private JButton Login;
    private JLabel LoginLabel;
    private JPasswordField Password;
    private JLabel PasswordLabel;
    private JLabel QuestionLabel;
    private JLabel Signup;
    private JTextField Username;
    private JLabel UsernameIcon;
    private JLabel UsernameLabel;
    private JLabel disable;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JLabel show;

}
