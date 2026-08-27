public class Week11ClassDesignStarter {

    static class Course {
        private String name;
        private int credits;

        public Course(String name, int credits) {
            this.name = name;
            this.credits = credits;
        }

        public String summary() {
            return name + " (" + credits + " credits)";
        }
    }

    public static void main(String[] args) {
        Course one = new Course("Java 101", 3);
        Course two = new Course("Algorithms", 4);

        System.out.println(one.summary());
        System.out.println(two.summary());
    }
}
