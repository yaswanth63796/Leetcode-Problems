package Subset;

import java.util.ArrayList;
import java.util.List;

public class Subsetarray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        List<List<Integer>>ans=new ArrayList<>();
        subprint(0,arr,new ArrayList<>(),ans);
        System.out.println(ans);
    }

    static void subprint(int index, int[]arr, List<Integer> ds,List<List<Integer>>ans){

         if(index>=arr.length){
             ans.add(new ArrayList<Integer>(ds));
             return;
         }

        ds.add(arr[index]);
        subprint(index+1,arr,ds,ans);
        ds.remove(ds.size()-1);
        subprint(index+1,arr,ds,ans);
    }
}
