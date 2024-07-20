# Integrantes:
- Cevallos Tomala Hellen
- Moreira Mendoza Cristofer
- Navas Amaya Cesar
- Rodriguez Carbo Melany
  
# Principios de JPA API de productos en Github
El proyecto está organizado en varios paquetes y clases con diferentes responsabilidades.

# Controlador (ProductoController):
Define las rutas y métodos para manejar las solicitudes HTTP relacionadas con los productos.
Utiliza @RestController para definir un controlador `RESTful` y `@RequestMapping` para definir la ruta base.

![image](https://github.com/user-attachments/assets/155af41d-39eb-4382-a02f-80bc624d3e07)


# Modelo (Producto):
Define la entidad Producto con anotaciones JPA para mapear la clase a una tabla en la base de datos.

![image](https://github.com/user-attachments/assets/811d09a9-b0f6-4cf4-af4c-dbf6022f0a31)


# Repositorio (ProductoRepository):
Interfaz que extiende `JpaRepository` para realizar operaciones CRUD en la base de datos.

![image](https://github.com/user-attachments/assets/047da9ee-4f39-4121-a891-04b54eb75ef4)


# Servicio (ProductoService):
Clase de servicio que contiene la lógica de negocio relacionada con los productos.

![image](https://github.com/user-attachments/assets/d6d90e2b-707c-4933-9f92-31f5332b8d96)

# Aplicación Principal (JpaTutorialApplication):
Clase principal que arranca la aplicación Spring Boot.

![image](https://github.com/user-attachments/assets/0c125a59-ee46-43d8-a19e-f1d8de38a16d)


# Carga Inicial de la Base de Datos (LoadDatabase):
Clase de configuración que inicializa la base de datos con algunos productos de prueba al iniciar la aplicación.

![image](https://github.com/user-attachments/assets/7fb4afc1-bac1-43d9-8db0-600f4992313b)

# Inicializacion en la base de datos 
Al iniciar la aplicación, se cargan algunos productos de prueba en la base de datos.

![Imagen de WhatsApp 2024-07-19 a las 15 25 56_279b5b1d](https://github.com/user-attachments/assets/95cc46d3-8471-4874-b1e2-0e2d14ba6b33)

# Endpoints y Carga de producto en el Thunder 
- GET `/api/productos`
- Descripción: Obtiene todos los productos.
  
  ![Imagen de WhatsApp 2024-07-19 a las 15 26 57_42d35f2d](https://github.com/user-attachments/assets/30459e97-a654-46e8-b532-4b1d7b7f721a)

- GET `/api/productos/{id}`
- Descripción: Obtiene un producto por su ID.
  
  ![Imagen de WhatsApp 2024-07-19 a las 15 27 12_602f3710](https://github.com/user-attachments/assets/987ffce3-b35f-445d-b775-124e5be132e9)

- GET `/api/productos/search`
- Descripción: Busca productos por nombre.
  
  ![Imagen de WhatsApp 2024-07-19 a las 15 28 09_bcb86579](https://github.com/user-attachments/assets/bb105cba-e388-4da9-a664-e941a39ebc43)

- GET `/api/productos/searchByPrecio`
- Descripción: Busca productos dentro de un rango de precios.

![Imagen de WhatsApp 2024-07-19 a las 15 29 02_13f95253](https://github.com/user-attachments/assets/a1a9de70-eaab-498f-90d9-df34741f5021)

