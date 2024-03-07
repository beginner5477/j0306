package T11_singleton;

public class T_run {
	public static void main(String[] args) {
		Singleton mbc = Singleton.getInstance();
		Singleton kbs = Singleton.getInstance();
		Singleton jtbc = Singleton.getInstance();
		if(mbc == kbs) System.out.println("같다");
		else System.out.println("다르다~");
		if(jtbc == kbs) System.out.println("같다");
		else System.out.println("다르다~");
	}
}
