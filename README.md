## Estutura de Dados em Java e Stream
Principais classes utilitárias de Collections e Map. Utilizando os principais métodos de cada um.

### Pré-Requisitos
✔️ Java JDK 17;<br>
✔️ IDE IntelliJ;<br>
✔️ Básico e noção de Orientação a Objetos, ambos em Java;<br>

### Conteúdo
#### Collections
Uma Collection basicamente é um objeto que agrupa múltiplos elementos, sejam variáveis primitivas ou objetos dentro de uma única unidade. Pode ser compostas por:
* Interfaces: consiste em um contrato que quando assumido por uma classe deve ser implementado;
* Implementação ou Classes: são as materializações, a codificação das interfaces;
* Algoritmos: é uma sequencia lógica, finita e definida de instruções que devem ser seguidas para resolver um problema;
Abaixo como as Collections estão organizadas:
![](http://www.startertutorials.com/corejava/wp-content/uploads/2018/02/collections-hierarchy.png)<br>
Percebe-se que o Map não faz parte do framework de Collections mas é bastante utilizado em tratamento e estrutura de dados.

#### Listas
As listas permitem elementos duplicados e garante ordem de inserção. Também permite adicção, atualização, leitura e remoção sem regras adicionais.
Diferença entre a ArrayList e LinkedList: 
**Arraylist** deve ser usado onde mais operações de pesquisa são necessárias, garante ordem de inserção, permite ordenação através dos comparators;

**LinkedList** deve ser usado onde mais operações de inserção e exclusão são necessárias. Garante ordem de inserção; Permite adição, leitura e remoção considerando a regra básica de uma fila: primeiro que entra, primeiro que sai; Não permite uma mudança de ordenação.

Exemplos práticos e uso dos principais métodos do <a href="https://github.com/kayladeodato/estrutura-dados-collection-stream/tree/main/src/br/com/projeto/dados/list/playlist"> ArrayList </a> e <a href="https://github.com/kayladeodato/estrutura-dados-collection-stream/tree/main/src/br/com/projeto/dados/list/carrinho"> LinkedList </a>.
