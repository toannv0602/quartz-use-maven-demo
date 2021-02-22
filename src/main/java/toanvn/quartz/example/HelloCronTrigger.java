package toanvn.quartz.example;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.matchers.KeyMatcher;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloCronTrigger {

  //      public void test( T obj ) Ex

    public static void main(String[] args) throws Exception{

//        final JobKey jobKey = new JobKey("HelloName","group1");
//        final JobDetail job = JobBuilder.newJob(HelloJob.class).withIdentity(jobKey).build();
//
//        final Trigger trigger = TriggerBuilder.newTrigger().withIdentity("HelloTriggerName","group1")
//                .withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?")).build();
//
//        final Scheduler scheduler = new StdSchedulerFactory().getScheduler();
//
//        // listener attached jobkey
//        scheduler.getListenerManager().addJobListener(new HelloJobListener(), KeyMatcher.keyEquals(jobKey));


//        // other type
//        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("triggerName", "group1")
//                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever()).build();
//
//        JobDetail job = JobBuilder.newJob(HelloJob.class)
//                .withIdentity("jobName", "group1").build();
//        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
//
//        scheduler.start();
//        scheduler.scheduleJob(job,trigger);

        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(1802215113062L));
        System.out.println(date);

    }
}
