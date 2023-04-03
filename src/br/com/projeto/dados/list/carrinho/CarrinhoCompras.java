package br.com.projeto.dados.list.carrinho;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CarrinhoCompras implements Comparable<CarrinhoCompras>{
    private String produto;
    private double valor;
    private int quantidade;
    private int codigo;

    public CarrinhoCompras(String produto, double valor, int quantidade, int codigo) {
        this.produto = produto;
        this.valor = valor;
        this.quantidade = quantidade;
        this.codigo = codigo;
    }

    public String getProduto() {

        return produto;
    }

    public void setProduto(String produto) {

        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double valorTotal() {
        List<CarrinhoCompras> carrinho = new LinkedList<>();
        Iterator<CarrinhoCompras> iterator = carrinho.listIterator();
        Double soma = 0d;
        int quantidadeProdutosCarrinho = carrinho.size();
        while (iterator.hasNext()) {
            Double next = iterator.next().valorTotal();
            soma += next;
        }

        double valorTotal = this.getValor() * this.getQuantidade();
        return valorTotal;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Produto:" + produto + ", Valor=" + valor + ", Quantidade=" + quantidade + ", Código=" + codigo + "\n");

        return sb.toString();

    }

    @Override
    public int compareTo(CarrinhoCompras carrinho) {
        if (this.valor > carrinho.getValor()) {
            return 1;
        } else if(this.valor < carrinho.getValor()) {
            return -1;
        }

        return 0;
    }
}
