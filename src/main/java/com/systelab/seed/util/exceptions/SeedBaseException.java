package com.systelab.seed.util.exceptions;

/**
 * SeedException wraps all checked standard Java exception and enriches them with a custom error code.
 * You can use this code to retrieve localized error messages and to link to our online documentation.
 */
public class SeedBaseException extends Exception {

    private static final long serialVersionUID = 3714428835173293220L;
    private final ErrorCode errorCode;

    public enum ErrorCode {
        PATIENT_NOT_FOUND(3),
        USER_NOT_FOUND(2),
        DEFAULT_ERROR(1);

        private final int errorCode;

        ErrorCode(int errorCode) {
            this.errorCode = errorCode;
        }
    }

    public SeedBaseException(ErrorCode code) {
        super();
        this.errorCode = code;
    }

    public SeedBaseException(String message, Throwable cause, ErrorCode code) {
        super(message, cause);
        this.errorCode = code;
    }

    public SeedBaseException(String message, ErrorCode code) {
        super(message);
        this.errorCode = code;
    }

    public SeedBaseException(Throwable cause, ErrorCode code) {
        super(cause);
        this.errorCode = code;
    }

    public ErrorCode getCode() {
        return this.errorCode;
    }
}
