package timer;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;

public class RunMyTimer {
    public static void main(String[] arg){
        ActionListener listner = new MyTimer();

        //Построить таймер вызывающий прийомник событий каждые 10 сек
        Timer t = new Timer(1000, listner);
        t.start();

        JOptionPane.showMessageDialog(null, "Quit program ?");
        System.exit(0);
    }
}
