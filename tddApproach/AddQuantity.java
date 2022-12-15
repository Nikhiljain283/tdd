package tddApproach;

public class AddQuantity {

	public void addBothQuanInch(int num1, int num2) {
		System.out.println(num1+num2);
		
	}
	
	public void addBothQuanfeet(int num1, int num2) {
		int num = (num1*12)+(num2*12);
		System.out.println(num);
		
	}
	
	public void addFirstQuanfeetSecondInch(int num1, int num2) {
		int num = num1*12;
		System.out.println(num + num2);

	}
	
	public void addFirstQuanInchSecondCm(double num1, double num2) {
		double num = num2/2.5;
		System.out.println(num + num1);
	}
	
	public void addFirstQuanGallonSecondLitre(double gallon, double litre) {
		double quan1 = gallon * 3.78;
		System.out.println(quan1 + litre);
	}
	
	public void addFirstQuanLitreSecondml(double litre, double ml) {
		double quan1 = ml / 1000;
		System.out.println(quan1 + litre);
	}
	
	public void addFirstQuanToneSecondGm(double tone, double gm) {
		double quan1 = tone * 1000;
		double quan2 = gm/1000;
		System.out.println(quan1 + quan2);
	}
	

	
	public static void main(String[] args) {
		AddQuantity quantity = new AddQuantity();
		quantity.addBothQuanInch(56, 21);
		quantity.addBothQuanfeet(2, 3);
		quantity.addFirstQuanfeetSecondInch(2, 5);
		quantity.addFirstQuanInchSecondCm(2, 2.5);
		quantity.addFirstQuanGallonSecondLitre(1, 3.78);
		quantity.addFirstQuanLitreSecondml(2, 3000);	
		quantity.addFirstQuanToneSecondGm(1, 1000);
		
	}
	
}
