package com;

import javax.swing.*;
import java.awt.*;

//面板
public class GamePanel extends JPanel {
    //绘制面板，游戏由这个画笔来画
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);//清屏
        this.setBackground(Color.WHITE);
        //绘制静态面板
        Data.header.paintIcon(this, g, 25, 11);//头部图片
        g.fillRect(25, 75, 850, 600);//默认游戏界面
    }
}
