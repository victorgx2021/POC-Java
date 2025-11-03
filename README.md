Azure Functions Java 11 Hello World

Proyecto mínimo Azure Functions en Java 11.

Requisitos:
- Java 11
- Maven
- Azure Functions Core Tools (opcional para pruebas locales)

Cómo probar localmente:
1. mvn clean package
2. mvn azure-functions:run

Secrets para GitHub Actions (setear en repo settings -> Secrets):
- AZURE_FUNCTIONAPP_PUBLISH_PROFILE: contenido del publish profile (XML) usado para desplegar
- AZURE_FUNCTIONAPP_NAME: nombre de la Function App
- AZURE_FUNCTIONAPP_RESOURCE_GROUP: resource group

