package Homework2.a3;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Inbox {

    private ArrayList<Mail> mails = new ArrayList<>();

    public void addMail(Mail mail) {
        mails.add(mail);
    }

    //gibt die Kopfzeile der Mail formatiert aus
    public void printHeaders() {
        for (int i = 0; i < mails.size(); i++) {
            Mail mail = mails.get(i);
            String formattedDate = mail.getDatetime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
            String readStatus = mail.isRead() ? "READ" : "UNREAD";
            System.out.println((i + 1) + ": " + readStatus + " | " + mail.getSubject() + " | " + mail.getSender() + " | " + formattedDate);
        }
    }

    //öffnet die vollständige Mail mit dem angegebenen Index
    public void open(int index) {
        // Überprüfen, ob der Index gültig ist
        if (index < 0 || index >= mails.size()) {
            System.out.println("Invalid index: " + index);
            return;
        }
        Mail mail = mails.get(index);
        mail.printFullMail();
        mail.markAsRead();
    }

    //gibt die Anzahl der ungelesenen Mails zurück
    public int countUnread() {
        int count = 0;
        for (Mail mail : mails) {
            if (!mail.isRead()) count++;
        }
        return count;
    }
}
