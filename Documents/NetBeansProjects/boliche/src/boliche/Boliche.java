/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boliche;

import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class Boliche {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       bol b=new bol();
            
            //tiro 1, tiro 2, del intento x
            b.intento(10,0,1);
            b.intento(10,0,2);
            b.intento(10,0,3);
            b.intento(10,0,4);
            b.intento(10,0,5);
            b.intento(10,0,6);
            b.intento(10,0,7);
            b.intento(10,0,8);
            b.intento(10,0,9);
            b.intento10(10,10,10);
            
            
            for(int q=0;q<10;q++)
                System.out.println(b.total[q]);
            bol b1=new bol();
            //tiro 1, tiro 2, del intento x
            b1.intento(8,2,1);
            b1.intento(8,0,2);
            b1.intento(2,5,3);
            b1.intento(2,7,4);
            b1.intento(9,0,5);
            b1.intento(5,4,6);
            b1.intento(7,2,7);
            b1.intento(5,5,8);
            b1.intento(10,0,9);
            b1.intento10(7,3,9); 
            
            for(int q=0;q<10;q++)
                System.out.println(b1.total[q]);
            
    }
   
    
}
