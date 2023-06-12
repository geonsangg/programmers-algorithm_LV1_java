// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12982

import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int hop = 0;
        Arrays.sort(d);
        for(int i=0; i<d.length; i++) {
            hop += d[i];
            if(hop > budget) {
                break;
            }
            answer++;
        }
        return answer;
    }
}