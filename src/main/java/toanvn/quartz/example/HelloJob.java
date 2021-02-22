package toanvn.quartz.example;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

//job task đại diện cho các tác vụ cần xử lý

public class HelloJob implements Job {

    public void execute(JobExecutionContext Context) throws JobExecutionException{
        System.out.println("Hello Quartz!!! - "+ new Date());
    }
}
