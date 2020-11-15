import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        int[] test;
        int i,j;
        String[] str = new String[numbers.length];
        
        for(i = 0; i < numbers.length; i++) {
            str[i] = Integer.toString(numbers[i]);
            
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2+s1).compareTo(s1+s2);
            }
        });
        if (str[0].equals("0")) {
            return "0";
        }
        for (i = 0; i < str.length; i++) {
            answer = (answer + str[i]);
        }
        return answer;
    }
}