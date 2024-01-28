public class DemoSingleton {
    public static void main(String[] args) {
        System.out.println(
                new StringBuilder()
                        .append("If you see the same value, then singleton was reused")
                        .append("\n")
                        .append("If you see different values, then 2 singletons were created")
                        .append("\n\n")
                        .append("RESULT:")
                        .append("\n"));
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}