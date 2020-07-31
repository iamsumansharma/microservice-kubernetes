package com.infy.fbl.disputeStatusAPI.model;

import com.infy.fbl.disputeStatusAPI.util.Status;

/**
 * This class includes the details regarding Dispute Status.
 */
public class DisputeStatus {

    private String transactionId;
    private Status status;
    private String message;

    public DisputeStatus(){
    }

    public DisputeStatus(String transactionId, Status status, String message){
        this.transactionId = transactionId;
        this.status = status;
        this.message  =message;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
