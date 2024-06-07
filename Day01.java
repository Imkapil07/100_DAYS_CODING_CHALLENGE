//LeetCode 9  Palindrome Number 
public class Day01{
    public static void main(String[] args) {
       System.out.println(isPalindrome(12));
    } 
    public static boolean isPalindrome(int n){
        int x = n; 
        int rev=0;
        while(x>0){
         int mod = x % 10;
         rev = rev * 10 + mod;
         x=x/10;
        } 
        if(rev == n){
            return true;
        }
    return false;
    }
}
