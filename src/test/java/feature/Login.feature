@Login_1
Feature: Login de trazabilidad
  Como Usuario
  Quiero Ingresar a la Web Trazabilidad
  Para Dar Seguimiento a mi Pedido

  Scenario Outline: Login Credenciales Correctos
    Given Abriendo el navegador e Ingresar Link de Trazabiliada
    When Seleccionar Tipo de Documento <documentType>
    And Ingreso de Numero de Documento <documentNumber>
    And Aceptamos Terminos y Condiciones
    And Realizar el Login
    Then Se muestra pantalla del token

    Examples:
      | documentType | documentNumber |
      | 1            | 48279083       |
      | 4            | 71099758A      |