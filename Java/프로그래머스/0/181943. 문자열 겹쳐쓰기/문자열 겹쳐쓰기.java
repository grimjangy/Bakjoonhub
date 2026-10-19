class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String begin = "";
        String last = "";
        begin = my_string.substring(0,s);
        last = my_string.substring(s+overwrite_string.length());
        return begin + overwrite_string + last;
    }
}