import javafx.scene.Parent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by shaka on 20.02.2018.
 */
public class DialogInfo extends Dialog implements ActionListener {


    public DialogInfo(Frame parent, String title, String info){
        super(parent, title, false);

        setLayout(new FlowLayout());
        setSize(750,200);
        Button btn = new Button("OK");
        add(new Label(info));
        add(btn);
        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String idButton = e.getActionCommand();

        switch (idButton){
            case "OK":
                dispose();
                break;
        }
    }
}
