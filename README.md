# java-discoduroderoer
## Ejercicios Básicos
1) Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).

2) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indícalo también.

3) Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola. Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.

4) Modifica la aplicación anterior para que nos pida el nombre que queremos introducir (usa JOptionPane).

5) Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (para pasar de String a double usa Double.parseDouble). Usa la constante PI y el método pow de Math.

6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.

7) Lee un número por teclado y muestra por consola el carácter al que pertenece en la tabla ASCII. Por ejemplo: si introduzco 97, muestra a.

8) Modifica el ejercicio anterior, para que, en lugar de pedir un número, pida un carácter (char) y muestre su código en la tabla ASCII.

9) Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. El IVA será una constante que será del 21%.

10) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.

11) Haz el mismo ejercicio anterior con un bucle for.

12) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.

13) Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final mostrará la suma de todas las ventas. Piensa que es lo que se repite y lo que no.

14) Realiza una aplicación que nos calcule una ecuación de segundo grado. Debes pedir las variables a, b y c por teclado y comprobar antes el discriminante (operación en la raíz cuadrada). Para la raíz cuadrada usa el método sqlrt de Math.

15) Lee un número por teclado y comprueba que este número es mayor o igual que cero, si no lo es lo volverá a pedir (do while), después muestra ese número por consola.

16) Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá más la contraseña y mostrará un mensaje diciendo “Enhorabuena”. Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).

17) Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello.

18) Pide por teclado dos números y genera 10 números aleatorios entre esos números. Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de double a int).

19) Pide por teclado un número entero positivo (debemos controlarlo) y muestra el número de cifras que tiene. Por ejemplo: si introducimos 1250, se muestra que tiene 4 cifras. Tendremos que controlar si tiene una o más cifras, al mostrar el mensaje.

20) Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel solo puede dividirse entre 1 y si mismo. Para saber si es primo, calcular la raíz cuadrada del número e ir comprobando si es divisible desde ese número hasta 1. Si se introduce un número menor o igual que 1, directamente no es primo.

21) Muestra los números primos entre 1 y 100.

22) Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta cuantas vocales hay en total (recorre el String con charAt).

23) Reemplaza todas las a del String anterior por una e.

24) Recorre el String del ejercicio 22 y transforma cada carácter a su código ASCII. Muéstralos en línea recta, separados por un espacio entre cada carácter.

25) Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y un signo aritmético (String), según este último se realizará la operación correspondiente. Al final mostrara el resultado en un cuadro de díalogo.

Los signos aritméticos disponibles son:

- + suma los dos operandos.
- - resta los operandos.
- * multiplica los operandos.
- / divide los operandos, este debe dar un resultado con decimales (double)
- ^ 1º operando como base y 2º como exponente.
- %  módulo, resto de la división entre operando1 y operando2.

26) Realizar la suma del 1 al número que indiquemos, este debe ser mayor que 1.

27) Crear una aplicación que nos permite insertar números hasta que insertemos un -1. Calcular el número de números introducidos.

28) Eliminar los espacios de una frase pasada por consola por el usuario.

29) Pedir al usuario que nos escriba frases de forma infinita hasta que insertemos una cadena vacía. Muestra la cadena resultante de concatenar todas las frases introducidas.

30) Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el usuario lo pida y mostraremos el resultado por pantalla.

31) Mostrar la longitud de una cadena.

32) Pedir dos palabras por teclado, indicar si son iguales.

33) Dada una cadena, extraer la cuarta y quinta letra usando el método substring.

34) Dada una frase, separarla en palabras.

35) Crea un enum con los días de la semana, (en el main) pide un día de la semana e indica si es laboral o no.

36) Modifica el anterior enum para indicar que es día laborable directamente (usar toString).

37) Crea el enum Mes, que contenga como parámetros el orden (1,2,3,etc) y el número de días (febrero tendra 28 días siempre). Estos datos pueden pedirse por separado, así que tienes que hacer sus respectivos get. No son necesarios los setters. Crear un arrays de Mes, pedir un número por teclado e indica qué meses tienen ese número de días.

38) Pedir números al usuario y cuando el usuario meta un -1 el programa se terminará. Al terminar, mostrar lo siguiente:

– mayor número introducido
– menor número introducido
– suma de todos los números
– suma de los números positivos
– suma de los números negativos
– medía de la suma (la primera que pido)

El número -1 no contará como número.

39) Realiza un reloj digital que muestre la hora sin parar. Debe esperar un segundo real para darle mas realismo.
## Bucles Anidados
1) Crear una aplicación que dibuje una escalera de asteriscos. Pedir la altura de la escalera por teclado.

2) Crear una aplicación que dibuje una escalera inversa de asteriscos. Pedir la altura de la escalera inversa por teclado.

3) Crear una aplicación que dibuje una escalera de números, siendo cada línea un número. Pedir la altura por teclado.

4) Crear una aplicación que dibuje una escalera de números, siendo cada línea números empezando en uno y acabando en el número de la línea.

5) Crear una aplicación que dibuje una pirámide de asteriscos. Pedir la altura de la pirámide por teclado.

6) Crear una aplicación que dibuje una pirámide invertida de asteriscos. Pedir la altura de la pirámide por teclado.
## Matrices
1) Crear una matriz de 3×3 con los números del 1 al 9. Mostrar por pantalla la matriz.

2) Crear una matriz de 5 filas y n columnas (pedir al usuario). Rellenar la matriz con números aleatorios entre 0 y 10.

3) Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra matriz. El tamaño de las matrices es irrelevante. Rellenarlas de manera automática.

4) Crear una matriz de 4×4 de números enteros que inicialmente está vacía.

Hacer un menú con estas opciones:

- Rellenar la matriz de números (pedir al usuario). Hasta que esto no se haga, el resto de opciones no se podrán ejecutar, hay que mostrar un mensaje donde diga que debes rellenar la matriz
- Suma de una fila que se pedirá al usuario (controlar que elija una correcta)
- Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
- Sumar la diagonal principal
- Sumar la diagonal inversa
- La medía de todos los valores de la matriz
- Salir del programa

5) Dado un Array con 18 tipos de pokémon (2º generación) y una matriz de 2 dimensiones donde se guarda el multiplicador de daño de tipoAtaque a tipoDefensor.

Las filas de la matriz corresponden con el Pokémon atacante. Las columnas, al atacado.

Las opciones que daremos al usuario son:
- ATAQUE TIPO X --> 1 Pokémon TIPO X. Pedir ambos tipos y sacar el multiplicador de ataque.
- ATAQUE TIPO X --> 1 Pokémon TIPO X e Y. Pedir los 3 tipos y sacar el multiplicador de ataque.
- ATAQUE TIPO X --> listado todos los tipos. Pedir un tipo. Sacar multiplicador de ataque con resto de tipos.
- Salir

6) Generar una matriz de 3×3 con números aleatorios sin repetirse.

7) Generar una matriz de 3×3 con números aleatorios sin repetirse. Realizar la suma de una columna o fila aleatoria.

8) Dadas 2 matrices que contienen, uno, el nombre de snacks, y, otro, su precio.

Implementar un software para una máquina expendedora de golosinas. Estas golosinas están identificadas por su fila y columna.

Cada golosina tiene un nombre y un precio. Cada una tendrá una cantidad inicial de 5.

Hacer un menú con las siguientes opciones:

- Pedir golosina: pedir posición de golosina. Si no quedan golosinas, se indica al usuario. Solo se puede pedir una golosina de una vez. Suponemos que el usuario siempre tiene dinero. Recuerda disminuir la cantidad después de pedir.
- Mostrar golosinas: mostrar todas las golosinas disponibles. Mostrar el código que debe introducir el usuario, el nombre, el precio y la cantidad.
- Reponer golosina: es una función exclusiva de un técnico, por lo que hay que pedir una contraseña (“MaquinaExpendedora2021”). Si se introduce bien, pedir posición de la golosina y la cantidad a reponer.
- Apagar maquina: salir del programa. Antes de salir, mostrar las ventas totales durante la ejecución del programa.

El programa debe ser 10-modular (métodos y funciones) sin POO.

9) Vamos a realizar el juego del 3 en raya con 2 jugadores.

Los signos de los jugadores deben ser X y O.

El signo de una posición vacía debe ser -.

El tablero de juego será una matriz multidimensional 3×3 de tipo de dato char.

El juego termina cuando 1) un jugadores hace 3 en raya; o 2) no haya posiciones vacías.

El juego debe pedir las posiciones donde el jugador actual quiera poner su signo, que debe ser validada y no estar marcada anteriormente.

Realizar el juego de forma modular (métodos y funciones).

10) Crear 2 Array multidimensionales n×n y rellenarlos cómo se desee. Crear otro Array y no rellenarlo.

Hacer un método que sume los Array multidimensionales (posición 0,0 de Array 1 + posición 0,0 de Array 2 = posición 0,0 de Array 3). El método no debe devolver nada, y recibe los 3 Array multidimensionales como parámetros (los 2 que se suman y en el que se guarda la suma).

Mostrar el contenido de cada array multidimensional.

11) Suponer que se ha realizado una encuesta a 10 personas preguntando lo siguiente:
- sexo (1 = masculino, 2 = femenino)
- si trabaja (1 = sí trabaja, 2 = no trabaja)
- sueldo, que estará entre 600 y 2000 (valor entero). Si no tiene trabajo, el valor de sueldo será 0.

Generar los valores pueden ser generados aleatoriamente.

Calcular y mostrar lo siguiente:
- % de hombres
- % de mujeres
- % de hombres que trabajan
- % de mujeres que trabajan
- Sueldo promedio de hombres que trabajan
- Sueldo promedio de mujeres que trabajan
## Métodos y funciones
1) Crear una aplicación que calcule el área de un círculo ( (radio^2)*PI ), cuadrado (lado * lado) o triangulo ( (base * altura) / 2 ). Pedir de qué figura se calcula su área y, según la elegida, pedir los valores necesarios para calcular el área.

Crear un método por calcular el área de cada figura. Usar número reales. Mostrar el resultado por pantalla.

2) Crear una aplicación que genere una cantidad (solicitada por teclado) de números enteros aleatorios. Crear un método al que se le pase entre qué números (pedir por teclado) se generarán los aleatorios. Mostrar estos números por pantalla.

3) Crear una aplicación que pida un número por teclado, pasárselo a una función como parámetro y que ésta indique si es o no un número primo devolviendo un tipo de dato boolean.

4) Crear una aplicación que calcule el factorial de un número pedido por teclado. Hacer un método que recibe el número como parámetro. Para calcular el factorial, se multiplica el mismo número por todos los números anteriores hasta llegar a uno.

5) Crear una aplicación que nos convierta un número en base decimal a binario, mediante una función a la que se le pasa un número en base decimal como parámetro y devuelve un String con el número convertido a binario.

6) Crear un método que cuente el número de cifras de un número entero positivo (hay que controlarlo) pedido por teclado. El método debe recibir el entero positivo como parámetro y devolver el número de cifras.

7) Crear un método que convierta una cantidad de euros introducida por teclado a otra moneda (dólares, yenes o libras). El método tendrá como parámetros la cantidad de euros y la moneda (cadena), y no devolverá ningún valor, sino que debe mostrar un mensaje indicando el cambio (void).