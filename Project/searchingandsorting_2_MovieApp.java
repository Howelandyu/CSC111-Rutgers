import java.lang.reflect.Array;

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
     * Default constructor creates array with capacity for 20 movies
     */
    MovieApp () {
    items = new Movie[20];
    numberOfItems = 0;
    }
    
    /*
     * One argument constructor creates array with user defines capacity
     *
     * @param capacity defines the capacity of the movie library
     */
    MovieApp (int capacity) {
    items = new Movie[capacity];
    numberOfItems = 0;
    }

    /*
     * Add a movie into the library (unsorted array)
     *
     * If the library is full (there is no space to add another movie)
     *   - create a new array with double the size of the current array. 
     *   - copy all current movies into new array
     *   - add new movie
     *
     * @param m The movie to be added to the libary
     */
    public void addMovie (Movie m) {

    if (numberOfItems == items.length) {            
        // double the size of the array
        Movie[] old = items;
        items = new Movie[items.length*2];

        for (int i=0; i<old.length; i++) {
        items[i] = old[i];
        }
    }
    
    // insert in the first empty position
    items[numberOfItems] = m;
    numberOfItems += 1;
    }

    /*
     * Removes a movie from the library. Returns true if movie is removed, false
     * otherwise.
     * The array should not become sparse after a remove, that is, all movies
     * should be in consecutive indexes in the array.
     * 
     * @param m The movie to be removed
     *
     */
    public boolean removeMovie (Movie m) {

    for (int i=0; i<numberOfItems; i++) {
        if (m.equals(items[i])) {       
        // move the last movie into the ith position
        items[i] = items[numberOfItems-1];

        // remove the last movie from array
        items[numberOfItems-1] = null;
        numberOfItems -= 1;
        return true;
        }
    }
    return false;
    }

    /*
     * Returns the library
     *
     * @return The array of movies
     */
    public Movie[] getMovies () {
    return items;
    }

    /*
     * Returns the current number of movies in the library
     *
     * @return The number of items in the array
     */
    public int getNumberOfItems () {
    return this.numberOfItems;
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
    for (int i=0; i<numberOfItems; i++) {
        if (m.equals(items[i])) {
        // found @m
        m.setRatings(ratings);
        return true;
        }
    }
    return false;
    }
    
    /*
     * Prints all movies
     */
    public void print () {
    for (int i=0; i<numberOfItems; i++) {
        System.out.println(items[i]);
    }
    }

    /*
     * Return all the movies by @director. The array size should be the 
     * number of movies by @director.
     *
     * @param director The director's name
     * @param An array of all the movies by @director
     *
     */
    public Movie[] getMoviesByDirector (String director) {
    
    int cnt = 0;
    // 1. finds out how many movies are made by @director
    for (int i=0; i<numberOfItems; i++){
        if (items[i].getDirector().equalsIgnoreCase(director)) {
        cnt += 1;
        }
    }

    // 2. create array with exact cnt movies made by @director
    Movie[] arr = new Movie[cnt];
    cnt = 0;
    for (int i=0; i<numberOfItems; i++){
        if (items[i].getDirector().equalsIgnoreCase(director)) {
        arr[cnt++] = items[i];
        }
    }
    return arr;
    }
    
    /*
     * Return all the movies made in @year. The array size should be the
     * number of movies made in @year.
     *
     * @param year The year the movies were made
     * @return An array of all the movies made in @year
     *
     */
    public Movie[] getMoviesByYear (int year) {
    
    int cnt = 0;
    // 1. finds out how many movies are made on @year
    for (int i=0; i<numberOfItems; i++){
        if (items[i].getYear() == year) {
        cnt += 1;
        }
    }

    // 2. create array with exact cnt movies made on @year
    Movie[] arr = new Movie[cnt];
    cnt = 0;
    for (int i=0; i<numberOfItems; i++){
        if (items[i].getYear() == year) {
        arr[cnt++] = items[i];
        }
    }
    return arr;
    }
    
    /*
     * Return all the movies with ratings greater then @ratings
     *
     * @param ratings
     * @return An array of all movies with ratings greater than @ratings
     *
     */
    public Movie[] getMoviesWithRatingsGreaterThan (int ratings) {
    Movie[] arr = new Movie[numberOfItems];
    int cnt = 0;
    for (int i=0; i<numberOfItems; i++){
        if (items[i].getRatings() > ratings ) {
        arr[cnt++] = items[i];
        }
    }
    return arr;
    }
    
    /*
     * Search for movie name @name using the iterative binary search algorithm.
     * Assumes the array items is sorted
     */
    public Movie searchMovieByName (String name) {
            String moviena=name;
            while (name.length() <=getmoviesName().length) {
              int midnam = (name.length() + getmoviesName().length) / 2;
              if (name== getmoviesName(midnam).length) {
                  return midnam;
              } 
              else if (name > getmoviesName[midnam]) {
                  name = getmoviesName(midnam+1);
              } 
              else {
                  getmoviesName().length = midnam - 1;
              }
          }

          return midnam;
            
    /** COMPLETE THIS METHOD **/
    // THE FOLLOWING LINE IS A PLACEHOLDER TO MAKE THIS METHOD COMPILE
    // Changed as needed for your implementation
    return null;
    }
    
    /*
     * Sorts movies (items field) by year using insertion sort
     */
    public void sortByYear () {
            int moviye=getMoviesByYear();
            for (int i = 1; i < getmovies().length; i++) {
                int key = moviye[i];
                int j = i - 1;
                while (j >= 0 && moviye[j] > key) {
                    moviye[j+ 1] = moviye[j];
                    j--;
                }
                moviye[j+1]=key;
            }
            return moviye;
    /** COMPLETE THIS METHOD **/
    }
    
    /*
     * Sorts array of movies by name using selection sort
     */
    public void sortByName () {
          Movie[] movinam=getMovies();
          for(int i = 0; i <movinam.length - 1; i++) {
              int k = i;
              for(int j = k + 1; j < movinam.length; j++){
                  if(movinam[j] != movinam[k]){ 
                      k = j; 
                  }
              }
              if(i != k){  
                  Movie temp = movinam[i];
                  movinam[i] = movinam[k];
                  movinam[k] = temp;
              }   
          }
          
    /** COMPLETE THIS METHOD **/
    }
    
    /*
     * Search for movie @name using recursive linear search
     */
    public static Movie searchMovieByName (String name, Movie[] movies, int l, int r) {
        int[] temp = new int[name.length+1];   
        for(int i=0;i<name.length;i++){  
            temp[i] = name[i];  
        }  
        temp[name.length] = movies;  
        int result = 0;   
        for(int i=0;;i++){  
            if(temp[i] == movies){  
                result = i;  
                break;  
            }  
        }  
        if(result <name.length){  
            return result;  
        }
        else{  
                return null; 
        }    
        
    /** COMPLETE THIS METHOD **/
    // Changed as needed for your implementation
    
    }
}
