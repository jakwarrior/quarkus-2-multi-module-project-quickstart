package com.github.bgizdov.multimodule.service;

import javax.enterprise.context.ApplicationScoped;

import lombok.Getter;

@ApplicationScoped
@Getter
public class TestService {
    private final String test = "Hello inject !";
}
