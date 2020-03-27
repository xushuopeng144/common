package com.xushuopeng.common.utils;

import java.util.Calendar;
import java.util.Date;
/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期工具类
 * @author: HASEE
 * @date: 2020年3月27日 上午10:53:45
 */
public class DateUtil {
    



	
	
	
	//返回一个月的第一天第一秒
	public static Date getInitMonth(Date date) {
		
		 Calendar c=Calendar.getInstance();
		 c.setTime(date);
		 c.set(Calendar.DAY_OF_MONTH, 1);
		 c.set(Calendar.HOUR_OF_DAY,0);
		 c.set(Calendar.MINUTE,0);
		 c.set(Calendar.SECOND,0);
		return c.getTime();
	}
	
	//返回一个月的最后一天最后一秒
	 public static Date getEndMonth(Date date) {
		 //创建日历类
		 Calendar c=Calendar.getInstance();
		 c.setTime(date);//传入参数初始化日历类
		 
		 //让传入的日期加一个月
		 c.add(Calendar.MONTH, 1);
		 
		 //调用月初方法变为下一个月的第一天
		 Date initMonth= getInitMonth(c.getTime());
		 //把得到的日期再初始化日历类
		 c.setTime(initMonth);
		 //把下一个月的第一天减一秒就是传入日期的最后一天最后一秒
		 c.add(Calendar.SECOND, -1);
		 return c.getTime();
		 
	 } 
	
	  /**
	   * 
	   * @Title: getAgeByBirthday 
	   * @Description: 根据出生日期算年龄
	   * @param date
	   * @return
	   * @return: int
	   */
	  public static int getAgeByBirthday(Date birthday) {
		  Calendar c = Calendar.getInstance();//获取日期类
		  int s_year =c.get(Calendar.YEAR);//获取系统的年
		  int s_month =c.get(Calendar.MONTH);//获取系统的月
		  int s_date =c.get(Calendar.DAY_OF_MONTH);//获取系统的日
		  c.setTime(birthday);//用出生日期初始日历类
		  int b_year = c.get(Calendar.YEAR);//获取出生的年
		  int b_month =c.get(Calendar.MONTH);//获取出生的月
		  int b_date =c.get(Calendar.DAY_OF_MONTH);//获取出生的日
		  //计算年龄
		 int age = s_year - b_year;
		 //如果系统月份小于b_month
		 if(s_month < b_month) {
			 age--; //年龄减少一岁
		 } 
		 //如果月份相等，但是系统的天小于出生的天
		 if(s_month == b_month &&s_date < b_date) {
			 age--; //年龄减少一岁
		 }
		return age;
		  
	  }
		
		/**
		 * 
		 * @Title: randomDate 
		 * @Description: 随机产生一个在startDate 和endDate 的随机日期
		 * @param startDate
		 * @param endDate
		 * @return 1970 .1.1 日
		 * @return: Date
		 */
		public static Date randomDate(Date startDate,Date endDate) {
			
			long t1 = startDate.getTime();//从1970到startDate 的毫秒数
			long t2 = endDate.getTime();//从1970到endDate 的毫秒数
			if(t2<t1)
			throw new RuntimeException("开始日期不能大于结束日期");
			
			//随机产生一个在t1 和t2 之间的毫秒数
			long t =(long) ((Math.random()* (t2-t1)) + t1);
			
			return new Date(t);
			
		}

	  
}
