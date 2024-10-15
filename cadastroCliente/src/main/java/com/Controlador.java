
package com;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.ArrayList;
import java.util.List;      

public class Controlador {
    
    
    @FXML
    private TextField campoNome;
    @FXML
    private TextField campoCep;
    @FXML
    private TextField campoRua;
    @FXML
    private TextField campoCidade;
    @FXML
    private TextField campoTelefone;
    @FXML
    private TextField campoNumero;
    @FXML
    private TextField campoEstado;
    
    private int cod = 1;
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private Endereco endereco = new Endereco();
    
    @FXML
    private void Buscarcep(){
        Buscador buscador = new Buscador();
        
        try {
            endereco = buscador.buscar(campoCep.getText());
            
            campoRua.setText(endereco.getRua());
            campoCidade.setText(endereco.getCidade());
            campoEstado.setText(endereco.getEstado());
           
        } catch (IllegalArgumentException e) {
            Alert alerta = new Alert(AlertType.INFORMATION);
            alerta.setTitle("ERRO");    
            alerta.setHeaderText(null);
            alerta.setContentText("Formato invalido");
            alerta.showAndWait();
        } catch (IOException e){
            Alert alerta = new Alert(AlertType.INFORMATION);
            alerta.setTitle("ERRO");
            alerta.setHeaderText(null);
            alerta.setContentText("Erro ao conectar com o serviço ViaCep");
            alerta.showAndWait();
        } catch (Exception e) {
            Alert alerta = new Alert(AlertType.INFORMATION);
            alerta.setTitle("ERRO");
            alerta.setHeaderText(null);
            alerta.setContentText("CEP invalido");
            alerta.showAndWait();
        }
        
}
    
    @FXML
    private void Cadastrar()throws IllegalArgumentException, Exception {

        try {
            if (campoNome.getText().isEmpty() == true){
                throw new IllegalArgumentException("campo vazio");
            }
            endereco.setRua(campoRua.getText());
            endereco.setNumero(campoNumero.getText());
            
            Cliente cliente = new Cliente(cod, campoNome.getText(), campoTelefone.getText(), endereco);
            listaClientes.add(cliente);
            exibirLista(listaClientes);
            cod++;

        } catch (IllegalArgumentException e){
            Alert alerta = new Alert(AlertType.INFORMATION);
            alerta.setTitle("ERRO");    
            alerta.setHeaderText(null);
            alerta.setContentText("Formato invalido");
            alerta.showAndWait();
            
        } catch (Exception e){
            Alert alerta = new Alert(AlertType.INFORMATION);
            alerta.setTitle("ERRO");    
            alerta.setHeaderText(null);
            alerta.setContentText("Formato invalido");
            alerta.showAndWait();
        }
        
    }
    
    public static void exibirLista(ArrayList<Cliente> listaC){
         for(Cliente cliente: listaC){
            System.out.println(cliente.toString());
        }
    }
    
    @FXML
    public void Limpar (){
        campoCep.setText("");
        campoCidade.setText("");
        campoEstado.setText("");
        campoNome.setText("");
        campoNumero.setText("");
        campoTelefone.setText("");
        campoRua.setText("");
    }
}
