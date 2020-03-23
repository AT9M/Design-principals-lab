package ie.gmit.open;

public abstract class DataVariable {


    private Long subscriberId;

    private String address;

    private Long phoneNumber;

    private int baseRate;

    private long freeUsage;

    abstract double calculateBill();
}
