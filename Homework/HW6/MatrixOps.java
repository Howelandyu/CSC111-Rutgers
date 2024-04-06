
public class MatrixOps{
	public static double[][] multiply(double[][] matrixfir,double[][] matrixsec){
		int row1=matrixfir.length;
		int row2=matrixsec.length;
		int column1=matrixfir[0].length;
		int column2=matrixsec[0].length;
		double[][] matrixfin=new double[matrixfir.length][matrixsec[0].length];
		if(column1!=row2){
		    System.out.println("The matrix cannot be multiplied");
		    return null;
		}
		for(int i=0; i<row1;i++){
			for(int j=0;j<column2;j++){
				for(int a=0;a<column1;a++){
					matrixfin[i][j]+=matrixfir[i][a]*matrixsec[a][j];
				}
			}
		}
		return matrixfin;
	}
}