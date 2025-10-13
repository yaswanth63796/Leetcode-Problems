package Combinations;
import java.util.ArrayList;
import java.util.*;
public class Combination2 {
    public static void main(String[] args) {
        int[]arr={10,1,2,7,6,1,5};
        int target=8;
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        Arrays.sort(arr);
        findcombination(0,arr,target,ans,new ArrayList<>());
        System.out.println(ans);

         /*
         Expected output:[[1,1,6],[1,2,5],[1,7],[2,6]]
         dupliacte values not allowed only unique values is been allowed
          */


    }

    static void findcombination(int index,int[]arr,int target,ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>ds){



           if(target==0){
               ans.add(new ArrayList<>(ds));
               return;
           }


           for(int i=index;i<arr.length;i++){


               if(i>index && arr[i]==arr[i-1])continue;

               if(arr[i]>target)  break;

               ds.add(arr[i]);

               findcombination(i+1,arr,target-arr[i],ans,ds);

               ds.remove(ds.size()-1);
           }
    }


}
