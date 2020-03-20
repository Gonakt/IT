package chief;

public class Cfo extends Chief {
    //финансовый директор

    public Cfo(String birth, String check, String name, String overdraft, String probation, float salary, String telephone) {
        super(birth, check, name, overdraft, probation, salary, telephone);
    }

    String responsibleFor;
}
