Comando a utilizar

En la consola de windows CMD nos dirigimos a la carpeta raiz del proyecto:
Ej. cd /d Desarollo/proyecto

Alli usamos el comando mvn clean para borrar la carpeta target.

Una vez usado el comando mvn clean, utilizamos el comando mvn install -P{perfil}, indicamos -P para senialar un perfil de los indicados en el pom.
Ej. mvn install -Pdev

para seleccionar un perfil desde el ide y ejecutarlo 


https://www.youtube.com/watch?v=XkQR2nih_FU
Con spring tool suite -> run configuration, seleccionamos del menu desplegable profile en cual queremos que se ejecute la app.

Sin spring tool suite -> click derecho sobre el proyecto -> run as -> run configuration -> maven build -> jpaSpring -> profile : y ponemos el nombre del profile que queremos. clickeamos en run.