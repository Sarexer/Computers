import java.awt.*;
import java.awt.event.WindowEvent;

public class DialogAdapter extends java.awt.event.WindowAdapter {
    Frame frame;

    public DialogAdapter(Frame frame) {
        this.frame = frame;
    }

    @Override
    public void windowClosing(WindowEvent e) {
        frame.dispose();
    }
}
