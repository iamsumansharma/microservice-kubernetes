package com.infy.fbl.disputeStatusAPI.model;

import com.infy.fbl.disputeStatusAPI.util.Status;

/**
 * This class includes setters and getters for dispute details in raise dispute
 */

public class Dispute {

    private String id;
    private Status status;
    private String url;

    public Dispute() {
    }

    public Dispute(String id, Status status, String url){
        this.id = id;
        this.status = status;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
