package day16_classes_and_objects;

public class CellPhone_Store {

	public static void main(String[] args) {
		
		// Scanner input = new Scanner();
				CellPhone samsung = new CellPhone();
				
//				int num = 5;  primitives can hold just one data point, non-primitives can hold multiple data points inside
				
				
				samsung.brand = "Samsung Galaxy";
				samsung.memorySize = 64;
				samsung.price = 499.99;
				
				System.out.println("My phone's brand is " + samsung.brand);
				System.out.println("The memory size is " + samsung.memorySize);

				samsung.call();
				samsung.takePicture();
				samsung.buy();
				// methods have () at the end, variables - don't
				
				CellPhone iphone = new CellPhone();
				iphone.brand = "iPhone 7";
				iphone.memorySize = 128;
				iphone.price = 699;
				
				iphone.buy();
				
				CellPhone htc = new CellPhone();
				htc.brand = "HTC One";
				htc.memorySize = 16;
				htc.price = 0;
				
				CellPhone huawei = new CellPhone();
				System.out.println("My Huawei's memory size is " + huawei.memorySize);
				System.out.println("My Huawei is affordable - " + huawei.isAffordable);
				
				huawei.call();
				huawei.takePicture();
				
				
				System.out.println("My phone is " + iphone.brand + ", it's memory size is " + iphone.memorySize);
				
				

	}

}
