package lab4_maríasandoval_tep;

/**
 *
 * @author Maria Fernanda
 */
public class Par {
    private String cad1;   
    private String cad2; 
    
    public Par (String a, String b){  
        cad1 = a; 
        cad2 = b; 
    } 
    
    private void SetCad1(String c){ 
        cad1=c; 
    } 
    
    private void SetCad2(String c){ 
        cad2=c; 
    } 
    
    public String getCad1(){ 
        return cad1; 
    } 
    
    public String getCad2(){ 
        return cad2; 
    } 
}
