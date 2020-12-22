package chapter06_Class.sec13_Modifier.part01_Class_Access.pack01;

import chapter06_Class.sec13_Modifier.part01_Class_Access.pack02.Cherry;

/* public 클래스 */
public class Banana {
	/* default 클래스 이지만 Banana와 같은 패키지에 속하는 Apple 클래스 접근 가능 */
	Apple apple;
	
	/* Banana와 다른 클래스 이지만 public으로 선언된 Cherry 클래스 접근 가능. */
	//단, Cherry 클래스가 속한 패키지 import 해야함.
	Cherry cherry;
}
