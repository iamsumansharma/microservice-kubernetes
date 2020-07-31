package com.infy.fbl.disputeStatusAPI.model;

public class DisputeReq {
    private String transactionId;
    private DisputeId dispute;


    public DisputeReq() {
    }

    public DisputeReq(String transactionId, DisputeId dispute) {
        this.transactionId = transactionId;
        this.dispute = dispute;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public DisputeId getDispute() {
        return dispute;
    }

    public void setDispute(DisputeId dispute) {
        this.dispute = dispute;
    }

}
