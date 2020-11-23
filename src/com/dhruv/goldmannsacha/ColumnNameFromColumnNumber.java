package com.dhruv.goldmannsacha;

import java.util.HashMap;
import java.util.Map;

public class ColumnNameFromColumnNumber {

    static Map<Integer,Character> hMap = new HashMap<>();
    public static void main(String[] args) {
        hMap.put(1,'A');
        hMap.put(2,'B');
        hMap.put(3,'C');
        hMap.put(4,'D');
        hMap.put(5,'E');
        hMap.put(6,'F');
        hMap.put(7,'G');
        hMap.put(8,'H');
        hMap.put(9,'I');
        hMap.put(10,'J');
        hMap.put(11,'K');
        hMap.put(12,'L');
        hMap.put(13,'M');
        hMap.put(14,'N');
        hMap.put(15,'O');
        hMap.put(16,'P');
        hMap.put(17,'Q');
        hMap.put(18,'R');
        hMap.put(19,'S');
        hMap.put(20,'T');
        hMap.put(21,'U');
        hMap.put(22,'V');
        hMap.put(23,'W');
        hMap.put(24,'X');
        hMap.put(25,'Y');
        hMap.put(26,'Z');

        System.out.println(getColumnName(28));
        System.out.println(getColumnName(13));
    }

    public static String getColumnName(int number){
        if(number <= 26){
            return hMap.get(number).toString();
        }
        else{
         int numOfA = number/26;
         int character = number % 26;
         int i = 0;
         StringBuilder sb = new StringBuilder();
         while(i < numOfA){
             sb.append("A");
             i++;
         }

         return sb.append(hMap.get(character)).toString();
        }
    }
}
