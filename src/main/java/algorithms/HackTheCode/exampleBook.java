package algorithms.HackTheCode;

public class exampleBook {

    public static void main(String[] args) {
        int example = 25;
        String example2 = "abbbaabcddefffg";
        System.out.println(pairSumSequence(example));
        countChange(example2);

    }

    //Example One
    //Prints out 325 from example of n = 25
    public static int sum(int n){
        if(n <= 0){
            return 0;
        }
        return n + sum(n - 1);

    }

    //Example Two
    public static int pairSumSequence(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += pairSum(i, i + 1);
        }
        return sum;
    }

    public static int pairSum(int a, int b){
        return a + b;
    }

    private static void countChange(String str){
        int count = 0;
        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == str.charAt(i + 1)){
                count++;
            }
        }
        System.out.println(count);
    }

}
