/**
 * 
 */
package com.hanlinonline.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * ѧϰʹ��lambda���ʽ Java8lambda��ʾʽʹ�ð��ո��������׵��ѽ���������Ҫ�漰�����¼������棺
 * 1�����ϵĵ���
 * 2��stream��ʹ��
 * 3��FunctionInterface
 * 
 * @author lazier
 */
public class LambdaTest {

	public static void main(String[] args) {
		testLambdaForeach();
		testStream();
		testFunctionalInterface();
	}

	/**
	 * �����µĵ���д��,forEach����һ��Consumer�������ݵ�����
	 */
	private static void testLambdaForeach() {
		List<String> testList = new ArrayList<>();
		testList.add("one");
		testList.add("two");
		testList.add("three");

		// ��ͳд��
		for (int i = 0; i < testList.size(); i++) {
			System.out.println(testList.get(i));
		}

		for (String str : testList) {
			System.out.println(str);
		}
		// ����ʽд��
		testList.forEach((str)->{System.out.println(str);});
		
		testList.forEach((str) -> System.out.println(str));
		
		//�ֿ�д
		Consumer<String> consumer = System.out::println;
		testList.forEach(consumer);
	}

	/**
	 * stream��ʹ��
	 * ��Ҫ�漰��java.util.steam��
	 * stream֪ʶ���Բο�https://www.ibm.com/developerworks/cn/java/j-lo-java8streamapi/
	 */
	private static void testStream() {
		Stream.of("one","two","three").filter(str->str.startsWith("t")).map(String::toUpperCase).forEach(System.out::println);
	}
	
	/**
	 * ���Ժ���ʽ�ӿڣ���Ҫ�漰��java.util.function��
	 * 
	 * ����ο����ӣ�http://colobu.com/2014/10/28/secrets-of-java-8-functional-interface/
	 */
	private static void testFunctionalInterface(){
		//��ͳд��
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("��ͳ�߳�������ʵ��");
			}
		}).start();
		// ����ʽд��
		new Thread(()->System.out.println("����ʽʵ��")).start();
		MyFunctionInteface myFunctionInteface = ()->System.out.println("my function Interface");
		myFunctionInteface.foo();
	}
	
	@FunctionalInterface
	private interface MyFunctionInteface{
		void foo();
	}
}
