public class NumberCubeTester {

   public static void main(String[] args) {
       // TODO Auto-generated method stub
       NumberCube cubey = new NumberCube(6);
       /*for(int i=0; i<100; i++)
           System.out.println(cubey.toss());*/
       
       NumberCubeSim sim1 = new NumberCubeSim(cubey);
       int[] data = sim1.getCubeTosses(10);
       for(int i=0; i<data.length; i++) {
           System.out.print(data[i]+ " ");
           
       }
       System.out.println("longest run " + sim1.getLongestRun(data));
           
   }

}