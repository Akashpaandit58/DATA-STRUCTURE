
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash Pandit
 */


//to fetch value  we have two process

//iterartor
//whileloop
//enanchedd for loop
public class Democlass {
    public static void main(String args[])
    {
        Collection values=new ArrayList();
        values.add(3);
        values.add("akash");
        values.add(5.9f);
     //   Iterator i=values.iterator();
       // while(i.hasNext())
        //{
        //System.out.println(i.next());
        //}  
        
        
        for(Object i:values)
        {
            System.out.println(i);
        }
    }
    
    
}
