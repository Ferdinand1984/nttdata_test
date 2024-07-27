1. Se debe descargar la version de chromedriver que funcione para su navegador, en este caso utilice la ultima,
    y actualizar en el archivo serenity.properties la direccion de la misma, en el ejercicio esta en el C:
2. Se debe abrir el proyecto como proyecto gradle y contar con las herramientas instaladas y las variables de entorno configuradas
    JAVA_HOME,GRADLE_HOME,MVN
3. Una vez que se tenga instalado abrir el proyecto y actualizar las dependencias de gradle.
4. Cuando ya se construya el proyecto y actualizado el chromedriver se puede ejecutar desde el Runner BuyProductsRunner.
    O se puede utilizar el comando gradle
    gradle clean test --tests *BuyProductsRunner aggregate
5. Una vez que termine la ejecucion de este comando se puede revisar el informe de ejecucion en la carpeta target - site - serenity
    una vez abierta la carpeta se muestran un listado de archivos,
    localizar el archivo index.html y abrirlo en el navegador.
    En ocaciones demora un poco su ejecucion y es aconsejable dar click derecho sobre la carpeta target y seleccionar
    reload from disk
