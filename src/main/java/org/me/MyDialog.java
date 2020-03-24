package org.me;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class MyDialog {
    private static JDialog d;
    MyDialog() {
        JFrame f= new JFrame();
        d = new JDialog(f, "My Dialog", true);
        d.setLayout(new FlowLayout());
        JButton b = new JButton("OK");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyDialog.d.setVisible(false);
                f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                System.exit(0);
            }
        });
        d.add(new JLabel("Click Button to close"));
        d.add(b);
        d.setSize(300,300);
        d.setVisible(true);
    }
}
