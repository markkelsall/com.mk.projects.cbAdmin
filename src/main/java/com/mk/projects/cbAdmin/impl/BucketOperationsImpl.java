package com.mk.projects.cbAdmin.impl;

import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.mk.projects.cbAdmin.AbstractCouchbaseDocument;
import com.mk.projects.cbAdmin.BucketOperations;

public class BucketOperationsImpl implements BucketOperations {

	private static final Logger logger = LogManager.getLogger(BucketOperationsImpl.class);

	public void upsertDocument(AbstractCouchbaseDocument cbDoc) {
		logger.trace("Entering BucketOperationsImpl.upsertDocument()");
		
		if (cbDoc == null) {
			return;
		}
		
		if (cbDoc.getId() == null) {
			cbDoc.setId(UUID.randomUUID().toString());
		}
		
		Gson gson = new Gson();
		gson.toJson(cbDoc);
		
		logger.trace("Exiting BucketOperationsImpl.upsertDocument");
	}
}
