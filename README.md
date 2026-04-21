[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/DYi5qqbj)
# Práctica Calificada 1 - Taller de Programación (Tipo B)

**Duración Parte Teórica (En Hoja):** 30 minutos
**Duración Parte Práctica (GitHub):** 1 hora

**Indicaciones:**

- El **Ejercicio 1** debe resolverse a mano en la hoja de examen proporcionada.
- Resuelva los **Ejercicios 3 y 4** en proyectos de consola utilizando Java.
- Utilice la clase `Scanner` para la entrada de datos y toda la lógica dentro del método `main`.
- Al finalizar, suba su código fuente a su repositorio de GitHub (según se detalla en el **Ejercicio 2**).

---

## Parte Teórica (En Hoja) - Tiempo Adicional

## Ejercicio 1: Cálculo del Siguiente Segundo (6 puntos)

Escribir un programa en Java que lea las horas, minutos y segundos individualmente, y calcule qué hora sería en el siguiente segundo.

**Requerimientos:**

1. Solicitar mediante teclado la entrada de horas, minutos y segundos.
2. Validar que los valores ingresados sean correctos: horas (0-23), minutos (0-59) y segundos (0-59). En caso de ingresar datos inválidos, mostrar un error.
3. Calcular la hora en el siguiente segundo (por ejemplo, si los segundos superan 59, se incrementa el minuto; si el minuto supera 59, se incrementa la hora).
4. Imprimir la hora resultante usando el formato de dos dígitos separados por dos puntos (Ejemplo: `08:00:00`), utilizando `printf`.

**Ejemplos:**

- Entrada: 07 35 29 -> Salida: 07:35:30
- Entrada: 07 35 59 -> Salida: 07:36:00
- Entrada: 07 59 59 -> Salida: 08:00:00
- Entrada: 23 59 59 -> Salida: 00:00:00

---

## Ejercicio 2: Control de Versiones con Git y GitHub (2 puntos)

Deberá subir el código fuente de los **Ejercicios 3 y 4** al repositorio de GitHub que se le proporcionará.

**Requerimientos de entrega:**

1. Realizar **un commit por cada pregunta práctica** (es decir, un commit para el Ejercicio 3 y otro para el Ejercicio 4).
2. En el mensaje del commit deberá aparecer su **nombre completo** y qué fue lo que realizó.
3. **Usuario de GitHub:** Su usuario de GitHub debe tener **estrictamente** el formato solicitado en clase. En caso de no tener este formato, **no se le considerará puntaje alguno** en esta rúbrica.
4. **Evidencia:** Deberá subir a la plataforma una **captura de pantalla** donde se vea claramente el historial con los dos commits realizados en su repositorio.

---

## Parte Práctica (En Computadora)

## Ejercicio 3: Cálculo de Sueldo Semanal (6 puntos)

Una empresa desea calcular el sueldo neto semanal de sus trabajadores en base a sus horas laboradas y su tarifa por hora. El programa debe solicitar por consola la **tarifa por hora** y la **cantidad de horas trabajadas**.

La empresa aplica un recargo por horas extras bajo la siguiente condición:

- Las primeras **40 horas** se pagan a la tarifa normal.
- Toda hora trabajada por encima de las 40 horas se considera "hora extra" y se paga con un **50% de recargo** (es decir, 1.5 veces la tarifa normal).

**Condición Especial:** Si el sueldo total calculado supera los **S/ 1500**, el trabajador recibe un bono adicional por concepto de movilidad de **S/ 100**. **Debe utilizar obligatoriamente el operador ternario para calcular y aplicar este bono adicional.**

**Requerimientos:**

1. Utilizar estructuras `if` y `else` para determinar el pago de horas normales y horas extras.
2. Calcular el sueldo base y el total a pagar.
3. Imprimir un recibo detallado utilizando `System.out.printf` para asegurar que todos los montos monetarios se muestren con **2 decimales**.
4. **Importante:** La entrega de este ejercicio requiere subir **capturas de pantalla del código completo** (pueden ser varias si el código es largo, lo vital es que se visualice todo para su corrección) y de la **ejecución**. En caso de no subir estas capturas, **se le anulará la pregunta**.

**Ejemplo de salida esperada:**

```text
Ingrese la tarifa por hora: 30.50
Ingrese las horas trabajadas: 45

--- BOLETA DE PAGO ---
Sueldo por horas normales (40h): S/ 1220.00
Sueldo por horas extras (5h): S/ 228.75
Bono de movilidad aplicado: S/ 0.00
Total neto a pagar: S/ 1448.75
----------------------
```

---

## Ejercicio 4: Calculadora de Áreas Geométricas (6 puntos)

Construya un programa que funcione como una calculadora de áreas. El programa debe mostrarle al usuario un menú de figuras geométricas para que elija una, y luego pedirle los datos necesarios para realizar el cálculo matemático correspondiente.

**Menú de Opciones:**

1. Área de un Círculo (Fórmula: 3.1416 * radio * radio)
2. Área de un Cuadrado (Fórmula: lado * lado)
3. Área de un Triángulo (Fórmula: (base * altura) / 2)
4. Área de un Rectángulo (Fórmula: base * altura)

**Requerimientos:**

1. Mostrar el menú y solicitar la opción deseada (número del 1 al 4) utilizando `Scanner`.
2. Utilizar la estructura **`switch`** (ya sea el tradicional o el mejorado con patrones) para procesar la opción elegida. Dentro de cada "case", solicitar los valores correspondientes (radio, lado, base, altura) y hacer el cálculo.
3. Si el usuario ingresa una opción fuera del rango (ej. 5), el programa debe imprimir un mensaje de error como "Figura inválida".
4. Imprimir el resultado del área usando `System.out.printf`, mostrando el resultado con **2 decimales**.
5. **Importante:** La entrega de este ejercicio requiere subir **capturas de pantalla del código completo** (pueden ser varias si el código es largo, lo vital es que se visualice todo para su corrección) y de la **ejecución**. En caso de no subir estas capturas, **se le anulará la pregunta**.

**Ejemplo de salida esperada:**

```text
--- Calculadora de Áreas ---
1. Círculo
2. Cuadrado
3. Triángulo
4. Rectángulo
Seleccione una figura: 3

Ingrese la base del triángulo: 5.5
Ingrese la altura del triángulo: 4.0

El área del Triángulo es: 11.00
```
