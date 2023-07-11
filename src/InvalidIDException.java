public class InvalidIDException extends Exception {

    private long cpr;
    public long getCPR()
    {
        return cpr;
    }

    public InvalidIDException()
    {
        System.out.println("Invalid ID");
    }

    public InvalidIDException(long employeeID)
    {
        cpr = employeeID;
    }

    public InvalidIDException(long employeeID,Throwable exception)
    {
        super(exception);
        cpr = employeeID;
    }

    public InvalidIDException(Throwable exception)
    {
        super(exception);

    }

}
