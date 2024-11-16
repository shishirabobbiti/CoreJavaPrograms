public class Code12{
	public static void main(String[] args){
		int[] a=new int[2];
		int[][] a1=new int[2][4];
		a[0]=1;
		a[1]=2;
		a1[0][0]=1;
		a1[0][1]=2;
		a1[0][2]=3;
		a1[0][3]=4;
		System.out.println(a1[0][2]);
		//System.out.println(a[2]);
		for(int b :a){
			System.out.println(b);
		}

		
	}
}