package com.epam.christmasgift.exception;

public class ChristmasGiftException extends Exception {
    public ChristmasGiftException() {
        super();
    }

    public ChristmasGiftException(String message) {
        super(message);
    }

    public ChristmasGiftException(String message, Throwable cause) {
        super(message, cause);
    }

    public ChristmasGiftException(Throwable cause) {
        super(cause);
    }

    protected ChristmasGiftException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
