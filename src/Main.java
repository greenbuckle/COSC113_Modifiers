public class Main{

    public String Test;
    protected int Test_int;
    private double Test_double;
    boolean Test_boolean;
    Main(){}

    public Main(String Test){
        this.Test=Test;
    }

    private Main(String Test,double Test_double){
        this.Test=Test;
        this.Test_double=Test_double;//constructor can be private
    }

    void main(){//this main is not static and instead of one argument (args) it takes none-different signatures, also if public is not declared it is then default
        System.out.println("Hello Main!");}
    void main(String args){
            System.out.println("Hello Main!");
        }

//you can have as many classes as you want, but you should have only one public static void main
public static void main (String[]args){

student s1= new student("thomas","jefferson");
//System.out.println(s1.FN);
//System.out.println(s1.LN);
//System.out.println(s1.Sid);

student s2=new student();
//System.out.println(s2.FN);
//System.out.println(s2.LN);
//System.out.println(s2.Sid);

student s3=new student("Charles","Chaplin",800592);
//System.out.println(s3.FN);
//System.out.println(s3.LN);
//System.out.println(s3.Sid);

student s4=new student();
//s4.FN="Melanie";
//s4.setLN("Thomas");
//s4.LN="Simpson";

student s5, s6, s7;
s4=new student();
//s4.FN="Praise";
//s4.LN="Ben";
//s4.gpa=4.0;
//s4.gpa=-3.1;
s4.setFN("Praise");
s4.setLN("Ben");
//s4.setGpa(3.8);
System.out.println("Praise Ben GPA is "+s4.getGpa());
}
}
