package org.example.practice;

import java.util.Arrays;

public class CodePractice {
    public static void main(String[] args) {
        boolean ans = isPalindrome("madram");
        boolean ans2 = isPalindromeRec("samimas",0,"Samimas".length()-1);
        System.out.println(ans2);
        for(int i=1;i<=5;i++){
            System.out.println(fibonacci(i));
        }
        System.out.println(anagram("sami","maSi"));
        System.out.println(reverseString("samiksha Surawashi"));
    }
    public static boolean isPalindrome(String str){
        int left = 0, right = str.length() - 1;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++; right--;
        }
        return true;
    }
    public static boolean isPalindromeRec(String str,int left,int right){
        if(left>right){
            return true;
        }
        if(str.charAt(left)!=str.charAt(right)){
            return false;
        }
        return isPalindromeRec(str,left+1,right-1);
    }
    public static int fibonacci(int cnt){
        if(cnt<=1)return cnt;
        return fibonacci(cnt-1)+fibonacci(cnt-2); //0, 1, 1, 2, 3, 5, 8, 13
    }
    public static boolean anagram(String s1, String s2){
        s1 = s1.replaceAll("\\s","").toLowerCase();
        s2 = s2.replaceAll("\\s","").toLowerCase();
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();
        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);
        return Arrays.equals(s1Arr,s2Arr);
    }
    //reverse a string
    public static String reverseString(String str){
        //implementation without StringBuilder
        int i = 0,j = str.length()-1;
        char[] arr = new char[j+1];
        while(i<=j){
            arr[i]=str.charAt(j);
            arr[j]=str.charAt(i);
            i++;
            j--;
        }

        return  String.valueOf(arr);
    }
}
