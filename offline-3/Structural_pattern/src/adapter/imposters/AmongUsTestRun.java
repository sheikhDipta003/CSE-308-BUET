package adapter.imposters;

public class AmongUsTestRun {
	public static void main(String[] args) {
		CrewMate red = new Red();
		Imposter redImp = new RedImp();
		CrewMate impAdapter = new ImpAdapter(redImp);

		System.out.print("<Red>: " + red.repairShip());
		System.out.print("<Imposter>: " + redImp.damageShip());
		System.out.print("<Imposter (after adapting) >: " + pretendCrewMate(impAdapter));
	}

	static String pretendCrewMate(CrewMate crewMate) {
		return crewMate.repairShip();
	}
}
