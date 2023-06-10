// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12906

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int index = 1;
        int idx = 1;
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] != arr[i+1]) {
                index++;
            }
        }
        int[] answer = new int [index];
        answer[0] = arr[0];
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] != arr[i+1]) {
                answer[idx] = arr[i+1];
                idx++;
            }
        }
        return answer;
    }
}