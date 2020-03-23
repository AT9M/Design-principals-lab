package ie.gmit.single;

public class StoreUser {
    private Store store = new Store();

    public String StoreUser(User user){
        store.store(user);
        return "STORING SUCCESS";
    }
}
