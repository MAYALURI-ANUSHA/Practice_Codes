public class Leaders2 {
    public static void main(String[] args) {
        int arr[]=new int[]{16,17,4,3,2};
        int size=arr.length;
        for(int i=0;i<size;i++){
            int j;
            for(j=i+1;j<size;j++){
                if (arr[i]<=arr[j])
                break;
            }
        
        if(j==size)
        System.out.println(arr[i]+"");
    }
}}
