/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandomascaras;

/**
 *
 * @author darla
 */
public class UsandoMascaras {

    
    public static void main(String[] args) {
        
        String cpfFormatado = Mascaras.formataCpf("69589548810");
        System.out.println("cpf: "+cpfFormatado);
        
        String formataCep = Mascaras.formataCep("88352490");
        System.out.println("cep: "+formataCep);
        
        String formataCnpj = Mascaras.formataCnpj("03795071000116");
        System.out.println("cnpj: "+formataCnpj);
        
        String formataTelefone = Mascaras.formataTelefone("47256251536");
        System.out.println("telefone: " + formataTelefone);
        
        String formataPlaca = Mascaras.formataPlaca("ABC2357");
        System.out.println(formataPlaca);
        
        int numeroLetras = Mascaras.contagemLetras("estErco");
        System.out.println("numero de letras na palavra: "+numeroLetras);
        
        
       
    }
    
}
