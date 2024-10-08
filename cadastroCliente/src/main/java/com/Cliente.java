
package com;

public class Cliente {
    private static int cod;
    
    private String nome;
    private String tel;
    private Endereco endereco;
    
    public Cliente (){
        cod = 1;
        nome = "";
        tel = "";
        endereco = new Endereco();
    }
        public Cliente (String nome, String tel, Endereco endereco){
        cod ++;
        this.nome = nome;
        this.tel= tel;
        this.endereco = endereco;
    }

    public static int getCod() {
        return cod;
    }

    public static void setCod(int cod) {
        Cliente.cod = cod;
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
          return "codigo: " + cod + "nome: " + this.nome + "telefone: " + this.tel + endereco.toString();
      } 
        
    
}
