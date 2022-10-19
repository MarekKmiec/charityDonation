package pl.coderslab.charity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.domain.Donation;
import pl.coderslab.charity.domain.Institution;
import pl.coderslab.charity.dto.Summary;
import pl.coderslab.charity.service.CategoryService;
import pl.coderslab.charity.service.DonationService;
import pl.coderslab.charity.service.InstitutionService;

import java.util.List;


@Controller
public class HomeController {

    private final DonationService donationService;
    private final InstitutionService institutionService;
    private final CategoryService categoryService;

    public HomeController(DonationService donationService, InstitutionService institutionService, CategoryService categoryService) {
        this.donationService = donationService;
        this.institutionService = institutionService;
        this.categoryService = categoryService;
    }

    @RequestMapping("/")
    public String homeAction(Model model){
        model.addAttribute("donation",donationService.findAll());
        List<Donation> donations=donationService.findAll();
        Summary sum=donationService.allGifts(donations);
        model.addAttribute("summary",sum);
        model.addAttribute("institutions",institutionService.findAll());

        return "index";
    }


}
