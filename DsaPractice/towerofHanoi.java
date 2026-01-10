// number of minimum steps (2^n -1)


public class towerofHanoi {

    public static void main(String[] args)
    {
        hanoi(3,'A','B','C');  //A to C via B.
    }

    private static void hanoi( int n, char a, char b, char c){
        if(n==0) return;  //base case

        hanoi(n-1, a, c, b);   // n-1 disks from a to b via c .         call

        System.out.println(a + "->"+ c);   // largest from a to c .     print

        hanoi(n-1, b, a, c);   // n-1 disks from b to c via a.          call
    }
    
}
