package com.zhangsan.app.model;

public class YearAnimalModel {
	/**
	 * 通过年龄判断生肖
	 * 
	 * @param age生肖
	 * @return 生肖
	 * @throws IllegalArgumentExecption 如果年龄为负数
	 */
	public static char judgeYearAnimalByAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("age必须大于0");
		}

		int year = 2019 - age;
		char result = doJudeYearAnimalByAge(age);

		return 0;
	}

	/**
	 * 
	 * @param year
	 * @param 猴鸡猪狗鼠牛虎兔龙蛇马羊
	 * @return
	 */
	private static char doJudeYearAnimalByAge(int year) {
		switch (year%12) {
		case 0:
			return '猴';
		case 1:
			return '鸡';
		case 2:
			return '猪';
		case 3:
			return '狗';
		case 4:
			return '鼠';
		case 5:
			return '牛';
		case 6:
			return '虎';
		case 7:
			return '兔';
		case 8:
			return '龙';
		case 9:
			return '蛇';
		case 10:
			return '马';
		case 11:
			return '羊';
		default:
			break;
		}
		return 0;

	}

	
}
