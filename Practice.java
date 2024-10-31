
public class Practice {
	
	public static void main(String[] args) {
		int[]array = {3, 4, 2, 1, 5};
		
		
		
		System.out.println(array[1]);
		String name = "computer science";
		System.out.println(name.substring(0,8));
		int sum = 0;
		
		for(int i = 0; i<array.length; i++)
		System.out.println(array[i]+" ");
		
		for(int i = 0; i<name.length(); i++)
			System.out.print(name.substring(i,i+1)+ " ");
		
		System.out.println();
		for(int i = 0; i<array.length; i++)
		sum+=array[i];
			System.out.print(sum);
	}

}
