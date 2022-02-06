package lab_programs;

class one 
{
    public void print_geek()
    {
        System.out.print("Geeks");
    }
}
 
class two extends one 
{
    public void print_for() 
    { 
    	System.out.print("for"); 
    }
}

public class Inheritance {

	public static void main(String[] args) {
		two alen = new two();
        alen.print_geek();
        alen.print_for();
        alen.print_geek();
	}

}
