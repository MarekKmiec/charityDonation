package pl.coderslab.charity.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.charity.domain.Donation;
import pl.coderslab.charity.dto.Summary;
import pl.coderslab.charity.repository.DonationRepository;

import java.util.List;

@Service
@Transactional
public class DonationService {
    private final DonationRepository donationRepository;

    public DonationService(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    public Donation addDonation(Donation donation) {
        donationRepository.save(donation);
        return donation;
    }

    public List<Donation> findAll() {
        return donationRepository.findAll();
    }

    public Donation findById(Long id) {
        return donationRepository.findById(id).orElseThrow();
    }

    public void delete(Long id) {
        donationRepository.deleteById(id);
    }

    public Summary allGifts(List<Donation> donations) {
        Summary summary = new Summary();
        int sumQuantity = 0;
        for (Donation donation : donations) {
            sumQuantity += donation.getQuantity();
        }
        summary.setSumQuantity(sumQuantity);
        summary.setSumDonation(donations.size());
        return summary;
    }

}
