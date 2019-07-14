package com.atkhamov.controller;

import com.atkhamov.model.Client;
//import com.atkhamov.repository.ClientRepository;
//import com.atkhamov.repository.ClientRepositoryImpl;
import com.atkhamov.service.ClientService;
import com.atkhamov.service.ClientServiceImpl;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ClientController {
    private ClientService clientService;

    @Autowired(required = true)
    @Qualifier(value = "clientService")
    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping(value = "clients", method = RequestMethod.GET)
    public String listClients(Model model){
        model.addAttribute("client", new Client());
        model.addAttribute("listClients", this.clientService.listClients());
        return "clients";
    }

    @RequestMapping(value = "/add-new-client", method = RequestMethod.POST)
    public String addClient(@ModelAttribute("client") Client client){
        if(client.getId() == 0){
            this.clientService.addClient(client);
        }else {
            this.clientService.updateClient(client);
        }
        return "redirect:/clients";
    }

    @RequestMapping("/remove/{client_id}")
    public String removeClient(@PathVariable("client_id") Integer client_id){
        this.clientService.removeClient(client_id);
        return "redirect:/clients";
    }

    @RequestMapping("edit/{client_id")
    public String editClient(@PathVariable("client_id") Integer client_id, Model model){
        model.addAttribute("client", this.clientService.getClientByID(client_id));
        model.addAttribute("listClients", this.clientService.listClients());
        return "clients";
    }

    @RequestMapping("clientdata/{client_id")
    public String clientData(@PathVariable("client_id") Integer client_id, Model model){
        model.addAttribute("client", this.clientService.getClientByID(client_id));
        return "clientdata";
    }

    //    private ClientService clientService = new ClientServiceImpl();
//    private ClientRepository clientRepository = new ClientRepositoryImpl();


//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String getClientPage(Model model){
//        return "home";
//    }

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String getClientPage(Model model){
//        List<Client> clientDB = clientService.getAll();
//        model.addAttribute("clientList", clientDB);
//        return "pages/home";
//    }
//
//    @RequestMapping(value = "/add-new-client", method = RequestMethod.GET)
//    public String addNewClientPage(){
//        return "pages/addNewClient";
//    }
//
//    @RequestMapping(value = "/add-new-client", method = RequestMethod.POST)
//    public String addNewClient(@RequestParam(value = "name") String nameIn,
//                               @RequestParam(value = "phone") int phoneIn,
//                               @RequestParam(value = "address") String addressIn,
//                               @RequestParam(value = "dateOfBirth") String dateOfBirthIn,
//                               @RequestParam(value = "discountRate") int discountRateIn,
//                               @RequestParam(value = "lastOrderSum") int lastOrderSumIn,
//                               @RequestParam(value = "favFood") String favFoodIn,
//                               @RequestParam(value = "favDrink") String favDrinkIn){
//        Client client = new Client();
//
//        client.setName(nameIn);
//        client.setPhone(phoneIn);
//        client.setAddress(addressIn);
//        client.setDateOfBirth(dateOfBirthIn);
//        client.setDiscountRate(discountRateIn);
//        client.setLastOrderSum(lastOrderSumIn);
//        client.setFavFood(favFoodIn);
//        client.setFavDrink(favDrinkIn);
//
//
////        clientRepository.addClient(client);
//        clientService.addClientService(client);
//        return "redirect:/";
//    }
//
//    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
//    public String delete(@PathVariable Integer id){
//        Client client = clientService.getByID(id);
//        clientService.deleteClient(client);
//        return "redirect:/";
//    }
}
