public class Carro {
    String fabricante, modelo, cor, placa;
    double valor;
    int numeroPortas, anoFabricacao;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante (String fab) {
        if (!fab.isEmpty()) {
            fabricante = fab;
        }
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String mod){
        if(!mod.isEmpty()){
            modelo = mod;
        }
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String co){
        if(!co.isEmpty()){
            cor = co;
        }
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String pla){
        if(!pla.isEmpty()){
            modelo = pla;
        }
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(double val){
        if(val > 0){
            valor = val;
        }
    }
    public int getNumeroPortas() {
        return numeroPortas;
    }
    public void setNumeroPortas(int por){
        if(por > 0){
            numeroPortas = por;
        }
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int fab){
        if(fab > 0){
            anoFabricacao = fab;
        }
    }
    public void imprimir(){
        System.out.println("Fabricante: " + getFabricante());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Valor: " + getValor());
        System.out.println("Número de portas: " + getNumeroPortas());
        System.out.println("Ano fabricação: " + getAnoFabricacao());


}

}





