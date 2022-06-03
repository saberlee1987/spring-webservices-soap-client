package com.saber.springwebservices.soap.client;

import com.saber.springwebservices.soap.client.dto.FindAllResponseDto;
import com.saber.springwebservices.soap.client.dto.wsdl.AddPersonSoapResponseDto;
import com.saber.springwebservices.soap.client.dto.wsdl.DeleteSoapPersonDto;
import com.saber.springwebservices.soap.client.dto.wsdl.PersonSoapDto;
import com.saber.springwebservices.soap.client.dto.wsdl.UpdatePersonSoapResponseDto;
import com.saber.springwebservices.soap.client.services.PersonSoapClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class SpringWebservicesSoapClientApplicationTests {

    @Autowired
    private PersonSoapClient personSoapClient;

    @Test
    void contextLoads() {
        PersonSoapDto response;
        PersonSoapDto personSoapDto;
        try {
            response = personSoapClient.findByNationalCode("0079028748", UUID.randomUUID().toString());
            System.out.println(response);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            FindAllResponseDto personsResponse = personSoapClient.findAllPersonsResponse(UUID.randomUUID().toString());
            System.out.println(personsResponse);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            DeleteSoapPersonDto deletePersonByNationalCodeResponse = personSoapClient.deletePersonByNationalCode("0079028748", UUID.randomUUID().toString());
            System.out.println(deletePersonByNationalCodeResponse);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            response = personSoapClient.findByNationalCode("0079028748", UUID.randomUUID().toString());
            System.out.println(response);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        personSoapDto = new PersonSoapDto();
        personSoapDto.setNationalCode("0079028748");
        personSoapDto.setFirstname("saber");
        personSoapDto.setLastname("Azizi");
        personSoapDto.setMobile("09365627895");
        personSoapDto.setAge(34);
        personSoapDto.setEmail("saberazizi66@yahoo.com");
        try {
            AddPersonSoapResponseDto addPersonResponse = personSoapClient.addPerson(personSoapDto, UUID.randomUUID().toString());
            System.out.println(addPersonResponse);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        personSoapDto.setFirstname("saber66");
        personSoapDto.setLastname("azizi66");
        try {
            UpdatePersonSoapResponseDto updatePersonByNationalCodeResponse = personSoapClient.updatePerson(personSoapDto, "0079028748", UUID.randomUUID().toString());
            System.out.println(updatePersonByNationalCodeResponse);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }


}
