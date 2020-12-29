# TestesEmAPI_REST
 Funcionais com Maven e Não funcionais com Jmeter

- Testes da API

    Tive problemas para criar o projeto usando o NetCore no VS. Apesar de utilizar essa stack no meu trabalho, inclusive por dar manutenção nele. No entanto, fiz o projeto na stack java, usando Maven e IntelliJ IDEA.

    - Projeto de automação: RegressionTestesAPI.iml
    - Dependências:
        - java jdk: https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html;
        - IntelliJ: https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC

- Testes não funcionais
    - Para os testes de performance da API utilizei o Jmeter
    - Projeto: Teste_Performance_API.jmx

    - Instalação e abertura:
        Para rodar no windows é necessário:
        - baixar a  versão compatível: [https://downloads.apache.org//jmeter/binaries/apache-jmeter-5.4.zip](https://downloads.apache.org//jmeter/binaries/apache-jmeter-5.4.zip) ;
        - descompactar em qualquer diretório;
        - Executar o bat contido na pasta: ..\apache-jmeter-5.4\bin\jmeter.bat
        - Abrir o arquivo de configuração do projeto: https://github.com/christiansaddock/TestesEmAPI_REST/tree/main/TestesPerformanceComJMeter 
        - Clicar no item da arvore de menus: View Results Tree
        - Clicar em Start para testar e analisar os resultados;
    