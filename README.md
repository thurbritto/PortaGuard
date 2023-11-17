# API PortaGuard - O Sistema de Portaria Empresarial

**Tecnologias utilizadas:** Java.
**Banco de Dados:** PostgreSQL.

**Dependências:** 
- Spring Boot
- Spring Web
- Spring DevTools
- Spring Data JPA
- Spring Security
- Project Lombok
- Auth0 Java JWT
- Jakarta Validation API
- PostgreSQL

## Recursos Principais:
- **Registro de Usuários:** O administrador do sistema poderá realizar o registro de novos usuários(porteiros) conforme necessário.

- **Autenticação de Usuário:** Quando um usuário registrado realiza o login no sistema, é gerado um token que permanece ativo por 4 horas, garantindo o acesso ao sistema.

- **Registro de Visitantes:** Como qualquer outra portaria, o sistema irá solicitar os dados de entrada e o porteiro deve inserir os dados do visitante, como: Nome, CPF, Telefone, Nome da Empresa, etc. Assim que os dados forem coletados e o formulário for enviado, o sistema irá coletar a data e hora que o visitante foi registrado e atribuir um ID único para o mesmo. Também será coletado quem foi o responsável por aquele registro.

- **Registro de Notas Fiscais:** Como estamos nos referindo à uma portaria empresarial, o porteiro também deve registrar a entrada e saída de notas fiscais. Assim como o registro de visitantes, será coletado alguns dados sobre o "entregador" da nota, e o número da nota.
E novamente, após o envio do formulário, será coletado a data e hora na qual a nota fiscal foi recebida/enviada. Também será coletado quem foi o responsável por aquele registro.

- **Exclusão e Alteração de Dados:** Caso seja necessário, o administrador e/ou o porteiro poderão realizar alterações e exclusões de dados. (A empresa deve manter um backup dos dados para evitar possíveis problemas.)

- **Filtro por Atributo:** O Sistema contém um filtro para o banco de dados, que permitirá buscas mais precisas. O filtro permite que o usuário escolha por quais atributos a pesquisa será realizada.


## Representações visuais do sistema - Diagramas:

### Diagrama de Casos de Uso
<img src="/resources/DiagramaCasosDeUso.png">

### Diagrama de Sequência
<img src="/resources/DiagramaSequencia.png">

### Diagrama de Classes
<img src="/resources/Diagrama de Classes - API Portaguard.png">

### Diagrama de Componentes
<img src="/resources/DiagramaComponentes.jpeg">
