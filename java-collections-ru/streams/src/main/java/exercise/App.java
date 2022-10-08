package exercise;

import java.util.List;

// BEGIN
class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        return emails.stream()
                .filter(email -> isFree(email))
                .count();
    }

    private static boolean isFree(String email) {
        List<String> freeEmails = List.of("@gmail.com", "@yandex.ru", "hotmail.com");

        return freeEmails.stream()
                .anyMatch(freeEmail -> email.contains(freeEmail));
    }
}
// END
