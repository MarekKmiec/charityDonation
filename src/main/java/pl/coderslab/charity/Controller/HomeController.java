package pl.coderslab.charity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.domain.Donation;
import pl.coderslab.charity.dto.Summary;
import pl.coderslab.charity.service.DonationService;

import java.util.List;


@Controller
public class HomeController {

    private final DonationService donationService;

    public HomeController(DonationService donationService) {
        this.donationService = donationService;
    }

    @RequestMapping("/")
    public String homeAction(Model model){
        model.addAttribute("donation",donationService.findAll());
        List<Donation> donations=donationService.findAll();
        Summary sum=donationService.allGifts(donations);
        model.addAttribute("summary",sum);
        return "index";
    }

//    @GetMapping("/")
//    public String showDonation(Model model){
//        model.addAttribute("donation",donationService.findAll());
//        List<Donation> donations=donationService.findAll();
//        Summary sum=donationService.allGifts(donations);
//        model.addAttribute("summary",sum);
//        return "index";
//    }
}
