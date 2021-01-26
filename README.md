# Challenge Tecnico
Sosa Challenge técnico - InDigital

Spring boot, Java 1.8, H2, GIT, AWS

Enlaces:
Proyecto en Github: https://github.com/sosacs/springboot
Documentación del api: http://18.230.108.151:8080/swagger-ui.html

Endpoint:
POST: /creacliente
{
  "apellido": "Perez",
  "edad": 29,
  "fechaNacimiento": "1991-08-11",
  "nombre": "Juan"
}
GET: /kpideclientes
Promedio edad entre todos los clientes.
Desviación estándar entre las edades de todos los clientes.
GET: /listclientes
Lista de personas con todos los datos + fecha probable de muerte de cada una.