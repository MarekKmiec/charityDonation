package pl.coderslab.charity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.charity.domain.Category;
import pl.coderslab.charity.domain.Donation;
import pl.coderslab.charity.domain.Institution;
import pl.coderslab.charity.service.CategoryService;
import pl.coderslab.charity.service.DonationService;
import pl.coderslab.charity.service.InstitutionService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@SessionAttributes("donation")
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
    public String donationAdd(Model model
                            )
    {
        model.addAttribute("donation",new Donation());
        return "form1";
    }

    @PostMapping("/add2")
    public String donationAdd2(@ModelAttribute Donation donation, HttpServletRequest request,
                               HttpServletResponse response) throws IOException {
        System.out.println("sesssssionnsssssssss:  " + donation.getCategories());
        return "form2";
    }

    @PostMapping("/add3")
    public String donationAdd3(@ModelAttribute Donation donation, HttpServletRequest request,
                               HttpServletResponse response) throws IOException {
        System.out.println("sesssssionnsssssssss:  " + donation.getQuantity());
        return "form3";
    }

    @PostMapping("/add4")
    public String donationAdd4(@ModelAttribute Donation donation, HttpServletRequest request,
                               HttpServletResponse response) throws IOException {
        System.out.println("sesssssionnsssssssssInstitu:  " + donation.getInstitution());
        return "form4";
    }

    @PostMapping("/add5")
    public String donationAdd5(@ModelAttribute Donation donation, HttpServletRequest request,
                               HttpServletResponse response) throws IOException {
        System.out.println("sesssssionnsssssssssAddress:  " + donation.toString());
        return "form5";
    }
    @PostMapping("/add6")
    public String donationAdd6(@ModelAttribute Donation donation, HttpSession session, Model model)  {
        donationService.addDonation(donation);

        session.removeAttribute("donation");




        System.out.println("sesssssionnssssssssspotwierdznie:  " + donation.toString());
        return "form6";
    }

    @ModelAttribute("categories")
    public List<Category> categories() {
        return categoryService.findAll();
    }

    @ModelAttribute("institutions")
    public List<Institution> institutions() {
        return institutionService.findAll();
    }

    @ModelAttribute("donation")
    public Donation donationSession() {
        return new Donation();
    }


}
