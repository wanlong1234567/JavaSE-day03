package day03;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar
 * ������
 * ���������ڲ���ʱ��
 * ����ʵ����GregorianCalendar,��:����
 * 
 * Calendar�ṩ�˾�̬����:getInstance���ڻ�ȡ
 * һ����ǰϵͳ���ڵ������õ�ʵ���࣬�󲿷ֵ���
 * ���صĶ�����������ʵ����
 * @author adminitartor
 *
 */
public class Calendar_getInstance {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();	
		System.out.println(calendar);
		/*
		 * Calendar�ṩ�˷���:
		 * Date getTime()
		 * �÷����᷵��һ��Date���󣬸ö�������ʾ��
		 * ���ھ��ǵ�ǰCalendar����ʾ�����ڡ�
		 * 
		 * 
		 * void setTime(Date date)
		 * ʹ�ø�����Date�����õ�ǰCalendar��ʾ
		 * �����ڡ�
		 * 
		 * 
		 */
		Date date = calendar.getTime();
		System.out.println(date);
	}
}











