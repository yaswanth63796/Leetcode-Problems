package Subset;

import java.util.ArrayList;
import java.util.List;

public class Subsetprogram {
    public static void main(String[] args) {
          int[]arr={1,2,3,5};
          List<List<Integer>>ans=new ArrayList<>();
        subsetm(0,arr,new ArrayList<>(),ans);

        System.out.println(ans);

    }

    static void subsetm(int index, int[]arr, List<Integer> ds,List<List<Integer>>ans){



        if(index>=arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        ds.add(arr[index]);
        subsetm(index+1,arr,ds,ans);
        ds.remove(ds.size()-1);
        subsetm(index+1,arr,ds,ans);

    }
}
