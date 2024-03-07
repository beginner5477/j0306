package T4_method;

public class Calculator {
	void cal(int su1, int su2, String oper)
	{
		int res;
		if(oper.equals("+")) res = su1 + su2; 
		else if(oper.equals("-")) res = su1 - su2; 
		else if(oper.equals("*")) res = su1 * su2; 
		else if(oper.equals("/")) res = su1 / su2;
		else
		{
			System.out.println("+,-,*,/ 연산만 가능합니다.");
			return;
		}
		prn(su1, su2, res, oper);
	}

	void prn(int su1, int su2, int res, String oper) 
	{
		System.out.println(su1 + " "+oper+" " + su2+ " = "+ res );
	}
}
