import java.awt.*;
import java.awt.event.WindowEvent;

public class WindowAdapter extends java.awt.event.WindowAdapter {
    Frame frame;

    public WindowAdapter(Frame frame) {
        this.frame = frame;
    }

    @Override
    public void windowClosing(WindowEvent e) {
        frame.setVisible(false);
        System.exit(0);
    }
}
