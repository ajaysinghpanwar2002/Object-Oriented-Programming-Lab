package oops;

class Studentee
{
    String Name;
    // jaise ab static bna diya h na, to isko seedha class ke naam se access kr payenge and  wo jitne bhe object bnange is class ke sab mein School same hoga 
    static String School;
}

public class statickeyword {
    public static void main(String[] args) {
        // idhar seedha class ke naam se access krdiya 
        Studentee.School = "KVT";
        Studentee student1 = new Studentee();
        student1.Name = "tony";
        System.out.println(student1.School);
    }
}
