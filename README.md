# CRUD_Intercult_Grp1

#  CRUD de personas con Mysql, Java y Restfull

Este Proyecto realiza el CRUD de personas usando el lenguaje JAVA, el IDE a utilizar es netbeans 21 JDK 21 y la BD en Mysql usando docker en la carpeta BDD, Arquitectura MVC.

## Integrantes:
- Christopher Bazurto (Lider)
- Vanessa Zurita (Programador)
- Ricardo Rivadeneira (Programador)
- Jhon Munarco (Programador)
- Wendy Quintana (BDD)

##  Endpoints de la API

A continuación se detallan los endpoints disponibles para el recurso `Persona`:

| Método | Endpoint        | Descripción                            |
|--------|------------------|----------------------------------------|
| GET    | `/persona`       | Obtiene la lista de todas las personas. |
| GET    | `/persona/{id}`  | Obtiene una persona por su ID.         |
| POST   | `/persona`       | Crea una nueva persona.                |
| PUT    | `/persona/{id}`  | Actualiza una persona existente.       |
| DELETE | `/persona/{id}`  | Elimina una persona por su ID.         |


##  **Docker (Opcional)**
Para crear la bdd en **Docker**, usar:

```bash
docker-compose up --build
```

---

## ¿Cómo resolvieron conflictos de merge entre equipos "remotos"?
- Pull frecuente: Cada integrante hacía git pull seguido para mantener su copia local actualizada antes de trabajar.
- Revisiones de código: Antes de hacer merge a la rama principal.
- Pruebas locales: Después de resolver un conflicto, se probaba localmente para evitar errores en el repositorio remoto.

## ¿Qué herramientas usaron para comunicarse?

- GitHub y Pull Requests: Para seguimiento técnico, comentarios sobre código y revisiones.

- WhatsApp: Para comunicación rápida, dudas inmediatas y coordinación diaria.

## ¿Cómo afectaría una diferencia de huso horario real en este flujo?

- Retrasos en la comunicación, los mensajes o dudas pueden tardar horas en ser respondidos, ralentizando la resolución de conflictos o la toma de decisiones.

- Mayor necesidad de documentación clara , para que cada integrante pueda continuar trabajando sin depender de respuestas inmediatas.

- Uso intensivo de herramientas asincrónicas, como GitHub, pull requests con comentarios detallados.


