package timer;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class MyTimer implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        System.out.print("Some text for testiong: " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}
