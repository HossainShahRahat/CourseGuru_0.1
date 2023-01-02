import java.io.*;
import java.util.logging.*;
import java.util.regex.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;



public class Signup extends JFrame {

    public Signup() {
        initComponents();
    }



    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel12 = new JLabel();
        jLabel1 = new JLabel();
        jPanel2 = new JPanel();
        Exit = new JLabel();
        jLabel3 = new JLabel();
        jLabel5 = new JLabel();
        Username = new JTextField();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        Password = new JPasswordField();
        jLabel9 = new JLabel();
        disable = new JLabel();
        show = new JLabel();
        Create = new JButton();
        Login = new JLabel();
        jLabel14 = new JLabel();
        jLabel10 = new JLabel();
        Email = new JTextField();
        jLabel11 = new JLabel();
        jLabel8 = new JLabel();
        jLabel4 = new JLabel();
        jLabel13 = new JLabel();
        ErrorEmailFound = new JLabel();

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

        jLabel12.setFont(new Font("Arial", 0, 14));
        jLabel12.setForeground(new Color(25, 118, 211));
        jLabel12.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel12.setText("Created By Rahat and Apurbo");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, 1040, 1100, 39);

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/icon/bg.png")));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1160, 1044);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-1, 0, 1160, 1080);

        jPanel2.setBackground(new Color(25, 118, 211));
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
        Exit.setBounds(780, 0, 40, 29);

        jLabel3.setFont(new Font("Arial", 1, 32));
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Signup");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(180, 300, 370, 41);

        jLabel5.setFont(new Font("Arial", 1, 18));
        jLabel5.setForeground(new Color(199, 226, 255));
        jLabel5.setText("Email");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(170, 450, 60, 22);

        Username.setBackground(new Color(25, 118, 211));
        Username.setFont(Username.getFont().deriveFont(Username.getFont().getSize()+2f));
        Username.setForeground(new Color(255, 255, 255));
        Username.setBorder(null);
        Username.setCaretColor(new Color(255, 255, 255));
        Username.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        jPanel2.add(Username);
        Username.setBounds(170, 400, 390, 30);

        jLabel6.setForeground(new Color(255, 255, 255));
        jLabel6.setText("_______________________________________________________");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(170, 490, 530, 30);

        jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_user_20px_1.png")));
        jPanel2.add(jLabel7);
        jLabel7.setBounds(560, 399, 40, 30);

        Password.setBackground(new Color(25, 118, 211));
        Password.setFont(Password.getFont().deriveFont(Password.getFont().getSize()+2f));
        Password.setForeground(new Color(255, 255, 255));
        Password.setBorder(null);
        Password.setCaretColor(new Color(255, 255, 255));
        jPanel2.add(Password);
        Password.setBounds(170, 570, 390, 30);

        jLabel9.setForeground(new Color(255, 255, 255));
        jLabel9.setText("_______________________________________________________");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(170, 580, 520, 30);

        disable.setHorizontalAlignment(SwingConstants.CENTER);
        disable.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_invisible_20px_1.png")));
        disable.setCursor(new Cursor(Cursor.HAND_CURSOR));
        disable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        jPanel2.add(disable);
        disable.setBounds(560, 570, 40, 40);

        show.setHorizontalAlignment(SwingConstants.CENTER);
        show.setIcon(new ImageIcon(getClass().getResource("/icon/icons8_eye_20px_1.png")));
        show.setCursor(new Cursor(Cursor.HAND_CURSOR));
        show.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel2.add(show);
        show.setBounds(560, 570, 40, 40);

        Create.setFont(new Font("Segoe UI", 1, 14));
        Create.setForeground(new Color(25, 118, 211));
        Create.setText("Create");
        Create.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Create.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });
        jPanel2.add(Create);
        Create.setBounds(170, 750, 440, 50);

        Login.setFont(new Font("Arial", 0, 24));
        Login.setForeground(new Color(255, 255, 255));
        Login.setText("Login");
        Login.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Login.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        jPanel2.add(Login);
        Login.setBounds(480, 890, 122, 28);

        jLabel14.setFont(new Font("Arial", 0, 24));
        jLabel14.setForeground(new Color(199, 226, 255));
        jLabel14.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel14.setText("Already have an account?");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(180, 890, 290, 28);

        jLabel10.setFont(new Font("Arial", 1, 18));
        jLabel10.setForeground(new Color(199, 226, 255));
        jLabel10.setText("Username");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(170, 370, 341, 22);

        Email.setBackground(new Color(25, 118, 211));
        Email.setFont(Email.getFont().deriveFont(Email.getFont().getSize()+2f));
        Email.setForeground(new Color(255, 255, 255));
        Email.setBorder(null);
        Email.setCaretColor(new Color(255, 255, 255));
        jPanel2.add(Email);
        Email.setBounds(170, 480, 390, 30);

        jLabel11.setForeground(new Color(255, 255, 255));
        jLabel11.setText("_______________________________________________________");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(170, 410, 580, 30);

        jLabel8.setFont(new Font("Arial", 1, 18));
        jLabel8.setForeground(new Color(199, 226, 255));
        jLabel8.setText("Password");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(170, 540, 341, 22);

        jLabel4.setBackground(new Color(25, 118, 211));
        jLabel4.setFont(new Font("Arial", 1, 48));
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText("CourseGuru");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(100, 120, 440, 100);

        jLabel13.setFont(new Font("Arial", 0, 18));
        jLabel13.setForeground(new Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel13.setText("Your course choosing partner");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(170, 200, 420, 22);

        ErrorEmailFound.setFont(new Font("Arial", 0, 14));
        ErrorEmailFound.setForeground(new Color(255, 0, 0));
        jPanel2.add(ErrorEmailFound);
        ErrorEmailFound.setBounds(230, 450, 320, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(1100, 0, 820, 1160);

        setSize(new Dimension(1920, 1080));
        setLocationRelativeTo(null);
    }

    private void formWindowOpened(WindowEvent evt) {
        for (double i = 0.0; i <=1.0; i = i+0.1){
            String val = i+ "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    private void formMouseDragged(MouseEvent evt) {

    }

    private void formMousePressed(MouseEvent evt) {

    }

    private void LoginMouseClicked(MouseEvent evt) {

        Login l = new Login();
        l.setVisible(true);
        setVisible(false);
    }

    private void CreateActionPerformed(ActionEvent evt) {

        File dir = new File("/Data_ProjectCourseGuru");
        dir.mkdir();

        File txt = new File("/Data_ProjectCourseGuru/Student.txt");
        try {
            txt.createNewFile(); 
        } catch (IOException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileOutputStream oFile = new FileOutputStream(txt, false);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }

        String uname = Username.getText().toString();
        String uemail = Email.getText().toString();
        String pass = Password.getText().toString();

        ArrayList<String> address = new ArrayList<>();
        address.add(Email.getText().toString());

        for(String i : address){
            if (isValid(i))
            {
                FileWriter stud_fw = null;

                try {
                    stud_fw = new FileWriter("/Data_ProjectCourseGuru/Student.txt", true);
                    stud_fw.write(uname + " " + pass + " " +uemail +"\n\n");
                    stud_fw.close();
                    JOptionPane.showMessageDialog(null, "New ID has been created.");
                }
                catch (IOException ex) {
                    Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
            {
                ErrorEmailFound.setText("*Not a Valid Email Type");
            }
        }
    }

    private void showMouseClicked(MouseEvent evt) {
        Password.setEchoChar((char)8226);
        disable.setVisible(true);
        disable.setEnabled(true);
        show.setEnabled(false);
        show.setEnabled(false);
    }

    private void disableMouseClicked(MouseEvent evt) {
        Password.setEchoChar((char)0);
        disable.setVisible(false);
        disable.setEnabled(false);
        show.setEnabled(true);
        show.setEnabled(true);
    }

    private void UsernameActionPerformed(ActionEvent evt) {

    }

    private void ExitMouseClicked(MouseEvent evt) {
        System.exit(0);
    }

    public static void main(String args[]) {

       
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }


    private JButton Create;
    private JTextField Email;
    private JLabel ErrorEmailFound;
    private JLabel Exit;
    private JLabel Login;
    private JPasswordField Password;
    private JTextField Username;
    private JLabel disable;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JLabel show;

}
