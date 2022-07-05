public class Employees{
    private String nome;
    private int salario;
    private String turno;

    public Employees(String nome, int salario, String turno){
        this.nome = nome;
        this.salario = salario;
        this.turno = turno;
    }
    public void setNome(String setNome){
        this.nome = setNome;
    }
    public void setSalario(int setSalario){
        this.salario = setSalario;
    }
    public void setTurno(String setTurno){
        this.turno = setTurno;
    }

    public String getNome(){
        return nome;
    }
    public int getSalario(){
        return salario;
    }
    public String getTurno(){
        return turno;
    }
}
