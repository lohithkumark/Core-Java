public class Count {

    public static void main(String[] args) {
        int num = 124321;
        int count = 0 ;

        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("The total count is:" + count);
    }

}


