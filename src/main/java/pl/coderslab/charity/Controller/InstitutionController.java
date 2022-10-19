package pl.coderslab.charity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.domain.Institution;
import pl.coderslab.charity.service.InstitutionService;

import java.util.List;

@Controller
@RequestMapping("/institution")
public class InstitutionController {
    private final InstitutionService institutionService;

    public InstitutionController(InstitutionService institutionService) {
        this.institutionService = institutionService;
    }
    @ModelAttribute("institutions")
    public List<Institution> institutions(){
        return institutionService.findAll();
    }
    @GetMapping("List")
    public String showInstitution(Model model){
        model.addAttribute("institutions",institutionService.findAll());
        return "institutionList";
    }

}
