//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String S){
        // code here
        int len=0;
        String ans="";
        for(int i=0;i<S.length();i++){
            String curr = help(S,i,i);  //odd
            if(curr.length()>len){
                ans=curr;
                len=curr.length();
            }
            
            curr=help(S,i,i+1);  //even
            if(curr.length()>len){
                ans=curr;
                len=curr.length();
            }
        }
        return ans;
    }
    
    static String help(String S, int st, int end){
        int n=S.length();
        while(st>=0 && end<n){
            if(S.charAt(st)==S.charAt(end)){
                st--;
                end++;
            }
            else break;
        }
        return S.substring(st+1,end);
    }
}