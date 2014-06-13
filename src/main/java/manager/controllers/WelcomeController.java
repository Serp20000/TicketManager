package manager.controllers;

import manager.entities.Event;
import manager.entities.Sector;
import manager.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

@Controller
public class WelcomeController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private EventTypeRepository eventTypeRepository;

    @Autowired
    private OperatorRepository operatorRepository;

    @Autowired
    private SectorRepository sectorRepository;

    @Autowired
    private TicketRepository ticketRepository;

    @RequestMapping(value="/about")
    public String about() {
        return "about";
    }

    @RequestMapping(value="/")
    public String welcome(Model model) {

        model.addAttribute("eventall", eventRepository.findAll());
        model.addAttribute("event", eventRepository.findAllByData());
        model.addAttribute("sector", sectorRepository.findAllByEvent_id(1));
        return "index";
    }


    /*@RequestMapping(value="/add_advertisment", method = RequestMethod.GET)
    public String newAdvertisment(Model model) {

        model.addAttribute("ad", new Advertisment());
        return "advertismentForm";
    }


    @RequestMapping(value="/add_advertisment", method = RequestMethod.POST)
    public String newAdvertisment(@Valid @ModelAttribute("ad") Advertisment ad, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "advertismentForm";
        }

        advertismentRepository.save(ad);

        return "redirect:/";
    }

    @RequestMapping(value="/delete_advertisment", method = RequestMethod.GET)
    public String deleteAdvertisment(@RequestParam("id") Long id) {

        advertismentRepository.delete(id);

        return "redirect:/";
    }

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value="/reg", method = RequestMethod.GET)
    public String newUser(Model model) {

        model.addAttribute("reg", new User());
        return "reg";
    }


    @RequestMapping(value="/reg", method = RequestMethod.POST)
    public String newUser(@Valid @ModelAttribute("reg") User reg, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "reg";
        }

        userRepository.save(reg);

        return "redirect:/";
    }*/


}
