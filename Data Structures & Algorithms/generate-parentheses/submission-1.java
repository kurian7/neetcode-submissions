class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder stck = new StringBuilder();
        backtrack(result, stck, 0, 0, n);
        return result;
    }
    private static void backtrack(List<String> res,StringBuilder stck, int open, int close, int n){
        if(stck.length() == 2*n){
            res.add(stck.toString());
            return;
        }
        if(open != n){
            stck.append('(');
            backtrack(res, stck, open+1, close, n);
            stck.deleteCharAt(stck.length()-1);
        }
        if(close<open){
            stck.append(')');
            backtrack(res, stck, open, close+1, n);
            stck.deleteCharAt(stck.length()-1);
        }
    }
}
