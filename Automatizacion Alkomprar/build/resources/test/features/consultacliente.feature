Feature: Consultar facturas del cliente en el aplicativo Panel Cliente

  Scenario Outline: Consultar facturas del cliente
    Given Se despliega la pagina crm cartera colcomercio e ingresan las credenciales
      | usuario   | password   |
      | <Usuario> | <Password> |
    When Se ingresa al modulo de panel cliente
    And Se consulta un documento
      | documento   |
      | <Documento> |
    Then Se visualizan los datos del cliente

    Examples:
      | Usuario  | Password | Documento |
      | adminpqr | 123      | 80817985  |