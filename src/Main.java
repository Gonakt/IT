import chief.Ceo;
import chief.Chief;
import network.Engineer;
import support.Leader;
import support.SecondLine;

public class Main {

    public static void main(String[] args) {

        Ceo ceo = new Ceo("20.02.1970", "No", "Ivanov", "Yes", "25 Years", 100000, "88005553535");
        Leader networkLeader = new Leader("11.06.1988", "No", "Sidorov", "Yes", "5 Years", 30000, "5826874");
        SecondLine secondLine = new SecondLine("11.06.1996", "Yes", "Petrov", "No", "3 Years", 50000, "5826812");
        Engineer engineer = new Engineer("20.02.1999", "Yes", "Vasilyev", "No", "1 Year", 10000, "+380124211");

        //Запрос для выявления опоздавших
        int count  = 0;
        if (ceo.getCheck() == "Yes") {
            System.out.println(ceo.getName() + " has been late");
            count++;
        }

        if (networkLeader.getCheck() == "Yes") {
            System.out.println(networkLeader.getName() + " has been late");
            count++;
        }

        if (secondLine.getCheck() == "Yes") {
            System.out.println(secondLine.getName() + " has been late");
            count++;
        }

        if (engineer.getCheck() == "Yes") {
            System.out.println(engineer.getName() + " has been late\n");
            count++;
        }

        System.out.println("Total employees have been late: " + String.valueOf(count) + "\n");
        count = 0;

        //Запрос для нахождения сотрудников со стажем более 3 лет
        if (Integer.valueOf(ceo.getProbation().split(" ")[0]) > 3) {
            System.out.println(ceo.getName() + " has required probation (more than 3 years)");
            count++;
        }

        if (Integer.valueOf(secondLine.getProbation().split(" ")[0]) > 3) {
            System.out.println(secondLine.getName() + " has required probation (more than 3 years)");
            count++;
        }

        if (Integer.valueOf(networkLeader.getProbation().split(" ")[0]) > 3) {
            System.out.println(networkLeader.getName() + " has required probation (more than 3 years)");
            count++;
        }

        if (Integer.valueOf(engineer.getProbation().split(" ")[0]) > 3) {
            System.out.println(engineer.getName() + " has required probation (more than 3 years)");
            count++;
        }

        System.out.println("\nTotal employees matches required probation: " + count);
    }
}
