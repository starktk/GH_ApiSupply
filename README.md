# GHAND
## GHand é um projeto de controle de fluxo de informações de fornecedores.
### Temos como missão e objetivo centralizar cada informação referente a fornecedores podendo oferecer uma eficacia nas 
### atividades diárias como recepção de produtos, contato com fornecedores, controle de entrega e controle de datas para pagamentos.

## Tecnologias utilizadas:
- Java 19
- Spring
- MongoDB
- Docker & Docker Compose

## Pré requisitos:
 - Docker
 - Docker Compose
 - Java 19

## Instruções de como rodar o projeto:
- Clonar o repositório:
```bash
git clone https://github.com/starktk/GH_ApiSupply
```
```bash
cd GH_ApiSupply
```
- Buildar os containers e inicializar
```bash
docker compose up --build
```
## Caso não esteja com o docker instalado:
### Windows -> https://docs.docker.com/desktop/setup/install/windows-install/  
- Obs: Já inclui o Docker Compose instalado.
### Linux -> https://docs.docker.com/engine/install/ubuntu/ 
- Obs: O Docker Compose já estará disponível como plugin (docker compose).
- verificando instalação
```bash
docker --version
```
```bash
docker compose version
```

- Se preferir rodar em segundo plano:
```bash
docker compose up -d --build
```
- Verificando se os containers estão rodando:
```bash
docker compose ps
```
- Parando os containers
```bash
docker compose stop
```
## Para acessar EndPoints da API utilizar a seguinte url após inicializar o projeto:
 - http://localhost:8084
## Observações:
- O projeto está configurado para MongoDB local via container.
- Caso queira alterar porta ou variáveis, edite o arquivo docker-compose.yml.

## Desenvolvido por: Raul Rodrigues
