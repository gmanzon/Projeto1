/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author 040069
 */

public abstract class Funcionario 
{
    private String nome, rg;
    protected double salBase;

    public Funcionario(String nome, String rg, double salBase) 
    {
        this.nome = nome;
        this.rg = rg;
        this.salBase = salBase;
    }
    
    // getters

    public String getNome() 
    {
        return nome;
    }

    public String getRg() 
    {
        return rg;
    }

    public double getSalBase() 
    {
        return salBase;
    }
    
    // setters

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public void setRg(String rg) 
    {
        this.rg = rg;
    }

    public void setSalBase(double salBase) 
    {
        this.salBase = salBase;
    }
    
    // métodos
    
    public abstract double salarioLiquido( ); 
    public abstract void novoMes( );

    public void hollerith( )
    {
        System.out.printf("Nome: %s\nRg: %s\nSalário base: %.2f\nSalário líquido: %.2f\n", 
                nome, rg, salBase, salarioLiquido());
    }
}
