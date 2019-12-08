@Login3
Feature:Login de Vendedor
  Como usuario
  Quiero entrar al login del vendedor
  Para logearme

  Scenario:
    Given Abriendo el navegador e Ingresar Link de la web fija
    When Ingresar un usuario
    And Darle click en continuar

    And Ingresar una contraseña
    And Iniciar sesion
    And Se muestra la web de ventas
    And Darle click en Altas Nuevas
    And Darle clik en obviar y continuar
    And Seleccionar Tipo de Documento
    And Ingreso de Numero de Documento
    And Selecciono el departamento
    And Selecciono la provincia
    And Selecciono el distrito
    And click en evaluar
    And click en continuar
    And click en elegir nombre
    And elegir nombre de la madre
    And click en btn siguiente
    And seleccionar direccion
    And Ubicar en el mapa
    And Click en continuar_mapa
    And Click en masiva
    And Click en producto a elegir
    And Elegir SVAs
    And Click en continuar_sva





