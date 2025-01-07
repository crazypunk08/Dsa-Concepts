public class Advanced_Recursion {
    public static void main(String[] args) {
       String ans="";
        int  i=0;
        int lp=-1;
        int n=3;
        printBinary(ans, n, i, lp);
    }
    
    //Tilling Problem (Amazon) 
        //Given a "2*n" floor and tiles of size "2*1" count the no of ways to tile the given floor using the 2*1 tiles
        //(A tile can either be placed horizontally or vertically)
    public static int TP(int n){
        if(n==0 || n==1){
            return 1;
        }
        //Adding tile vertically
        int n1=TP(n-1);
        //Adding tile horizontally
        int n2=TP(n-2);
        return n1+n2;
    }

       // Length of a String using Recursion
    public static int len(String str, int i, int length) {
        if (i == str.length()) {
            return length;
        }
        return len(str, i + 1, length + 1);
    }

    //Remove Duplicates from  a String
    public static  void  rmdup(String s,String ans,int i,boolean[] arr){
        //base case
        if(s.length()==i){
            System.out.println(ans);
            return;
        }
        //kaam
        if(!arr[s.charAt(i)-'a']){
            ans+=s.charAt(i);
            arr[s.charAt(i)-'a']=true;
        }
        //Recursion
         rmdup(s,ans,i+1,arr);
    }

    //Friends pairing Problem
    //Given n friends ,each one can remain single or canbe paired up with some other friend .Each friend can 
    //friend can be paired only once.Find out the total number of ways in which friends can remain single or can be paired up
    public static int pair(int n){
        //base case
       if (n==0 || n==1) {
           return 1;
       }
        //kaam
        //choice to remain single
        int ans1=pair(n-1);
        //choice to pair up
        int ans2=(pair(n-2)) * (n-1);
        //Recursive call
        return ans1+ans2;
    }
    
    //Print all binary strings of size N without consecutive ones
    public static void printBinary(String ans, int n, int i, int lp) {
    // base case
    if (ans.length() == n) {
        System.out.println(ans);
        return;
    }
    // choice to place 0
    printBinary(ans + '0', n, i + 1, 0);
    // choice to place 1
    if (lp != 1) {
        printBinary(ans + '1', n, i + 1, 1);
    }
}

}
