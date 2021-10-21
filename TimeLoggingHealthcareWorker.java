package edu.parinya.softarchdesign.structural;
import java.util.Date;

public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator {
    public TimeLoggingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
        this.worker = worker;
    }

    @Override
    public void service() {
        Date date = new Date();
        System.out.print(date+": ");
        worker.service();
    }
}
