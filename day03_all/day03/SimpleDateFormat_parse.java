package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���ַ�������ָ�������ڸ�ʽ����ΪDate
 * @author adminitartor
 *
 */
public class SimpleDateFormat_parse {
	public static void main(String[] args) throws ParseException {
		String str = "2008-08-08 20:08:08";
		
		SimpleDateFormat sdf
			= new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss"	
			);
		
		Date date = sdf.parse(str);
		System.out.println(date);
	}
}








