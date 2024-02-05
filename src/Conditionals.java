public class Conditionals {
    public static void main(String[] args) {
        Conditionals MagicEightBall=new Conditionals();
    }//main method

    public Conditionals(){
        String question = "yes or no";
        System.out.println(question);

        int randomInt=(int) (Math.random()*10);
        System.out.println(randomInt);

        if( randomInt>0 && randomInt<=2){System.out.println("Most defenitely not");}
        if(randomInt>2 && randomInt<=4){System.out.println("Yea..... no");}
        if(randomInt>4 && randomInt<=6){System.out.println("Keep your hopes up!");}
        if(randomInt>6 && randomInt<=8){System.out.println("I dont feel lie answering right now, try again later");}
        if(randomInt>8 && randomInt<=10){System.out.println("As of right this second, Yes");}
    }//constructor method
}
