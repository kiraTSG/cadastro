
package com;

public class Cliente {
    private int cod;
    private String nome;
    private String tel;
    private Endereco endereco;
    
    public Cliente (){
        cod = 1;
        nome = "";
        tel = "";
        endereco = new Endereco();
    }
    public Cliente (int cod, String nome, String tel, Endereco endereco){
        this.cod = cod;
        this.nome = nome;
        this.tel= tel;
        this.endereco = endereco;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
      
    public String toString (){
          return "Codigo: " + cod + " Nome: " + this.nome + " Telefone: " + this.tel + endereco.toString();
    } 
        
    
}
