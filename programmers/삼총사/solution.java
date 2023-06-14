// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/131705

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i=0; i<number.length-2; i++) {
            for(int j=i+1; j<number.length-1; j++){
                for(int n=j+1; n<number.length; n++) {
                    if(0 == number[i] + number[j] + number[n]) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}