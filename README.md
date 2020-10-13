# value_objects_POO
atividade da aula 13/10/2020
  No exemplo feito em sala, praticamente todos os atributos podem ser considerados Value Objects. Como por exemplo o nome, telefone e email da classe Pessoa, assim como o desconto associado às composições Cliente e Fornecedor.
  Para a implementação, foi escolhido a validação do desconto. Sendo assim, toda vez que um usuário quiser adicionar um novo desconto à alguma compra, será necessário instanciar um new Desconto, sendo que dentro da classe Desconto já estão as validações necessárias para o tipo escolhido. Desse modo, desconto não é mais uma variável do tipo Double, mas sim uma variável do tipo Desconto.
