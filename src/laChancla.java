
public class laChancla {
double price = 12.50;
String color = "black";
	void coupon(double percentOff) {
		this.price -= price * (percentOff/100);
		System.out.println(price);
	}
	void color() {
		System.out.println("for some " + color + " chanclas.");
	}

}
