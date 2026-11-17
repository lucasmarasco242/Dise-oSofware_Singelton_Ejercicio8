Ejercicio 8 - Refactorización hacia Inyección de Dependencias

Explicación del programa

En este ejercicio se refactorizó el diseño de la aplicación para desacoplar las llamadas rígidas, implementando el patrón Singleton en combinación con Inyección de Dependencias sin utilizar librerías externas ni imports.
El sistema cuenta con:
- Una clase PasarelaPago que mantiene la restricción de instancia única mediante un constructor privado y el método estático getInstancia().
- Una clase consumidora ServicioCompra que recibe la pasarela de pago a través de su constructor en lugar de invocar llamadas estáticas internas.

Luego, dentro del método main, se obtienen las referencias al Singleton, se comprueba su unicidad y se instancia el servicio inyectándole la pasarela.

Lógica utilizada

La lógica del programa consiste en:
- Conservar el control interno de instancia única en la clase PasarelaPago.
- Aplicar inversión de dependencias pasando la instancia por el constructor de la clase consumidora (ServicioCompra).
- Evitar que la clase cliente dependa de llamadas globales acopladas, facilitando la modularidad y el mantenimiento del código.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
¿Es la misma instancia de pasarela?: true
Iniciando proceso de compra...
Procesando pago de: $1500.0

Captura de pantalla

<img width="350" height="111" alt="image" src="https://github.com/user-attachments/assets/7237aaca-6125-4054-a452-bd983aa1f7da" />
