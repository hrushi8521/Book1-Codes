package cons;

public class Manager extends Accounts {
	@Override
	public double calSal(double sal, double bonus) {
		return sal + bonus;
	}
}
