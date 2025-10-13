package Strings;

public class Program1 {
    public static void main(String[] args) {
        System.out.println(Skipapple("bbapplebc"));
    }


    static void skip(String P,String Up){

        if(Up.isEmpty()){
            System.out.println(P);
            return;
        }

        char ch1=Up.charAt(0);

        if(ch1=='a'){
            skip(P,Up.substring(1));
        }
        else{
            skip(P+ch1,Up.substring(1));
        }

    }

    static String Skipstring(String K){


        if(K.isEmpty()){
            return " ";
        }

        char ch1=K.charAt(0);

        if(ch1=='a'){
            return Skipstring(K.substring(1));
        }
        else{
           return ch1+Skipstring(K.substring(1));
        }
    }



    static String Skipapple(String M){


        if(M.isEmpty()){
            return " ";
        }



        if(M.startsWith("apple")){
            return Skipapple(M.substring(5));
        }
        else{
            return M.charAt(0)+Skipapple(M.substring(1));
        }
    }
}
