package com.mycompany.myapp.cucumber;

import com.mycompany.myapp.HrManagerApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = HrManagerApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
