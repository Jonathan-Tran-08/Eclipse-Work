
public class NumberCube {

   private int sides;
   
   //Constructor
   public NumberCube(int s) {
       this.sides = s;
   }
   
   public int toss() {
       double t = Math.random();
       //System.out.println(t);
       return (int)((t *sides)+1);//1 - sides
   }
}