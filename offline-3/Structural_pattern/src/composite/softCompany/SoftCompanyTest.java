package composite.softCompany;

import java.util.Scanner;

public class SoftCompanyTest {
    public static void main(String args[]) {
        CompanyPersonnel pm1 =
                new ProjectManager("Alan Turing", "Project Manager", "CSE308");
        CompanyPersonnel pm2 =
                new ProjectManager("David Patterson", "Project Manager", "CSE307");
        CompanyPersonnel dev1 = new Developer("Robert Oppenheimer", "Developer", "CSE308");
        CompanyPersonnel dev2 = new Developer("John von Neumann", "Developer", "CSE308");
        CompanyPersonnel dev3 = new Developer("Alfred Aho", "Developer", "CSE307");

        CompanyPersonnel myCompany = new Company("Manhattan Company");

        myCompany.add(pm1);
        myCompany.add(pm2);

        pm1.add(dev1);
        pm1.add(dev2);
        pm2.add(dev3);

        myCompany.showHierarchy();
        System.out.print("<Before deletion> Number of developers under pm1: " + pm1.getNumEmployees() + "\n");

        myCompany.remove(pm1);
        myCompany.showHierarchy();
//        pm1.getChild(0);
        System.out.print("<After deletion> Number of developers under pm1: " + pm1.getNumEmployees() + "\n");

        myCompany = myCompany.removeCompany();
//        myCompany.showHierarchy();
    }
}
