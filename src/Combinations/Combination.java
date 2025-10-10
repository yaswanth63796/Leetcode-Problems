package Combinations;
import java.util.ArrayList;

public class Combination {
    public static void main(String[] args) {

          int[]arr1={2,3,6,7};
          int target=7;
     ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
             findcombination(0,arr1,target,ans,new ArrayList<Integer>());
        System.out.println(ans);



    }



    static void findcombination(int index,int[]arr,int target,ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>ds){

         if(index==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));

            }
            return;
        }


        if(arr[index]<=target){
            ds.add(arr[index]);
            findcombination(index,arr,target-arr[index],ans,ds);
            ds.remove(ds.size()-1);
        }

        findcombination(index+1,arr,target,ans,ds);



    }

}
