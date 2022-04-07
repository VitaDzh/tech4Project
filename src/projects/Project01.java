package projects;

public class Project01 {
    public static void main(String[] args) {

        //Task-1
        String name = "Vita";
        System.out.println("My name is" + " " + name);
        System.out.println();

        //Task-2
        char letter1 = 'V';
        char letter2 = 'i';
        char letter3 = 't';
        char letter4 = 'a';
        System.out.println("Name letter 1 is" + " " + letter1);
        System.out.println("Name letter 2 is" + " " + letter2);
        System.out.println("Name letter 3 is" + " " + letter3);
        System.out.println("Name letter 4 is" + " " + letter4);
        System.out.println();

        //Task-3
        String myFavMovie = "\"Interstellar\"";
        String myFavSong = "\"Take it easy\"";
        String myFavCity = "Kiev";
        String myFavActivity = "Yoga";
        String myFavSnack = "apple";
        String beforeSentence = "My favourite city is ";

        System.out.println("My favorite movie is" + " " + myFavMovie);
        System.out.println("My favourite song is" + " " + myFavSong);
        System.out.println("My favourite city is" + " " + myFavCity);
        System.out.println("My favourite activity is" + " " + myFavActivity);
        System.out.println("My favourite snack is an" + " " + myFavSnack);
        System.out.println(beforeSentence .concat(myFavCity));
        System.out.println("My fav snack is " .concat(myFavSnack));
        System.out.println();

        //Task-4
        int myFavNumber = 8;
        int numberOfStatesIVisited = 5;
        int numberOfCountriesIVisited = 12;

        System.out.println("My fav number is" + " " + myFavNumber);
        System.out.println("I've visited" + " " + numberOfStatesIVisited + " " + "states");
        System.out.println("I've visited" + " " + numberOfCountriesIVisited + " " + "countries");
        System.out.println();

        //Task-5
        boolean amIAtSchoolToday = false;
        System.out.println("I am at school today =" + " " + amIAtSchoolToday);

        //Task-6
        boolean isWeatherNiceToday = false;
        System.out.println( "Weather is nice today =" + " " + isWeatherNiceToday);


    }

}
