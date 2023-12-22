public class Student extends Person
{
    private String program;
    private int Syear;
   public Student(String N1, char G1, int A1, String P1, int Y1) {
        super(N1, G1, A1);
        program = P1;
        Syear = Y1;
    }
   public void study()
   {
       
   }
   public void heldExam()
   {
       
   }
   public void show() {
   	System.out.println(program);
   	System.out.println(Syear);
   	System.out.println(name);
   	System.out.println(age);
   	System.out.println(gender);
   }
}


