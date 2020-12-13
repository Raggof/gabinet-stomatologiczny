package pl.coderslab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.entity.APatient;
import pl.coderslab.entity.Dentist;
import pl.coderslab.repository.APatientRepository;
import pl.coderslab.repository.DentistRepository;
import pl.coderslab.services.DentistService;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/dentist")
public class DentistController {
    
    private DentistService dentistService;


    public DentistController(DentistService dentistService) {
        this.dentistService = dentistService;

    }


    @GetMapping("/all")
    public String showDentist(Model model) {
        List<Dentist> dentists = dentistService.getDentists();
        model.addAttribute("dentists", dentists);
        return "dentist/all";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showAddFormDentist(Model model){
        model.addAttribute("dentist", new Dentist());
        return "dentist/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveDentist(@Valid Dentist dentist, BindingResult result) {
        if (result.hasErrors()) {
            return "dentist/add";
        }
        dentistService.add(dentist);
        return "redirect:/dentist/all";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String showEditFormDentist(@PathVariable long id, Model model) {
        model.addAttribute("dentist", dentistService.get(id));
        return "dentist/edit";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editDentist(@Valid Dentist dentist, BindingResult result) {
        if (result.hasErrors()) {
            return "dentist/edit";
        }
        dentistService.add(dentist);
        return "redirect:/dentist/all";
    }

    @GetMapping("/show/{id}")
    public String showDentist(Model model, @PathVariable long id) {
        model.addAttribute("dentist", dentistService.get(id).orElseThrow(EntityNotFoundException::new));
        return "dentist/show";
    }

    @GetMapping("/delete/{id}")
    public String deleteDentist(@PathVariable long id) {
        dentistService.delete(id);
        return "redirect:/dentist/all";
    }
    
}
