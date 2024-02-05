public class Loops {
    public static void main(String[] args) {
        Loops myCount = new Loops();
    }

    public Loops() {
        //call methods here
        countUp();
        countByThrees();
        countUp();
        countDown();
    }//end of loops method

    public void countUp() {
        System.out.println();
        for (int y = 1; y < 6; y = y + 1) {
            System.out.println(y);
        }
    }

        public void countByThrees() {
            System.out.println();
            for (int y = 3; y < 16; y = y + 3) {
                System.out.print(y);
            }
        }

            public void countDown(){
                System.out.println();
                for (int y = 10; y >0; y = y -1){
                    System.out.print(y + ", ");}
            }


        }


