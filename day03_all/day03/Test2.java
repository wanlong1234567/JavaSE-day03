package day03;

import java.util.Calendar;

/**
 * �鿴�Լ�����������ĵڼ���?
 * @author adminitartor
 *
 */
public class Test2 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR,1992);
		calendar.set(Calendar.MONTH,7);
		calendar.set(Calendar.DAY_OF_MONTH,4);
		System.out.println(calendar.getTime());
		
		int days = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println(
			"����������"+calendar.get(Calendar.YEAR)
			+"��ĵ�"+days+"��"
		);
		
		String[] data = {"��","һ","��","��","��","��","��"};
		int dow = calendar.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println("����������"+data[dow]);
	}
}







