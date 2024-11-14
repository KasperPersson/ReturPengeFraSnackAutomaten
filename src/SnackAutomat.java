public class SnackAutomat {
    private int varePris;
    private int betaltBeløb;


    public int køb(int varePris, int betaltBeløb) throws HjemmeLavetException{
        this.varePris = varePris;
        this.betaltBeløb = betaltBeløb;
        int byttePenge = betaltBeløb - varePris;

        if (varePris < 0 || betaltBeløb < 0) {
            throw new ArithmeticException("Beløbene må ikke være negative"); //Illegalexception
        } else if (betaltBeløb < varePris) {
            throw new HjemmeLavetException(); //Lave vores egen exception "For få penge"
        }
        return byttePenge;
    }

    public int[] byttePenge(int byttePenge) {
        int[] result = new int[5];
        result[0] = byttePenge / 20;
        byttePenge %= 20;

        result[1] = byttePenge / 10;
        byttePenge %= 10;

        result[2] = byttePenge / 5;
        byttePenge %= 5;

        result[3] = byttePenge / 2;
        byttePenge %= 2;

        result[4] = byttePenge / 1;
        return result;
    }

    public int[] byttePengeTest(int byttePenge) {
        int[] result = new int[5];
        result[0] = Integer.divideUnsigned(byttePenge,20);
        byttePenge %= 20;

        result[1] = Integer.divideUnsigned(byttePenge,10);
        byttePenge %= 10;

        result[2] = Integer.divideUnsigned(byttePenge,5);
        byttePenge %= 5;

        result[3] = Integer.divideUnsigned(byttePenge,2);
        byttePenge %= 2;

        result[4] = Integer.divideUnsigned(byttePenge,1);
        return result;
    }

}
