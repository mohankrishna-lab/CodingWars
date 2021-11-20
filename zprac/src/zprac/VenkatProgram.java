package zprac;

import java.util.ArrayList;
import java.util.List;

public class VenkatProgram {
	public static void main(String[] args) {
		List<Sellers> seller = new ArrayList<>();
		seller.add(new ABC(250000, 600000,150000,90000));
		seller.add(new DEF(175000,625000,250000,99999));
		seller.add(new GHI(225000,550000,185000,115000));
		seller.add(new JKL(255000, 700000, 142000, 125000));
		seller.add(new MNO(240000, 650000, 165000, 97000));
		
		int coliestProducts = 0;
		int whichProduct = 0;
		for (int i = 0; i < seller.size(); i++) {
			if (coliestProducts == 0) {
				coliestProducts = seller.get(i).total();
				whichProduct = i + 1;
			}else if (coliestProducts < seller.get(i).total()){
				coliestProducts = seller.get(i).total();
				whichProduct = i + 1;
			}
		}
		
		if (whichProduct == 1) {
			System.out.println("Mr.Mahajan, you can buy all your items from ABC for RS. " + coliestProducts);
		}else if (whichProduct == 2) {
			System.out.println("Mr.Mahajan, you can buy all your items from DEF for RS. " + coliestProducts);
		}else if (whichProduct == 3) {
			System.out.println("Mr.Mahajan, you can buy all your items from GHI for RS. " + coliestProducts);
		}else if (whichProduct == 4) {
			System.out.println("Mr.Mahajan, you can buy all your items from JKL for RS. " + coliestProducts);
		}else if (whichProduct == 5) {
			System.out.println("Mr.Mahajan, you can buy all your items from MNO for RS. " + coliestProducts);
		}
	}
}
