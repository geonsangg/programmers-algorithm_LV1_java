// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12917

import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        for(String i:arr) {
            answer += i;
        }
        return answer;
    }
}