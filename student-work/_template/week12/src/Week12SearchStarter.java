public class Week12SearchStarter {

    public static boolean contains(String[] items, String target) {
        for (String item : items) {
            if (item.equals(target)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] items = {"card", "deck", "hand"};
        System.out.println(contains(items, "deck"));
    }
}
