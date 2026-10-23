# Universidad Nacional de Colombia

**Programación Orientada a Objetos 2026-2S**

## Actividad 3: Interfaz Gráfica de Usuario - Valor 10%

*   **Nombre del estudiante:** Alejandro Ramos Rincón
*   **Docente:** Walter Hugo Arboleda Mazo

---

### Descripción del Repositorio

Este repositorio contiene la solución a la **Actividad 3** del curso de Programación Orientada a Objetos. Los ejercicios fueron desarrollados en el lenguaje de programación **Java** con la librería **swing**, aplicando conceptos de componentes gráficos, gestión de eventos, herencia y manejo de errores en la entrada de datos.

El proyecto incluye el código fuente de los siguientes ejercicios basados en el libro *Ejercicios de programación orientada a objetos con Java y UML* de Leonardo Bermón Angarita, junto con sus ejercicios propuestos:

*   **Ejercicio 8.2:** Componentes swing (ventana de notas: promedio, desviación estándar, nota mayor y nota menor). Propuesto: mensajes de alerta cuando se ingresa un dato no numérico y cuando falta alguna de las cinco notas.
*   **Ejercicio 8.3:** Gestión de eventos (volumen y superficie del cilindro, la esfera y la pirámide con una jerarquía de clases). Propuesto: cubo, prisma e imagen de cada figura geométrica (hecha en draw.io). Además se agregan el cono, la semiesfera y el tetraedro regular.

### Estructura
El código fuente se encuentra en la carpeta `Codigo fuente`. Cada ejercicio está organizado en su respectivo paquete y cuenta con una clase `Main` que contiene el método `main`. Las clases del modelo tienen métodos get y set para cada atributo; las ventanas extienden `JFrame` e implementan `ActionListener`:

| Paquete | Clases |
|---|---|
| `Ejercicio8_2` | `Notas`, `VentanaPrincipal`, `Main` |
| `Ejercicio8_3` | `FiguraGeometrica`, `Cilindro`, `Esfera`, `Piramide`, `Cubo`, `Prisma`, `Cono`, `Semiesfera`, `Tetraedro`, `VentanaCilindro`, `VentanaEsfera`, `VentanaPiramide`, `VentanaCubo`, `VentanaPrisma`, `VentanaCono`, `VentanaSemiesfera`, `VentanaTetraedro`, `VentanaPrincipal`, `Main` (imágenes de las figuras en `Ejercicio8_3/Imagenes`) |

### Documentos y recursos
| Archivo / carpeta | Contenido |
|---|---|
| `Actividad3_POO.pdf` | Documento de entrega: código fuente, diagramas de clases, de objetos y de casos de uso, e imágenes de la interfaz de usuario de cada ejercicio |
| `Codigo fuente/` | Código fuente de los ejercicios 8.2 y 8.3 (paquetes `Ejercicio8_2` y `Ejercicio8_3`) |
| `Diagramas/` | Diagramas de clases, de objetos y de casos de uso en draw.io (`.xml`) y exportados a PNG (`.drawio.png`); en `Diagramas/Figuras/` están los archivos draw.io de las imágenes de las figuras |
| `Interfaz/` | Imágenes de la interfaz de usuario de cada ejercicio |

En el documento se omiten los métodos get y set, tanto en el código como en los diagramas de clases; el código fuente completo está en la carpeta `Codigo fuente`.
