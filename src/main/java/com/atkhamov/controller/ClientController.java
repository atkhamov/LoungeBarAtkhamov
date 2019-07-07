package com.atkhamov.controller;

import com.atkhamov.model.Client;
import com.atkhamov.repository.ClientRepository;
import com.atkhamov.repository.ClientRepositoryImpl;
import com.atkhamov.service.ClientService;
import com.atkhamov.service.ClientServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ClientController {

    private ClientService clientService = new ClientServiceImpl();
//    private ClientRepository clientRepository = new ClientRepositoryImpl();

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String getClientPage(Model model){
//        return "home";
//    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getClientPage(Model model){
        List<Client> clientDB = clientService.getAll();
        model.addAttribute("clientList", clientDB);
        return "home";
    }

    @RequestMapping(value = "/add-new-client", method = RequestMethod.GET)
    public String addNewClientPage(){
        return "addNewClient";
    }

    @RequestMapping(value = "/add-new-client", method = RequestMethod.POST)
    public String addNewClient(@RequestParam(value = "name") String nameIn,
                               @RequestParam(value = "phone") int phoneIn,
                               @RequestParam(value = "address") String addressIn,
                               @RequestParam(value = "dateOfBirth") String dateOfBirthIn,
                               @RequestParam(value = "discountRate") int discountRateIn,
                               @RequestParam(value = "lastOrderSum") int lastOrderSumIn,
                               @RequestParam(value = "favFood") String favFoodIn,
                               @RequestParam(value = "favDrink") String favDrinkIn){
        Client client = new Client();

        client.setName(nameIn);
        client.setPhone(phoneIn);
        client.setAddress(addressIn);
        client.setDateOfBirth(dateOfBirthIn);
        client.setDiscountRate(discountRateIn);
        client.setLastOrderSum(lastOrderSumIn);
        client.setFavFood(favFoodIn);
        client.setFavDrink(favDrinkIn);

        clientService.addClientService(client);
        return "redirect:/";
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable Integer id){
        Client client = clientService.getByID(id);
        clientService.deleteClient(client);
        return "redirect:/";
    }
}
