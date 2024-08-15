For Each vs. For: Explorando a Diferença em Java
Este projeto demonstra a diferença entre o loop for tradicional e o loop forEach em Java, utilizando um vetor de inteiros como exemplo.

Objetivo:

Compreender as diferenças de sintaxe e funcionamento entre os loops for e forEach.
Identificar as vantagens e desvantagens de cada tipo de loop.
Demonstrar a aplicação prática do loop forEach para iterar sobre elementos de um vetor.
Estrutura do Projeto:

ForEach.java: Classe principal que contém o código do exemplo.
Como Executar:

Compile o código Java.
Execute a classe ForEach.java.
Explicação do Código:

O código define um vetor de inteiros vetNumeros.
O primeiro loop for é um exemplo tradicional, utilizando um contador (i) para iterar sobre cada elemento do vetor.
O segundo loop for utiliza a sintaxe forEach, que itera diretamente sobre cada elemento do vetor sem a necessidade de um contador.
Diferenças entre for e forEach:

Sintaxe: O loop forEach é mais conciso e simplificado, eliminando a necessidade de um contador.
Iteração: O loop for itera sobre um intervalo definido pelo contador, enquanto o forEach itera sobre cada elemento de uma coleção.
Modificação: O loop for permite a modificação dos elementos da coleção durante a iteração, enquanto o forEach não.
Vantagens do forEach:

Simplicidade: Sintaxe mais fácil de entender e escrever.
Segurança: Impede a modificação acidental de elementos durante a iteração.
Legibilidade: Código mais limpo e fácil de ler.
Desvantagens do forEach:

Flexibilidade: Menor flexibilidade em relação ao loop for tradicional.
Modificação: Não permite a modificação de elementos durante a iteração.
Conclusão:

O loop forEach é uma opção ideal para iterar sobre elementos de uma coleção quando a modificação dos elementos não é necessária. O loop for tradicional oferece maior flexibilidade, mas exige mais código e cuidado para evitar erros de modificação durante a iteração.
