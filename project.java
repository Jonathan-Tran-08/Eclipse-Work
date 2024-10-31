package secondProject;

public class project {
	
	public static boolean more20(int n) {
		  if (n%20 == 0 || n%20>2){
		    return false;
		  } else
		  return true;
		}
	public static boolean twoAsOne(int a, int b, int c) {
		  if(a + b == c || b + c == a || a + c == b) {
		    return true;
		  } else
		  return false;
		}
	public static boolean inOrder(int a, int b, int c, boolean bOk) {
		  if (bOk == true && c > b){
		    return true;
		  } else if (b > a && c > b){
		    return true;
		  } else
		  return false;
		}
	public static int sumLimit(int a, int b) {
		  int sum = a + b;
		  if(String.valueOf(sum).length() > String.valueOf(a).length()){
		    return a;
		  } else
		  return a + b;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(more20(20));
		System.out.println(more20(21));
		System.out.println(more20(22));
		System.out.println(twoAsOne(1, 2, 3));
		System.out.println(twoAsOne(3, 1, 2));
		System.out.println(twoAsOne(3, 2, 2));
		System.out.println(inOrder(1, 2, 4, false));
		System.out.println(inOrder(1, 2, 1, false));
		System.out.println(inOrder(1, 1, 2, true));
		System.out.println(sumLimit(2, 3));
		System.out.println(sumLimit(8, 3));
		System.out.println(sumLimit(8, 1));
	}

}
