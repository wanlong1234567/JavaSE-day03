package day03;

import java.util.Calendar;

/**
 * void add(int field,int value)
 * ��ָ����ʱ������Ӹ�����ֵ����������ֵΪ����
 * ���Ǽ�ȥ��
 * @author adminitartor
 *
 */
public class Calendar_add {
	public static void main(String[] args) {
		/*
		 * �鿴3����2���µ�ǰ25���Ժ����ܵ�����������?
		 */
		Calendar calendar = Calendar.getInstance();
		//+3��
		calendar.add(Calendar.YEAR, 3);
		//+2��
		calendar.add(Calendar.MONTH, 2);
		//-25��
		calendar.add(Calendar.DAY_OF_YEAR, -25);
		
		calendar.set(Calendar.DAY_OF_WEEK, 6);
		System.out.println(calendar.getTime());
		
	}
}







