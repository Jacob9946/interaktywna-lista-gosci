import java.sql.SQLOutput;

public class Guest {
    private String name;
    private String meal;
    private long phoneNumber;
    private boolean isVegan;

    public Guest(String name, String meal, long phoneNumber, boolean isVegan) {
        this.name = name;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }



    public String getName() {
        return name;
    }

    public String getMeal() {
        return meal;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isVegan() {
        return isVegan;
    }
    public void displayGuestInformation(){
        System.out.println("Imię: " + name);
        System.out.println("Preferowany posiłek: " + meal);
        System.out.println("Numer telefonu: " + phoneNumber);
        String isVeganString = isVegan ? "tak" : "nie";
        System.out.println("Weganin? " + isVeganString);
        System.out.println("");
    }
}
