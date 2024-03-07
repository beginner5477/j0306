package T4_method;

/*
  	
 */
public class Test3_1_run {
	public static void main(String[] args) {
		Test3_1 t3 = new Test3_1();
		int[] su = {90, 30, 13, 41, 43};
		
		int res = t3.hap(su);
		System.out.println("총합은 "+res);
		System.out.println();
		res = t3.sum(su);
		System.out.println("총합은 "+res);
		System.out.println();
		res = t3.hap(new int[] {1,2,3,4,5});
		System.out.println("총합은 "+res);
		res = t3.sum(new int[] {1,2,3,4,5});
		System.out.println("총합은 "+res);
//		res = t3.hap({1,2,3,4,5}); (X)
//		res = t3.hap(1,2,3,4,5); (X)
		res = t3.sum(1,2,3,4,5); //(O),몇개의 변수가 들올지 모를떄 ...으로 받으면 좋음
		System.out.println("총합은 " + res);
		
		
	}
}
