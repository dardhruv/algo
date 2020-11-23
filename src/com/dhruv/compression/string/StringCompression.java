package com.dhruv.compression.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringCompression {

    public static void main(String[] args) {
        String str = "wwwwaaadexxxxx";
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        int i = 0;
        List<Object> result = new ArrayList<>();
 //       StringBuilder res = null;
        int currentCharCount = 0;
   //     res.append(str.charAt(0));
        // result.add(str.charAt(0));
        while(i < str.length()){
              Character ch = str.charAt(i);
            if(i > 0 && str.charAt(i-1) == ch){
                currentCharCount ++;
            }else if (i > 0 && str.charAt(i-1) != ch){
                // why it did not give compilation error
                if(currentCharCount > 1) result.add(currentCharCount);
                currentCharCount = 1;
                result.add(ch);
            }else{
                result.add(ch);
                currentCharCount++;
            }
            i++;
        }
        result.add(currentCharCount);
        for (Object character : result) {
            System.out.print(character);
        }
        System.out.println(result.size());
    }
}
