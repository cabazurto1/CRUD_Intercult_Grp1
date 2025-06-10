# CRUD_Intercult_Grp1

# 📝 CRUD de personas con Mysql, Java y Restfull

Este Proyecto realiza el CRUD de personas usando el lenguaje JAVA, el IDE a utilizar es netbeans 21 JDK 21 y la BD en Mysql usando docker en la carpeta BDD, Arquitectura MVC.

## Integrantes:
- Christopher Bazurto (Lider)
- Vanessa Zurita (Programador)
- Ricardo Rivadeneira (Programador)
- Jhon Santos (Programador)
- Wendy Quintana (BDD)

## 📡 Endpoints de la API

A continuación se detallan los endpoints disponibles para el recurso `Persona`:

| Método | Endpoint        | Descripción                            |
|--------|------------------|----------------------------------------|
| GET    | `/persona`       | Obtiene la lista de todas las personas. |
| GET    | `/persona/{id}`  | Obtiene una persona por su ID.         |
| POST   | `/persona`       | Crea una nueva persona.                |
| PUT    | `/persona/{id}`  | Actualiza una persona existente.       |
| DELETE | `/persona/{id}`  | Elimina una persona por su ID.         |


## 📦 **Docker (Opcional)**
Para crear la bdd en **Docker**, usar:

```bash
docker-compose up --build
```

---

