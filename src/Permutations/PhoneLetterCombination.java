package Permutations;
import java.util.ArrayList;

public class PhoneLetterCombination {
    public static void main(String[] args) {
             // Permute("","12");
        ArrayList<String>ans=PermuteList("","12");
        System.out.println(ans);

    }

    static void Permute(String P,String Up){

        if(Up.isEmpty()){
            System.out.println(P);
            return;
        }

        int digit=Up.charAt(0)-'0';

        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch= (char)('a'+i);
            Permute(P+ch,Up.substring(1));
        }
    }

    static ArrayList<String>PermuteList(String P,String Up){

        if(Up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(P);
            return list;
        }

        int digit=Up.charAt(0)-'0';
        ArrayList<String>ans=new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch= (char)('a'+i);
            ans.addAll(PermuteList(P+ch,Up.substring(1)));
        }
return ans;

    }
}
