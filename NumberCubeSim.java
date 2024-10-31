public class NumberCubeSim {

   private NumberCube cube;
   
   public NumberCubeSim(NumberCube c) {
       cube = c;
   }
   
   public int[] getCubeTosses(int numTosses) {
       int[] tosses = new int[numTosses];
       
       for(int i=0; i<numTosses; i++) {
           tosses[i]=cube.toss();
       }
       
       return tosses;
   }
   
   public int getLongestRun(int[] values) {
       int maxLength = 1;
	   int maxIndex = -1;
	   int runLength = 1;
	   int runIndex = 0;
	 for(int i = 1; i < values.length; i++) {
		 if(values[i] == values[runIndex]) {
			 runLength++;
			 if(runLength > maxLength) {
				 maxIndex = runIndex;
				 maxLength = runLength;
			 }
		 } else {
			 runIndex = i;
			 runLength = 1;
		 }
	 }
	   return maxIndex;
   }
}






