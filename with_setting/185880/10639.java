import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int solution(String[] drum) {
        int leng = drum.length;
        int count = 0;

        for (int i = 0; i < leng; i++) {
            boolean checked = false;
            int dr = 0;
            int dc = i;
            while (dr < leng) {
                if (dc < 0 || dc >= leng) {
                    break;
                }
                
                char currentChar = drum[dr].charAt(dc);
                if (currentChar == '#') {
                    dr++;
                } else if (currentChar == '>') {
                    dc++;
                } else if (currentChar == '<') {
                    dc--;
                } else if (currentChar == '*') {
                    if (!checked) {
                        checked = true;
                        dr++;
                    } else {
                        break;
                    }
                }

            }
            // 끝까지 도달하였으면 count 추가
            if (dr == leng) {
                count++;
            }
        }

        return count;
    }
    
    public static void main(String[] args) {
        String[] drum = {"######", ">#*###", "####*#", "#<#>>#", ">#*#*<", "######"};
        
        System.out.println(solution(drum)); // to be 4
    }
}
