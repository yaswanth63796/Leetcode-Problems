package Permutations;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class StringProgram1 {
    public static void main(String[] args) {

        //Permute("","abc");
        ArrayList<String>ans=PermuteList("","abc");
        System.out.println(ans);
   }

    static void Permute(String P,String Up){
        if(Up.isEmpty()){
            System.out.println(P);
            return;
        }

        for(int i=0;i<=P.length();i++){

            char ch=Up.charAt(0);
            String f=P.substring(0,i);
            String s=P.substring(i,P.length());
            Permute(f+ch+s,Up.substring(1));

        }
    }

    static ArrayList<String>PermuteList(String P,String Up){

        if(Up.isEmpty()){

            ArrayList<String>list=new ArrayList<>();
            list.add(P);
            return list;
        }
        ArrayList<String>ans=new ArrayList<>();

        for(int i=0;i<=P.length();i++){


            char ch=Up.charAt(0);

            String f=P.substring(0,i);
            String s=P.substring(i,P.length());
            ans.addAll(PermuteList(f+ch+s,Up.substring(1)));

        }
return ans;

    }
}
