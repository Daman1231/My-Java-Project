package Week11_Assignment;

public class R2 extends Rocket {

	public R2() {
		// Rocket Weight and max Weight
		super(18000, 29000, 120);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean land() {
		// TODO Auto-generated method stub
		int random = (int) (Math.random() * 100) + 1;
		// if random is greater than given value then it will land otherwise will
		// explode.
		if (random > 8 * (maximumWeight / rocketWeight)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean launch() {
		// TODO Auto-generated method stub
		int random = (int) (Math.random() * 100) + 1;
		if (random > 4 * (maximumWeight / rocketWeight)) {
			return true;
		} else {
			return false;
		}
	}

}
