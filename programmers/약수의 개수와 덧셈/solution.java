// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/77884

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i=left; i<=right; i++) {
            int index = 0;
            for(int j=1; j<=i; j++) {
                if(i%j == 0) {
                    index++;
                }                
            }
            if(index % 2 == 0){
                    answer += i;
                }else {
                    answer -= i;
                }
        }
        return answer;
    }
}