package Permutations;
//sieve of sundaram algorithm
public class Sieveofsundaram {
    public static void main(String[] args) {
             int n=20;

             int a=(n-1)/2;

             boolean []marked=new boolean[a+1];

             for(int i=1;i<=a;i++){
                 for(int j=1;i+j+2*i*j<=a;j++){
                     marked[i+j+2*i*j]=true;
                 }
             }


             if(n>2){
                 System.out.print("2"+" ");
             }
             for(int k=1;k<=a;k++){
                 if(!marked[k]){
                     System.out.print(2*k+1+" ");
                 }
             }
    }
}
