public class RevStr {

    public static void main(String[] args) {
        String word = "ABCD";
        String rev = "";

            int len = word.length();
            for(int i =len-1;i>=0;i--){
                rev = rev + word.charAt(i);
            }
        System.out.println(rev);
    }
}
