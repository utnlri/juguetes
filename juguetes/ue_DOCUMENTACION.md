# UTN FRRO - Asignatura: Diseño de Sistemas.
## Proyecto: juguetes  
Objetivo: programar con Spring el caso Juguetes utilizado para clases DS en UTN 2019
Creado: [UTDC008 - LRI 1/8/19]

## Para ejecutar la aplicación Caso Juguetes
1- Botón derecho sobre JuguetesApplication.java \ Run as \ Java Application
2- En chrome URL: http://localhost:8080/ --> Esto mapea al Menú pcial que corresponde al home.html
..
###Ejecutar en Heroku --> URL de la APP: https://dsappjuguetes.herokuapp.com/
Para Deploy en Heroku  ver -->  ue_Deploy-Heroku_paso-a-paso.md

## Bitácora proyecto juguetes
[1/8/19 LRI] Tareas realizadas: 
-Se consiguío crear el Proyecto con Spring Initializr ( URL -->  https://start.spring.io/ ), e importar en VM con Eclipse --> ver paso a paso en Evernote "UTDC008 - DS Spring 2019::Programar Caso Juguete

-Se agregó file Example.java para poder ejecutar algo en el browser (código tomado de Spring.io-Getting-Started_11. Developing Your First Spring Boot Application.pdf [Q:\3-UNIV\UTN_DS\DS-2020\Spring_LRI-2019\Guides])

-Para ejecutar Example.java --> 
	1- Botón derecho sobre Example.java \ Run as \ Java Application
	2- En chrome URL: http://localhost:8080/world-jug
	2.a- Para editar el URL modificar en Example.java --> @RequestMapping("/world-jug")
[1/8/19 FIN]

[3/8/19 y 4/8/19 LRI]
1- Se agrega spring-boot-starter-web al pom.xml
2- Se resuelve el primer evento del caso Juguete. Agregando:
     + Paquete edu.utn.frro.ds.juguetes.domain
     + Clase Juguete.java
     + Paquete edu.utn.frro.ds.juguetes.dao
     + Interfaz JugueteDAO
     + Método CommandLineRunner en JuguetesApplication.java
     + Paquete edu.utn.frro.ds.juguetes.controller
     + ControladorPedidoJuguete.java
     + buscarJug.html
     + confirmacion.html
     + Pedido.java
     + PedidoDAO.java
     + Cliente.java
     + ClienteDAO.java
     .
3- Se agrega un Listado de los Pedidos realizados y un menú inicial en el Home
     + ControladorListarPedidos.java
     + listarPedidos.html
     + home.html
     + ControladorHome.java --> Mapea el url / al home.html
     .
[4/8/19 FIN]

[4/8/19 Noche - LRI]
1- Se hace el Deploy en Heroku Exitosamente:
     + URL de la APP: https://dsappjuguetes.herokuapp.com/
     + Ver paso a paso del Deploy en: ue_Deploy-Heroku_paso-a-paso.md
     .
[4/8/19 Noche - FIN]
     