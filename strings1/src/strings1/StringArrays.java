/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings1;

import java.util.Arrays;

/**
 *
 * @author Kishor
 */
public class StringArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[ ] aryString = new String[5] ;

    aryString[0] = "this";
    aryString[1] = "is";
    aryString[2] = "a";
    aryString[3] = "string";
    aryString[4] = "array";
    
    Arrays.sort(aryString);
    
    int i;
    for ( i=0; i < aryString.length; i++ ) {
    System.out.println( aryString[i] );
}
    }
    
}
