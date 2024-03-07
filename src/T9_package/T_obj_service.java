package T9_package;

public class T_obj_service {

	public String adultCheck(int age) {
		String temp = "";
		if(age >= 20) temp = "성인";
		else temp = "미성년자";
		return temp;
	}

	public void memberPrint(T_objVO[] data, int cnt) {
		System.out.println("================================");
		System.out.println("ID\t비밀번호\t성명\t나이\t비고");
		System.out.println("--------------------------------");
		for(int i = 0; i < cnt; i++)
		{
			System.out.println(data[i].getMid()+"\t"+data[i].getPwd()+"\t"+data[i].getName()+"\t"+data[i].getAge()+"\t"+data[i].getAdult());
		}
		System.out.println("================================");
		System.out.println("\t\t\t전체 건수: " +cnt);
	}

}
