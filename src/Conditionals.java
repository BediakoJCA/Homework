public class Conditionals {
    public static void main(String[] args) {
        Conditionals MagicEightBall=new Conditionals();
    }//main method

    public Conditionals(){
        String question = "yes or no";
        System.out.println(question);

        int randomInt= Math.max(0,10);
        System.out.println(randomInt);

        if(0>=2){System.out.println("Most defenitely not");}
        if(2>=4){System.out.println("Yea..... no");}
        if(4>=6){System.out.println("Keep your hopes up!");}
        if(6>=8){System.out.println("I dont feel lie answering right now, try again later");}
        if(8>=10){System.out.println("As of right this second, Yes");}
    }//constructor method
}
