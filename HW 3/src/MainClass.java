import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        String[] fruit = {"apple", "orange", "melon", "apple", "kiwi", "kiwi", "banana", "kiwi", "pear", "mango", "papaya"};
        HashMap<String, Integer> fetus = new HashMap<>();
        for (String x : fruit) {
            fetus.put(x, fetus.getOrDefault(x,0)+1);
        }
        System.out.println(fetus);

        // creaete book
        Phonebook book = new Phonebook();
        book.addContact("Sasha", "363487");
        book.addContact("Petya", "870977");
        book.addContact("Kolya", "544456");
        book.addContact("Roma", "877765");
        book.addContact("Lena", "877737");
        book.addContact("Nadya", "877733");

        // Search by name
        book.findAndPrint("Sasha");
        book.findAndPrint("Kolya");
        book.findAndPrint("Lena");

    }
}
