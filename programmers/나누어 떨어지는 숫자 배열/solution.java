// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12910

import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int index = 0;
        int num=0;
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0){
            index++; 
            }
        }
        if(index == 0){
            int[] answer = {-1};
             return answer;
        }else {
        int[] answer = new int [index];
            for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0){
                answer[num] = arr[i];
                num++;
            }
          }
             return answer;
        }
       
    }
}