// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/87389

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=n; i>0; i--) {
            if(n%i == 1){
                answer = i;
            }
        }
        return answer;
    }
}