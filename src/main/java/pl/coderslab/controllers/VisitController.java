package pl.coderslab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.entity.Visit;
import pl.coderslab.services.VisitService;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/visit")
public class VisitController {

    private VisitService visitService;

    public VisitController(VisitService visitService) {
        this.visitService = visitService;
    }

    @GetMapping("/all")
    public String showDentist(Model model) {
        List<Visit> visits = visitService.getVisit();
        model.addAttribute("visits", visits);
        return "visit/all";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showAddFormVisit(Model model){
        model.addAttribute("visit", new Visit());
        return "visit/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveVisit(@Valid Visit visit, BindingResult result) {
        if (result.hasErrors()) {
            return "visit/add";
        }
        visitService.add(visit);
        return "redirect:/visit/all";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String showEditFormVisit(@PathVariable long id, Model model) {
        model.addAttribute("visit", visitService.get(id));
        return "visit/edit";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editVisit(@Valid Visit visit, BindingResult result) {
        if (result.hasErrors()) {
            return "visit/edit";
        }
        visitService.add(visit);
        return "redirect:/visit/all";
    }

    @GetMapping("/show/{id}")
    public String showVIsit(Model model, @PathVariable long id) {
        model.addAttribute("visit", visitService.get(id).orElseThrow(EntityNotFoundException::new));
        return "visit/show";
    }

    @GetMapping("/delete/{id}")
    public String deleteVisit(@PathVariable long id) {
        visitService.delete(id);
        return "redirect:/visit/all";
    }
}
