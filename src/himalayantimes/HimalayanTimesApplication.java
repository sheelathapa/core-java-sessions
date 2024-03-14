package himalayantimes;

import java.time.LocalDate;

public class HimalayanTimesApplication {
    public static void main(String[] args) {
        int id = 1;

     Category home = new Category(1,"Home",false,1,false,"createdHome","updatedHome");
     Category kathmandu = new Category(2,"ktm",false,2,false,"Feb","Feb");
     Category nepal = new Category(3,"nepal",false,3,false,"Feb","Feb");
     Category covid19 = new Category(4,"covid19",false,4,false,"Feb","Feb");
     Category covidConnect = new Category(5,"covidConnect",false,5,false,"Feb","Feb");
     Category world = new Category(6,"world",false,6,false,"Feb","Feb");
     Category opinion = new Category(7,"opinion",false,7,false,"Feb","Feb");
     Category business = new Category(8,"business",false,8,false,"Feb","Feb");
     Category sports = new Category(9,"sports",false,9,false,"Feb","Feb");
     Category entertainment = new Category(10,"entertainment",false,10,false,"Feb","Feb");
     Category more = new Category(11,"more",false,11,false,"Feb","Feb");


        System.out.println(home);
        System.out.println(kathmandu);
        System.out.println(nepal);
        System.out.println(covid19);
        System.out.println(covidConnect);
        System.out.println(world);
        System.out.println(opinion);
        System.out.println(business);
        System.out.println(sports);
        System.out.println(entertainment);
        System.out.println(more);

        Category international = new Category();
        LocalDate createdDate = LocalDate.parse(international.getCreatedAt());
        LocalDate newCreatedDate = createdDate.plusDays(10);

        System.out.println(newCreatedDate);


    }
}
