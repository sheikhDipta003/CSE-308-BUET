package composite.softCompany;

import java.util.ArrayList;
import java.util.Iterator;

//internal nodes
public class ProjectManager extends CompanyPersonnel {
    ArrayList<CompanyPersonnel> developers = new ArrayList<>();
    String name;
    String role;
    String projectName;

    public ProjectManager(String name, String role, String projectName) {
        this.name = name;
        this.role = role;
        this.projectName = projectName;
    }

    public void add(CompanyPersonnel personnel) {
        developers.add(personnel);
    }

    public void remove(CompanyPersonnel personnel) {
        developers.remove(personnel);
    }

    public CompanyPersonnel getChild(int i) {
        return (CompanyPersonnel)developers.get(i);
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getProjectName() {
        return projectName;
    }

    public int getNumEmployees() {
        return developers.size();
    }

    public void printDetails(){
        System.out.print("Name: " + getName());
        System.out.print("\nRole: " + getRole());
        System.out.print("\nCurrent Project: " + getProjectName() + "\n");
    }

    public void showHierarchy() {
        System.out.print("\t- " + getName() + " (" + getProjectName() + ")\n");
        Iterator<CompanyPersonnel> iterator = developers.iterator();
        while (iterator.hasNext()) {
            CompanyPersonnel CompanyPersonnel =
                    (CompanyPersonnel)iterator.next();
            CompanyPersonnel.showHierarchy();
        }
    }
}
