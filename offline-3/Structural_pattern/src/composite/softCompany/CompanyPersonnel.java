package composite.softCompany;

public abstract class CompanyPersonnel {

    public void add(CompanyPersonnel personnel) {
        throw new UnsupportedOperationException();
    }
    public void remove(CompanyPersonnel personnel) {
        throw new UnsupportedOperationException();
    }
    public CompanyPersonnel removeCompany() {
        throw new UnsupportedOperationException();
    }
    public CompanyPersonnel getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getRole() {
        throw new UnsupportedOperationException();
    }
    public int getTotalProjectCount() {
        throw new UnsupportedOperationException();
    }
    public int getNumEmployees() {
        throw new UnsupportedOperationException();
    }
    public String getProjectName() {
        throw new UnsupportedOperationException();
    }

    public void printDetails() {
        throw new UnsupportedOperationException();
    }
    public void showHierarchy() {
        throw new UnsupportedOperationException();
    }
}
