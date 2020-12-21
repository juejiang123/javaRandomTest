/*
这是一行注释信息
数据类型不一样时，将会发生数据类型转换
自动类型转换（隐式）
	1.特点：代码不需要进行特殊处理，自动完成
	2.规则：数据范围从小到大
强制类型转换（显式）
注意事项：
	1.强制类型转换一般不建议使用，因为可能发生精度损失，数据溢出；
	2.byte/short/char这三种类型都可以发生数学运算，例如加法“+”，这三种在运算时，都会先提升成int类型，再计算。
switch语句注意事项：
	1.多个case后面的数值不可以重复；
	2.switch后面小括号当中只能是下列数据类型；
		1.基本数据类型:byte/short/char/int
		2.引用数据类型：String，enum枚举类
*/
public class HelloWorld{
	public static void main(String[] args){
		System.out.println("Hello,world");//单行注释
		System.out.println(1024);
		System.out.println(3.14);
		long num1=100;
		System.out.println(num1);
		double num2=2.5F;
		System.out.println(num2);
		float num3=30L;
		System.out.println(num3);
		int num4=(int)6000000000L;
		System.out.println(num4);
		int num5 = (int)3.5;
		System.out.println(num5);
		int num6 = (int)3.5F;
		System.out.println(num6);
		char zf1 = 'A';
		System.out.println(zf1+1);
		byte bt = 1;
		System.out.println(bt+2);
		short st = 30;
		short st1 = 40;
		int num7 = st+st1;
		System.out.println(num7);
		String s = "hello";
		System.out.println(s+(st1+bt+zf1+num5));

		int score = 98;
		if(score<0 || score>100){
			System.out.println("超出边界值");
		}else if(score>=90 && score<=100){
			System.out.println("优秀");
		}else if(score>=80 && score<90){
			System.out.println("好");
		}else if(score>=70 && score<80){
			System.out.println("良");
		}else if(score>=60 && score<70){
			System.out.println("好");
		}else {
			System.out.println("不及格");
		}
		int a=10;
		int b=30;
		int max = a>b? a : b;
		System.out.println(max);
		switch(max){
			case 10:
				System.out.println("最大值小");
				break;
			case 30:
				System.out.println("最大值大");
				// break;
			case 40:
				System.out.println("这个值不对");
				break;
			default:
				System.out.println("数据不合理");
			//	break;

		}


	}
}