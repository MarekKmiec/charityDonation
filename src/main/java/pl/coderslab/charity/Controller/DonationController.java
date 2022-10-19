package pl.coderslab.charity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.domain.Category;
import pl.coderslab.charity.domain.Donation;
import pl.coderslab.charity.domain.Institution;
import pl.coderslab.charity.service.CategoryService;
import pl.coderslab.charity.service.DonationService;
import pl.coderslab.charity.service.InstitutionService;

import java.util.List;

@Controller
@RequestMapping("/donation")
public class DonationController {

    private final DonationService donationService;
    private final CategoryService categoryService;
    private final InstitutionService institutionService;

    public DonationController(DonationService donationService, CategoryService categoryService, InstitutionService institutionService) {
        this.donationService = donationService;
        this.categoryService = categoryService;
        this.institutionService = institutionService;
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
    @ModelAttribute("categories")
    public List<Category> categories(){
        return categoryService.findAll();
    }
    @ModelAttribute("institutions")
    public List<Institution> institutions(){
        return institutionService.findAll();
    }


}
