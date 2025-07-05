# Estructuras No Lineales – Ejercicios Árboles

Este proyecto contiene la solución a cuatro ejercicios prácticos sobre estructuras de datos tipo árbol binario, como parte del aprendizaje de estructuras no lineales en Java. Cada ejercicio se encuentra organizado en su propia carpeta, siguiendo la convención de paquetes y buenas prácticas.

---

## Identificación del Estudiante (Obligatorio)

Antes de comenzar a programar o ejecutar el proyecto, **debes completar tu nombre y correo institucional en el archivo `student.env`** que se encuentra en la raíz del proyecto. Este archivo es necesario para validar tu identidad como autor del trabajo.

### ¿Por qué es obligatorio?

Este proyecto utiliza una verificación automática que valida que has ingresado tu información personal. Si no lo haces:

- Al ejecutar el proyecto (`App.java`) verás este mensaje de error:
```
❌ Debes completar STUDENT_NAME y STUDENT_EMAIL en student.env
```
- No podrás enviar tu código (`push`) al repositorio si tienes activado el sistema de validación local.
- Las pruebas automáticas en GitHub Actions también fallarán si no detectan tu nombre y correo.

### ¿Qué debo hacer?

1. Abre el archivo `student.env` que ya está creado en el proyecto.
2. Rellena tus datos:

```
STUDENT_NAME=Tu Nombre Completo
STUDENT_EMAIL=tu.correo@institucion.edu.ec
```


3. **No borres estas líneas ni cambies los nombres de las variables.**
4. Guarda los cambios y vuelve a ejecutar el programa o hacer push.

> 💡 Este mecanismo asegura la autoría del código y que cada estudiante reciba su evaluación automática de forma personalizada.

---




## Explicación para el estudiante

```
src/
│
├── Materia/
│
├── Ejercicio_01_insert/
├── Ejercicio_02_invert/
├── Ejercicio_03_listLeves/
└── Ejercicio_04_depth/
```

---

## Descripción de Ejercicios

### Ejercicio 01: Insertar en un Árbol Binario de Búsqueda (BST)

Carpeta: `Ejercicio_01_insert`
Implementa un algoritmo para insertar nodos en un Árbol Binario de Búsqueda.

 **Input de ejemplo:** `[5, 3, 7, 2, 4, 6, 8]`
 **Output esperado:**

```
    5
  3   7
 2 4 6 8
```

---

### Ejercicio 02: Invertir un Árbol Binario

📂 Carpeta: `Ejercicio_02_invert`
Dada la raíz de un árbol binario, el algoritmo devuelve su versión invertida (espejo).

 **Input de ejemplo:**

```
    4
  2   7
1  3 6  9
```

**Output esperado:**

```
    4
  7   2
9  6 3  1
```

---

### Ejercicio 03: Listar Niveles en Listas Enlazadas

📂 Carpeta: `Ejercicio_03_listLeves`
Devuelve una lista enlazada con los nodos por nivel. Si hay N niveles, se obtienen N listas.

 **Input de ejemplo:**

```
    4
  2   7
1  3 6  9
```

**Output esperado:**

```
4  
2 → 7  
1 → 3 → 6 → 9
```

---

### Ejercicio 04: Calcular la Profundidad Máxima

Carpeta: `Ejercicio_04_depth`
Calcula la profundidad máxima de un árbol binario (la longitud del camino más largo desde la raíz hasta una hoja).

**Input de ejemplo:**

```
    4
  2   7
1  3  
8
```

**Output esperado:** `4`

---

## Indicaciones Generales

* Lee cuidadosamente el enunciado de cada ejercicio.
* Cada carpeta debe contener:

  * Código fuente Java.
  * Casos de prueba.
  * Comentarios claros.
* Realiza commit y push con el mensaje:

  ```
  Estructuras No Lineales – Ejercicios Árboles
  ```
* En el AVAC, sube la **URL del repositorio** con el código.

---

## No se calificará si:

* No hay commit con los ejercicios.
* No se incluye este README explicativo.
* Las clases o métodos no siguen los nombres requeridos.

---

## Rúbrica de Calificación

| **Criterio**       | **Descripción**                                                                       | **Puntaje** |
| ------------------ | ------------------------------------------------------------------------------------- | ----------- |
| **Informe**        | No hay informe                                                                        | 0 pts       |
|                    | Informe parcial **sin explicación** de cada método                                    | 1 pt        |
|                    | Informe parcial **con explicación** de cada método                                    | 2 pts       |
|                    | Informe completo                                                                      | 3 pts       |
| **Funcionamiento** | No implementado                                                                       | 0 pts       |
|                    | Implementado parcialmente: <br>• Ejercicio 1 y 4 → 2 pts<br>• Ejercicio 2 y 3 → 4 pts | 2–4 pts     |
|                    | Código funcional pero **no pasa todas las pruebas**                                   | 6 pts       |
|                    | Código funcional y **pasa todas las pruebas correctamente**                           | 7 pts       |



## Contribuir

Para contribuir a este proyecto, por favor crea un fork y envía una solicitud de extracción, o simplemente abre un issue con tus comentarios y sugerencias.

## Autores

- [PABLO TORRES] - Desarrollo inicial
#



# 👨‍💻 Informe de Practica

### 🌳 Ejercicio 01: Insertar en un Árbol Binario de Búsqueda (BST)
Métodos usados: 

- insert(Node root, int value): Node

- insertEnv(): Void

- printTree(): Void

- printTreeNode2(Node root, String prefix, boolean isLeft): Void

- Clase: InsertBST

🧠 ¿Qué hace?

Este método inserta un nuevo valor en un Árbol Binario de Búsqueda (BST):

Respetando las reglas de este:

- Los valores menores van al subárbol izquierdo.
- Los valores mayores van al subárbol derecho.

⚙️ ¿Cómo funciona?
- Primero se comprueba que el nodo no sea nulo, si lo es se crea un nodo nuevo.

- Despues si el valor que llega es mayor al nodo se ingresa a la derecha caso contrario ira a la izquierda.

📌 Ejemplo:
Insertando los valores [5, 3, 7, 2, 4, 6, 8] se obtiene el siguiente árbol:
```
├── 5
│   ├── 3
│   │   ├── 2
│   │   └── 4
│   └── 7
│       ├── 6
│       └── 8
```



###  🔄 Ejercicio 02: Invertir un Árbol Binario

Métodos: 

- invertTree(Node root): Node

- invertTreeEnv(): Void

- insert(Node root, int value): Node

- insertEnv(): Void

- printTree(): Void

- printTreeNode2(Node root, String prefix, boolean isLeft): Void

- Clase: InvertBinaryTree

🧠 ¿Qué hace?

- Invierte el arbol ya creado de manera que los hijos izquerdos pasaran a ser los derechos y viceversa.

⚙️ ¿Cómo funciona?
- Mediante la recursividad se guardanlos hijos izquierdos en una variable temporal se setea a la izquierda la llamada recursiva del nodo derecho, de igual manera se setea a la derecha la variable temporal.

- Luego, si en la llamada recursiva actual ya no hay mas hijos se realiza el cambio, se vuelve a la llamada anterior y se setea el cambio de estos nodos con sus hijos ya invertidos y asi con todos los nodos que tengan hijos.

- Por ultimo se retornan los nodos con sus hijos invertidos

📌 Ejemplo:

```
ARBOL ORIGINAL:

├── 4
│   ├── 2
│   │   ├── 1
│   │   └── 3
│   └── 7
│       ├── null
│   └── 7
│       ├── 6
│       └── 9

ARBOL ESPEJO:

├── 4
│   ├── 7
│   │   ├── 9
│   │   └── 6
│   └── 2
│       ├── 3
│       └── 1

```



###  📋 Ejercicio 03: Listar Niveles en Listas Enlazadas

Métodos:

- listLevels(Node root): List<List<Node>>

- listLevelsEnv() : Void

- insert(Node root, int value): Node

- insertEnv(): Void

- printTree(): Void

- printTreeNode2(Node root, String prefix, boolean isLeft): Void

- Clase: ListLevels

🧠 ¿Qué hace?

- Recorre cada nivel del arbol y lo guarda en  una lista de listas, donde cada sublista contiene los nodos de un nivel del árbol binario, para poder obtener los valores de cada nivel

⚙️ ¿Cómo funciona?

- Se emplea una cola en la que se guarda en root para despues de guerdar el root en una lista proceder a guardar su hijos izquierdo y derecho en la cola y repetir el proceso guardando estos en sublistas.

- En cada iteracion se recorre cada nivel del arbol y se van guardando los nodos en sublistas


- Por ultimo agregamos cada sublista a la lista principal y retornamos la misma

📌 Ejemplo de salida:
```
ARBOL ORIGINAL:

├── 4
│   ├── 2
│   │   ├── 1
│   │   └── 3
│   └── 7
│       ├── 6
│       └── 9

ARBOL POR NIVELES:

4 -> null
2 -> 7 -> null
1 -> 3 -> 6 -> 9 -> null

```


###  📏 Ejercicio 04: Calcular la Profundidad Máxima

Métodos:

- maxDepth(Node root): int

- maxDepth() : int

- insert(Node root, int value): Node

- insertEnv(): Void

- printTree(): Void

- printTreeNode2(Node root, String prefix, boolean isLeft): Void

- Clase: Depth

🧠 ¿Qué hace?

Calcula la profundidad máxima (altura) de un árbol binario, basicamente calcula el camino para llegar a la hoja mas lejana del arbol.

⚙️ ¿Cómo funciona?

- Si el nodo es null, retorna 0.

- Calcula recursivamente la profundidad de cada sub-arbol guardando en variables enteras cada vez que se llama a un nuevo nodo hasta que no hayan mas. 

- Retorna el valor maximo entre el numero de nodos recorridos de cada subarbol mas 1 ya que la raiz no se toma en cuenta en el metodo que calcula el maximo,

📌 Ejemplo:
```
ARBOL ORIGINAL: 

├── 4
│   ├── 2
│   │   ├── 1
│   │   └── 3
│   └── 7
│       ├── null
│       └── 8

LA PROFUNDIDAD MAXIMA DEL ARBOL ES: 3

```

### ✅ Conclusión

Con esta practica pudimos aplicar la logica de los arboles y descubrir algunos metodos que quizas usemos alguna vez, ademas logramos profundizar en el entendimiento de estas estructuras y desarrollar mayor logica de programacion.




