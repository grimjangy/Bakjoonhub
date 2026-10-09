class Solution {
    public int solution(int num1, int num2) {
        double divide = (double) num1 / num2;
        double calculate = divide * 1000;
        int answer = (int) calculate;
        return answer;
    }
}