package test;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


public class TestJob implements Job {
	static Logger logger = Logger.getLogger(TestJob.class);
	
    public void execute(final JobExecutionContext ctx) throws JobExecutionException {
    	
    	logger.info("say hello");
    }

}