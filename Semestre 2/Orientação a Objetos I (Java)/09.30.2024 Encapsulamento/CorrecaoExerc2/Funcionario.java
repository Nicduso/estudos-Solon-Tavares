package empresa;
public class Funcionario{
    private String nome;
    private Double salario;
    private String cargo;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalario(Double salario){
        this.salario = salario;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public String getNome(){
        return this.nome;
    }
    public Double getSalario(){
        return this.salario;
    }
    public String getCargo(){
        return this.cargo;
    }

    public void descontos(){
        Double inss=0.0, transp=0.0;
        if(this.salario > 2600.0){
            inss = this.salario * 0.11;
        }else{
            inss = this.salario * 0.08;
        }

        if(this.salario >= 1600.0){
            transp = this.salario * 0.06;
        }
        this.salario = this.salario - (inss + transp);
    }

    public void beneficio(){
        this.salario = this.salario + 800.0;
    }
}