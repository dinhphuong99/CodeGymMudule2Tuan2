public class Prime {
    private int number = 0;

    public Prime(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isPrime(){
//        throw new UnsupportedOperationException();
        //isPrime()
//        if(this.getNumber() < 2)
//            return false;
//        //isPrime1()
//        //isPrime2()
//        boolean KiemTraBang2Hoac3 = this.getNumber() == 2||this.getNumber() == 3;
//        if(KiemTraBang2Hoac3)
//            return true;
//
//        //isPrime3()
//        //isPrime4()
//        int squareRootPart = (int)(Math.sqrt(this.getNumber()));
//        for (int i = 2; i <= squareRootPart; i++) {
//            if (this.getNumber()%i==0)
//                return false;
//        }
//
//        return true;

        // Refactor
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) { isPrime = false; break; }
        }

        boolean checkAgain = isPrime && (number >= 2);
        if (checkAgain) {
            isPrime = true;
        } else {
            isPrime = false;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Prime number = new Prime(5001);
        System.out.println(number.isPrime());
    }
}
