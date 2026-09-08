public class student {
//all the attributes should be private/

//java uses four access modifiers - public, private, protected, -( default)
//access modifiers are applicable to attributes, constrictors, methods, setters and getters

//public= accessible from everywhere
//private= accessible from inside the class

public String FN;
public String LN;//access modifiers are the default-if nothing is declared
public int Sid;

//public double gpa;
//Concept- Encapsulation=  Controlling the access of attributes and methods
private double gpa;



student(){
this.FN="No First Name";
this.LN="No Last name";//access modifier is default
this.Sid=0;
this.gpa=0.0;
}

student(String FN, String LN, int Sid) {
this.FN = FN;
this.LN = LN;
this.Sid = Sid;
}

student(String FN, String LN){
this.FN=FN;
this.LN=LN;

}
student (String FN,  int Sid, String LN){
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

public double getGpa() {
return gpa;
}

public void setGpa(double gpa) {
//this.gpa = gpa;
if(gpa>=0.0&&gpa<=4.0){
this.gpa=gpa;
}else{
System.out.println("Invalid GPA Value");
}
}
}


