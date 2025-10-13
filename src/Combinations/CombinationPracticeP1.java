package Combinations;
import java.util.ArrayList;
public class CombinationPracticeP1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();

        int[]arr1={2,3,6,7};
        int target=7;
        findcombinations(0,arr1,target,ans,new ArrayList<>());
        System.out.println(ans);



    }
    static void findcombinations(int index,int[]arr,int target,ArrayList<ArrayList<Integer>>ans, ArrayList<Integer>ds){


        if(index==arr.length){
            if(target==0){
                 ans.add(new ArrayList<>(ds));


            }
            return;
        }


        if(arr[index]<=target){
            ds.add(arr[index]);
            findcombinations(index,arr,target-arr[index],ans,ds);
            ds.remove(ds.size()-1);

        }
        findcombinations(index+1,arr,target,ans,ds);


    }
}
