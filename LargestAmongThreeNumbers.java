class Largest {
    public static void main(String[] args) {

        int a = 70;
        int b = 30;
        int c = 45;

        if (a > b && a >c) {
            System.out.println("Largest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest number is: " + b);
        } else {
            System.out.println("Largest number is: " + c);
        }
    }
}
