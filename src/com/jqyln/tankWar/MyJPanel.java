package com.jqyln.tankWar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author xiaoxia
 * @create 2021/1/28 8:34 下午
 */
public class MyJPanel extends JPanel implements KeyListener {
    public Image image_mainView = Toolkit.getDefaultToolkit().getImage("image/mainView.jpeg");
    public Image image_mainRole = Toolkit.getDefaultToolkit().getImage("image/mainRole.jpeg");
    public int x = 0;
    public int y = 0;
//    public MyJPanel(){
//        Timer timer = new Timer();
//        timer.scheduleAtFixedRate(new TimerTask() {
//            @Override
//            public void run() {
//                repaint();
//            }
//        },0,50);
//
//    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image_mainView, x, y, this);
        g.drawImage(image_mainRole, 500, 50, this);
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keycode = e.getKeyCode();
        if (keycode == KeyEvent.VK_UP){
            y-=50;
        }else if (keycode == KeyEvent.VK_DOWN){
            y+=50;
        }else if (keycode == KeyEvent.VK_LEFT){
            x-=50;
        }else if (keycode == KeyEvent.VK_RIGHT){
            x+=50;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
