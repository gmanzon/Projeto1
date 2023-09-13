/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author 040069
 */
public class Producao extends Funcionario
{
    private int hrDia, hrNoite;

    public Producao(String nome, String rg, double salBase) 
    {
        super(nome, rg, salBase);
        hrDia= 0;
        hrNoite= 0;
    }
    
    public void registrarHorasDiurnas(int horas)
    {
        hrDia+= horas;
    }
    
    public void registrarHorasNoturnas(int horas)
    {
        hrNoite+= horas;
    }
    
    private double valorDiurno()
    {
        return hrDia*salBase;
    }
    
    private double valorNoturno()
    {
        return hrNoite*salBase*1.3;
    }
    
    @Override
    public double salarioLiquido( )
    {
        return valorDiurno() + valorNoturno();
    }
    
    @Override
    public void novoMes( )
    {
        hrDia= 0;
        hrNoite= 0;
    }

    @Override
    public void hollerith( )
    {
        super.hollerith();
        System.out.printf("Horas diurnas: %d  Valor: %.2f\nHoras noturnas: %d  Valor: %.2f\n\n",
                hrDia, valorDiurno(), hrNoite, valorNoturno());
    }
    
    
}
