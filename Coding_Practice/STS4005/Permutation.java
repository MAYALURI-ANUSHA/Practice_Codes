public class Permutation {

    static void permutations(char[] ar,int fi){
        if(fi==ar.length){
            System.out.println(ar);
            return;
        }

        for(int i=fi;i<ar.length;i++){
            swap(ar,i,fi);
            permutations(ar, fi+1);
            swap(ar,i,fi);

        }
    }

    static void swap(char[] ar,int i,int fi){
        char temp = ar[fi];
        ar[fi]=ar[i];
        ar[i]= temp;
    }

    public static void main(String[] args) {
        String s="abc";
        permutations(s.toCharArray(), 0);
    }
}