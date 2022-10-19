package pl.coderslab.charity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.domain.Category;
import pl.coderslab.charity.domain.Institution;
import pl.coderslab.charity.service.CategoryService;
import pl.coderslab.charity.service.InstitutionService;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;
    private final InstitutionService institutionService;

    public CategoryController(CategoryService categoryService, InstitutionService institutionService) {
        this.categoryService = categoryService;
        this.institutionService = institutionService;
    }

    @GetMapping("/list")
    public String allCategory(Model model) {
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("institutions",institutionService.findAll());
        return "listCategories";
    }

}
