public class Main{

public static void main (String[]args){

student s1= new student("thomas","jefferson");
System.out.println(s1.FN);
System.out.println(s1.LN);
System.out.println(s1.Sid);

student s2=new student();
System.out.println(s2.FN);
System.out.println(s2.LN);
System.out.println(s2.Sid);

student s3=new student("Charles","Chaplin",800592);
System.out.println(s3.FN);
System.out.println(s3.LN);
System.out.println(s3.Sid);

student s4=new student();
s4.FN="Melanie";
s4.setLN("Thomas");
s4.LN="Simpson";

student s5, s6, s7;
s4=new student();
s4.FN="Praise";
s4.LN="Ben";
//s4.gpa=4.0;
//s4.gpa=-3.1;
s4.setGpa(3.8);
}
}