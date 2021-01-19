package LeetCode;

import java.util.HashMap;
import java.util.Map;

class Roman2Integer {

    public static void main(String[] args) {
        Roman2Integer ri = new Roman2Integer();


        System.out.println(ri.romanToInt("IV"));
    }

    public int romanToInt(String s) {
        
        Map<Character,Integer> map = new HashMap<>();
 
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum = 0;
        
        
  int current = map.get(s.charAt(0));
        for (int i=1; i< s.length(); i++)
        {
            int prev = map.get(s.charAt(i-1));
            current = map.get(s.charAt(i));
            
            if( prev  >= current){
                sum+=prev;
            } else{
                sum-=prev;
            }
        }
        sum+=current;
        
        return sum;
        
        
    }
    

}