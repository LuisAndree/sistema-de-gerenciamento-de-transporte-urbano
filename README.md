---

# Sistema de Gerenciamento de Transporte Urbano

Este projeto é um **sistema de gerenciamento de frota de transporte urbano** desenvolvido em Java, utilizando os princípios de **Programação Orientada a Objetos (POO)**. Ele permite o gerenciamento de diferentes tipos de veículos, registrar viagens, calcular lucros e gerar relatórios.

## Sumário

- [Descrição do Projeto](#descrição-do-projeto)
- [Funcionalidades](#funcionalidades)
- [Estrutura de Pacotes](#estrutura-de-pacotes)
- [Pré-requisitos](#pré-requisitos)
- [Instalação](#instalação)
- [Como Usar](#como-usar)
- [Contribuições](#contribuições)
- [Licença](#licença)

## Descrição do Projeto

O **Sistema de Gerenciamento de Transporte Urbano** é uma aplicação que simula a gestão de uma frota de transporte urbano, composta por diversos tipos de veículos como **ônibus**, **metrô** e **táxi**. Cada veículo possui características próprias, como capacidade de passageiros e método de cálculo de lucro. O sistema permite o registro de viagens, o cálculo de lucros e a geração de relatórios individuais e da frota completa.

Este projeto foi desenvolvido com o objetivo de aplicar conceitos avançados de POO, como **herança**, **interfaces** e **classes abstratas**, promovendo uma arquitetura modular e reutilizável.

## Funcionalidades

- **Cadastro de veículos**: Permite adicionar veículos como Ônibus, Metrô e Táxi à frota.
- **Registro de viagens**: Registrar a distância percorrida por cada veículo.
- **Cálculo de lucros**: Calcular o lucro de cada veículo com base nas viagens realizadas.
- **Relatórios**: Gerar relatórios do desempenho de cada veículo e da frota como um todo.

## Estrutura de Pacotes

A estrutura de pacotes do projeto é organizada de forma modular, facilitando a manutenção e a evolução do sistema:

```
src/
 └── br/
     └── com/
         └── transporte/
             ├── veiculos/               # Classes concretas dos veículos
             │    ├── Onibus.java         # Classe Ônibus
             │    ├── Metro.java          # Classe Metrô
             │    └── Taxi.java           # Classe Táxi
             ├── gerenciamento/           # Gerenciamento da frota e operações
             │    └── GestorDeFrota.java  # Classe responsável pela gestão da frota
             ├── interfaces/              # Definição de interfaces
             │    └── Veiculo.java        # Interface que todos os veículos implementam
             ├── VeiculoDeTransporte.java # Classe abstrata base para veículos
             └── app/
                  └── Main.java           # Classe principal com o método main()
```

### Explicação dos Pacotes

- **veiculos**: Contém as implementações concretas dos diferentes tipos de veículos.
- **gerenciamento**: Implementa a lógica de gerenciamento da frota, como adição de veículos e cálculo de lucros.
- **interfaces**: Define a interface **Veiculo**, que especifica as operações comuns para todos os tipos de veículos.
- **app**: Contém a classe principal (`Main.java`), responsável por iniciar a aplicação.

## Pré-requisitos

Para rodar o projeto, é necessário ter:

- **Java 8+**
- **IDE Java** (como Eclipse, IntelliJ, NetBeans)
- **Maven** (opcional, caso utilize dependências externas)

## Instalação

1. Clone este repositório para sua máquina local:
   ```bash
   git clone https://github.com/seu-usuario/sistema-transporte-urbano.git
   ```

2. Importe o projeto em sua IDE Java preferida.

3. Compile o projeto e execute a classe `Main.java`, que se encontra em `src/br/com/transporte/app/Main.java`.

## Como Usar

1. **Inicialize o sistema** executando a classe `Main`.
2. O sistema criará um **Gestor de Frota** que gerencia os veículos da frota, como Ônibus, Metrô e Táxi.
3. A partir daí, você poderá adicionar novos veículos à frota, registrar viagens, calcular lucros e gerar relatórios sobre o desempenho de cada veículo.

Exemplo de relatório gerado no console:

```
Relatório dos veículos:
Tipo de Veículo: Ônibus
Capacidade de Passageiros: 50
Número de Viagens: 2
Distância Total Percorrida: 20.0 km
Total Arrecadado: R$ 8.0
--------------------
Tipo de Veículo: Metrô
Capacidade de Passageiros: 200
Número de Viagens: 1
Distância Total Percorrida: 15.0 km
Total Arrecadado: R$ 7.5
--------------------
Lucro total arrecadado pela frota: R$ 15.5
```

## Contribuições

Contribuições são bem-vindas! Para contribuir, siga os passos abaixo:

1. Faça um fork deste repositório.
2. Crie uma branch para sua feature: `git checkout -b minha-feature`.
3. Adicione suas modificações e faça commit: `git commit -m 'Adiciona minha feature'`.
4. Envie para o repositório original: `git push origin minha-feature`.
5. Abra um **Pull Request** para revisão.

## Licença

Este projeto está licenciado sob a **Licença MIT** - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Esse **README** proporciona uma visão geral clara e objetiva do projeto, com informações importantes sobre funcionalidades, estrutura de pacotes, instalação e uso.
