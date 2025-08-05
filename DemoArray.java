class ArrayExample {
    void array() {
        int[] ages = new int[3];
        float[] weights = new float[3];
        String[] names = {"Ken Mile", "Leo", "Veera"};

        ages[0] = 20;
        ages[1] = 22;
        ages[2] = 30;
        // ages[7] = 70; // out of bound
        weights[0] = 40.3f;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }
}

public class DemoArray {
    public static void main(String[] args) {
        ArrayExample obj1 = new ArrayExample();
        obj1.array();
    }
}
