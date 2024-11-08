public class APCalendar {
	
	public APCalendar() {
		
	}
	private boolean isLeapYear(int year) {
		return ((year%4==0&&year%100!=0)||(year%400==0));
	}
	
	private int numberOfLeapYears(int year1, int year2) {
		int count = 0;
		for(int i = year1; i < year2+1; i++) {
			
		}
		
		return count;
	}
	
	public int firstDayOfYear (int year) {
		int difference = Math.abs(year - 2012);
		int leapYearCount = numberOfLeapYears(year,year+difference);
		int findFirst = (difference+leapYearCount)%7;
		return findFirst-1;
	}
	
	private int dayOfYear (int month, int day, int year) {
		return 0;
	}
	
	public int dayOfweek(int month, int day, int year) {
		return 0;
	}
	
}
