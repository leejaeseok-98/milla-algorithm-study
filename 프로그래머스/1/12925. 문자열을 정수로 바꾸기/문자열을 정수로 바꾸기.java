class Solution {
    public int solution(String s) {
        int answer = 0;
        char a = s.charAt(0);
        int b = 0;
        if(a == '-'){
            b = Integer.parseInt(s.substring(1));
            answer = b - 2*b;
        } else{
            b = Integer.parseInt(s);
            answer = b;
        }
        return answer;
    }
}