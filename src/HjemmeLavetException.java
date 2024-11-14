public class HjemmeLavetException extends Exception{

    public HjemmeLavetException(){
        this("Det betalte beløb er mindre end varens pris");
    }

    public HjemmeLavetException(String message){
        super(message);
    }
}
