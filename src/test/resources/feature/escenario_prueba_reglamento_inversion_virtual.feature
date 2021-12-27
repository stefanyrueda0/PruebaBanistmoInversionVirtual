#language: es
#Author: Stefany Rueda

  Característica: Prueba de validación documento Reglamento de inversión vurtual

  Escenario: Validar que el documento descargado sea el correcto

    Cuando se ingresa a la seccion de solicitud de productos
    #Y a la ruta de Inversiones con un monto de menos 500k
    Entonces se puede validar que el documento adjunto es el correcto