package spring.basic.boot.cse.poc;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CourierParcel {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long parcelId;
    private String receiverName;
    private String parcelItemName;
    private String receiverAddress;
    private String receiverContact;
    private double itemPrice;
    private String itemStatus; // transit/delivered
    private String executiveName;

    public void setItemStatus(String newStatus) {
    }

    // Getters and Setters
}

