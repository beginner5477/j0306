package T3_Constructor;

public class Test3 {
	//디폴트생성자(기본생성자)
	Test3() {} // #1
	int atom = 30;
	int atom2;
	double atom3;
	Test3(int n1) 
	{
		System.out.println("n1 = " + n1);
	} //#2
	Test3(int n1, int n2) 
	{
		atom = n1;
		atom2 = n2;
	}//#3
	Test3(int atom, double atom3) 
	{
		this.atom = atom;
		this.atom3 = atom3;
	}//#4
	Test3(double n2, int n1) {}//#5
}
