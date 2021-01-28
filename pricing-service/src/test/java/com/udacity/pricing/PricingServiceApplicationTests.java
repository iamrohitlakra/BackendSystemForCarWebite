package com.udacity.pricing;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.net.URI;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class PricingServiceApplicationTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void contextLoads() {
    }

    /**
     * Test get price for a vehicle
     *
     * @throws Exception if the get price operation for a single car fails
     */
    @Test
    public void getPrice() throws Exception {
        mockMvc.perform(
                get(new URI("/services/price?vehicleId=1"))
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

}