package ua.lviv.lgs;

public class task3 {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle ();
		Rectangle rect2 = new Rectangle (2, 5);
		
		System.out.println(rect1);
		System.out.println(rect2);
		
		System.out.println("������� �������������� #1 = " + rect1.rectArea (rect1.getLength(), rect1.getWidth()));
		System.out.println("�������� �������������� #1 = " + rect1.rectPerimeter (rect1.getLength(), rect1.getWidth()));
		
		System.out.println("������� �������������� #2 = " + rect2.rectArea (rect2.getLength(), rect2.getWidth()));
		System.out.println("�������� �������������� #2 = " + rect2.rectPerimeter (rect2.getLength(), rect2.getWidth()));
	
		System.out.println();

		
		Circle circle1 = new Circle (3.5, 7);
		Circle circle2 = new Circle (2.4, 4.8);
		
		System.out.println(circle1);
		System.out.println(circle2);
		
		System.out.println("������� ����� #1 = " + circle1.circleArea(circle1.getDiameter()));
		System.out.println("����� ����� #1 = " + circle1.circleLength(circle1.getRadius()));
		
		System.out.println("������� ����� #2 = " + circle2.circleArea(circle2.getDiameter()));
		System.out.println("����� ����� #2 = " + circle2.circleLength(circle2.getRadius()));
		
	}
}