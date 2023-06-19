//Time complexity: O(log n) where n is th epower
//Space: O(1)

//Wasn't very intuitive because I had to read up on binary exponentiation but I did think we could solve it with log i.e. suqaring base and taking half of the exponent.

class Solution {
    public double myPow(double x, int n) {
        
        double out = 1.0;
        int pow = Math.abs(n);

        if (pow == 0) return out;
        while (pow > 0){
            if (pow % 2 == 1) out*=x;
            x = x*x;
            pow = pow/2;
        }
        return n<0 ? 1/out: out;


    /*Approach 2
        if (n == 0) return 1;
        if (n < 0) return 1 / myPow(x, -n);
        return x * myPow(x, n-1); */

      /*Approach 1

        double out = 1;
        if(n == 0) return out;

        else if(n > 0){
            for(int i=0; i < n ; i++){
                out*=x;
            }
            return out;
        }
        
        else {
            for(int i=0; i < -(n) ; i++){
                out*= 1/x;
            }
            return out;
        }
        */
    }
}
