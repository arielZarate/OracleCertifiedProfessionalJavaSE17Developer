# OCP Oracle Certified Professional Java SE 17 Developer Study Guide
Esta es una guia para la certificacion de Oracle en java SE 17
donde ire de forma cronologica iteractiva e incremental subiendo temas y ejercicios


## Hoja de Ruta o Roadmap 

Estoy usando lapagina web de [roadmap.sh](https://roadmap.sh/)
Donde yo seguire la hoja de ruta orientada de [java](https://roadmap.sh/java)

<img src="./images/java.png"   width="600"/>


## Consejos adicionales
#### Práctica Constante: 
Es fundamental escribir código diariamente para afianzar los conceptos aprendidos y desarrollar una lógica de programación sólida. 
#### participacion en comunidades como :
- Únete a foros y comunidades en línea, como [CodeRanch](https://coderanch.com/) o 
- subreddits relacionados con Java.

#### Simulacros de Examen: 
Realiza exámenes de práctica para evaluar tu progreso y acostumbrarte al formato y la presión del examen real.  Esto te ayudará a gestionar mejor el tiempo y a identificar áreas que requieren más estudio.
#### Recursos
- la pagina [Recursos para desarrolladores](https://www.java.com/es/)
- la pagina [www.w3school.com/java](https://www.w3schools.com/java/)
- la pagina [https://coderanch.com/](https://coderanch.com/)
- la pagina [https://www.codewars.com/trainer/setup](https://www.codewars.com/trainer/setup)

## Información sobre el Examen
El examen 1Z0-829 para la certificación Java SE 17 Developer consta de 50 preguntas de opción múltiple, con una duración de 90 minutos. Para aprobar, se requiere una puntuación mínima del 68%. Puedes encontrar más detalles y registrarte para el examen en el sitio oficial de Oracle.

## Revisar temas de exámenes 
`https://mylearn.oracle.com/ou/exam/java-se-17-developer-1z0-829/40805/110649/170355`


#### Manejo de valores de fecha, hora, texto, numéricos y booleanos
- Utilice primitivas y clases contenedoras, incluidas API de matemáticas, paréntesis, promoción de tipos y conversión para evaluar expresiones aritméticas y booleanas.
- Manipular texto, incluidos bloques de texto, utilizando las clases String y StringBuilder
- Manipule objetos de fecha, hora, duración, período, instante y zona horaria mediante la API de fecha y hora

#### Control del flujo del programa
- Crear construcciones de control de flujo de programa que incluyan if/else, declaraciones y expresiones switch, bucles y declaraciones break y continue

#### Utilizando el enfoque orientado a objetos de Java
- Declarar e instanciar objetos Java, incluidos objetos de clase anidados, y explicar el ciclo de vida de los objetos, incluida la creación, la reasignación de referencias y la recolección de basura.
- Crear clases y registros, y definir y utilizar campos y métodos de instancia y estáticos, constructores e inicializadores de instancia y estáticos.
- Implementar sobrecarga, incluidos los métodos var-arg
- Comprender los alcances de las variables, utilizar la inferencia de tipos de variables locales, aplicar la encapsulación y hacer que los objetos sean inmutables
- Implementar la herencia, incluidas las clases abstractas y selladas. Anular métodos, incluidos los de la clase Object. Implementar el polimorfismo y diferenciar el tipo de objeto del tipo de referencia. Realizar conversiones de tipos, identificar tipos de objetos mediante el operador instanceof y la coincidencia de patrones.
- Crear y utilizar interfaces, identificar interfaces funcionales y utilizar métodos de interfaz privados, estáticos y predeterminados.
- Crear y utilizar enumeraciones con campos, métodos y constructores 

#### Manejo de excepciones
- Manejar excepciones usando try/catch/finally, try-with-resources y bloques multi-catch, incluidas excepciones personalizadas

#### Trabajar con matrices y colecciones
- Cree matrices Java, colecciones de listas, conjuntos, mapas y deque, y agregue, elimine, actualice, recupere y ordene sus elementos
#### Trabajar con secuencias y expresiones Lambda

- Utilice objetos Java y secuencias primitivas, incluidas expresiones lambda que implementan interfaces funcionales, para suministrar, filtrar, mapear, consumir y ordenar datos.
- Realizar descomposición, concatenación y reducción, y agrupación y partición en secuencias secuenciales y paralelas.

#### Empaquetado e implementación de código Java y uso del sistema de módulos de la plataforma Java
- Definir módulos y sus dependencias, exponer el contenido de los módulos, incluso para la reflexión. Definir servicios, productores y consumidores.
- Compilar código Java, producir archivos jar modulares y no modulares, imágenes en tiempo de ejecución e implementar la migración utilizando módulos automáticos y sin nombre

#### Gestión de la ejecución simultánea de código
- Cree subprocesos de trabajo utilizando Runnable y Callable, administre el ciclo de vida del subproceso, incluidas las automatizaciones proporcionadas por diferentes servicios de Executor y API simultáneas
- Desarrollar código seguro para subprocesos, utilizando diferentes mecanismos de bloqueo y API concurrentes
- Procesar colecciones de Java simultáneamente, incluido el uso de flujos paralelos

#### Uso de la API de E/S de Java
- Leer y escribir datos de consola y archivos mediante flujos de E/S
- Serializar y deserializar objetos Java
- Crear, recorrer, leer y escribir objetos Path y sus propiedades utilizando la API java.nio.file

#### Acceder a bases de datos mediante JDBC
- Cree conexiones, cree y ejecute declaraciones básicas, preparadas e invocables, procese resultados de consultas y controle transacciones mediante la API de JDBC

#### Implementación de la localización
- Implementar la localización utilizando configuraciones regionales, paquetes de recursos, analizar y formatear mensajes, fechas, horas y números, incluidos valores monetarios y porcentuales.

#### Supongamos lo siguiente:

- Declaraciones de importación y paquetes faltantes: si el código de muestra no incluye declaraciones de importación o paquetes, y la pregunta no hace referencia explícita a estas declaraciones faltantes, entonces suponga que todo el código de muestra está en el mismo paquete o que existen declaraciones de importación para respaldarlos.
- No hay nombres de rutas de archivos o directorios para las clases: si una pregunta no indica los nombres de archivos o las ubicaciones de directorios de las clases, suponga una de las siguientes opciones, la que permita que el código se compile y se ejecute:
  1. Todas las clases están en un archivo
  2. Cada clase está contenida en un archivo separado y todos los archivos están en un directorio.
- Saltos de línea no deseados: el código de ejemplo puede tener saltos de línea no deseados. Si ve una línea de código que parece haber sido modificada y esto crea una situación en la que el cambio de línea es significativo (por ejemplo, un literal de cadena entre comillas se ha modificado), suponga que el cambio de línea es una extensión de la misma línea y que la línea no contiene un retorno de carro que causaría un error de compilación.
- Fragmentos de código: un fragmento de código es una pequeña sección de código fuente que se presenta sin su contexto. Suponga que existe todo el código de soporte necesario y que el entorno de soporte admite por completo la compilación y ejecución correctas del código mostrado y su entorno omitido.
- Comentarios descriptivos: tome los comentarios descriptivos, como "los setters y los getters van aquí", al pie de la letra. Suponga que existe el código correcto, que se compila y se ejecuta correctamente para crear el efecto descrito.

#### También se espera que los candidatos:
- Comprenda los conceptos básicos de la API de registro de Java.
- Utilice anotaciones como Anular, Interfaz funcional, Obsoleto, Suprimir advertencias y SafeVarargs.
- Utilice genéricos, incluidos comodines.




### Seguime en mis perfiles 💥
- GitHub : [https://github.com/arielZarate](https://github.com/arielZarate)
- linkedin : [https://www.linkedin.com/in/ariel-zarate/](https://www.linkedin.com/in/ariel-zarate/)
