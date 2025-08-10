public class hello{
    public static void main(String []args){
        int arr[]={12,45,88,47,77};
        int max=arr[0];
        for(int i=1;i<5;i++)
        {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }   
}