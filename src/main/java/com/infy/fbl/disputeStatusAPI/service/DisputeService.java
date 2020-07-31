package com.infy.fbl.disputeStatusAPI.service;

import com.infy.fbl.disputeStatusAPI.controller.DisputeStatusController;
import com.infy.fbl.disputeStatusAPI.exception.ResourceNotFoundException;
import com.infy.fbl.disputeStatusAPI.model.*;
import com.infy.fbl.disputeStatusAPI.repository.DisputeDetailsRepository;
import com.infy.fbl.disputeStatusAPI.util.ApplicationConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This is a service class which includes the logic related to DisputeManagement
 * API.
 */
@Service
public class DisputeService {
	@Autowired
	private DisputeDetailsRepository disputeDetailsRepository;

	private static final Logger log = LoggerFactory.getLogger(DisputeStatusController.class);

	/**
	 * @param disputeReq
	 * @return disputeStatus
	 * @throws ResourceNotFoundException
	 */
	public DisputeStatus getDisputeStatus(DisputeReq disputeReq) throws ResourceNotFoundException {
		log.debug("********DisputeService :: Method :: getDisputeStatus********");
		String dispute_id = "";

		log.debug("TransactionID :: " + disputeReq.getTransactionId());

		try {
			if (disputeReq.getDispute().getId() == null) {
				throw new ResourceNotFoundException(ApplicationConstants.MESSAGE);
			} else if (disputeReq.getTransactionId() == null) {
				throw new ResourceNotFoundException(ApplicationConstants.MESSAGE);
			} else {
				dispute_id = disputeReq.getDispute().getId();
				log.debug("disputeID :: " + dispute_id);

				DisputeDetails disputeDetails = disputeDetailsRepository.findById(dispute_id)
						.orElseThrow(() -> new ResourceNotFoundException(ApplicationConstants.MESSAGE));

				DisputeStatus disputeStatus = new DisputeStatus();
				disputeStatus.setTransactionId(disputeDetails.getTransactionId());
				disputeStatus.setStatus(disputeDetails.getStatus());
				disputeStatus.setMessage(disputeDetails.getComplaint_message());
				log.debug("Response :: " + disputeStatus);

				return disputeStatus;
			}
		} catch (Exception e) {
			log.debug("Handled exception :: " + e);
			throw new ResourceNotFoundException(ApplicationConstants.MESSAGE);
		}
	}

}
