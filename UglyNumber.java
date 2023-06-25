//Time Complexity: O(log N) --->when dividing an integer x by y, there can be at most log x (base y) ops. So atmost log N(base 2) + log N(base 3) + log N(base 5) i.e log N complexity
//Space: O(1)
class Solution {
    public boolean isUgly(int n) {
        if(n <= 0)
            return false;
        
        for(int factor: new int[] {2, 3, 5})
            while(n % factor == 0)
                n = n / factor;
        return n == 1; // 1 is an ugly number
    }
}
