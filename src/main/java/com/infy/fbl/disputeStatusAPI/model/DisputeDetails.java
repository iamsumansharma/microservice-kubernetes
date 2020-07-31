package com.infy.fbl.disputeStatusAPI.model;

import com.infy.fbl.disputeStatusAPI.util.Status;
import com.infy.fbl.disputeStatusAPI.util.complaintcode;
import com.vladmihalcea.hibernate.type.basic.PostgreSQLEnumType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

/**
 * This entity class includes the details related to staging_masterdispute_details table.
 */
@Entity
@Table(name = "staging_masterdispute_details")
@TypeDef(
        name = "pgsql_enum",
        typeClass = PostgreSQLEnumType.class)
public class DisputeDetails {

    @Column(name = "transactionid", nullable = false)
    private String transactionId;

    @Column(name = "loan_application_no", nullable = false)
    private String loan_application_no;

    @Id
    @Column(name = "dispute_id", nullable = false)
    private String dispute_id;

    @Column(name = "complaint_message", nullable = false)
    private String complaint_message;

    @Column(name = "resolution_message", nullable = false)
    private String resolution_message;

    @Column(name = "disputetrack_url", nullable = false)
    private String disputeTrack_url;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    @Type( type = "pgsql_enum" )
    private Status status;

    @Enumerated(EnumType.STRING)
    @Column(name = "complaintcode", nullable = false)
    @Type( type = "pgsql_enum" )
    private complaintcode complaintCode;

    public DisputeDetails(){

    }

    public DisputeDetails(String transactionId, String loan_application_no, String dispute_id, String complaint_message, String resolution_message, String disputeTrack_url, Status status, complaintcode complaintCode) {
        this.transactionId = transactionId;
        this.loan_application_no = loan_application_no;
        this.dispute_id = dispute_id;
        this.complaint_message = complaint_message;
        this.resolution_message = resolution_message;
        this.disputeTrack_url = disputeTrack_url;
        this.status = status;
        this.complaintCode = complaintCode;
    }


    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getLoan_application_no() {
        return loan_application_no;
    }

    public void setLoan_application_no(String loan_application_no) {
        this.loan_application_no = loan_application_no;
    }

    public String getDispute_id() {
        return dispute_id;
    }

    public void setDispute_id(String dispute_id) {
        this.dispute_id = dispute_id;
    }

    public String getComplaint_message() {
        return complaint_message;
    }

    public void setComplaint_message(String complaint_message) {
        this.complaint_message = complaint_message;
    }

    public String getResolution_message() {
        return resolution_message;
    }

    public void setResolution_message(String resolution_message) {
        this.resolution_message = resolution_message;
    }

    public String getDisputeTrack_url() {
        return disputeTrack_url;
    }

    public void setDisputeTrack_url(String disputeTrack_url) {
        this.disputeTrack_url = disputeTrack_url;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public complaintcode getComplaintCode() {
        return complaintCode;
    }

    public void setComplaintCode(complaintcode complaintCode) {
        this.complaintCode = complaintCode;
    }

}
