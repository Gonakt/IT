package network;

public class Engineer extends Network {
    //сетевой инженер

    public Engineer(String birth, String check, String name, String overdraft, String probation, float salary, String telephone) {

        super(birth, check, name, overdraft, probation, salary, telephone);
    }

    String responsibleFor;
}
