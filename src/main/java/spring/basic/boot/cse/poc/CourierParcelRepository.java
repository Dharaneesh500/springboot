package spring.basic.boot.cse.poc;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourierParcelRepository extends JpaRepository<CourierParcel, Long> {

    List<CourierParcel> findByExecutiveName(String executiveName);

    List<CourierParcel> findByReceiverAddress(String receiverAddress);

    List<CourierParcel> findByReceiverName(String receiverName);
}