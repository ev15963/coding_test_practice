import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int solution(String[] drum) {
        int leng = drum.length;
        int dr = 0;
        int dc = 0;
        boolean checked = false;
        int count = 0;

        // 특수 기호에 따라 방향 이동
        for (int i = 0; i < leng; i++) {
            char[] strs = drum[i].toCharArray();
                if (strs[dr] == '#') {
                    dc += 1;
                } else if (strs[dr] == '>') {
                    dr += 1;
                } else if (strs[dr] == '<') {
                    dr -= 1;
                } else if (strs[dr] == '*' && !checked) {
                    checked = true;
                    dc += 1;
                }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        String[] drum = {"######", ">#*###", "####*#", "#<#>>#", ">#*#*<", "######"};
        
        System.out.println(solution(drum)); // to be 4
    }
}
