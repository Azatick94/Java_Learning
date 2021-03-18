package com.loan.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.loan.model.Loan;
import com.loan.repository.PersonRepository;
import com.loan.service.BlackListService;
import com.loan.service.LoanService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@Sql(scripts = "classpath:db_sql/populateDB.sql", config = @SqlConfig(encoding = "UTF-8"))
@AutoConfigureMockMvc
class LoanControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    PersonRepository personRepository;

    @Autowired
    LoanService loanService;

    @Autowired
    BlackListService blacklists;

    @Test
    public void startPageTest() throws Exception {
        this.mockMvc.perform(get("/")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("List of REST commands:")));
    }

    @Test
    public void getAllLoansTest() throws Exception {
//        MvcResult mvcResult = this.mockMvc.perform(get("/loans")).andReturn();
        this.mockMvc.perform(get("/loans")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content()
                        .string(containsString("Loan(id=1, amount=1000000.0, term=12, person=Person(id=1, name=Azat, lastName=Burkhanov))")));
    }

    @Test
    public void postLoanTest() throws Exception {
        Loan loan = new Loan(1d, 12, personRepository.getPeopleById(1));
        ObjectMapper mapper = new ObjectMapper();

        MvcResult mvcResult = this.mockMvc.perform(post("/submit_loan").contentType(MediaType.APPLICATION_JSON_UTF8).content(
                mapper.writeValueAsString(loan)))
                .andExpect(status().isOk())
                .andReturn();

        boolean bool = mvcResult.getResponse().getContentAsString().contains("{\"id\":4,\"amount\":1.0,\"term\":12,\"person\":{\"id\":1,\"name\":\"Azat\",\"lastName\":\"Burkhanov\"}");
        Assertions.assertTrue(bool);
    }

    @Test
    public void postLoanFromBlackListErrorTest() throws Exception {
        Loan loan = new Loan(1d, 12, personRepository.getPeopleById(2));
        ObjectMapper mapper = new ObjectMapper();

        MvcResult mvcResult = this.mockMvc.perform(post("/submit_loan").contentType(MediaType.APPLICATION_JSON_UTF8).content(
                mapper.writeValueAsString(loan)))
                .andExpect(status().isOk())
                .andReturn();

        boolean bool = mvcResult.getResponse().getContentAsString().contains("error");
        Assertions.assertTrue(bool);
    }
}