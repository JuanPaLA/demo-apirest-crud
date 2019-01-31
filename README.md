# demo-apirest-crud

PARA PROBAR EL PROYECTO

1) Instalar PHPMyAdmin 
  a) Lo pueden hacer instalando WAMPSERVER, que de paso les instala otras cosas y todo lo necesario para que funcione PHPMyAdmin. 
  b) Hay varios tutoriales de cómo hacerlo. Acá uno: https://www.youtube.com/watch?v=aUa2-0l2ZXc.
  c) También podría funcionar con MySQLWorkBench, supongo. 

2) Una vez instalado el gestor de SQL, importar el archivo loancheckerdb2.sql.
  *Este es el archivo donde están las tablas con las que se prueba el proyecto. 
  ** Es posible que se tenga que configurar algún parámetro del proyecto para que el programa Java tome la base de datos como corresponde.
    
3) Importar los dos proyectos: JAVA & ANGULAR
  a) De aqué bajan el proyecto java (API-REST), que es el backend. Este repo está trabajando en el branch: "FullRefactorTerceraClaseCobros".
  b) El FrontEnd Angular lo bajan del siguiente repo: https://github.com/JuanPaLA/demo-angular-REST.git. Este repo está trabajando en el branch
  "prueba". 
  
 4) Iniciar su gestor de SQL desde el menú de herramientas de WAMPSERVER.
 
 5) Ejecutar como Spring Boot App el proyecto de java.

 6) Ejecutar el proyecto angular desde la terminal de Visual Studio Code: "ng serve -o".
