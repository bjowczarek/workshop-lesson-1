
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class HelloWorldApplication extends JFrame {
    static final long serialVersionUID = 1235567788L;
    
    public static void main(String[] args) {
        JLabel label;
        JFrame frame;
        // CHANGE HERE: Run application. Close it and change "Hello World Application"
        // with some other text.
        // ИЗМЕНИТЕ ЗДЕСЬ: Запустите программу. Закройте его и измените «Hello
        // WorldApplication» другим текстом.
        frame = new JFrame("Hello World Application");

        // CHANGE HERE: Run application. Close it and change "Hello World" with some
        // other text.
        // ИЗМЕНИТЕ ЗДЕСЬ: Запустите программу. Закройте его и измените «Hello World»
        // другим текстом.
        label = new JLabel("Hello World");
        /**********************************/
        
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        JPanel p = new JPanel();
        p.setBackground(Color.red);
        p.setLayout(new BorderLayout());
        p.add(label, BorderLayout.CENTER);
        frame.add(p);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}