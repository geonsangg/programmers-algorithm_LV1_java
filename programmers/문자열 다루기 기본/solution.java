// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12918

class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        if(s.matches("[0-9]+")) {
            if(s.length()==4 || s.length()==6){
                answer = true;
            }
        }
        return answer;
    }
}