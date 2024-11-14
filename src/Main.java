public class Main {
    public static void main(String[] args) throws HjemmeLavetException{
        SnackAutomat snackAutomat = new SnackAutomat();

        int byttePenge = snackAutomat.køb(93, 200);
        int[] mønter = snackAutomat.byttePenge(byttePenge);
        System.out.println("Beløb " + byttePenge + " kr");
        System.out.println("Antal 20 kr: " + mønter[0]);
        System.out.println("Antal 10 kr: " + mønter[1]);
        System.out.println("Antal 5 kr: " + mønter[2]);
        System.out.println("Antal 2 kr: " + mønter[3]);
        System.out.println("Antal 1 kr: " + mønter[4]);
        System.out.println();

        byttePenge = snackAutomat.køb(39,78);
        int[] byttePengeIMønter = snackAutomat.byttePengeTest(byttePenge);
        System.out.println("Beløb " + byttePenge + " kr");
        System.out.println("Antal 20 kr: " + byttePengeIMønter[0]);
        System.out.println("Antal 10 kr: " + byttePengeIMønter[1]);
        System.out.println("Antal 5 kr: " + byttePengeIMønter[2]);
        System.out.println("Antal 2 kr: " + byttePengeIMønter[3]);
        System.out.println("Antal 1 kr: " + byttePengeIMønter[4]);

    }
}
