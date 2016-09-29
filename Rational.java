public class Rational {

    private int num;
    private int denom;

    public Rational() {
	this.num = 1;
	this.denom = 1;
    }

    @Override
    public String toString(){
	return num + "/" + denom;

    }
    
    public Rational(int num, int denom) {
	this.num = num;
	this.denom = denom;
    }

    
}
