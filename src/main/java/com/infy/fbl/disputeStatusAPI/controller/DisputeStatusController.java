package com.infy.fbl.disputeStatusAPI.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.fbl.disputeStatusAPI.exception.ResourceNotFoundException;
import com.infy.fbl.disputeStatusAPI.model.DisputeReq;
import com.infy.fbl.disputeStatusAPI.model.DisputeStatus;
import com.infy.fbl.disputeStatusAPI.service.DisputeService;
import com.infy.fbl.disputeStatusAPI.util.ApplicationConstants;

/**
 * @author suman.sharma
 * @apiNote This class includes APIs related to raise dispute and dispute status
 *          requirements
 */

@CrossOrigin
@RestController
@RequestMapping("/lsp/v1")
public class DisputeStatusController {
	private static final Logger log = LoggerFactory.getLogger(DisputeStatusController.class);

	@Autowired
	private DisputeService disputeService;

	/**
	 * This API is invoked to check the status of the dispute.
	 *
	 * @param disputeReq
	 * @return DisputeStatus
	 * @throws ResourceNotFoundException
	 */
	@GetMapping(path = "/disputeStatus", consumes = "application/json", produces = "application/json")
	public ResponseEntity<DisputeStatus> disputeStatus(@RequestBody DisputeReq disputeReq)
			throws ResourceNotFoundException {
		log.debug("******DisputeController :: Method :: DisputeStatus*******");
		try {
			DisputeStatus disputeStatus = new DisputeStatus();
			disputeStatus = disputeService.getDisputeStatus(disputeReq);

			return new ResponseEntity<>(disputeStatus, HttpStatus.ACCEPTED);

		} catch (Exception e) {
			log.debug("Exception :: " + e);
			throw new ResourceNotFoundException(ApplicationConstants.MESSAGE);
		}
	}

}
