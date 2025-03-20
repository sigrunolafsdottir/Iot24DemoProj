package StudentPortalen;

public class HuvudProgramSP {

    public HuvudProgramSP(){
        Student anna = new Student("Anna", "erete@gdfd", "2003435646");
        Student bertil = new Student("Bertil", "ejuku@gdfd", "8768687686");
        Student cecil = new Student("cecil", "rete@gdfd", "867877676");

        System.out.println(anna);
        System.out.println(bertil);
        //System.out.println("hej");
    }


    public static void main(String[] args) {
        HuvudProgramSP obj = new HuvudProgramSP();
        //System.out.println("hej");
    }


}
