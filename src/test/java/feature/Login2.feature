@LoginFija
Feature: Login de trazabilidad
  Como Usuario
  Quiero Ingresar a la Web Admin
  Para Dar Logearme como administrador

  Scenario: Login Credenciales Correctos
    Given Abriendo el navegador e Ingresar Link de Web Admin
    When Ingresar usuario
    And Ingresar contraseña
    And Realizar el Login a la web
    And Ingrear a parametros
    And Ingresar a parametros de validacion
    And buscar texto gps
    And hacer click en editar
    Then Se muestra en pantalla el parametro






