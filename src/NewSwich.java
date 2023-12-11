public class NewSwich {
    public static void main(String[] args) {
        String day = "xxx";

        String word;
       word = switch (day)
        {
            case "Mon"-> ("Its Monday");
            case "Tues"-> ("Its Tuesday");
            case "Wed"->("Its Wednesday");
            case "Thurs"->("Its Thursday");
            case "Fry"-> ("Its Friday");
            case "Sat", "Sun" -> ("Its Holiday");
            default -> ("Have a good day");

        };
        System.out.println(word);
    }
}
