// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12969

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=b; i>0; i--){
            for(int j=a; j>0; j--){
            System.out.print("*");       
            }
            System.out.println("");
        }
    }
}