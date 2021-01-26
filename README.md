# Challenge Tecnico
Sosa Challenge Tecnico - InDigital

## Acerca del proyecto
Spring boot, Java 1.8, H2, GIT, AWS.

- Enlaces:
1. Proyecto en Github: https://github.com/sosacs/springboot
2. Documentación del api: http://18.230.108.151:8080/swagger-ui.html


- Endpoint:
1. POST: /creacliente
{
  "apellido": "Perez",
  "edad": 29,
  "fechaNacimiento": "1991-08-11",
  "nombre": "Juan"
}
2. GET: /kpideclientes
Promedio edad entre todos los clientes.
Desviación estándar entre las edades de todos los clientes.
3. GET: /listclientes
Lista de personas con todos los datos + fecha probable de muerte de cada una.