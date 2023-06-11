// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/68935

class Solution {
    public int solution(int n) {
        String reverse = "";
        String three = Integer.toString(n,3);
        for(int i=three.length()-1; i>=0; i--) {
            reverse += three.charAt(i);
        }
        int answer = Integer.parseInt(reverse, 3);
        return answer;
    }
}