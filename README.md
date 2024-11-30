# Conversor de Monedas

Este proyecto es un conversor de monedas desarrollado en Java, que utiliza la API de ExchangeRate-API para obtener tasas de cambio en tiempo real. El programa permite convertir USD (Dólar estadounidense) a varias otras monedas y proporciona una interfaz de usuario en la consola para la interacción.

![moneda](https://github.com/user-attachments/assets/cff28737-6f20-4773-bdb3-ee1a50b77b17)

## Características

- Realiza solicitudes HTTP a la API de ExchangeRate-API para obtener tasas de cambio.
- Convierte USD a varias monedas: Peso argentino (ARS), Boliviano (BOB), Real brasileño (BRL), Peso chileno (CLP) y Peso colombiano (COP).
- Interfaz de usuario en la consola que permite seleccionar la moneda de destino y la cantidad a convertir.
- Manejo de excepciones para capturar errores en las solicitudes HTTP.

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación principal utilizado para desarrollar el proyecto.
- **HttpClient**: Para realizar solicitudes HTTP.
- **Gson**: Biblioteca para convertir JSON a objetos Java.
- **IntelliJ IDEA**: Entorno de desarrollo integrado (IDE).

## Requisitos Previos

- [JDK (Java Development Kit)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) 11 o superior.
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) (o cualquier otro IDE de tu preferencia).
- Conexión a Internet para realizar las solicitudes a la API.

## Instalación y Ejecución

1. **Clona el repositorio**:
    ```
    
    https://github.com/PatrickAcha/Conversor-de-Monedas.git
    
    ```
2. **Abre el proyecto en tu IDE**:
    - Abre IntelliJ IDEA.
    - Selecciona "Open" y elige la carpeta del proyecto clonada.

3. **Añadir Dependencia de Gson**:
    - Haz clic derecho en el proyecto en IntelliJ y selecciona "Open Module Settings".
    - Ve a la sección "Libraries" y añade una nueva biblioteca desde Maven buscando `com.google.code.gson:gson`.

4. **Ejecuta la clase principal**:
    - Navega hasta `src` y abre `Principal.java`.
    - Haz clic derecho y selecciona "Run Principal.main()".

## Uso

1. **Selección de Moneda**:
    - El programa mostrará un menú con las opciones de monedas disponibles para la conversión desde USD.

2. **Ingresar Cantidad**:
    - Introduce la cantidad en USD (Dólar estadounidense) que deseas convertir.

3. **Resultado**:
    - El programa mostrará la cantidad convertida en la moneda seleccionada.

4. **Continuar o Salir**:
    - Después de cada conversión, el programa preguntará si deseas realizar otra conversión o salir.

## Estructura del Proyecto

- **`ClienteTasaCambio.java`**: Maneja las solicitudes HTTP y la obtención de tasas de cambio.
- **`ConvertidorMoneda.java`**: Contiene la lógica para convertir entre monedas.
- **`Principal.java`**: Clase principal que maneja la interacción con el usuario.
---

¡Gracias por utilizar el Conversor de Monedas! 
