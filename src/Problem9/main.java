package Problem9;

public class main {

	public static void main(String[] args) {
		main solution = new main();
		Integer result = solution.findABCProduct();
		System.out.println(result);
		//System.out.println(solution.isPerfectSquare(225));
	}

	public Integer findABCProduct() {
		Integer product = 0;
		Integer aSquare = 0;
		Integer bSquare = 0;
		Integer cSquare = 0;
		for(int i=1; i<=1000; i++) {
			for(int j=1; j<=1000; j++) {
				aSquare = getSquare(i);
				bSquare = getSquare(j);
				cSquare = aSquare + bSquare;
				if(isPerfectSquare(cSquare)) {
					if(i+j+Math.sqrt(cSquare) == 1000) {
						return i*j*(int)Math.sqrt(cSquare);
					}
				}
			}
		}
		return product;
	}
	
	public Integer getSquare(int a) {
		return a*a;
	}
	
	public boolean isPerfectSquare(Integer a) {
		double squareRoot = Math.sqrt(Double.parseDouble(a.toString()));
		return getSquare((int) squareRoot).equals(a);
	}
}
