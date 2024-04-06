public class Party{
	public static void main(String[] args) {
		System.out.print("How many people?");
		int people=IO.readInt();
		System.out.print("The number of slices of pizza each people need: ");
		int slicePizza=IO.readInt();
		IO.outputIntAnswer(slicePizza);
		System.out.print("The number of each people need soda: ");
		int boxSoda=IO.readInt();
		IO.outputIntAnswer(boxSoda);
		System.out.print("How much the pizza");
		double costPizza=(double)IO.readDouble();
		System.out.println("The cost of a pizza pie is ");
		IO.outputDoubleAnswer(costPizza);
		System.out.println("The number slices in a pizza is: 8 ");
		System.out.print("How much a box of soda");
		double costSoda= (double)IO.readDouble()*people;
		System.out.println("The number soda in a box is: 72");


		int numpiere=slicePizza%8;
		double TotalmonPie;
		if (numpiere==0.0) {
			int numpie=(people*slicePizza)/8;
			TotalmonPie=numpie*costPizza;
			//IO.outputIntAnswer(numpie);			
		}
		else{
			int numpie=(people*slicePizza)/8+1;
			TotalmonPie=numpie*costPizza;
			//System.out.print("The number of pies is: ");
			//IO.outputIntAnswer(numpie);	
		}

		int numsodare=boxSoda%72;
		double Totalsoda;
		if (numsodare==0.0){
			int numSodabox=(people*boxSoda)/72;
			Totalsoda=numSodabox*costSoda;
			//System.out.print("The number is ");
			//IO.outputIntAnswer(numSodabox);	
		}
		else{
			int numSodabox=(people*boxSoda)/72+1;
			Totalsoda=numSodabox*costSoda;
		}
			//IO.outputIntAnswer(numSodabox);	
		IO.outputDoubleAnswer(TotalmonPie+Totalsoda);
	}	
}