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
import pl.coderslab.services.HistoryService;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/history")
public class HistoryController {

    private HistoryService historyService;
    private APatientRepository aPatientRepository;

    public HistoryController(HistoryService historyService, APatientRepository aPatientRepository) {
        this.historyService = historyService;
        this.aPatientRepository = aPatientRepository;
    }

    @GetMapping("/all")
    public String showHistory(Model model) {
        List<History> histories = historyService.getHistory();
        model.addAttribute("histories", histories);
        return "history/all";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showAddFormHistory(Model model){
        model.addAttribute("history", new History());
        return "history/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveHistory(@Valid History history, BindingResult result) {
        if (result.hasErrors()) {
            return "history/add";
        }
        historyService.add(history);
        return "redirect:/history/all";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String showEditFormHistory(@PathVariable long id, Model model) {
        model.addAttribute("history", historyService.get(id));
        return "history/edit";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editHistory(@Valid History history, BindingResult result) {
        if (result.hasErrors()) {
            return "history/edit";
        }
        historyService.add(history);
        return "redirect:/history/all";
    }

    @GetMapping("/show/{id}")
    public String showHistory(Model model, @PathVariable long id) {
        model.addAttribute("history", historyService.get(id).orElseThrow(EntityNotFoundException::new));
        return "history/show";
    }

    @GetMapping("/delete/{id}")
    public String deleteHistory(@PathVariable long id) {
        historyService.delete(id);
        return "redirect:/history/all";
    }

}
