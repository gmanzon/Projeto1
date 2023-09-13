/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tecelagem;

/**
 *
 * @author 040069
 */
public class Tecelagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Administracao a1= new Administracao("José", "1234567-8", 10000);
        a1.registrarFalta();
        //a1.hollerith();
        
        Producao p1= new Producao("Maria", "2345678-9", 50);
        p1.registrarHorasDiurnas(100);
        p1.registrarHorasNoturnas(100);
        //p1.hollerith();
        
        Vendas v1= new Vendas("Joca", "3456789-0", 1000);
        v1.registrarVenda(100000);
        //v1.hollerith();
        
        ListaFunc lf= new ListaFunc(10);
        lf.add(a1);
        lf.add(p1);
        lf.add(v1);
        lf.listagemProducao();
        lf.listagemAdministracao();
        
        lf.registrarVenda(2, 100000);
        lf.listagemVendas();
    }
    
}
