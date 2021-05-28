package Assignments;

public class March1st {
    public static class House {
        public static void main(String[] args){
            String houseType= "Single House";
            byte numberOfBedrooms= 5;
            int numberOfBathrooms= 4;
            short numberOfKitchen= 1;
            boolean isThereABasement= true;
            Boolean isThereAnAttic= false;
            boolean isThereAPool= false;
            String isTheHouseForSale= "yes";
            String costOfTheHouse= "500k";
            String address= "500 arbor st.brooklyn, NY, 02768";
            boolean isAparkNearBy= true;
            int ratingOfSurroundingSchoolDistricts= 5;
            System.out.println("House Type: " +houseType);
            System.out.println("Number of Bedrooms: "+ numberOfBathrooms);
            System.out.println("Number of Kitchen: "+ numberOfKitchen);
            System.out.println("Has Basement: "+ isThereABasement);
            System.out.println("Is there an attic?:" + isThereAnAttic);
            System.out.println("Is There A Pool?: "+ isThereAPool);
            System.out.println("Is The House for Sale?: "+ isTheHouseForSale);
            System.out.println("Cost of the House: " + costOfTheHouse);
            System.out.println("House address: "+ address);
            System.out.println("Park is near by: " + isAparkNearBy);
            System.out.println("Rating for School: "+ ratingOfSurroundingSchoolDistricts);



    /*
    Create the following variables:
            house type,
            number of bedrooms, number of bathrooms, number of kitchens,
            is there a basement?,
            is there an attic, is there a pool,
            is the house for sale?, cost of the house, address, zipcode,
            is a park near by,
            Rating of surrounding school districts (out of 5),
     */
        }
    }

    public static class Movie {
        public static void main(String[] args){
            String movieName= "Happy Penquin";
            String releaseDate= "03.03.2014";
            String genre= "Comedy";
            int rottenTomatoesRating= 9;
            int rating= 5;
            String duration= "180 minutes";
            boolean isSquel= true;
            boolean isOnDvd= true;


            System.out.println("Tonight we are streaming "+ movieName+ " which was released on "+ releaseDate);
            System.out.println("This "+ genre+ " movie got a "+  rottenTomatoesRating+" rating on Rotten Tomatoes.");
            System.out.println("The rating is"+ rating+"and it runs for "+ duration+"hours");
            System.out.println("This is a squeal: "+isSquel+" and is on dvd: "+isOnDvd);

            /*
            Tonight we are streaming "$movieName" which was released on $releaseDate
        This $genre movie got a $rottenTomatoesRating rating on Rotten Tomatoes.
        The rating is $rating and it runs for $duration hours.
        This is a sequel $isSequel and is on dvd $isOnDvd.
             */
        }
    }
}
