public class Doctor extends Person{
    private String Designation;
    private int salary;
    public Doctor(String N1, char G1, int A1, String D1, int S1) {
        super(N1, G1, A1);
        Designation = D1;
        salary = S1;
    }
    public void Checkup()
    {
        
    }
    public void prescribe()
    {
        
    }
    public void show() {
    	System.out.println(Designation);
    	System.out.println(salary);
    	System.out.println(name);
    	System.out.println(age);
    	System.out.println(gender);
    }
}
