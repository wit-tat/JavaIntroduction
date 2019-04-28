// Hello world

class Triangles {
	public static void main(String args[]) {
		double i, j, k;
		for( i = 1.0; i< 1000; i++) {
			for( j = i; j< 1000000; j++) {
				k = Math.sqrt(i*i + j*j);
				if ( ((k - Math.floor(k)) == 0) & (k-j==1)) System.out.println(i  + "\t" + j + "\t" + k);	
			}
		}
	}
}