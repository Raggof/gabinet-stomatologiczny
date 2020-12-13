package pl.coderslab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.entity.APatient;
import pl.coderslab.entity.History;
import pl.coderslab.repository.APatientRepository;
import pl.coderslab.repository.HistoryRepository;
import pl.coderslab.services.APatientService;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/patient")
public class APatientController {

    private final APatientService aPatientService;
    private final HistoryRepository historyRepository;


    public APatientController(APatientService aPatientService,
                              HistoryRepository historyRepository) {
        this.aPatientService = aPatientService;
        this.historyRepository = historyRepository;
    }

    @GetMapping("/all")
    public String showAPatients(Model model) {
        List<APatient> patients = aPatientService.getAPatient();
        model.addAttribute("patients", patients);
        return "patient/all";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showAddFormAPatient(Model model){
        model.addAttribute("patient", new APatient());
        return "patient/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveAPatient(@Valid APatient aPatient, BindingResult result) {
        if (result.hasErrors()) {
            return "patient/add";
        }
        aPatientService.add(aPatient);
        return "redirect:/patient/all";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String showEditFormAPatient(@PathVariable long id, Model model) {
        model.addAttribute("patient", aPatientService.get(id));
        return "patient/edit";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editAPatient(@Valid APatient aPatient, BindingResult result) {
        if (result.hasErrors()) {
            return "patient/edit";
        }
        aPatientService.add(aPatient);
        return "redirect:/patient/all";
    }

    @GetMapping("/show/{id}")
    public String showAPatient(Model model, @PathVariable long id) {
        model.addAttribute("patient", aPatientService.get(id).orElseThrow(EntityNotFoundException::new));
        List<History> histList = historyRepository.findByHistoryByPatientId(id);
        model.addAttribute("histList", histList);
        List<History> dataList = historyRepository.findByHistoryByDate(id);
        model.addAttribute("dataList", dataList);
        return "patient/show";
    }

    @GetMapping("/delete/{id}")
    public String deleteAPatient(@PathVariable long id) {
        aPatientService.delete(id);
        return "redirect:/patient/all";
    }
}
