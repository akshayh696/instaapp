package com.application.instaapp.cucumber.stepdefs;

import com.application.instaapp.InstaappApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = InstaappApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
