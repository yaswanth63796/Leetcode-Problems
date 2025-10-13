package Strings;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubsequenceString {
    public static void main(String[] args) {
        System.out.println(subseqrep("","abc"));
    }
    static void subseq(String P,String Up){

        if(Up.isEmpty()){
            System.out.println(P);
            return;
        }
     char ch1=Up.charAt(0);
        subseq(P+ch1,Up.substring(1));
        subseq(P,Up.substring(1));
    }

    static ArrayList<String>subseqrep(String P,String Up){

        if(Up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(P);
            return list;
        }

        char ch1=Up.charAt(0);
        ArrayList<String>left=subseqrep(P+ch1,Up.substring(1));
        ArrayList<String>right=subseqrep(P,Up.substring(1));
        left.addAll(right);
        return left;
    }
}
