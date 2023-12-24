package lab4;

public class lab4_Seasons {
    public enum Seasons {
        AUTUMN(1),
        SUMMER(3),
        WINTER(2),
        SPRING(100);


        private final int avgT;
        Seasons(int avgT) {
            this.avgT = avgT;
        }

        String getDescription(Seasons season) {
            switch (season) {
                case SPRING, WINTER, AUTUMN -> {
                    return "Cold";
                }

                case SUMMER -> {
                    return "Warm";
                }
            }
            return null;
        }
    }


    public static void favorite_season(Seasons season) {
        switch (season) {
            case SPRING -> System.out.println("I love Spring");
            case AUTUMN -> System.out.println("I love Autumn");
            case SUMMER -> System.out.println("I love Summer");
            case WINTER -> System.out.println("I love Winter");
        }
    }

    public static void main(String[] args) {
        Seasons spring = Seasons.SPRING;
        System.out.println(Seasons.SPRING);

        System.out.println(spring.getDescription(spring));

        for (Seasons lvl:Seasons.values()) {
            System.out.println(lvl + " " + lvl.avgT);
        }
    }
}
