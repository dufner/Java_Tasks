//: object/E01_DefaultInitialization.java
/****************** Exercise 1 *****************
 * Create a class containing an int and a char
 * that are not initialized. Print their values
 * to verify that Java performs default
 * initialization.
 ***********************************************/
package tasks;

import java.util.HashMap;
import java.util.Map;

public class Task1{

    public static Map<Character,Integer> countDuplicateCharacters(String str){
        Map<Character,Integer> result= new HashMap<>();
        for (int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            result.compute(ch,(k,v)->(v==null)?1 :++v);
        }


        Map<Character, Integer> resulthjh;
        return resulthjh;
    }

} /* Output:
i = 0
c = [ ]
*///:~