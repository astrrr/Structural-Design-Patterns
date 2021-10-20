package edu.parinya.softarchdesign.structural;

import java.util.LinkedHashSet;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable {
    Set<HealthcareServiceable> members;

    public HealthcareWorkerTeam(Set<HealthcareServiceable> members) {
        members = new LinkedHashSet<>();

    }


    public HealthcareWorkerTeam() {
        members = new LinkedHashSet<>();
    }

    public void  addMember(HealthcareWorker worker){
        members.add(worker);
    }

    public void removeMember(HealthcareWorker worker){
        members.remove(worker);
    }

    @Override
    public void service() {

        for (HealthcareServiceable i  : members){
            i.service();
        }
    }

    @Override
    public double getPrice() {
        double total=0;
        for (HealthcareServiceable j : members) total += j.getPrice();
        return total;
    }
}
