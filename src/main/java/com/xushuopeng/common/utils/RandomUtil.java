package com.xushuopeng.common.utils;

import java.util.HashSet;
import java.util.Random;

/**
 * 
 * @ClassName: RandomUtil 
 * @Description: 随机数工具类
 * @author: 许硕鹏
 * @date: 2020年3月26日 上午9:00:41
 */
public class RandomUtil {
	static Random r=new Random();
	public static int random(int min, int max){
		//TODO 实现代码
		
		
		return min + r.nextInt(max-min+1);
		
		}
		//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
		public static int[] subRandom (int min, int max, int subs) throws IllegalAccessException{
			
		//TODO 实现代码
			 if (subs > max-min+1) {
				throw new IllegalAccessException("subs参数异常");
			}else {
			int[] x=new int[subs];
			HashSet<Integer> set=new HashSet<Integer>();
			while(set.size()!=subs) {
				set.add(random(min, max));
			}
			int i=0;
			for (Integer integer : set) {
				x[i] = integer;
				i++;
			}
			
			return x;
			}
		}
		//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
		public static char randomCharacter (){
		
		//TODO 实现代码
			
			String str="123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
 			return str.charAt(random(0,str.length()-1));
		}
		//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
		public static String randomString(int length){
			StringBuffer sb=new StringBuffer();
			for (int i = 0; i < length; i++) {
				sb.append(randomCharacter());
			}
			return sb.toString();
		//TODO 实现代码
		}

}
