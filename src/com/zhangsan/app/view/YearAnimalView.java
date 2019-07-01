package com.zhangsan.app.view;

import com.zhangsan.app.model.YearAnimalModel;
import com.zhangsan.app.util.ConsoleUtil;

public class YearAnimalView {
        
	private static Object coutinue;

	public static void paint() {
		System.out.println("欢迎使用生肖查询器");
		System.out.println("请输入您的年龄");
		
		int age=getAge();
		
		char animal=YearAnimalModel.judgeYearAnimalByAge(age);
		
		System.out.println("您的生肖是:"+animal);
	}
	
	/**
	 * 
	 * @return
	 */
	public static int getAge() {
		int age=0;
		while(true) {
			age=ConsoleUtil.readInt("请输入您的年龄(0-150)>",-1);

		   if(0<age&&age<150) {
				break;
		   	}else {
		   System.out.println("输入格式错误,请重新输入");
		   	}
			}
		            return age;
		}
	
	
}
