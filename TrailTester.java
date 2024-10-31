
public class TrailTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] everestData = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
		int[] appalachianData = {20,30,20,30,23,21,26,28,28,30,23,22,27};
		Trail basecamp = new Trail(everestData);
		Trail homebase = new Trail(appalachianData);
		System.out.println(basecamp.isLevelTrailSegment(2,12));
		System.out.println(basecamp.isDifficult());
		System.out.println(homebase.isLevelTrailSegment(1, 9));
		System.out.println(homebase.isDifficult());
	}

}
