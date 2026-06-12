package portfolio.personal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;


import  java.util.List;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import portfolio.personal.model.Experience;
import portfolio.personal.model.Message;
import portfolio.personal.model.Project;
import portfolio.personal.service.PortfolioService;
import portfolio.personal.service.MailService;


@Controller
public class PortfolioController {
    @Autowired
    private PortfolioService portfolioService;
    @Autowired
    private  MailService mailService;

    @GetMapping("/")
    public String homepage(Model model){
        List<Project> project = portfolioService.getAllProjects();
        List<Experience> experience = portfolioService.getAllExperience();
        Message message = new Message();

        model.addAttribute("projects", project);
        model.addAttribute("experience", experience);
        model.addAttribute("message", message);
        return "index";
    }

    @PostMapping("/contact")
    public String sendMessage(Message message, RedirectAttributes redirectAttributes){
        System.out.println("Form submitted! Name: " + message.getName());
        try {
            mailService.sendMessage(message);
            redirectAttributes.addFlashAttribute("messageSent", true);
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            redirectAttributes.addFlashAttribute("messageError", true);
        }
        redirectAttributes.addFlashAttribute("message", new Message());
        return "redirect:/";
    }

}
