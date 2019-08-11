# UTN FRRO - Asignatura: Diseño de Sistemas.
## Proyecto: juguetes  
Documentación pcial --> Ver en file ue_DOCUMENTACION.md  
Objetivo de este documento: Documentar el paso a paso realizado para el deployment Exitoso en Heroku  
Esta misam info se vuelca en el txt C:\__Tmp_LRI\Deploy-Heroku_paso-a-paso_v01.txt
     y en la nota Evernote "UTDC008 - DS Spring 2019::Programar Caso Juguete"  
Creado: [UTDC008 - LRI 4/8/19]

## Paso a Paso del Deploy
[4/8/19 LRI] 
   + Folder para el deploy en esta máquina (VM DS2018 en NB LRI): C:\__Heroku-Wks\juguetes
   + Nombre de la APP en Heroku: dsappjuguetes
   + User en Heroku: lripani@gmail.com   (ver la password en Evernote)
   + URL de la APP: https://dsappjuguetes.herokuapp.com/
   + GIT de la APP: https://git.heroku.com/dsappjuguetes.git   
     .  
0- Copy files del proyecto a C:\__Heroku-Wks\juguetes  
1- Install GIT --> https://git-scm.com/download/gui/windows  
2- Install Heroku CLI  
3- En CMD probar GIT --> C:\git  
4- En CMD probar Heroku CLI --> C:\heroku --version  
     ++ Solo funciona con: "C:\Program Files\heroku\bin\heroku" --version
.        
5- "C:\Program Files\heroku\bin\heroku" login    
6- CD C:\__Heroku-Wks\juguetes  
7- git init  --> Resp: "Initialized empty Git repository in C:/__Heroku-Wks/juguetes/.git/"  
8- git add .  --> (Adiciona el directorio al repositorio) - Resp: da varios "warning: LF will be replaced by CRLF"  
.  
9.0- git config --global user.email "lripani@gmail.com" --> (esto hubo que agregarlo porque sino al ejecutar el commit, da error " Please tell me who you are")  
9.1- git config --global user.name "Luciano Ripani" --> (esto hubo que agregarlo porque sino al ejecutar el commit, da error " Please tell me who you are")  
9.2- git commit -m "primer commit" --> (Hace commit con el comentario "primer commit")   
.  
10- "C:\Program Files\heroku\bin\heroku" create dsappjuguetes --> (Si el nombre de app está ya usado dará error.   
Debe responder el URL de la app, y el URL del GIT)   
Resp: Creating ? dsappjuguetes... done  
https://dsappjuguetes.herokuapp.com/ | https://git.heroku.com/dsappjuguetes.git  
.  
11- git push heroku master --> (Levanta los archivos en el git.heroku.com y arranca la aplicacion) (Demorará de acuerdo con el tamaño de la aplicación)  
      + La primera vez dió error de conexión  
      + Se volvió a ejecutar, y funcionó OK   
      Resp (solo las últimas 5 líneas):  
		remote:        https://dsappjuguetes.herokuapp.com/ deployed to Heroku  
		remote:  
		remote: Verifying deploy... done.  
		To https://git.heroku.com/dsappjuguetes.git  
		 * [new branch]      master -> master  
12- Testear https://dsappjuguetes.herokuapp.com--> OK  
13- Crear TinyUrl Caso Juguetes --> https://tinyurl.com/utnfrro-juguetes   ==>  https://dsappjuguetes.herokuapp.com  
[4/8/19 FIN]  
      