package com.infy.fbl.disputeStatusAPI.exception;

/**
 * This class contains details regarding error request.
 */
public class ErrorDetails {
    private String code;
    private String message;
    private String success;

    public ErrorDetails(String code, String message, String success) {
        super();
        this.code = code;
        this.message = message;
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
}
