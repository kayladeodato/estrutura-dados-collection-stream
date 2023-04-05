## Estutura de Dados em Java e Stream
A seguir veremos as principais classes utilitárias de Collections e Map e sua aplicabilidade através dos principais métodos de cada um.

### 🔧 Pré-Requisitos
✔️ Java JDK 17;<br>
✔️ IDE IntelliJ;<br>
✔️ Básico e noção de Orientação a Objetos, ambos em Java;<br>

### 📝 Conteúdo
#### Collections
Uma Collection basicamente é um objeto que agrupa múltiplos elementos, sejam variáveis primitivas ou objetos dentro de uma única unidade. Pode ser compostas por:
* Interfaces: consiste em um contrato que quando assumido por uma classe deve ser implementado;
* Implementação ou Classes: são as materializações, a codificação das interfaces;
* Algoritmos: é uma sequencia lógica, finita e definida de instruções que devem ser seguidas para resolver um problema;
Abaixo como as Collections estão organizadas:
![](http://www.startertutorials.com/corejava/wp-content/uploads/2018/02/collections-hierarchy.png)<br>
Percebe-se que o Map não faz parte do framework de Collections mas é bastante utilizado em tratamento e estrutura de dados.

#### Listas
![](https://examples.javacodegeeks.com/wp-content/uploads/2019/06/java_lists_1.png.webp)<br>

As listas permitem elementos duplicados e garante ordem de inserção. Também permite adição, atualização, leitura e remoção sem regras adicionais. As classes mais utilizadas são a ArrayList e a LinkedList. 
As principais características entre a ArrayList e LinkedList: 

**ArrayList** deve ser usado onde mais operações de pesquisa são necessárias, garante ordem de inserção, permite ordenação através dos comparators;

**LinkedList** deve ser usado onde mais operações de inserção e exclusão são necessárias. Garante ordem de inserção; Permite adição, leitura e remoção considerando a regra básica de uma fila: primeiro que entra, primeiro que sai. Não permite uma mudança de ordenação.

Exemplos práticos e uso dos principais métodos do <a href="https://github.com/kayladeodato/estrutura-dados-collection-stream/tree/main/src/br/com/projeto/dados/list"> List </a>.

#### Set
![](https://examples.javacodegeeks.com/wp-content/uploads/2020/01/Java-Set-UML-Diagram-1.jpg.webp)<br>

O Set por padrão não garante ordem e também não permite elementos duplicados. Permite adição e remoção normalmente, porém não possui busca e atualização.
Por não apresentar índice ou ordem, não consegue realizar pesquisas. Outra característica é não permitir a mudança de ordenação. 
As principais classes da Interface Set são: HashSet, LinkedHashSet e TreeSet. E as principais características entre cada uma: 

**HashSet** apresenta ordem aleatória. Pelo fato de não manter ordenação, não permitirá valores repetidos. Apresenta uma melhor performance;

**LinkedHashSet** deve ser usado quando é preciso manter a ordem de inserção dos elementos. Sua performance é mais lenta pois precisa manter a ordem;

**TreeSet** pode ser utilizado quando há a necessidade de alterar a ordem através do uso de Comparators, nisso consegue manter a ordem e ser reordenado. Sua performance é eficiente para a leitura, nos casos de modificação fica lento ( mais lento que o LinkedHashSet).

Exemplos práticos e uso dos principais métodos do <a href="https://github.com/kayladeodato/estrutura-dados-collection-stream/tree/main/src/br/com/projeto/dados/set/sorteio"> Set </a>.


### 🔗 Links úteis

### ❗ Observações

### 🤝 Contribuindo


