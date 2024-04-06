/*
 * 
 * This class implements a library of movies
 *
 * @author runb-cs111
 *
 */


 public class MovieApp {

    private Movie[] items;     // keep movies in an unsorted array
    private int numberOfItems; // number of movies in the array
    
    /*
     * Default constructor allocates array with capacity for 20 movies
     */
    MovieApp () {
    /** COMPLETE THIS METHOD **/
            items= new Movie[20];
            numberOfItems=20;
    }
    
    /*
     * One argument constructor allocates array with user defined capacity
     *
     * @param capacity defines the capacity of the movie library
     */
    MovieApp (int capacity) {
    /** COMPLETE THIS METHOD **/
            items=new Movie[capacity];
            numberOfItems=capacity;
    }

    /*
     * Add a movie into the library (unsorted array)
     *
     * Inserts @m into the first empty spot in the array.
     * If the array is full (there is no space to add another movie)
     *   - create a new array with double the size of the current array
     *   - copy all current movies into new array
     *   - add new movie
     *
     * @param m The movie to be added to the libary
     *
     */
    public void addMovie (Movie m) {
    /** COMPLETE THIS METHOD **/
            for(int i=0;i<items.length;i++) {
                items[i]=m;
                if (i>items.length) {
                    Movie[] secitems=new Movie[items.length*2];
                    secitems=items;
                    secitems[i]=m;
                }
                else {
                    break;
                }
            }
    }

    /*
     * Removes a movie from the library. Returns true if movie is removed, false
     * otherwise.
     * The array should NOT become sparse after a remove, that is, all movies
     * should be in consecutive array indices.
     * 
     * @param m The movie to be removed
     * @return Returns true is movie is successfuly removed, false otherwise
     *
     */
    public boolean removeMovie (Movie m) {
            if (items.length>0) {
                for(int i=0;i>items.length;i--) {
                    items[i]=null;
                }
                return true;
        }
    /** COMPLETE THIS METHOD **/
    // THE FOLLOWING LINE IS A PLACEHOLDER TO MAKE THIS METHOD COMPILE
    // Change as needed for your implementation
    return false;
    }

    /*
     * Returns the library of movies
     *
     * @return The array of movies
     */
    public Movie[] getMovies () {
                return items;
    /** COMPLETE THIS METHOD **/
    // THE FOLLOWING LINE IS A PLACEHOLDER TO MAKE THIS METHOD COMPILE
    // Change as needed for your implementation
    //return null;
    }

    /*
     * Returns the current number of movies in the library
     *
     * @return The number of items in the array
     */
    public int getNumberOfItems () {
                    return numberOfItems;
    /** COMPLETE THIS METHOD **/
    // THE FOLLOWING LINE IS A PLACEHOLDER TO MAKE THIS METHOD COMPILE
    // Changed as needed for your implementation
    //return 0;
    }
    
    /*
     * Update the rating of movie @m to @ratings
     * 
     * @param @m The movie to have its ratings updated
     * @param @ratings The new ratings of @m
     * @return tue if update is successfull, false otherwise
     *
     */
    public boolean updateRating (Movie m, int ratings) {
        m.setRatings(ratings);
            if (ratings>=0&&ratings<=5&&m!=null) {
                return true;
            }
    /** COMPLETE THIS METHOD **/
    // THE FOLLOWING LINE IS A PLACEHOLDER TO MAKE THIS METHOD COMPILE
    // Changed as needed for your implementation    
            else {
            return false;   
            }
                
    }
    
    /*
     * Prints all movies
     */
    public void print () {
            //m=items;
            for (int i = 0; i < items.length; i++) {
                System.out.println(items.toString());
            }
    /** COMPLETE THIS METHOD **/
    }   

    /*
     * Return all the movies by @director. The array size should be the 
     * number of movies by @director.
     *
     * @param director The director's name
     * @return An array of all the movies by @director
     *
     */
    public Movie[] getMoviesByDirector (String director) {
        Movie[] listMovies = new Movie[items.length];
        int openspot = 0;
            for (int i = 0; i < items.length; i++) {
            Movie x = items[i];
                if(x.getDirector().equals(director) && openspot != items.length) {
                    listMovies[openspot] = x;
                    openspot++;
                }
            }
            return listMovies;
    /** COMPLETE THIS METHOD **/
    // THE FOLLOWING LINE IS A PLACEHOLDER TO MAKE THIS METHOD COMPILE
    // Changed as needed for your implementation    
    //return null;
    }
    
    /*
     * Returns all the movies made in @year. The array size should be the
     * number of movies made in @year.
     *
     * @param year The year the movies were made
     * @return An array of all the movies made in @year
     *
     */
    public Movie[] getMoviesByYear (int year) {
        Movie[] listMovies = new Movie[items.length];
        int openspot = 0;
            for (int i = 0; i < items.length; i++) {
            Movie x = items[i];
                if(x.getYear()==year && openspot != items.length) {
                    listMovies[openspot] = x;
                    openspot++;
                }
            }
    /** COMPLETE THIS METHOD **/
    // THE FOLLOWING LINE IS A PLACEHOLDER TO MAKE THIS METHOD COMPILE
    // Changed as needed for your implementation    
    //return null;
            return listMovies;
    }
    
    /*
     * Returns all the movies with ratings greater then @ratings. The array
     * size should match the number of movies with ratings greater than @ratings
     *
     * @param ratings
     * @return An array of all movies with ratings greater than @ratings
     *
     */
    public Movie[] getMoviesWithRatingsGreaterThan (int ratings) {
            Movie[] listMovies = new Movie[items.length];
            int openspot = 0;
            for (int i = 0; i < items.length; i++) {
                Movie x=items[i];
                if (ratings>x.getRatings()) {
                    listMovies[openspot] = x;
                    //return listMovies;
                    openspot++;
                    
                }
                else {
                    return null;
                }
            }
            return listMovies;
            
    /** COMPLETE THIS METHOD **/
    // THE FOLLOWING LINE IS A PLACEHOLDER TO MAKE THIS METHOD COMPILE
    // Changed as needed for your implementation    
    
    }
}
