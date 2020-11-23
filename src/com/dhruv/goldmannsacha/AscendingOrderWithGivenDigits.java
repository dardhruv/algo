package com.dhruv.goldmannsacha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AscendingOrderWithGivenDigits {

    // print all the number containing 1,2,3 in any order
    private static String printNumbers(int[] numbers){

        List<Integer> array = new ArrayList<>();
        for(int number:numbers) {

            // check if number contains 1,2 & 3 in any order
            if (findContainsOneTwoThree(number)) {
                array.add(number);
            }
        }

            Collections.sort(array);

            StringBuffer strbuf = new StringBuffer();
            Iterator<Integer> it = array.iterator();
            while(it.hasNext()){

                int value = it.next();
                if(strbuf.length() > 0){
                    strbuf.append(", ");
                }
                strbuf.append(Integer.toString(value));
            }
            return (strbuf.length() > 0) ? strbuf.toString(): "-1";
        }

        private static boolean findContainsOneTwoThree(int number){
        String str = Integer.toString(number);
        return str.contains("1") && str.contains("2") && str.contains("3");
        }


}
