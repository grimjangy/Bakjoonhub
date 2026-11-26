class Solution {
    public int solution(int[] num_list) {
        String even = "";
        String odd = "";
        for(int n : num_list){
            if(n % 2 == 0){even += ""+n;}
            else {odd += n;}
        }
        int answer = Integer.parseInt(odd) + Integer.parseInt(even);
        return answer;
    }
}