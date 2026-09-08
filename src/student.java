public class Student{
String FN;
String LN;
int Sid;

Student(){
this.FN="No First Name";
this.LN="No Last name";
this.Sid=0;}

Student(String FN, String LN, int Sid) {
this.FN = FN;
this.LN = LN;
this.Sid = Sid;}

Student(String FN, String LN){
this.FN=FN;
this.LN=LN;

}
Student (String FN,  int Sid, String LN){
this(FN,LN);

}

public String getFN() {
return FN;
}

public void setFN(String FN) {
this.FN = FN;
}

public String getLN() {
return LN;
}

public void setLN(String LN) {
this.LN = LN;
}

public int getSid() {
return Sid;
}

public void setSid(int sid) {
Sid = sid;
}

public static void main (String[]args){

Student s1= new Student("thomas","jefferson");
System.out.println(s1.FN);
System.out.println(s1.LN);
System.out.println(s1.Sid);

Student s2=new Student();
System.out.println(s2.FN);
System.out.println(s2.LN);
System.out.println(s2.Sid);

Student s3=new Student("Charles","Chaplin",800592);
System.out.println(s3.FN);
System.out.println(s3.LN);
System.out.println(s3.Sid);

Student s4=new Student();
s4.FN="Juan";
s4.setLN("Johnson");
s4.setSid(55662);
System.out.println(s4.getFN());
System.out.println(s4.getLN());
System.out.println(s4.getSid());

}
}