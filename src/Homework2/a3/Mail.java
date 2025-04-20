package Homework2.a3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mail {

    // Attributes
    private String sender;
    private String subject;
    private String message;
    private LocalDateTime datetime;
    private boolean isRead;

    // Konstruktor für Mails mit aktuellem Zeitpunkt
    public Mail(String sender, String subject, String message) {
        this.sender = sender;
        this.subject = subject;
        this.message = message;
        this.datetime = LocalDateTime.now();
        this.isRead = false;
    }

    // Zusätzlicher Konstruktor für Mails mit spezifischem Zeitpunkt
    public Mail(String sender, String subject, String message, LocalDateTime datetime) {
        this.sender = sender;
        this.subject = subject;
        this.message = message;
        this.datetime = datetime;
        this.isRead = false;
    }

    //Mail als gelesen makieren
    public void markAsRead() {
        this.isRead = true;
    }

    //gibt die vollständige Mail formatiert aus
    public void printFullMail() {
        String formattedDate = datetime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        System.out.println(subject + " from " + sender + " on " + formattedDate + ": " + message);
    }

    // Getter-Methoden
    public String getSender() {
        return sender;
    }

    public String getSubject() {
        return subject;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public boolean isRead() {
        return isRead;
    }

}

