class Solution {
    private int sum(int n){
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum += digit*digit;
            n=n/10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
      Set<Integer> numbers = new HashSet<>();
      while(!numbers.contains(n)){
        numbers.add(n);
        n = sum(n);
        if(n == 1)
          return true;
      }    
      return false;
    }
}
