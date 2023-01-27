public class task2 {
    public static void main(String[] args) {

    int[] arr = new int[] {1,1,1,0,0,1,1,0,1,1,1,1};
    int count = 0;
    int countMax = count;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 1){
            count++;
        }
        if (arr[i] != 1 || i == arr.length-1) {
            if (count > countMax) {
                countMax = count;
            }
            count = 0;
        }
    }
    System.out.println(countMax);       
    }
}        

