package day03;

import java.util.Calendar;

/**
 * int get(int field)
 * ��ȡ��ǰCalendar��ָ��ʱ���������Ӧ��ֵ��
 * ����Ϊָ����ʱ���������ӦCalendar�ṩ��
 * ��س���ֵ��
 * @author adminitartor
 *
 */
public class Calendar_get {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();	
		//��ȡ��?
		int year = calendar.get(Calendar.YEAR);
		//��ȡ��
		int month = calendar.get(Calendar.MONTH)+1;
		/*
		 * ��ȡ��
		 * ������صĳ���:
		 * DATE:���е��죬��DAY_OF_MONTHһ��
		 * DAY_OF_MONTH:���е���
		 * DAY_OF_WEEK:�����е���
		 * DAY_OF_YEAR:���е���
		 */
		int day = calendar.get(Calendar.DATE);
		
		System.out.println(year+"-"+month+"-"+day);
		
		int h = calendar.get(Calendar.HOUR_OF_DAY);
		int m = calendar.get(Calendar.MINUTE);
		int s = calendar.get(Calendar.SECOND);
		System.out.println(h+":"+m+":"+s);
		
		
		int doy = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("�����ǽ���ĵ�:"+doy+"��");
		
		/*
		 * ��ȡָ��ʱ���������������ֵ
		 */
		int days = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("����һ��"+days+"��");
		System.out.println("���껹ʣ:"+(days-doy)+"��");
	}
}








