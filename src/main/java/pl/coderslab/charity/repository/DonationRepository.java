package pl.coderslab.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.charity.domain.Donation;

import java.util.List;

@Repository
public interface DonationRepository extends JpaRepository<Donation,Long> {

//    List<Donation> findAllByQuantity();
}
