/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comprog2;

import javax.swing.JButton;
import javax.swing.JLabel;



/**
 *
 * @author Huawei
 */
public class Constants extends Total{
    
    static int limit = 10;
    static JLabel stack[] = new JLabel[limit];
    static int top = -1;
    static History h = new History();
    

    void display(JLabel[] bought, JLabel[] price, JLabel x){
        
       Receipt r = new Receipt();
       Watsons w = new Watsons();
       
       for (int i = 0; i < bought.length; i++){
       if(bought[i] != null){
           
           r.icons[i].setIcon(bought[i].getIcon());
           r.icons[i].setText(bought[i].getText());
           r.labels[i].setText(price[i].getText());
           r.getjLabel22().setText(x.getText());
       }
       }
       r.setVisible(true);
       //w.dispose();
    }
    
        void clear(JLabel[] bought, JLabel[] price, JLabel x){
        
       Receipt r = new Receipt();
       Watsons w = new Watsons();
       AddToCart add = new AddToCart();
       
       
       for (int i = 0; i < bought.length; i++){
       if(bought[i] != null){
           
           r.icons[i].setIcon(null);
           r.icons[i].setText(null);
           r.labels[i].setText(null);
           r.getjLabel22().setText("0");
       }
       }
       //w.dispose();
    }
        
    int hasBought(boolean bought){
        
         int timesBought = 0;
         
         if(bought){
             
             timesBought += 1;
         }
         return timesBought;
    }
    
     static boolean isEmpty(){
        
        return top == -1;
    }
    
    static boolean isFull(){
        
        return top == limit - 1;
    }
    
    
        static void push(JLabel data[]){
        
        if(isFull()){
            
            System.out.println("STACK OVERFLOW!");
        }
        else{
        for(int i = 0; data[i] != null; i++){
        top++;
        stack[top] = data[i];
        }
        System.out.println(top);
        
       
        }
    }
    
    static void pop(Constants c){
        
        if(isEmpty()){
            System.out.println("STACK UNDERFLOW!");
        }
        else{
        stack[top] = null;
        //stack[top] = 0;
        top--;
        }
        
    }
        
    
        
        static void display1(History h){
        
        if(isEmpty()){
            
            System.out.println("STACK UNDERFLOW");
        }
        else{
            
    for (int i = top; i >= 0; i--) {
        if (i < h.labels.length && stack[i] != null) { // Ensure no out-of-bounds access
            h.labels[i].setText(stack[i].getText());
        }
    }
}
}
}
        
