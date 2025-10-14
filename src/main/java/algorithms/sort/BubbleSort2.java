package algorithms.sort;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] test1 = {3, 5, 7, 2, 1, 2};
        bubbleSort(test1);
    }

    public static void bubbleSort(int[] n){
        for(int i = 0; i < n.length -1; i++){
            for(int j = 1; j < n.length - i; j++){
                if(n[j - 1] > n[j]){
                    int temp = n[j - 1];
                    n[j - 1] = n[j];
                    n[j] = temp;

                }

            }
        }

        for(int k : n){
            System.out.println(k);
        }

    }
    
}
