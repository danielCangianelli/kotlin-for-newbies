package teoria

/*
------------------------------------------------------------------------------------------------------------------------
A keyword if testa uma expressão e verifica se o resultado dela é true ou false.
Uma expressão true-or-false é chamada de booleana.

 A expressão condicional (if expression for short ) é uma construção que permite
 que um programa execute diferentes processamentos dependendo do valor de uma expressão
 booleana. Se for true, o programa executa uma ação. Se for false, o programa executa outra ação
------------------------------------------------------------------------------------------------------------------------
Em sua forma mais simples consiste na keyword if, uma expressão booleana e um corpo entre chaves:

if (expressão) {
    // corpo
}
------------------------------------------------------------------------------------------------------------------------
Operadores relacionais
==
!=
>=
>
<=
<

Operadores lógicos
||
&&
!
------------------------------------------------------------------------------------------------------------------------
if-else

A expressão que vimos acima pode ser estendida com a palavra-chave elsee outro corpo para realizar ações alternativas
quando a expressão for false.

if (expression) {
    // faça algo
} else {
    // Faça outra coisa
}
------------------------------------------------------------------------------------------------------------------------
 if-else-if

 A forma mais usual da instrução condicional consiste em várias condições e else ramificações.

if (expression0) {
    // faça algo
} else if (expression1) {
    // Faça outra coisa 1
// ...
} else if (expressionN) {
    // Faça outra coisa N
}
------------------------------------------------------------------------------------------------------------------------
If aninhado
 Você pode aninhar uma expressão if no corpo de outra. Por exemplo:
 
 if (n % 2 == 0) {
    if (n % 3 == 0) {
        println("O número pode ser dividido por 6")
    } else {
        println("O número pode ser dividido por 2")
    }
} else {
    println("O número não pode ser dividido por 2")
}
------------------------------------------------------------------------------------------------------------------------
Condição como expressão:

val max = if (a > b) a else b
------------------------------------------------------------------------------------------------------------------------
 */