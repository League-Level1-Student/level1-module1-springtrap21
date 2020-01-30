package _05_vault;

public class Runner {
public static void main(String[] args) {
	jamesBond james = new jamesBond();
	Vault boi = new Vault();
	int code = james.findCode(boi);james.findCode(boi);
	System.out.println("The code is " + code);
}
}
