package policy;

public interface Policy {
	double calSal(double sal);

	double calSal(double sal, double bonus);

	double calSal(double sal, double bouns, double tax);

}
