package composite.softCompany;

import java.util.ArrayList;
import java.util.Iterator;

//internal nodes
public class Company extends CompanyPersonnel {
    ArrayList<CompanyPersonnel> managers = new ArrayList<>();
    String name;
    int projectCount;

    public Company(String name) {
        this.name = name;
        this.projectCount = 0;
    }

    public void add(CompanyPersonnel personnel) {
        managers.add(personnel);
        projectCount++;
    }

    public void remove(CompanyPersonnel personnel) {
        int n = personnel.getNumEmployees();
        for(int i = 0; i < n; i++){
            personnel.remove(personnel.getChild(0));
        }
        managers.remove(personnel);
        projectCount--;
    }

    public CompanyPersonnel removeCompany(){
        int n = managers.size();
        for(int i = 0; i < n; i++){
            this.remove(managers.get(0));
        }
        return null;
    }

    public CompanyPersonnel getChild(int i) {
        return (CompanyPersonnel)managers.get(i);
    }

    public String getName() {
        return name;
    }

    public int getTotalProjectCount() {
        return projectCount;
    }

    public int getNumEmployees() {
        return managers.size();
    }

    public void printDetails(){
        System.out.print("Name: " + getName());
        System.out.print("\nNumber of Projects: " + getTotalProjectCount() + "\n");
    }

    public void showHierarchy() {
        System.out.print("- " + getName() + "\n");
        Iterator<CompanyPersonnel> iterator = managers.iterator();
        while (iterator.hasNext()) {
            CompanyPersonnel CompanyPersonnel =
                    (CompanyPersonnel)iterator.next();
            CompanyPersonnel.showHierarchy();
        }
    }
}
