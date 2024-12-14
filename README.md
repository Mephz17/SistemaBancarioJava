# Sistema Bancário em Java

Este é um projeto básico de um sistema bancário implementado em Java, projetado para gerenciar contas bancárias e realizar operações como depósito, saque, transferência, visualização de histórico e solicitação de empréstimos. O projeto também permite a abertura e fechamento de contas.

## Funcionalidades

1. **Abertura de conta**: Permite criar contas bancárias fornecendo nome, CPF, senha e agência.
2. **Depósito**: Permite adicionar fundos à conta bancária.
3. **Saque**: Permite retirar fundos da conta bancária, respeitando o saldo disponível.
4. **Transferência**: Transfere dinheiro entre contas bancárias.
5. **Histórico de transações**: Exibe todas as transações realizadas na conta.
6. **Solicitação de empréstimo**: Permite solicitar empréstimos e calcula o valor total a ser pago com juros de 3% ao mês.
7. **Fechamento de conta**: Permite encerrar uma conta bancária após verificação de nome e senha.

## Como executar

1. Certifique-se de ter o [JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) instalado em sua máquina.
2. Clone este repositório em sua máquina local:
   ```
   git clone https://github.com/seuusuario/seurepositorio.git
   ```
3. Navegue até o diretório do projeto:
   ```
   cd seurepositorio
   ```
4. Compile os arquivos Java:
   ```
   javac -d bin src/com/mycompany/bancojava/*.java
   ```
5. Execute o programa:
   ```
   java -cp bin com.mycompany.bancojava.variosBancos
   ```

## Estrutura do Projeto

O projeto está dividido em duas classes principais:

1. **`operacoesBanco`**:
   - Contém a lógica para as operações bancárias, como depósito, saque, transferência, histórico de transações e solicitação de empréstimos.
   - Gerencia as informações de contas, como nome, CPF, senha e agência.

2. **`variosBancos`**:
   - Classe principal que interage com o usuário através do console.
   - Permite criar contas, realizar operações e visualizar dados.

## Como usar

Ao executar o programa, siga as instruções no console:

1. **Criação de contas**: Insira o nome, CPF, senha e agência para criar sua conta.
2. **Escolha de operação**: Após criar as contas, selecione uma das seguintes opções para operar:
   - 1: Depósito
   - 2: Saque
   - 3: Transferência
   - 4: Visualizar histórico de transações
   - 5: Fechar conta
   - 6: Solicitar empréstimo
   - 7: Sair
3. **Siga as instruções**: Insira os dados solicitados para realizar as operações desejadas.

## Melhorias Futuras

- Implementar tratamento de exceções para entradas inválidas.
- Adicionar interface gráfica para melhorar a interatividade.
- Utilizar banco de dados para persistência das contas e histórico.
- Substituir o array de histórico por uma estrutura mais eficiente, como listas ou coleções.

## Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo `LICENSE` para mais detalhes.

## Autor

Criado por IagoG. Qualquer dúvida ou sugestão, sinta-se à vontade para entrar em contato!

