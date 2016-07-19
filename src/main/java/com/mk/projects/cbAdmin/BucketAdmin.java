package com.mk.projects.cbAdmin;

import com.mk.projects.cbAdmin.util.CBOperationResponse;

public interface BucketAdmin {
	public CBOperationResponse insertBucket (String bucketName);
	
	public CBOperationResponse deleteBucket (String bucketName);
	
	public void connectToCluster();
}
