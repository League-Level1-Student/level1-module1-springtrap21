package _05_vault;

public class jamesBond {
	int findCode(Vault v) {
	for(int i = 1; i < 100001; i++) {
		if(v.tryCode(i) == true) {
			return i;
		}
	}
	return -1;
	}
}

