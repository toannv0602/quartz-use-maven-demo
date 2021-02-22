package toanvn.quartz.example;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;

public class HelloJobListener  implements JobListener {
    public String getName() {
        return "JobListener";
    }

    // phuong thuc nay duoc goi  khi task chuan bi duoc thuc thi
    public void jobToBeExecuted(JobExecutionContext jobExecutionContext) {
        final String jobName = jobExecutionContext.getJobDetail().getKey().toString();
        System.out.println("jobToBeExcuted: "+jobName+" is starting .....");
    }

    public void jobExecutionVetoed(JobExecutionContext jobExecutionContext) {
        System.out.println("jobExecutionVetoed!!!");
    }

    // phuong thuc nay duoc goi khi task da thuc thi xong
    public void jobWasExecuted(JobExecutionContext jobExecutionContext, JobExecutionException e) {
        System.out.println("jobWasExcuted");
        final String jobName = jobExecutionContext.getJobDetail().getKey().toString();
        System.out.println("task: "+jobName+" is finished!!!");

        if(!e.getMessage().equals("")){
            System.out.println("Exception throw by "+jobName+" Exception: "+ e.getMessage());
        }
        System.out.println("-------------------");
    }
}
