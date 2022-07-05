public class Car {
    private String modelo;
    private String marca;
    private String placa;
    private int ano;

    public Car(String modelo, String marca, String placa, int ano ){
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.ano = ano;
    }

    public void setModelo(String setModelo) {
        this.modelo = setModelo;
    }

    public void setMarca(String setMarca) {
        this.marca = setMarca;

    }

    public void setPlaca(String setPlaca) {
        this.placa = setPlaca;
    }

    public void setAno(int setAno) {
        this.ano = setAno;
    }
    public String getModelo(){
        return modelo;
    }
    public String getMarca(){
        return marca;
    }
    public String getPlaca(){
        return placa;
    }
    public int getAno(){
        return ano;
    }


}