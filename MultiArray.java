class MultiDimention {
    void mDA() {
        int[][] arr = new int[5][3];
        int[][] arr_2 = {{2, 3, 4}, {5, 6, 7}, {8, 9, 10}};

        System.out.println(arr_2[0][0]); //2
        System.out.println(arr_2[0][1]); // 3
        System.out.println(arr_2[0][2]); //4
    }
}

public class MultiArray {
    public static void main(String[] args) {
        MultiDimention obj1 = new MultiDimention();
        obj1.mDA();
    }
}
