package br.com.projeto.dados.list.carrinho;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExemploCarrinhoCompras {
    public static void main(String[] args) {

        List<CarrinhoCompras> carrinho = new LinkedList<>() {{
            add(new CarrinhoCompras("Camisa preta básica", 19.90, 1,10230));
            add(new CarrinhoCompras("Camisa branca básica", 19.90, 2,10285));
            add(new CarrinhoCompras("Short linho", 59.90, 1,10228));
            add(new CarrinhoCompras("Calça jeans", 109.90, 1,10263));
            add(new CarrinhoCompras("Camisa preta básica", 19.90, 1,10212));
        }};

        System.out.println(carrinho);

        System.out.println("O quarto item do carrinho é: " + carrinho.get(3));

        System.out.println("O menor valor unitário é de " + Collections.min(carrinho));

        System.out.println("O maior valor unitário é de " + Collections.max(carrinho));

        Iterator<CarrinhoCompras> iterator = carrinho.listIterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next().valorTotal();
            soma += next;
        }

        System.out.println("Adicionando mais um produto na primeira posição: ");
        CarrinhoCompras maisUmItem = new CarrinhoCompras("vestido florido",149.90, 1,10287);
        carrinho.add(0, maisUmItem);
        System.out.println(carrinho);

        System.out.println("Existe vestido no carrinho de compras?  " + carrinho.contains(maisUmItem));

        System.out.println("Existem " + carrinho.size() + " tipos de produtos no carrinho totalizando: " + soma);

        System.out.println("Removendo o item 2 do carrinho: " + carrinho.get(1));

        carrinho.remove(1);
        System.out.println("Carrinho atualizado: \n" + carrinho);

        System.out.println("O carrinho está vazio? " + carrinho.isEmpty());

    }
}
