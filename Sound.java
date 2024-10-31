import java.util.*;

public class Sound {

	private int[] samples;
	
	
	public Sound (int[] s) {
		samples = s;
	}
	
	public int limitAmplitude (int limit) {
		int numChanged = 0;
		for(int i = 0; i < this.samples.length; i++) {
				if(samples[i] > limit) {
					samples[i] = limit;
					numChanged++;
				}	
				if(samples[i] < -limit) {
					samples[i] = -limit;
					numChanged++;
				}
			}		
		return numChanged;
	}
	
	public void trimSilenceFromBeginning() {
		int i = 0;
		while(samples[i] == 0) {
			i++;
		} 
	int[] newSamples = new int[samples.length-i];
	for(int j = 0; j< newSamples.length; j++) {
		newSamples[j] = samples[j+i];
	}
	this.samples = newSamples;
	System.out.println(Arrays.toString(samples));
	}
	


}

