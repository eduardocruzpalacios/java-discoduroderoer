# java-discoduroderoer
## Ejercicios Básicos
1) Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).

2) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indícalo también.

3) Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola. Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.

4) Modifica la aplicación anterior para que nos pida el nombre que queremos introducir (usa JOptionPane).

5) Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (para pasar de String a double usa Double.parseDouble). Usa la constante PI y el método pow de Math.

6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.

7) Lee un número por teclado y muestra por consola el carácter al que pertenece en la tabla ASCII. Por ejemplo: si introduzco 97, muestra a.

8) Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un carácter (char) y muestre su código en la tabla ASCII.

9) Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.

10) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.

11) Haz el mismo ejercicio anterior con un bucle for.

12) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.

13) Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final mostrará la suma de todas las ventas. Piensa que es lo que se repite y lo que no.

14) Realiza una aplicación que nos calcule una ecuación de segundo grado. Debes pedir las variables a, b y c por teclado y comprobar antes el discriminante (operación en la raíz cuadrada). Para la raíz cuadrada usa el método sqlrt de Math.

15) Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a pedir (do while), después muestra ese número por consola.

16) Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá más la contraseña y mostrará un mensaje diciendo “Enhorabuena”. Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).

17) Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no. Usa un switch para ello.

18) Pide por teclado dos números y genera 10 números aleatorios entre esos números. Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de double a int).

19) Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene. Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras. Tendremos que controlar si tiene una o mas cifras, al mostrar el mensaje.

20) Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel solo puede dividirse entre 1 y si mismo. Para saber si es primo, calcular la raíz cuadrada del numero e ir comprobando si es divisible desde ese numero hasta 1. Si se introduce un numero menor o igual que 1, directamente no es primo.

21) Muestra los números primos entre 1 y 100.

22) Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta cuantas vocales hay en total (recorre el String con charAt).

23) Reemplaza todas las a del String anterior por una e.

24) Recorre el String del ejercicio 22 y transforma cada carácter a su código ASCII. Muestralos en línea recta, separados por un espacio entre cada carácter.

25) Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y un signo aritmético (String), según este último se realizara la operación correspondiente. Al final mostrara el resultado en un cuadro de dialogo.

Los signos aritméticos disponibles son:

- + suma los dos operandos.
- - resta los operandos.
- * multiplica los operandos.
- / divide los operandos, este debe dar un resultado con decimales (double)
- ^ 1º operando como base y 2º como exponente.
- %  módulo, resto de la división entre operando1 y operando2.

26) Realizar la suma del 1 al numero que indiquemos, este debe ser mayor que 1.

27) Crear una aplicación que nos permite insertar números hasta que insertemos un -1. Calcular el numero de números introducidos.

28) Eliminar los espacios de una frase pasada por consola por el usuario.

29) Pedir al usuario que nos escriba frases de forma infinita hasta que insertemos una cadena vacia. Muestra la cadena resultante de concatenar todas las frases introducidas.

30) Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el usuario lo pida y mostraremos el resultado por pantalla.

31) Mostrar la longitud de una cadena.

32) Pedir dos palabras por teclado, indicar si son iguales.

33) Dada una cadena, extraer la cuarta y quinta letra usando el método substring.

34) Dada una frase, separarla en palabras.

35) Crea un enum con los días de la semana, (en el main) pide un día de la semana e indica si es laboral o no.

36) Modifica el anterior enum para indicar que es día laborable directamente (usar toString).

37) Crea el enum Mes, que contenga como parametros el orden (1,2,3,etc) y el numero de dias (febrero tendra 28 dias siempre). Estos datos pueden pedirse por separado, asi que tienes que hacer sus respectivos get. No son necesarios los setters. Create un arrays de Mes (mirate la funcion values), pide un numero por teclado e indica que meses tienen ese numero de dias (toda su informacion). Por ejemplo, si escribes un 28, este te devolvera la informacion de FEBRERO.

38) Pedir números al usuario y cuando el usuario meta un -1 se terminará el programa. Al terminar, mostrará lo siguiente:

– mayor numero introducido
– menor numero introducido
– suma de todos los numeros
– suma de los numeros positivos
– suma de los numeros negativos
– media de la suma (la primera que pido)

El número -1 no contara como número.

39) Realiza un reloj digital que muestre la hora sin parar. Debe esperar un segundo real para darle mas realismo.
## Bucles Anidados
1) Crear una aplicación que dibuje una escalera de asteriscos. Pedir la altura de la escalera por teclado.

2) Crear una aplicación que dibuje una escalera inversa de asteriscos. Pedir la altura de la escalera inversa por teclado.

3) Crear una aplicación que dibuje una escalera de números, siendo cada línea un numero. Pedir la altura por teclado.

4) Crear una aplicación que dibuje una escalera de números, siendo cada línea números empezando en uno y acabando en el número de la línea.

5) Crear una aplicación que dibuje una pirámide de asteriscos. Pedir la altura de la pirámide por teclado.

6) Crear una aplicación que dibuje una pirámide invertida de asteriscos. Pedir la altura de la pirámide por teclado.
## Matrices
1) Crear una matriz de 3×3 con los números del 1 al 9. Mostrar por pantalla la matriz.

2) Crear una matriz de 5 filas y n columnas (pedir al usuario). Rellenar la matriz con números aleatorios entre 0 y 10.

3) Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra matriz. Los valores y la longitud serán insertados por el usuario. Mostrar las matrices originales y el resultado.

4) Crear una matriz de 4×4 de números enteros que inicialmente está vacía.

Hacer un menú con estas opciones:

- Rellenar la matriz de números (pedir al usuario). Hasta que esto no se haga, el resto de opciones no se podrán ejecutar, hay que mostrar un mensaje donde diga que debes rellenar la matriz
- Suma de una fila que se pedirá al usuario (controlar que elija una correcta)
- Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
- Sumar la diagonal principal
- Sumar la diagonal inversa
- La media de todos los valores de la matriz

5) Queremos hacer un programa que muestre la tabla de tipos de Pokémon.

Coger el fichero llamado Constantes.java y copiar a caproyecto propio.

Los datos que contiene la tabla de tipos es la siguiente:

- 2 el atacante hace el doble de daño al oponente (Es muy eficaz)
- 1 el atacante hace un daño neutro al oponente (No se da información)
- 5 el atacante hace la mitad de daño al oponente (No es muy eficaz)
- 0 el atacante hace un daño nulo al oponente (No afecta)

Las filas de la matriz corresponden con el Pokemon atacante.

Las columnas, al atacado.

Las opciones que daremos al usuario son:

- Mostrar debilidades: pedimos uno o dos tipos (pedir al usuario).

Si el usuario pide 1 tipo, mostrar todos los tipos que hacen un daño eficaz a ese tipo.

Si elige dos tipos de pokemon, habrá que ver esos dos tipos y multiplicar las debilidades y mostrar el multiplicador de daño.

Por ejemplo, FUEGO y TIERRA:
- AGUA : x4 (2 * 2 = 4, doblemente eficaz)
- TIERRA : x2 (2 * 1 = 2, la tierra es neutro con la tierra)
- Fíjate que no aparece el tipo ROCA, ya que TIERRA tiene resistencia y hace que un ataque sea neutro (0.5 * 2 = 1)

- Mostrar todos los tipos eficaces: pedir tipo y mostrar todos los tipos debiles contra el tipo pedido al usuario.

- Mostrar toda la información relativa a un tipo: pedir un tipo y mostrar los demás tipos y su relación con el anterior (neutro, etc.).

Comparar 2 tipos: pedir pokemon (atacante y atacado) y su/s tipo/s. Se informa de si es eficaz, neutro, etc.

6) Generar una matriz de 3×3 con números aleatorios sin repetirse.

7) Generar una matriz de 3×3 con números aleatorios sin repetirse. Realizar la suma de una columna o fila aleatoria.

8) Nos piden que implementemos el software para una máquina expendedora de golosinas. Cada golosina tiene un nombre y un precio para ahorrar tiempo. Los datos son los siguientes:

            String[][] nombresGolosinas = {
 
            {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
 
            {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
 
            {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
 
            {"Lacasitos", "Crunch", "Milkybar", "KitKat"}
 
             };
 
            double[][] precio = {
 
            {1.1, 0.8, 1.5, 0.9},
 
            {1.8, 1, 1.2, 1},
 
            {1.8, 1.3, 1.2, 0.8},
 
            {1.5, 1.1, 1.1, 1.1}
 
            };
 
También tendrán una cantidad inicial, que en principio será de 5.

Tendremos un pequeño menú con las siguientes opciones:

- Pedir golosina: pedirá la posición de la golosina que quiera. Esta máquina tiene golosinas en cada posición, identificados por su fila y columna, que será lo que introduzca el usuario al pedir una golosina, por ejemplo si el usuario teclea 20 significa que está pidiendo la golosina que está en la fila 2 columna 0. Cuando no haya más golosinas se le indicará al usuario. Solo puede pedir una golosina y supondremos que el usuario siempre tiene dinero al elegir. Recuerda de disminuir la cantidad la pedir.
- Mostrar golosinas: mostrara todas las golosinas disponibles. Mostrará el código que debe introducir el usuario, el nombre y el precio. La cantidad no se mostrará.
- Rellenar golosinas: esta es una función exclusiva de un técnico por lo que nos pedirá una contraseña, si el usuario escribe “MaquinaExpendedora2021” le pedirá la posición de la golosina y la cantidad.
- Apagar maquina: sale del programa, antes de salir mostrará las ventas totales durante la ejecución del programa.

El programa debe ser modular (métodos y funciones).

Las funciones deben ser lo más genéricas posibles.

No se deben utilizar POO para este ejercicio.

9) Vamos a realizar el juego del 3 en raya, donde habrá dos jugadores que tengan que hacer el 3 en raya, los signos serán el X y el O, cuando haya una posición vacía habrá un –

El tablero de juego será una matriz de 3×3 de char.

El juego termina cuando uno de los jugadores hace 3 en raya o si no hay más posiciones que poner.

El juego debe pedir las posiciones donde el jugador actual quiera poner su marca, esta debe ser validada y no estar marcada anteriormente.

Realizar el juego de forma modular (métodos y funciones).

10) Crear dos arrays multidimensionales de 2×3 y rellenarlos como se desee (números aleatorios, por teclado o definido al crear el array).

Hacer un método que sume los arrays multidimensionales, es decir, la posición 0,0 del array1 con la posición 0,0 del array2, y así sucesivamente. Este método no debe devolver nada, haciendo que deba pasarse 3 array multidimensional como parámetro (los 2 que se suman y en el que se guarda la suma).

Mostrar el contenido de cada array multidimensional.

11) Queremos realizar una encuesta a 10 personas, en esta encuesta indicaremos el sexo (1=masculino,2=femenino), si trabaja (1 = sí trabaja, 2 = no trabaja) y su sueldo (si no tiene un trabajo, el valor será un cero) estará entre 600 y 2000 (valor entero). Los valores pueden ser generados aleatoriamente.

Calcula y muestra lo siguiente:
- Porcentaje de hombres (tengan o no trabajo).
- Porcentaje de mujeres (tengan o no trabajo).
- Porcentaje de hombres que trabajan.
- Porcentaje de mujeres que trabajan.
- El sueldo promedio de las hombres que trabajan.
- El sueldo promedio de las mujeres que trabajan.