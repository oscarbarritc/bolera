/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boliche;

/**
 *
 * @author oscar
 */
public class bol 
{   
    int[]total=new int[10];
    int tiro1,tiro2,tiro3,intento;
    boolean chuza=false,spare=false,chuza2=false;
    
    
     public void intento(int tiro1, int tiro2,int intento)
    { //validar los numeros del tiro1 y tiro2
        if(tiro1+tiro2>10)
        {
            System.out.println("ERROR");
            System.exit(0);
        }
        
        intento=intento-1;
        
        total[intento]=tiro1+tiro2;
        if(intento>0)
            total[intento]=total[intento-1]+tiro1+tiro2;
        
        if(chuza2)
            {
                total[intento-2]=total[intento-2]+tiro1;
                total[intento-1]=total[intento-1]+tiro1+tiro2+tiro1;
                total[intento]=total[intento-1]+tiro1+tiro2;
                if(tiro1!=10)
                    chuza2=false;
                
            }else
                if(chuza)
                {
                    total[intento-1]=total[intento-1]+tiro1+tiro2;
                    total[intento]=tiro1+tiro2+total[intento-1];
                    if(tiro1==10)
                    {
                        chuza2=true;
                    }
                    chuza=false;
                }else
                    if(spare)
                    {
                        total[intento-1]=total[intento-1]+tiro1;
                        total[intento]=tiro1+tiro2+total[intento-1];
                        spare=false;
                    }
        
        chuza=false;
        if(tiro1==10)
        {
            chuza=true;
        }else    
            if(tiro1+tiro2==10)
                spare=true;
    }
    
    public void intento10(int tiro1, int tiro2,int tiro3)
    {
        if(chuza2)
        {
            total[7]=total[7]+tiro1;
            total[8]=total[8]+tiro1+tiro2+tiro1;
        }else
            if(chuza)
            {
                total[8]=total[8]+tiro1+tiro2;
            }
        if(tiro1+tiro2>=10)
        {
            total[9]=total[8]+tiro1+tiro2+tiro3;
        }else
            total[9]=total[8]+tiro1+tiro2;
    }
}
