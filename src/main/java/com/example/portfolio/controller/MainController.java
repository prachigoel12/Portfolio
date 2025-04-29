package com.example.portfolio.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.portfolio.model.ContactMessage;
import com.example.portfolio.service.ContactService;

@Controller
public class MainController {

  private final ContactService contactService;

//  @Autowired
  public MainController(ContactService contactService) {
      this.contactService = contactService;
  }

  @GetMapping("/")
  public String home(Model model) {
      return "index";
  }

  @GetMapping("/about")
  public String about() {
      return "about";
  }

  @GetMapping("/skills")
  public String skills() {
      return "skills";
  }

  @GetMapping("/projects")
  public String projects() {
      return "projects";
  }

  @GetMapping("/contact")
  public String contactForm(Model model) {
      model.addAttribute("contact", new ContactMessage());
      return "contact";
  }

  @PostMapping("/contact")
  public String submitContact(@ModelAttribute ContactMessage contact, Model model) {
      contactService.handleContactForm(contact.getName(), contact.getEmail(), contact.getMessage());
      model.addAttribute("msg", "Thank you for reaching out, " + contact.getName() + "!");
      return "contact";
  }

}
