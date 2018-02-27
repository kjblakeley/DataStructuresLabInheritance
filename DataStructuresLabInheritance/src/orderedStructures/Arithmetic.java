package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() {
		if(firstValueFlag = false)
			throw new IllegalStateException("Invalid; firstValue() hasn't been called") ;
		
		current = current + commonDifference; 
		return current;
	}
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 

		double value = this.firstValue()+ (this.commonDifference* n-1);
		
		return value; 
	} 
	
	public String toString(){
		return "Arith("+(int)this.firstValue() +"," +(int)this.commonDifference+")";
	}
}
