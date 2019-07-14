
package usandomascaras;


public class Mascaras {
    
     public static String formataCpf(String cpf) {
        //forta cpf 
       char[] arrayCpf = cpf.toCharArray();
       String cpfFormatado = "";
       
        for (int i = 0; i < arrayCpf.length; i++) {
            cpfFormatado = cpfFormatado + arrayCpf[i];
            
            if (i == 2 | i == 5){
                cpfFormatado = cpfFormatado +".";
                
            }
            if (i ==8){
                cpfFormatado = cpfFormatado +"-";
            }
        }
        
        
        return cpfFormatado;
            
            
        }
        //formata cep
    public static String formataCep (String cep) {
        
        char[] arrayCep = cep.toCharArray();
        String cepFormatado = "";
        
        for (int i = 0; i < arrayCep.length; i++) {
            cepFormatado = cepFormatado + arrayCep[i];
            
            if (i == 1) {
                cepFormatado = cepFormatado + ".";   
            }if (i == 4 ) {
                cepFormatado = cepFormatado + "-";
            }
            
            
            
            
        }
        return cepFormatado;
        
        
    }  
    //formata cnpj
    public static String formataCnpj (String cnpj) {
        
        char[] arrayCnpj = cnpj.toCharArray();
        String cnpjFormatado = "";
        
        for (int i = 0; i < arrayCnpj.length; i++) {
            cnpjFormatado = cnpjFormatado + arrayCnpj[i];
            
            if (i == 1) {
                cnpjFormatado = cnpjFormatado + ".";   
            }if (i == 4 ) {
                cnpjFormatado = cnpjFormatado + ".";
            }if (i == 7 ){
                cnpjFormatado = cnpjFormatado + "/";
                
            }if(i == 11 ){
                cnpjFormatado = cnpjFormatado + "-";
            }
                
                    
            
            
            
            
        }
        return cnpjFormatado;
        
        
    } 
    //formata telefone
    public static String formataTelefone (String telefone) {
        
        char[] arrayTelefone = telefone.toCharArray();
        String telefoneFormatado = "";
        
        for (int i = 0; i < arrayTelefone.length; i++) {
           
            
            if (i == 0) {
                telefoneFormatado = telefoneFormatado + "(";   
            }
             telefoneFormatado = telefoneFormatado + arrayTelefone[i];
            if (i == 1 ) {
                telefoneFormatado = telefoneFormatado + ") ";
            }if (i == 6) {
                telefoneFormatado = telefoneFormatado + "-";
            }
            
            
            
            
        }
        return telefoneFormatado;
        
        
    }
    //formata placa
    public static String formataPlaca (String placa) {
        
        char[] arrayPlaca = placa.toCharArray();
        String placaFormatada = "";
        
        for (int i = 0; i < arrayPlaca.length; i++) { 
             placaFormatada = placaFormatada + arrayPlaca[i];
            
            if (i == 2) {
                placaFormatada = placaFormatada + "-";   
            }   
        }
        return placaFormatada;
    }
    //conta quantas vezes uma letra especifica foi usada
    public static int contagemLetras (String letras) {
        
        char [] arrayLetra = letras.toCharArray();
        int contaLetra = 0;
        
        for (int i = 0; i < arrayLetra.length; i++) {
            if (letras.charAt(i) == 'e' | letras.charAt(i) == 'E' )  {
                contaLetra = contaLetra + 1;
                
                
            }
            
        }
        
        return contaLetra;
        
        
        
    }
    
    
    
    
    
    
}
