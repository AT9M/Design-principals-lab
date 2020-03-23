package ie.gmit.open;

import java.util.List;

 abstract class ISPSubscriber extends DataVariable{


    public ISPSubscriber() {

    }

/*
    public double calculateBill() {

    }
*/

     @Override
     double calculateBill() {
         List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(getSubscriberId());
         long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
         long chargeableData = totalData - getFreeUsage();
         return chargeableData*getBaseRate()/100;
     }

     /**
      * @return the subscriberId
      */
     public Long getSubscriberId() {
         return getSubscriberId();
     }

     /**
      * @param subscriberId the subscriberId to set
      */
     public void setSubscriberId(Long subscriberId) {
         setSubscriberId(subscriberId);
     }

     /**
      * @return the address
      */
     public String getAddress() {
         return getAddress();
     }

     /**
      * @param address the address to set
      */
     public void setAddress(String address) {
         setAddress(address);
     }

     /**
      * @return the phoneNumber
      */
     public Long getPhoneNumber() {
         return getPhoneNumber();
     }

     /**
      * @param phoneNumber the phoneNumber to set
      */
     public void setPhoneNumber(Long phoneNumber) {
         setPhoneNumber(phoneNumber);
     }

     /**
      * @return the baseRate
      */
     public int getBaseRate() {
         return getBaseRate();
     }

     /**
      * @param baseRate the baseRate to set
      */
     public void setBaseRate(int baseRate) {
         setBaseRate(baseRate);
     }

     /**
      * @return the freeUsage
      */
     public long getFreeUsage() {
         return getFreeUsage();
     }

     /**
      * @param freeUsage the freeUsage to set
      */
     public void setFreeUsage(long freeUsage) {
         setFreeUsage(freeUsage);
     }

    
}