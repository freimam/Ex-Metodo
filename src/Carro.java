class Carro { // classe carro

    String cor; // atributo
    String modelo;
    int capacidadeTanque;

    Carro() { // metodo construtor = deve ter o msm nome da classe e estar logo abaixo

    }

    Carro(String cor, String modelo, int capacidadeTanque) { //construtor - sobrecarga
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCor(String cor) { //set colocar valor atributo
        this.cor = cor; // sendo void não retorna nada, e só para guardar valor
    }

    String getCor() { //get retornar valor
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel) { //calcular valor total do tanque
        return capacidadeTanque * valorCombustivel;
    }
}