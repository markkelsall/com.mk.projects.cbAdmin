package com.mk.projects.cbAdmin;

public interface BucketAdmin {
	public CBOperationResponse insertBucket (String bucketName);
	
	public CBOperationResponse deleteBucket (String bucketName);
	
	public void connectToCluster();
}
