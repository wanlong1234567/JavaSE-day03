package day03;

import java.util.Calendar;

/**
 * void set(int field,int value)
 * ��ָ����ʱ���������ָ����ֵ
 * @author adminitartor
 *
 */
public class Calendar_set {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		/*
		 * ����Ϊ2008-08-08 20:08:08
		 */
		//������
		calendar.set(Calendar.YEAR, 2008);
		calendar.set(Calendar.MONTH,Calendar.AUGUST);
		calendar.set(Calendar.DAY_OF_MONTH,8);
		calendar.set(Calendar.HOUR_OF_DAY,20);
		calendar.set(Calendar.MINUTE,8);
		calendar.set(Calendar.SECOND,8);
		System.out.println(calendar.getTime());
		/*
		 * ����ĳЩʱ�������ֵ���ܵ�������ʱ��
		 * ����ֵ�ı仯
		 * ����:�������ܼ��󣬶�Ӧ������Ҳ��ı�
		 */
		calendar.set(Calendar.DAY_OF_WEEK,4);
		System.out.println(calendar.getTime());
		/*
		 * ��������ʱ�������Ӧ��ֵ�����䷶Χ��
		 * Calendar���Զ���λ��
		 */
		calendar.set(Calendar.DAY_OF_MONTH,32);
		System.out.println(calendar.getTime());
	}
}








