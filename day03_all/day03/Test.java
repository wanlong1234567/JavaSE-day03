package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ����������Ҫ���û������Լ������գ�
 * ��ʽ:yyyy-MM-dd
 * Ȼ�󾭹�������㣬���������Ϊֹ��һ�����˶�����
 * @author adminitartor
 *
 */
public class Test {
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������������:");
		String birthStr = scanner.nextLine();
		
		SimpleDateFormat sdf 
			= new SimpleDateFormat(
				"yyyy-MM-dd"	
			);
		//����
		Date birth = sdf.parse(birthStr);
		//��ǰϵͳʱ��
		Date now = new Date();
		//�������ĺ���
		long time = now.getTime()-birth.getTime();
		//�������
		time = time/1000/60/60/24;
		
		System.out.println("��ϲ��!�Ѿ�����"+time+"��!���������!");
		
		
		//���յĺ���
		time = birth.getTime();
		time += 10000L*1000*60*60*24;
		birth.setTime(time);
		
		String str = sdf.format(birth);
		System.out.println("����10000��ļ�������:"+str);
		
	}
}









