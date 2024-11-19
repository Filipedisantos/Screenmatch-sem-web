package br.com.alura.screenmatch.service;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados {
    private ObjectMapper mapper = new ObjectMapper();


    @Override
    public <T> T obterDados(String Json, Class<T> classe) {
        return mapper.readValue(json, classe);
    }
}
