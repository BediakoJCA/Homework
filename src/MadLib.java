public class MadLib {
    String classmate="Devan";
    String city="Boston";
    String noun="river";
    String adjective="funny";
    String pluralNoun="chicken nuggets";
    String pluralAnimal="cattle";
    boolean trueOrFalse= true;
    double decimalBiggerThan1= 2.3;
    int number1= 100;
    int number2= 200;
    int wholeNumberBetween1And4= 3;
    String miltonTeacher= "Palmer";
    String miltonDean= "Jacobs";
    char letterGrade= 'A';
    String season= "Fall";


    //define a string called story for mad lib
    String story = "This weekend I am going camping with "
            +classmate+ ". We are going to a campsite in "
            +city+ ". I packed my "+noun+ " and "
            +pluralNoun + ".  The forecast is calling for a high of "
            +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
            +adjective+" day! This year, the park rangers have seen "
            +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
            +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
            +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
            +miltonDean+ " said it actually has only happened "
            + number2+" times. Wish us luck! If we survive, we will earn a "
            +letterGrade+ "- in P.E. class.";

//now print story to the dos window



    public static void main(String[] args) {
        System.out.println("hello world");
        MadLib mystory = new MadLib();

    } //main method


    public MadLib() {
        System.out.println(story);;
    }
}
