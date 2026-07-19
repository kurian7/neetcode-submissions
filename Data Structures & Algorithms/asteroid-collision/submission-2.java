class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> ast = new Stack<>();

        for(int a : asteroids){
          boolean destroyed = false;
          while( !ast.isEmpty() && ast.peek() > 0 && a < 0){
            if( Math.abs(a)> Math.abs(ast.peek())){
                ast.pop();
                continue;
            }
            else if( Math.abs(a) == Math.abs(ast.peek())){
                ast.pop();
            }
              destroyed = true;
              break;
          }
          if(!destroyed ){
            ast.push(a);
          }
        }
        int[] res = new int[ast.size()];
        for(int i = ast.size()-1; i>=0; i--){
            res[i] = ast.pop();
            
        }
        return res;
    }
}