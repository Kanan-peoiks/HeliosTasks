package lesson20.smartEmailFilter;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Email> emails = List.of(
                new Email("Faktura gonderildi", false),
                new Email("Spam reklam",true),
                new Email("test mesaji", false)
        );

        EmailHandler handler = new EmailHandler();

        Predicate<Email> filter = e -> !e.isSpam() && e.getContent().contains("Faktura");

        Consumer<Email> action = e -> System.out.println("Muhasibatliga gonderildi: " +e.getContent());

        handler.processEmails(emails, filter, action);

    }
}
