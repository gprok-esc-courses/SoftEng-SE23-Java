package c_observer_pattern;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Window extends JFrame {

    private JTextField field;
    private JButton button;
    List<ClickButtonObserver> observers;

    public Window() {
        observers = new ArrayList<>();
        field = new JTextField();
        add(field, BorderLayout.CENTER);
        button = new JButton("Click");
        add(button, BorderLayout.SOUTH);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = field.getText();
                for(ClickButtonObserver observer : observers) {
                    observer.act(str);
                }
            }
        });

        setSize(400, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void addClickButtonObserver(ClickButtonObserver observer) {
        observers.add(observer);
    }

    public static void main(String[] args) {
        Window w = new Window();
        w.addClickButtonObserver(new DBAction());
        w.addClickButtonObserver(new LogAction());
        w.addClickButtonObserver(new EmailAction());
    }
}
