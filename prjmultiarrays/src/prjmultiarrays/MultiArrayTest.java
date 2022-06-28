/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjmultiarrays;

import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Kishor
 */
public class MultiArrayTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ArrayList listTest = new ArrayList( );
        
        listTest.add( "first item" );
        listTest.add( "second item" );
        listTest.add( "third item" );
        listTest.add( 7 );
        
        //listTest.get( 3 );
        //listTest.remove(2);
        
        
        Iterator it = listTest.iterator( );
        
        while ( it.hasNext( ) ) {
        System.out.println( it.next( ) );
        }
        
        // Rmeove an Item From the List
        
        listTest.remove("second item");
        
        //Print Out the New List
        
        System.out.println("Whole list =" + listTest);
        
        //Get the item at index Position 1
        System.out.println("Position 1= " + listTest.get(0));
    }
    
}
