package io.pragra.learning.guestbook;

public class GuestBookFullException extends RuntimeException {
    public GuestBookFullException(String message) {
        super(message);
    }
}
