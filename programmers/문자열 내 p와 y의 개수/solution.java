// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12916

import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        s = s.toLowerCase();
        String[] arr = s.split("");
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("p")) {
                p++;
            } else if (arr[i].equals("y")){
                y++;
            }
        }
        if(p != y){
            answer = false;
            return answer;
        }
        return answer;
    }
}