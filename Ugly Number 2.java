/*
Write a program to find the n-th ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. 

Example:

Input: n = 10
Output: 12
Explanation: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.
*/

Solution :

class Solution {
    
    public int nthUglyNumber(int n) {
        if(n<=0)
            return 0;
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(1);
        int x=0;
        int y=0;
        int z=0;
        while(al.size()<n){
            int m1=al.get(x)*2;
            int m2=al.get(y)*3;
            int m3=al.get(z)*5;
            al.add(Math.min(m1,(Math.min(m2,m3))));
            if(Math.min(m1,(Math.min(m2,m3)))==m1) x++;
            if(Math.min(m1,(Math.min(m2,m3)))==m2) y++;
            if(Math.min(m1,(Math.min(m2,m3)))==m3) z++;
            
        }
        return al.get(al.size()-1);
    }
}
