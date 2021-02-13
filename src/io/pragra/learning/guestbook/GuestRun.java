package io.pragra.learning.guestbook;

public class GuestRun {
    public static void main(String[] args) {
        GuestBook  book = new GuestBook();
        try {
            book.add(new Guest("Hsah", "h"));
            book.add(new Guest("Hsah", "h"));
            book.add(new Guest("Hsah", "h"));
            book.add(new Guest("Hsah", "h"));
            book.add(new Guest("Hsah", "h"));
            book.add(new Guest("Hsah", "h"));
            book.add(new Guest("Hsah", "h"));
            book.add(new Guest("Hsah", "h"));
            book.add(new Guest("Hsah", "h"));
            book.add(new Guest("Hsah", "h"));
            book.add(new Guest("Hsah", "h"));
            book.add(new Guest("Hsah", "h"));
            book.add(new Guest("Hsah", "h"));
            book.add(new Guest("Hsah", "h"));
            book.add(new Guest("Hsah", "h"));
            book.add(new Guest("Hsah", "h"));
            book.add(new Guest("Hsah", "h"));
            book.add(new Guest("Hsah", "h"));
            book.add(new Guest("Hsah", "h"));
            book.add(new Guest("Hsah", "h"));
            book.add(new Guest("Hsah", "h"));
            book.add(new Guest("Hsah", "h"));
        } catch (InvalidNameException e) {
            e.printStackTrace();
        }
    }
}
