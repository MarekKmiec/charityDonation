package pl.coderslab.charity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.domain.Donation;
import pl.coderslab.charity.dto.Summary;
import pl.coderslab.charity.service.DonationService;

import java.util.List;

@Controller
@RequestMapping("/donation")
public class DonationController {

    private final DonationService donationService;

    public DonationController(DonationService donationService) {
        this.donationService = donationService;
    }

    @GetMapping("/add")
    public String donationAdd(Model model) {
        model.addAttribute("donation", new Donation());
        return "formDonation";
    }

    @PostMapping("/add")
    public String saveDonation(Donation donation) {
        donationService.addDonation(donation);
        return "redirect:/donation/listDonation";
    }



}
