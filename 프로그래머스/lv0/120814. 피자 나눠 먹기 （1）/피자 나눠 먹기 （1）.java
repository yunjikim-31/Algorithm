class Solution {
    public int solution(int n) {
        int answer = 0;

        answer = (int) (Math.floor(n - 1) / 7) + 1;

        return answer;
    }
}