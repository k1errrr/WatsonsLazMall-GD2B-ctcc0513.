/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comprog2;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Huawei
 */
public abstract class Total{
    
    
    ArrayList<Double> price = new ArrayList<>();
    ArrayList<JButton> icons = new ArrayList<>();
    ArrayList<JLabel> labels = new ArrayList<>();

    abstract void display(JLabel[] bought, JLabel[] price, JLabel x);
}
