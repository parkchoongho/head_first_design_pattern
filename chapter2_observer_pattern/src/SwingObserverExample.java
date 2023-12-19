import javax.swing.*;

public class SwingObserverExample {
    JFrame frame;
    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        // Create and set up the frame
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        // Register anonymous listeners
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        // Set frame properties
    }
}
