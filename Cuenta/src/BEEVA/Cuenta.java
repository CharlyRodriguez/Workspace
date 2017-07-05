package BEEVA;

public class Cuenta {
protected double balance;

public double getBalance(){
	return balance;
}

public double Deposito(double dep){
	balance=balance+ dep;
	return balance;
}
public double Retiro(double ret){
	balance=balance- ret;
	return balance;
}

}
