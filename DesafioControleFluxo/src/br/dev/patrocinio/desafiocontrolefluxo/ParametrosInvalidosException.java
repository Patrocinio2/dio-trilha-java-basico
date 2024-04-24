package br.dev.patrocinio.desafiocontrolefluxo;

public class ParametrosInvalidosException extends Exception {
    private int parametroUm;
    private int parametroDois;

    public ParametrosInvalidosException(int parametroUm, int parametroDois){
        this.parametroUm = parametroUm;
        this.parametroDois = parametroDois;
    }

    @Override
    public String getMessage(){
        return "O segundo parâmetro deve ser maior que o primeiro";
    }
}
