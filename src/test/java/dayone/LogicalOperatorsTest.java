package dayone;

public class LogicalOperatorsTest {

	public static void main(String[] args) {
		//&& And
		//|| OR 
		// !
		
		int subject1=30;
		int subject2=26;
		int subject3=25;
		
		boolean result=subject1>subject2 && subject1>subject3;//true
		
		boolean result2=subject1>subject2 && subject3>subject1 && subject2>subject3;//false
		
		System.out.println("result: "+!result);
		System.out.println("result2: "+!result2);
		
		boolean result3=subject1>subject2 || (subject1>subject3 && subject1>subject2);//true
		
		boolean hasTrue=subject1>subject2 || subject3>subject1;//true
		
		int result5=subject1*(subject2+subject3);
	}

}
