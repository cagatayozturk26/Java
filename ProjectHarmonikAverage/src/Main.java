public class Main {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        double harmonik = 0.0;
        for( int i = 0; i < numbers.length; i++){
            harmonik += 1.0/numbers[i];
        }
        System.out.println(harmonik);
    }
}