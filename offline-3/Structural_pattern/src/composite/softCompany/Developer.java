package composite.softCompany;

//Leaf
public class Developer extends CompanyPersonnel {
    String name;
    String role;
    String projectName;

    public Developer(String name,
                    String role,
                    String projectName)
    {
        this.name = name;
        this.role = role;
        this.projectName = projectName;
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

    public void printDetails(){
        System.out.print("Name: " + getName());
        System.out.print("\nRole: " + getRole());
        System.out.print("\nCurrent Project: " + getProjectName() + "\n");
    }

    public void showHierarchy() {
        System.out.print("\t\t- " + getName() + "\n");
    }
}

