# SistemaPortariaEmpresarial
O software deve ter uma interface minimalista, prática e intuitiva, para que o usuário (porteiro) possa entender facilmente o funcionamento do sistema. O sistema deve ter tais utilidades:

Tecnologias que serão utilizadas: Java, Microsoft SQL Server, HTML e CSS. 
Periféricos: Computador, monitor touch, teclado, mouse, no-break. (O sistema requer conexão com a internet.)

## Recursos Principais:
- **Registro de Visitantes:** Como qualquer outra portaria, o sistema irá solicitar os dados de entrada e o porteiro deve inserir os dados do visitante, como: Nome, CPF, Telefone, Nome da Empresa, etc. Assim que os dados forem coletados e o formulário for enviado, o sistema irá coletar a data e hora que o visitante foi registrado e atribuir um ID único para o mesmo.

- **Registro de Notas Fiscais:** Como estamos nos referindo à uma portaria empresarial, o porteiro também deve registrar a entrada e saída de notas fiscais. Assim como o registro de visitantes, será coletado alguns dados sobre o "entregador" da nota, e o número da nota.
E novamente, após o envio do formulário, será coletado a data e hora na qual a nota fiscal foi recebida/enviada.

- **Registro de Usuários:** O administrador do sistema poderá realizar o registro de novos usuários(porteiros) conforme necessário.

- **Exclusão e Alteração de Dados:** Caso seja necessário, o administrador e/ou o porteiro poderão realizar alterações e exclusões de dados. (A empresa deve manter um backup dos dados para evitar possíveis problemas.)

- **Filtro por Coluna:** O sistema irá implementar um filtro para o banco que dados, que permitirá buscas mais precisas.


## Representações visuais do sistema - Diagramas:

### Diagrama de Casos de Uso
<img src="/resources/DiagramaCasosDeUso.png">

### Diagrama de Sequência
<img src="/resources/DiagramaSequencia.png">

### Diagrama de Classes
<img src="/resources/DiagramaClasses.png">

### Diagrama de Componentes
<img src="/resources/DiagramaComponentes.jpeg">
