# GS- 2TDSJ

## Integrantes
 - Gabriel Sun Gonçalo da Silva - RM: 88316
 - Kleber Albert de Sousa Monteiro - RM: 88711
 - Renato Miranda Esmail - RM: 86701

## Proposta :

Registrar Locais com acessibilidade e o tipo de acessibilidade e apresentar os locais.


## Link do Youtube :

```

https://youtu.be/wJFeZ2h4bjs

```

## EMPACOTAR

```

./mvnw package

```

## CRIAR IMAGEM NO DOCKER: precisar esta logado no docker

```

docker build -t acessible -f Dockerfile .

```

## Executar o docker :

```

docker container run -it -d -p 8080:8080 --name acessible-01 acessible

```
Caso queira ver o WebApp ou Api elas estão disponível para teste no heroku até o dia 27 de Novembro :
API : 
```

https://acessible.herokuapp.com/api/localacessibilidade

```

WebApp:

```

https://acessible.herokuapp.com/localacessilidade

```
