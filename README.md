# Diferença entre classe e aplicação

Uma aplicação é algo executável, ela consome classes. Se tem main é aplicação.
ex: public static void main (String args[])

Uma classe serve como um modelo para ser consumida. Se não tem main é uma classe.
ex:public static void maim (String args[])

# JDK vs JVM

JDK é o kit para rodar o java.
JMV é a máquina virtual do java que o interpreta.

# Comandos para compilar e executar um arquivo .java

compila: javac c:/temp/BoaNoite.java
executa: java -cp c:/temp BoaNoite

# Duas formas de criar um array no Java

## 1º forma

String[] vetor = {"10","20"};

## 2º forma
		
String[] v = new String[2];
v[0] = "30";
v[1] = "40";

# Função vs Método

Função é algo genérico, já o método é um trecho que manipula o conteúdo de um objeto.

Veja o arquivo `Math01.java`