package Subset;

import java.util.ArrayList;
import java.util.List;

public class Subseqencesum {
    public static void main(String[] args) {

        int[]arr={3,5,6,7};
        int target=9;
        List<List<Integer>>ans=new ArrayList<>();
        subseq(0,arr,0,target,new ArrayList<>(),ans);
        System.out.println(ans);



    }

    static void subseq(int index, int[]arr, int sum, int target, List<Integer> ds,List<List<Integer>>ans){


        int n=arr.length;

        if(index==n){
            if(sum==target){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        ds.add(arr[index]);
        sum+=arr[index];
        subseq(index+1,arr,sum,target,ds,ans);
        ds.remove(ds.size()-1);
        sum-=arr[index];
        subseq(index+1,arr,sum,target,ds,ans);
    }
}
