import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder strBuild = new StringBuilder();
        
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i)))
            {strBuild.append(Character.toLowerCase(str.charAt(i)));}
            else if(Character.isLowerCase(str.charAt(i)))
            {strBuild.append(Character.toUpperCase(str.charAt(i)));}
            else {strBuild.append(str.charAt(i));}}
                
    str = strBuild.toString();
    System.out.println(str);
    }
}