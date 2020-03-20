package network;

public class Administrator extends Network {
    //сетевой администратор
    public Administrator(String birth, String check, String name, String overdraft, String probation, float salary, String telephone) {

        super(birth, check, name, overdraft, probation, salary, telephone);
    }

    String certification;
}
