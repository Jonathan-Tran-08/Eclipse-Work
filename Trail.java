
public class Trail {

	private int[] markers;
	
	public Trail(int[] m) {
		this.markers = m;
	}
	
	public boolean isLevelTrailSegment(int start, int end) {
		int minimum = markers[start];
		int maximum = markers[end];
		for(int i = start; i<=end; i++) {
			if(markers[i] < minimum) {
				minimum = markers[i];
			}
			if(markers[i] > maximum) {
				maximum = markers[i];
			}
			}
		
		return((maximum-minimum<=10));
	}
	
	public boolean isDifficult() {
		int changes = 0;
		for(int i = 1; i < markers.length; i++) {
			if(((markers[i]-markers[i-1])>=30)||(markers[i-1]-markers[i])>=30) {
				changes++;
			}
		}
		
		return (changes>=3);
	}
	
	
	
	
	
}
