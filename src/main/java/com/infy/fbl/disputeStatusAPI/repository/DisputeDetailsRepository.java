package com.infy.fbl.disputeStatusAPI.repository;

import com.infy.fbl.disputeStatusAPI.model.DisputeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisputeDetailsRepository extends JpaRepository<DisputeDetails,String> {
}
