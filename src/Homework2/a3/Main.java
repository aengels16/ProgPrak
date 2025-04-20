package Homework2.a3;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        //Erstellen der neuen Mails
        Inbox inbox = new Inbox();
        inbox.addMail(new Mail("test1@gmail.com", "A", "Test Message von Message A."));
        inbox.addMail(new Mail("test2@gmail.com", "B", "Test Message von Message B."));
        inbox.addMail(new Mail("test3@gmail.com", "C", "Test Message von Message C."));

        //Erstellen einer gelesenen Mail
        Mail oldMail = new Mail("test4@gmail.com", "D", "Test Message von Message D.", LocalDateTime.of(2025, 04, 16, 11, 30));
        oldMail.markAsRead();
        inbox.addMail(oldMail);

        //Übersicht der Mails
        System.out.println("---Test Email Inbox---");
        inbox.printHeaders();

        //Anzahl ungelesener Mails
        System.out.println("\nUnread emails: " + inbox.countUnread());

        //Öffnen der 1. ungelesenen Mail
        System.out.println("\nOpening email 1:");
        inbox.open(0);

        //Öffnen einer nicht existierenden Mail
        System.out.println("\nOpening email 5 (invalid):");
        inbox.open(5); // Invalid index

        //Übersicht der Mails nach dem öffnen
        System.out.println("---Test Email Inbox---");
        inbox.printHeaders();

        //Anzahl der ungelesenen Mails nach dem Öffnen
        System.out.println("\nUnread emails after opening:");
        System.out.println(inbox.countUnread());
    }

}
