# Actividad 2: Spring Boot MVC y Thymeleaf

## 1. Descripción

Aplicación basada en una copia independiente de la Actividad 1. Se utilizan Spring Boot, Thymeleaf, Model y DTO para mostrar una lista de empleados, recibir datos desde un formulario y responder peticiones HTTP.

## 2. Tecnologías y funcionalidades

Java 21, Spring Boot 4.1.2, Maven, Spring Web MVC, Thymeleaf y Postman.

- `EjemploController`: vista `/detalles_info` con la lista de empleados (`Model` y `th:each`).
- `FormularioController`: vista `/empleados/formulario` y recepción de datos por `@ModelAttribute` en `POST /empleados/registrar`.
- `EmpleadoDTO`: objeto utilizado tanto en el formulario HTML como en el endpoint REST POST.
- `RquestParamControllers`: endpoint GET con `@RequestParam`.
- `PathVariableController`: endpoint GET con `@PathVariable`, POST con `@RequestBody` y propiedades con `@Value`.
- `@Value` obtiene `config.usuario` desde `application.properties` y lo muestra en el formulario.

## 3. Endpoints

| Método | Ruta | Función |
|---|---|---|
| GET | `/detalles_info` | Tabla de empleados con Thymeleaf |
| GET | `/empleados/formulario` | Formulario enlazado a EmpleadoDTO |
| POST | `/empleados/registrar` | Recepción del formulario con ModelAttribute |
| GET | `/api/parametros/detalle?informacion=hola` | RequestParam |
| GET | `/api/variable/pagina1/hola` | PathVariable |
| GET | `/api/variable/valores` | Propiedades mediante Value |
| POST | `/api/variable/solicitud` | Petición JSON mediante RequestBody y EmpleadoDTO |

## 4. Configuración local

En `src/main/resources/application.properties` se configuró `server.port=8084` para no interferir con la Actividad 1 (8082).


## 5. Capturas de evidencia

En esta sección se muestran las pruebas realizadas para comprobar el funcionamiento de las vistas, los controladores y los endpoints desarrollados en Spring Boot.

### 5.1. Listado de empleados con `th:each`

Se muestra la información de los empleados mediante una tabla generada dinámicamente con Thymeleaf, utilizando `Model` y la directiva `th:each`.

**Endpoint:** [Ver listado de empleados](http://13.140.209.186:8084/detalles_info)

![Listado de empleados](src/img/act2-listado.png)

---

### 5.2. Formulario con `@ModelAttribute` y `@Value`

Formulario para capturar los datos de un empleado y enviarlos al controlador mediante `@ModelAttribute`. También se muestra una propiedad personalizada obtenida con `@Value`.

**Endpoint:** [Ver formulario de empleados](http://13.140.209.186:8084/empleados/formulario)

![Formulario de empleados](src/img/act2-formulario.png)

---

### 5.3. Petición GET con `@RequestParam`

Se comprueba la recepción de un parámetro enviado mediante la URL y su respuesta en formato JSON.

**Endpoint:** [Probar RequestParam](http://13.140.209.186:8084/api/parametros/detalle?informacion=hola)

![Prueba RequestParam](src/img/act2-requestparam.png)

---

### 5.4. Petición GET con `@PathVariable`

Se demuestra cómo recibir información directamente desde una variable incluida en la ruta del endpoint.

**Endpoint:** [Probar PathVariable](http://13.140.209.186:8084/api/variable/pagina1/hola)

![Prueba PathVariable](src/img/act2-pathvariable.png)

---

### 5.5. Petición POST con Postman

Se realizó una petición POST enviando los datos de un empleado en formato JSON mediante Postman. El servidor procesó la solicitud y devolvió una respuesta `200 OK` con la información recibida.

**Método:** `POST`

**Endpoint:** `http://13.140.209.186:8084/api/variable/solicitud`

![Prueba POST en Postman](src/img/act2-post.png)

## 6. Publicación

Repositorio: https://github.com/mendozavargasbraulio/BMVact2_t4

Actividad 2 (puerto 8084): `http://13.140.209.186:8084/empleados/formulario` 

Actividad 1 (puerto 8082): `http://13.140.209.186:8082/proyecto` 
