public class Week02VariablesStarter {

    public static void main(String[] args) {
        String name = "TODO";
        int age = 0;
        double gpa = 0.0;

        System.out.println("Student: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Years until next goal: " + ((4 - age % 4) % 4));
    }
}
