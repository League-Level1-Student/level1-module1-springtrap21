package _05_vault;

import java.util.Random;

public class Vault {
	int secretCode = new Random().nextInt(100000)+1;
	boolean tryCode(int code) {
		if(code == secretCode) {
		return true;
	}
	else {
		return false;
}
}
}