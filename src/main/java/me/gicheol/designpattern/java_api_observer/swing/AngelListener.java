package me.gicheol.designpattern.java_api_observer.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AngelListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("안돼 분명 나중에 후회할 거야");
    }

}
