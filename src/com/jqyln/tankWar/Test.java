package com.jqyln.tankWar;

import javax.swing.*;

/**
 * @author xiaoxia
 * @create 2021/1/28 8:26 下午
 */
public class Test {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(1000, 1500);
        jFrame.setTitle("tank war");
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyJPanel myJPanel = new MyJPanel();
        jFrame.add(myJPanel);

        jFrame.addKeyListener(myJPanel);

        jFrame.setVisible(true);
    }
}
