
public class Flight {
	private Time DepartureTime;
	private Time ArrivalTime;

	public Flight(Time d, Time a) {
		DepartureTime = d;
		ArrivalTime = a;
	}

	public Time getDepartureTime() {
		return DepartureTime;
	}

	public Time getArrivalTime() {
		return ArrivalTime;
	}
}
