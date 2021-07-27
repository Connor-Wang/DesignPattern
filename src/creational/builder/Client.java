package creational.builder;

public class Client {
    public static void main(String[] args) {
        MyStringBuilder str = new MyStringBuilder();
        final int count = 26;
        for (int i = 0; i < count; i++) {
            str.append((char) ('a' + i));
        }
        System.out.println(str.toString());
    }
}
