package support;

public abstract class Support {

    String birth;
    String check;
    String name;
    String overdraft;
    String probation;
    float salary;
    String telephone;

    public Support(String birth, String check, String name, String overdraft, String probation, float salary, String telephone) {

        this.birth = birth;
        this.check = check;
        this.name = name;
        this.overdraft = overdraft;
        this.probation = probation;
        this.salary = salary;
        this.telephone = telephone;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(String overdraft) {
        this.overdraft = overdraft;
    }

    public String getProbation() {
        return probation;
    }

    public void setProbation(String probation) {
        this.probation = probation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
