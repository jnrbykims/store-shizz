/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.store;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author JAM PC
 */
public class Store {

    public static void main(String[] args) {
         Map m = new HashMap();
        JOptionPane.showMessageDialog(null, "Hi mhiema!");
        JOptionPane.showMessageDialog(null, "▬▬ι═══════ﺤ");
        JOptionPane.showMessageDialog(null, "⁽⁽(੭ꐦ •̀Д•́ )੭*⁾⁾");
        JOptionPane.showMessageDialog(null, "╭∩╮( •̀_•́ )╭∩╮");
        JOptionPane.showMessageDialog(null, "( -_•)╦̵̵̿╤─");
        JOptionPane.showMessageDialog(null, "(ง'̀-'́)ง");
        m.put("bracelet", 15);
        m.put("headband", 10);
        m.put("earings", 20);
        m.put("necklace", 25);
        m.put("ring", 30);
        String [] i = {"bracelet","headband","earings","necklace","ring"};
        String[] y = {" ", " ", " "};
        float[] x = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] w = {0};
        do {
            x[5] = 0;
            x[1] = 0;
            x[3] = 0;
            x[4] = 0;
            do {

                y[0] = JOptionPane.showInputDialog("bracelet    :15 " + "\n" + "headband     :10 " + "\n" + "earings   :20 " + "\n" + "necklace  :25 " + "\n" + "ring     :30 " + "\n" + "unsa man imo beh");
                if (m.containsKey(y[0])) {
                    float z = (int) m.get(y[0]);

                    y[2] = JOptionPane.showInputDialog("how many?");
                    x[2] = Float.parseFloat(y[2]);
                    x[3] = z * x[2];
                    x[1] = x[2] + x[0];
                    x[5] = x[3] + x[4];
                    JOptionPane.showMessageDialog(null, "total is " + x[5]);
                    x[4] = x[5];
                    x[0] = x[2];
                    while (true) {

                        y[1] = JOptionPane.showInputDialog("buy paka or dili na?" + "\n" + "[buy] or [dili]");
                        if (y[1].equals("buy") || y[1].equals("dili")) {
                            break;
                        }
                    }
                }
            } while (y[1].equals("buy"));
            if (y[1].equals("dili")) {
                if (x[1] >= 10 && x[1] < 20) {
                    JOptionPane.showMessageDialog(null, "kay " + x[1] + " man kabuok imong item gipalit naa kay libre nga freebie na panyo!");
                } else if (x[1] >= 20) {
                    System.out.println("kay " + x[1] + " man kabuok imong item gipalit naa kay libre freebie na paypay!");
                }

                JOptionPane.showMessageDialog(null, "Ang imo bayronon kay " + x[4]);
                do {
                    y[2] = JOptionPane.showInputDialog("kay 2023 naman ron naa mi discount slayyy pick number 0 to 3");
                    w[0] = Integer.parseInt(y[2]);
                    switch (w[0]) {

                        case 3:
                            JOptionPane.showMessageDialog(null, "naa kay 10% discount");
                            x[5] = (float) (x[5] * 0.90);
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "naa kay 20% discount");
                            x[5] =  (float) (x[5] * 0.80);
                            break;
                        case 1:
                            JOptionPane.showMessageDialog(null, "naa kay 30% discount");
                            x[5] =  (float) (x[5] * 0.70);
                            break;
                        case 0:
                            JOptionPane.showMessageDialog(null, "wala kay discount");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "wa sa choices na number imo gipili oy duh");
                            x[9] = 1;
                            break;
                    }
                } while (x[9]==1);

                JOptionPane.showMessageDialog(null, "ang imo bayronon kay " + x[5]);
                y[2] = JOptionPane.showInputDialog("palihog butang sa imo bayad");
                x[6] = Float.parseFloat(y[2]);
                do {
                    if (x[6] < x[5]) {
                        x[7] = (x[5] - x[6]);
                        JOptionPane.showMessageDialog(null, "kulang man imo gi bayad ang kulang kay: " + x[7]);
                        y[2] = JOptionPane.showInputDialog("palihog ko dungag");
                        float dungag = Float.parseFloat(y[2]);
                        x[6] = x[6] + dungag;
                    }
                } while (x[6] < x[5]);
                if (x[6] >= x[5]) {
                    float kambyo = (x[6] - x[5]);
                    JOptionPane.showMessageDialog(null, "imo kambyo kay " + kambyo);
                    y[2] = JOptionPane.showInputDialog("For the next customer press 1");
                    x[2] = Float.parseFloat(y[2]);
                }

            }
        } while (x[2] == 1);
    }

}
    

