// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/82612

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long hop = 0;
        for(long i=1; i<=count; i++) {
            hop += (i*price);
            }
        if(hop > money) {
        answer = hop - money;
        }
        return answer;
    }
}