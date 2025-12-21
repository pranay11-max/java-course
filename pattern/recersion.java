public class recersion{

    static void recurr(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        recurr(n-1);
    }
    public static void main(String[] args) {
        recurr(10);

    }
}