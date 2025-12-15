A locadora de veículos "Rota Certa" está modernizando seu atendimento e precisa de um sistema backend para gerenciar sua frota e calcular orçamentos de aluguel. O gerente de TI solicitou a criação de uma estrutura baseada em boas práticas de Programação Orientada a Objetos (POO), garantindo que o sistema seja extensível para adicionar novos tipos de veículos no futuro (como caminhões ou vans).

Atualmente, a locadora trabalha com dois tipos principais de veículos: Carros e Motos. O sistema deve utilizar rigorosamente os pilares de encapsulamento, herança e polimorfismo.

Instruções da Atividade:

1. Análise do Diagrama UML: Seguindo as orientações do diagrama de classe acima (ou da descrição textual, caso não visualize a imagem), identifique e liste:
   Os atributos de cada classe.
   Os métodos construtores e getters.
   O nível de visibilidade (público/privado) dos membros.
   A relação de herança entre as classes.

2. Implementação em Java: Implemente as classes do diagrama em Java. Certifique-se de que a classe Veiculo seja a classe mãe (superclasse) e que Carro e Moto sejam as classes filhas (subclasses). Utilize o modificador private para os atributos e crie os métodos de acesso (getters) necessários.

3. Lógica de Negócio (Polimorfismo): A gerência decidiu aplicar regras de preços diferentes dependendo do tipo de veículo. Implemente o método calcularAluguel(int dias) na classe Veiculo e sobrescreva-o nas subclasses com as seguintes regras:
   Para Carros: O valor do aluguel é o (valor da diária * dias). Porém, devido ao seguro obrigatório mais caro, deve-se adicionar uma taxa de 10% ao valor final.
   Para Motos: O valor do aluguel é o (valor da diária * dias). Para incentivar a locação, deve-se aplicar um desconto de 5% no valor final.

4. Questões Teóricas: Responda às perguntas abaixo no final do código (como comentário em bloco ou em um arquivo README.md separado): a) Por que o atributo valorDiaria foi colocado na classe Veiculo e não repetido nas classes Carro e Moto? Explique com base no conceito de Herança. b) No método calcularAluguel, a assinatura é a mesma, mas o comportamento muda entre Carro e Moto. Qual pilar da POO permite que tratermos objetos diferentes de maneira uniforme, mas com execuções específicas? Explique.

Entrega: Essa avaliação deve ser entregue com o link do repositório do GitHub.
Inicie o repositório local, realize a atividade (commits organizados são bem-vindos).
Suba o projeto para seu repositório remoto no Github.
Cole o link do repositório na entrega do Google Classroom.