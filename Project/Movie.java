public class Movie {
	private String movieName;
	private int movieYear;
	private String movieDirector;
	private String movieDescri;
	private int movierate;

	Movie(){
		movieName=new String();
		movieDirector=new String();
		movieDescri=new String();
	}
	Movie(String movieName,String movieDirector,String movieDescri){
		this.movieName=movieName;
		this.movieDirector=movieDirector;
		this.movieDescri=movieDescri;
	}

	Movie(String setmovieName,int setmovieYear,String setMovieDirector, 
	String setMovieDescri,int setmovierate){
		movieName=setmovieName;
		movieYear=setmovieYear;
		movieDirector=setMovieDirector;
		movieDescri=setMovieDescri;
		movierate=setmovierate;
	}
	
	
	public void setmovieName(String newmovieName){
		this.movieName=newmovieName;
	}
	public void setmovieYear(int newmovieYear){
		movieYear=newmovieYear;
	}
	public void setMovieDirector(String newmovieDirctor){
		this.movieDirector=newmovieDirctor;
	}
	public void setMovieDescri(String newDescri){
		this.movieDescri=newDescri;
	}
	public void setmovierate(int newmovierate){
		movierate=newmovierate;
	}

	
	
	public String getmovieName(){
		return movieName;
	}
	public int getmovieYear(){
		return movieYear;
	}
	public String getmovieDirector(){
		return movieDirector;
	}
	public String getmovieDescri(){
		return movieDescri;
	}
	public int getmovierate(){
		return movierate;
	}

	public String toString(){
		return "Movie Name is "+movieName+" and the public year is "+movieYear+"The director is "+
		movieDirector+" The movie decription is "+movieDescri+"The rate is "+movierate;
	}

	public boolean equals(Object other){
		if (other==null||!(other instanceof Movie)){
			return false;
		}
		Movie o=(Movie)other;
		return this.movieName.equals(o.getmovieName())&&this.movieYear==o.getmovieYear();
	}
	public int compareTo(Movie other){
		return this.movieName.compareTo(other.getmovieName());

	} 

	public static void main(String[] args) {
		Movie gan=new Movie();
		Movie sai=new Movie();


			sai.setmovieName("Harry Potter");
			System.out.println(sai.getmovieName());
			gan.setmovieYear(2013);
			System.out.println(gan.getmovieYear());
			sai.setMovieDirector("don't know");
			System.out.println(sai.getmovieDirector());
			sai.setMovieDescri("magic movie");
			System.out.println(sai.getmovieDescri());
			gan.setmovierate(4);
			System.out.println(gan.getmovierate());
	}
}