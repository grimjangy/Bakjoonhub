class Solution {
    public String solution(String code) {
        char[] codeC = code.toCharArray();
        StringBuilder ret = new StringBuilder();
        int mode = 0;
        for (int i = 0; i<code.length(); i++){
            if (codeC[i] == '1') { mode = 1; } else { mode = 0; }
            ret.append((mode == 0 && i % 2 == 0) ? codeC[i] : "");
            ret.append((mode == 1 && i % 2 == 1 && i != 0) ? codeC[i] : "");
        }
        
        String answer = String.valueOf(ret);
        return answer;
    }
}