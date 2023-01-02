import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start extends JFrame {

    public Start() {
        initComponents();
    }



    private void initComponents() {

        LoadingBar = new JProgressBar();
        jLabel3 = new JLabel();
        jLabel13 = new JLabel();
        LoadingValue = new JLabel();
        LoadingLabel = new JLabel();
        backgroundImage = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        LoadingBar.setBackground(new Color(255, 255, 255));
        LoadingBar.setForeground(new Color(0, 179, 0));
        getContentPane().add(LoadingBar);
        LoadingBar.setBounds(0, 420, 670, 20);

        jLabel3.setFont(new Font("Arial", 1, 48));
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("CourseGuru");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 80, 440, 100);

        jLabel13.setFont(new Font("Arial", 0, 18));
        jLabel13.setForeground(new Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel13.setText("Your course choosing partner");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(180, 160, 420, 22);

        LoadingValue.setFont(new Font("Arial", 0, 18));
        LoadingValue.setForeground(new Color(255, 255, 255));
        LoadingValue.setText("0%");
        getContentPane().add(LoadingValue);
        LoadingValue.setBounds(600, 390, 50, 22);

        LoadingLabel.setFont(new Font("Arial", 0, 18));
        LoadingLabel.setForeground(new Color(255, 255, 255));
        LoadingLabel.setText("Loading...");
        getContentPane().add(LoadingLabel);
        LoadingLabel.setBounds(10, 390, 470, 22);

        backgroundImage.setIcon(new ImageIcon(getClass().getResource("/icon/loadingPage.jpg")));
        backgroundImage.setMaximumSize(new Dimension(674, 450));
        backgroundImage.setMinimumSize(new Dimension(674, 450));
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(0, 0, 660, 440);

        setSize(new Dimension(658, 442));
        setLocationRelativeTo(null);
    }

    public static void main(String args[]) throws InterruptedException {

       
        Start l = new Start();
        l.setVisible(true);

            for(int i=0; i<=100; i++){
                Thread.sleep(70);
                l.LoadingValue.setText(i+"%");

                if(i==5){
                    l.LoadingLabel.setText("Staring Progress..");
                }
                else if(i==30){
                    l.LoadingLabel.setText("Searching Project CourseGuru Files..");
                }
                else if(i==50){
                    l.LoadingLabel.setText("Project Found...");
                }
                else if(i==70){
                    l.LoadingLabel.setText("Project Found...");
                }
                else if(i==90){
                    l.LoadingLabel.setText("Opening Project...");
                }
                else if(i==100){
                    l.setVisible(false);

                    Login l1 = new Login();
                    l1.setVisible(true);
                }

                l.LoadingBar.setValue(i);
            }
    }


    private JProgressBar LoadingBar;
    private JLabel LoadingLabel;
    private JLabel LoadingValue;
    private JLabel backgroundImage;
    private JLabel jLabel13;
    private JLabel jLabel3;

}
