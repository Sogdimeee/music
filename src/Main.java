public class Main {
    public static void main(String[] args) {
        // Пример использования
        Genre genre1 = new Genre("Pop", "A genre characterized by catchy melodies and lyrics");
        Genre genre2 = new Genre("Rock", "A genre known for its strong guitar riffs and powerful vocals");
        Genre genre3 = new Genre("Jazz", "A genre featuring improvisation and complex harmonies");

        Author author1 = new Author("John", "Doe", 34, "USA");
        Author author2 = new Author("Jane", "Smith", 28, "UK");
        Author author3 = new Author("Carlos", "Gomez", 40, "Spain");

        Music music1 = new Music("Hit Song", author1, genre1, 200, 2.99, 2021, "A hit song loved by millions");
        Music music2 = new Music("Rock Anthem", author2, genre2, 240, 3.49, 2019, "A powerful anthem for rock enthusiasts");
        Music music3 = new Music("Smooth Jazz", author3, genre3, 300, 4.99, 2020, "A relaxing piece for jazz lovers");

        User user1 = new User("Alice", 20, "alice@example.com", "Premium");
        User user2 = new User("Bob", 15, "bob@example.com", "Basic");
        User user3 = new User("Charlie", 50, "charlie@example.com", "Premium");

        System.out.println(music1);
        System.out.println(music2);
        System.out.println(music3);

        user1.listenMusic(music1);
        user2.listenMusic(music2);
        user3.listenMusic(music3);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        System.out.println("Listens: " + music1.getListens());
        System.out.println("Listens: " + music2.getListens());
        System.out.println("Listens: " + music3.getListens());
    }
}
