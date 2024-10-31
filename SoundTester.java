import java.util.Arrays;

public class SoundTester {

	public static void main(String[] args) {
		
	int[] samples1 = {40,2532,17,-2300,-17,-4000,2000,1048,-420,33,15,-32,2030,3223};
	int[] samples2 = {1923,32,8429,3023,23123,384,239023,392,122,400,343,5839};
	int[] samples3 = {0,0,0,0,-14,0,-35,-39,0,-7,16,32,37,29,0,0};
	
	Sound number1 = new Sound(samples1);
	Sound number2 = new Sound(samples2);
	Sound number3 = new Sound(samples3);
	
	
	System.out.println(number1.limitAmplitude(2000));
	System.out.println(Arrays.toString(samples1));
	System.out.println(number2.limitAmplitude(1000));
	number3.trimSilenceFromBeginning();
	
	}

}
