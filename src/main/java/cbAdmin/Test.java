package cbAdmin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.CouchbaseCluster;

public class Test {
	public static final Logger logger = LogManager.getLogger(Test.class);
	public static void main(String[] args) {
		// Initialize the Connection
		logger.debug("entering");
		Cluster cluster = CouchbaseCluster.create();
        Bucket bucket = cluster.openBucket("beer-sample");
        bucket.close();
        logger.debug("exiting");
	}
}
