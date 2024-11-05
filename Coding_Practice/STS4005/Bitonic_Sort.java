public class Bitonic_Sort{
    public static void main(String [] args){
        int arr[]=new int[]{20,4,60,6};
        
    }
    void BitonicSequence(int arr[],int l,int h,int Order){
        //Time Complexity of this method is O(logn)
        //Space complexity of this method is O(logn)
        if(h>1){
            int m=h/2;
        
        BitonicSequence(arr,l,m,0);
        BitonicSequence(arr, l+m, m,1);
        }
        BitonicSort(arr,l,h,Order);
    }
    void BitonicSort(int arr[],int l,int h,int Order){
        //Time complexity of this method is O(nlogn)
        //Space complexity of this method is O(nlogn)
        if(h>1){
            int m=h/2;
            for(int i=l;i<l+m;i++){
                BitonicSort(arr,l,m,Order);
                BitonicSort(arr,l+m,m,Order);
                if((arr[i]>arr[i+m]&&Order==0)||(arr[i]<arr[i+m]&&Order==1)){
                    int temp=arr[i];
                    arr[i]=arr[i+m];
                    arr[i+m]=temp;
                }
            }
        }

    }
}