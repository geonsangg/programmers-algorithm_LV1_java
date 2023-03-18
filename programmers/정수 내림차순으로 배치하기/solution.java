// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12933

import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String ss = "";
        String str = Long.toString(n);
        String[] arr = str.split("");
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0; i--){
            ss += arr[i];
        }
        answer = Long.parseLong(ss);
        return answer;
    }
}