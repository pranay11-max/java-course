public class hash{
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        String name="jfdsflakdhhaopgjhkjhiuiuiu";
        int[] arr=new int [26];
        for(int i=0; i<name.length();i++){
            char ch = name.charAt(i);
            arr[ch-'a']++;
        }

        for(int j=0; j<26; j++){
            System.out.println(arr[j]);
        }

        

    }
}