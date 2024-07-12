package spring.basic.boot.cse.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourierService {

    @Autowired
    private CourierParcelRepository parcelRepository;

    public CourierParcel addParcel(CourierParcel parcel) {
        return parcelRepository.save(parcel);
    }

    public CourierParcel updateItemStatus(Long parcelId, String newStatus) {
        CourierParcel parcel = parcelRepository.findById(parcelId).orElse(null);
        if (parcel != null) {
            parcel.setItemStatus(newStatus);
            return parcelRepository.save(parcel);
        }
        return null;
    }

    public List<CourierParcel> getParcelsByExecutiveName(String executiveName) {
        return parcelRepository.findByExecutiveName(executiveName);
    }

    public List<CourierParcel> getParcelsByReceiverAddress(String receiverAddress) {
        return parcelRepository.findByReceiverAddress(receiverAddress);
    }

    public List<CourierParcel> getParcelsByReceiverName(String receiverName) {
        return parcelRepository.findByReceiverName(receiverName);
    }
}
