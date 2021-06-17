package OfficeHours.Practice_06_01_2021.ScrumTeamPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    /*
     Attributes:
                            PO, BA, SM,
                            ArrayList<Tester> testersList = new ArrayList<>(),
                            ArrayList<Developer> devopsList = new ArrayList<>(),
                            sprintNumber

                Constructor:
                      sets the names of: PO, BA, SM

                Actions:addTester(Tester tester): adds the given tester to the testers arraylist
                        addTesters(Tester[] testers): adds the given testers to the testers arraylist
                        addDeveloper(Developer developer): adds the given developer to the developers arraylist
                        addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
                        removeTester(long employeeID): removes the given tester from the testers arraylist
                        removeDeveloper(long employeeID): removes the developer from the developers arraylist
                        toString(): prints number of tester,& developers,  PO name, SM name, BA name
     */
    String productOwner;
    String scrumMaster;
    String businessAnalyst;

    ArrayList<Tester> allTesters; //this is references
    ArrayList<Developer> allDevelopers;
    int sprintNumber;
    //these all above belongs to the ScrumTeam class, these are all instances. all references...

    public ScrumTeam(String productOwner, String scrumMaster, String businessAnalyst){
        this.productOwner=productOwner;
        this.scrumMaster=scrumMaster;
        this.businessAnalyst=businessAnalyst;
       this. allTesters= new ArrayList<>();
       this. allDevelopers= new ArrayList<>();


    }
    public void addTester(Tester tester){
        this.allTesters.add(tester);
    }
    public void addTester(Tester [] testers) {//we did overload method ---Tester ... testers, same thing.
        this.allTesters.addAll(Arrays.asList(testers)); //bunu daha one yapmistik, simdi object ile yapioruz.


    }
    public void addDeveloper(Developer developer){
        this.allDevelopers.add(developer);
    }
    public void addDeveloper (Developer ... developer){
        this.allDevelopers.addAll(Arrays.asList(developer));
    }

    public boolean removeTester (int employeeId){
        for(int i=0; i<allTesters.size();i++){
            if(allTesters.get(i).getEmployeeId()== employeeId){
                allTesters.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean removeDeceloper (int employeeId){
        int size= allDevelopers.size();
        allDevelopers.removeIf(eachDev -> eachDev.getEmployeeId() == employeeId);
        return size!= allDevelopers.size();
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "productOwner='" + productOwner + '\'' +
                ", scrumMaster='" + scrumMaster + '\'' +
                ", businessAnalyst='" + businessAnalyst + '\'' +
                ", allTesters=" + allTesters +
                ", allDevelopers=" + allDevelopers +
                ", sprintNumber=" + sprintNumber +
                '}';
    }
}
