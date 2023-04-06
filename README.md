## Estutura de Dados em Java e Stream
A seguir veremos as principais classes utilitárias de Collections e Map e sua aplicabilidade através dos principais métodos de cada um. 

### 🔧 Pré-Requisitos
✔️ Java JDK 17;<br>
✔️ IDE IntelliJ;<br>
✔️ Básico e noção de Orientação a Objetos, ambos em Java;<br>

### 📝 Conteúdo
#### Introdução
Estrutura de dados é uma estrutura que armazena e organiza dados/informações de modo que os dados possam ser acessados e manipulados de forma efeiciente. 
São utilizados nessa manipulação listas, pilhas, filas e árvores.
As **listas** também chamadas como vetores ou arrays é a estrutura de dados mais simples que existe. Armazena uma sequência de valores onde todos são do mesmo tipo. Pode-se criar uma lista sem precisar especificar o tipo, nesse caso usa-se [Generics](http://https://www.devmedia.com.br/java-generics-trabalhando-com-metodos/30911 "Generics").
As **pilhas** também conhecidas como Stacks e Queues tem o comportamento de último a entrar primeiro a sair ou primeiro a entrar último a sair. A classe Stack do Java não é estática, e ela está ligada a outra classe que é LinkedList. Por isso não precisa de uma capacidade.
As **filas** tem o comportamento primeiro a entrar, primeiro a sair. A interface de fila é a Queue no Java e para implementar uma que possui características da fila é o LinkedList.
As **árvores** é uma estrutura de dados bidimensional e não são lineares. É constituída de nós que representam um modelo hierárquico (armazenam os dados com base em relações e dependências).

#### Collections
Uma Collection basicamente é um objeto que agrupa múltiplos elementos, sejam variáveis primitivas ou objetos dentro de uma única unidade. Pode ser compostas por:
* Interfaces: consiste em um contrato que quando assumido por uma classe deve ser implementado;
* Implementação ou Classes: são as materializações, a codificação das interfaces;
* Algoritmos: é uma sequencia lógica, finita e definida de instruções que devem ser seguidas para resolver um problema;
Abaixo como as Collections estão organizadas:
![](http://www.startertutorials.com/corejava/wp-content/uploads/2018/02/collections-hierarchy.png)<br>

Percebe-se que o Map não faz parte do framework de Collections mas é bastante utilizado em tratamento e estrutura de dados.
Outro ponto de atenção é não confundir a **interface Collection** com a **classe Collections**. A interface Collection comporta todas as coleções em Java, na qual aborda mais detalhados nos exemplos e conteúdo a seguir. Já a classe Collections é uma classe utilitária para realizar algumas operações em uma Collection. (Nos exemplos utilizei Collections.min e Collections.max ao pegar elementos de menor e maior valor, respectivamente).

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

#### Map
![](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20200811210611/Collection-Framework-2.png)
Fonte:geeksforgeeks.org

O Map diferente dos demais vistos anteriormente, não extende da Interface Collections. Faz parte do java.util.
Tem como característica elementos únicos (key/chave) para cada valor (value), ou seja, as chaves não podem se repetir mas os valores sim. Assim, facilita a manipulação de uma estrutura.
Permite adição, busca por chave ou valor, atualização, remoção e navegação. Também podem ser ordenados.

As principais classes da Interface Map são: HashMap, LinkedHashMap e TreeMap. E as principais características entre cada uma: 

**HashMap** apresenta ordem aleatória, ou seja, não realiza ordenação dos elementos. Suporta o uso de valor e chaves nulos ("null");;

**LinkedHashMap** é usado para fazer ordenações com a ordem de inserção ou ordem de acesso. Suporta o uso de valor e chaves nulos ("null");

**TreeMap** é usado para fazer ordenações do menor para o maior (ordem natural das chaves). Não suporta o uso de valor e chaves nulos ("null") e é fortemente utilizado na manipulação de dados hierárquicos.

Exemplos práticos e uso dos principais métodos do <a href="https://github.com/kayladeodato/estrutura-dados-collection-stream/tree/main/src/br/com/projeto/dados/map"> Map </a>.

#### Stream
Antes de falarmos de Stream vamos ver alguns conceitos que deixarão o entendimento de stream mais "amigável".

**Classe Anônima** é uma classe que não recebeu um nome e é tanto delcarado e instanciado em uma única instrução, ou seja, pode-se ser usada em casos que você precisa criar uma classe que será instanciado apenas uma vez.

**Funcional Interface** refere-se a qualquer interface com um SAM (Single Abstract Method). Sua implementação pode ser tratada como expressões Lambda. Alguns exemplos de interfaces funcionais: Comparator, Consumer, Funcion, Predicate.

**Lamba** é uma simplificação de uma classe anônima. É uma função sem declaração, sem a necessidade de colocar um nome, um tipo de retorno e o modificador de acesso. A ideia é que o método seja declarado no mesmo lugar em que será usado. 
A sua sintaxe é: (argumento) -> (corpo)

**Reference Method** serve para simplicar uma expressão Lamba. Permite fazer referência a um método ou construtor de uma classe (de forma funcional) e assim indicar que ele deve ser utilizado num ponto específico do código, deixando mais simples e legível. É representado por "::".

Por fim, vem a definição de **Stream API**.
A proposta de Streams API é reduzir a preocupação do desenvolvedor de implementar controle de fluxo ao lidar com coleções, deixando isso a cargo da API.
A ideia é iterar sobre essas coleções e a cada objeto, e a cada elemento, realizar uma ação, seja ela de filtragem e mapeamento, transformação, etc.
Tem característica imutável, pois não altera a coleção origem, sempre cria uma nova coleção.
Sua estrutura consiste em: Source (fonte) -> Pipeline (operação intermediária) -> Terminal (operação final).
As operações intermediárias retornam uma stream. As operações terminais retornam um valor ou um objeto.

Exemplos práticos e uso dos principais métodos de <a href="https://github.com/kayladeodato/estrutura-dados-collection-stream/tree/main/src/br/com/projeto/dados/stream"> Stream </a>.

### 🔗 Links úteis
Documentações:<br>
[Collection](http://https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html "Collection")<br>
[List](http://https://docs.oracle.com/javase/8/docs/api/java/util/List.html "List")<br>
[Set](http://https://docs.oracle.com/javase/8/docs/api/java/util/Set.html "Set")<br>
[Map](http://https://docs.oracle.com/javase/8/docs/api/java/util/Map.html "Map")<br>
Artigo da Oracle sobre [Stream API](http://https://www.oracle.com/br/technical-resources/articles/java-stream-api.html "Stream API")<br>
[Intefaces Funcionais](http://https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html "Intefaces Funcionais")<br>

### ❗ Observações
Este curso que realizei foi ministrado pela [Camila Cavalcante](http://https://github.com/cami-la "Camila Cavalcante") disponibilizado pela Digital Inovation One, aproveito para deixar o [repositório original](http://https://github.com/cami-la/curso-dio-intro-collections "repositório original") do conteúdo do curso.

### 🤝 Contribuindo
Esse repositório foi criado para reforçar os estudos em estrutura de dados e para possíveis revisões, e espero que possa ajudá-los de alguma forma. Se quiser contribuir e compartilhar, pode ficar a vontade! 
Agradeço se puderem dar o Star ⭐ e/ou encontrar issues 🐛!


------------

✨ Feito com carinho por [Kayla](http://https://www.linkedin.com/in/kayla-deodato/ "Kayla")
