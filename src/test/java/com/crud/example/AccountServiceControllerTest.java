package com.crud.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.crud.example.entity.Account;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class AccountServiceControllerTest extends AbstractTest {
    @Override
    @Before
    public void setUp() {
        super.setUp();
    }

    //Get Accounts List
    @Test
    public void getAccountsList() throws Exception {
        String uri = "http://localhost:9191/findall";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        Account[] accountlist = super.mapFromJson(content, Account[].class);
        assertTrue(accountlist.length > 0);
    }

    //Create Account Test
    @Test
    public void createAccount() throws Exception {
        String uri = "http://localhost:9191/account";
        Account account = new Account();
        account.setId(4);
        account.setFirstname("Asda");
        account.setLastname("Lastname");
        account.setEmail("test4@hotmail.com");
        //[{"id":1,"firstname":"aaa","lastname":"bb","email":"abc@gmail.com","birthdate":"2010-05-05T00:00:00.000+0000","active":true}]
        String inputJson = super.mapToJson(account);
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(inputJson)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
    }

    //Updated Account First Name where is id equal 4
    @Test
    public void updateAccount() throws Exception {
        String uri = "http://localhost:9191/update";
        Account account = new Account();
        account.setId(4);
        account.setFirstname("Updated FirstName");

        String inputJson = super.mapToJson(account);
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.put(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(inputJson)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
    }


    //Delete Account where is id equal 3
    @Test
    public void deleteAccount() throws Exception {
        String uri = "http://localhost:9191/delete/3";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
    }

}
