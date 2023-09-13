/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author 040069
 */
public class ListaFunc 
{
    private Funcionario list[];
    private int count;
    
    public ListaFunc(int capMax)
    {
        list= new Funcionario[capMax];
        count= 0;
    }
    
    public boolean add(Funcionario f)
    {
        if(count >= list.length)
        {
            System.out.println("Lista lotada.");
            return false;
        }
        
        list[count]= f;
        count++;
        return true;
    }
    
    public void listagemVendas()
    {
        System.out.println("\nListagem de vendedores\n");
        for(int i=0; i<count; i++)
        {
            if(list[i] instanceof Vendas)
                list[i].hollerith();
        }
    }
    
    public void listagemProducao()
    {
        System.out.println("\nListagem de produção\n");
        for(int i=0; i<count; i++)
        {
            if(list[i] instanceof Producao)
                list[i].hollerith();
        }
    }
    
    public void listagemAdministracao()
    {
        System.out.println("\nListagem de administração\n");
        for(int i=0; i<count; i++)
        {
            if(list[i] instanceof Administracao)
                list[i].hollerith();
        }
    }
    
    public boolean registrarVenda(int index, double valor)
    {
        if(!(list[index] instanceof Vendas)) return false;
        Vendas v= (Vendas)list[index];
        v.registrarVenda(valor);
        return true;
    }
    
    public boolean registrarHorasDiurnas(int index, int horas)
    {
        if(!(list[index] instanceof Producao)) return false;
        Producao p= (Producao)list[index];
        p.registrarHorasDiurnas(horas);
        return true;
    }
    
    public boolean registrarHorasNoturnas(int index, int horas)
    {
        if(!(list[index] instanceof Producao)) return false;
        Producao p= (Producao)list[index];
        p.registrarHorasNoturnas(horas);
        return true;
    }
    
    public boolean registrarFalta(int index)
    {
        if(!(list[index] instanceof Administracao)) return false;
        Administracao a= (Administracao)list[index];
        a.registrarFalta();
        return true;
    }
    
}
