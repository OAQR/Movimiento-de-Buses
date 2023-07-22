/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.Utils;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.*;
import javax.swing.JList;
import javax.swing.ListModel;

public class PrintText implements Printable {

    private JList<String> jlist;

    public PrintText(JList<String> jlist) {
        this.jlist = jlist;
    }

    @Override
    public int print(Graphics g, PageFormat pf, int pageIndex) throws PrinterException {
        if (pageIndex > 0) {
            return NO_SUCH_PAGE;
        }

        Graphics2D g2d = (Graphics2D) g;

        int x = 50;
        int y = 50;
        int width = (int) (5.5 * 25);
        int height = (int) (10 * 20);

        Font font = new Font("Arial", Font.PLAIN, 10);
        g2d.setFont(font);

        StringBuilder sb = new StringBuilder();
        ListModel<String> model = jlist.getModel();
        int size = model.getSize();
        for (int i = 0; i < size; i++) {
            String item = model.getElementAt(i);
            sb.append(item);
            sb.append(System.lineSeparator()); // Agrega un salto de línea después de cada elemento
        }
        String text = sb.toString();

        String[] lines = text.split("\n");

        int lineHeight = g2d.getFontMetrics().getHeight();
        for (int i = 0; i < lines.length; i++) {
            int lineX = x + 5;
            int lineY = y + lineHeight * (i + 1);
            g2d.drawString(lines[i], lineX, lineY);
        }

        g2d.drawRect(x, y, width, height);

        return PAGE_EXISTS;
    }
}
