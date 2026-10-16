import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] sepStr = a.toCharArray();
        for(int i = 0; i < sepStr.length; i++){
            System.out.println(sepStr[i]);
        }
        
    }
}