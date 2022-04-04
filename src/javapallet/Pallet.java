
package javapallet;

public class Pallet {
    private String produto;
    private int qtd;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    @Override
    public String toString(){
        return getProduto()+ " : " + getQtd();
    }
    
}// fim classe
