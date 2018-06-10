public class Test {
    public static void main(String[] args) {
        MultiArray multiArray = new MultiArray(3, 4);


        int max = multiArray.findMax();
        int min = multiArray.findMin();
        multiArray.print();
        System.out.println(max +" "+ min);
    }
}
