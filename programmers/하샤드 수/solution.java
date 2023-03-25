// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12947

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num = 0;
        String str = Integer.toString(x);
        for(int i=0; i<str.length(); i++) {
            num += str.charAt(i) - '0';
        }
        if(x % num != 0){
            answer = false;
        }
        return answer;
    }
}