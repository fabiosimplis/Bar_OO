package br.com.dev.entity;

public class Bill {

    private char gender;
    private int beer;
    private int barbecue;
    private int softDrink;

    public Bill(char gender, int beer, int barbecue, int softDrink) {
        this.gender = gender;
        this.beer = beer;
        this.barbecue = barbecue;
        this.softDrink = softDrink;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getBeer() {
        return beer;
    }

    public void setBeer(int beer) {
        this.beer = beer;
    }

    public int getBarbecue() {
        return barbecue;
    }

    public void setBarbecue(int barbecue) {
        this.barbecue = barbecue;
    }

    public int getSoftDrink() {
        return softDrink;
    }

    public void setSoftDrink(int softDrink) {
        this.softDrink = softDrink;
    }

    public double cover(){

        return (feeding() > 30.00 ? 0.00 : 4.00);
    }

    public double feeding(){
        return (this.beer * 5.00) + (this.softDrink * 3.00) + (this.barbecue * 7.00);
    }
    public double ticket(){
        char sexo = getGender();
        if (sexo == 'F')
            return 8.00;

        return 10.00;
    }
    public double total(){

        double total = 0.00;

        return total + feeding() + ticket() + cover();
    }

    public void relatorio() {
        System.out.println("RELATORIO");
        System.out.printf("\nConsumo = R$ %.2f", feeding());
        System.out.printf("\nCouvert = R$ %.2f", cover());
        System.out.printf("\nIngresso = R$ %.2f", ticket());
        System.out.printf( "\n\nValor a pagar = R$ %.2f", total());

    }
}
