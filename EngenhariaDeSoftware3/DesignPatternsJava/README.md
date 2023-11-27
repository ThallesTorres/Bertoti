<p align="center">Padrões de projeto (design patterns)<p/> 

<table>
  <tr>
    <th>Padrão</th>
    <th>Definição</th>
    <th>O que resolve</th>
    <th>Anti-padrão</th>
    <th>Exemplo</th>
  </tr>
  <tr>
    <td><strong>Strategy</strong></td>
    <td>Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. Permite que o cliente escolha dinamicamente qual algoritmo utilizar.</td>
    <td>Flexibiliza o código ao permitir que algoritmos sejam facilmente trocados ou estendidos sem modificar o código cliente.</td>
    <td>Evita o uso excessivo de herança, pois pode levar a uma hierarquia complexa.</td>
    <td>Ao escolher um meio de transporte para chegar ao aeroporto, como ônibus, táxi ou carro particular, você está aplicando o padrão Strategy para a estratégia de transporte.</td>
  </tr>
  <tr>
    <td><strong>Observer</strong></td>
    <td>Define uma dependência um para muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente.</td>
    <td>Permite que objetos se comuniquem de forma eficiente sem conhecimento direto uns dos outros, promovendo baixo acoplamento.</td>
    <td>Acoplamento direto entre observador e observado (alto acoplamento).</td>
    <td>Implementar um sistema de notificação em um chat, onde os participantes são notificados quando uma mensagem é enviada.</td>
  </tr>
  <tr>
    <td><strong>Composite</strong></td>
    <td>Compor objetos em estruturas de árvore para representar hierarquias parte-todo. Permite tratar objetos individuais e composições de objetos de maneira uniforme.</td>
    <td>Simplifica a manipulação de estruturas hierárquicas, possibilitando tratamento uniforme de objetos individuais e composições.</td>
    <td>Evitar herança excessiva e alto acoplamento.</td>
    <td>Um sistema de representação de elementos gráficos, onde um elemento pode ser uma forma simples ou uma composição complexa de várias formas.</td>
  </tr>
  <tr>
    <td><strong>Facade</strong></td>
    <td>Fornecer uma interface unificada para um conjunto de interfaces em um subsistema ou qualquer conjunto complexo de classes. Simplifica a complexidade do sistema.</td>
    <td>Reduz a complexidade ao fornecer uma interface única e fácil de usar para um subsistema complexo.</td>
    <td>Evitar complexidade desnecessária e alto acoplamento.</td>
    <td>Uma interface simplificada para um subsistema complexo, como uma biblioteca gráfica, onde operações comuns são encapsuladas em uma única interface.</td>
  </tr>
  <tr>
    <td><strong>Singleton</strong></td>
    <td>Garante a existência de apenas uma instância de uma classe e fornece um ponto global de acesso a ela.</td>
    <td>Controla estritamente o número de instâncias de uma classe, útil em configurações únicas, gerenciamento de recursos compartilhados ou para evitar conflitos em operações concorrentes.</td>
    <td>Evitar múltiplas instâncias da mesma classe.</td>
    <td>Gerenciamento de configurações globais em um aplicativo, onde apenas uma instância da configuração é necessária.</td>
  </tr>
</table>
