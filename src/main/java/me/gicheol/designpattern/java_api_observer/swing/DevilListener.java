package me.gicheol.designpattern.java_api_observer.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DevilListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("당연하지 그냥 저질러 버려!");
    }

}
