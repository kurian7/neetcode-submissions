class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
          return false;
     int t =0; 
     int num = x;
     while(num !=0){
       t = t*10 + num%10;
       num = num/10;
     }
     if(t!=x)
       return false;
    return true;
     }   
}