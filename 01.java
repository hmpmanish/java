class Student {
    public static void main(String[] args) {

        System.out.println("---BIODATA---");
        System.out.println("NAME\t\t: MANISH PANDEY");
        System.out.println("AGE\t\t: 21");
        System.out.println("GENDER\t\t: M");
        System.out.println("CITY\t\t: GONDA");

        System.out.println("\n---Formatted Output---");

        String name = "Manish Pandey";
        int age = 30;
        String gender = "Male";

        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Gender: %s%n", gender);
    }
}
