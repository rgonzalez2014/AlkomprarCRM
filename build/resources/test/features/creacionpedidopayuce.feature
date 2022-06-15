Feature: Crear un pedido cliente envio con medio de pago PayU

  Scenario Outline: Creacion pedido cliente envio con medio de pago PayU
    Given Se despliega la pagina cmpqr_cartera e ingresan las credenciales
      | usuario   | password   |
      | <Usuario> | <Password> |
    When Se ingresa al modulo principal y luego a televentas
    Then Se hace clic en el boton Crear y registran los datos del formulario cliente factura
      | unidadventa   | facturacionelectronica   | tipodocumento   | numerodocumento   | primernombre   | segundonombre   | primerapellido   | segundoapellido   | ciudad   | direccion   | telefonocelular   | telefonofijo   | email   | genero   | autorizotratamientodatos   |
      | <UnidadVenta> | <FacturacionElectronica> | <TipoDocumento> | <NumeroDocumento> | <PrimerNombre> | <SegundoNombre> | <PrimerApellido> | <SegundoApellido> | <Ciudad> | <Direccion> | <TelefonoCelular> | <TelefonoFijo> | <Email> | <Genero> | <AutorizoTratamientoDatos> |
    And Se registran los datos del formulario cliente envio
      | tipodocumento_ce   | numerodocumento_ce   | primernombre_ce   | segundonombre_ce   | primerapellido_ce   | segundoapellido_ce   | ciudad_ce   | direccion_ce   | telefonocelular_ce   | telefonofijo_ce   | email_ce   | genero_ce   |
      | <TipoDocumento_ce> | <NumeroDocumento_ce> | <PrimerNombre_ce> | <SegundoNombre_ce> | <PrimerApellido_ce> | <SegundoApellido_ce> | <Ciudad_ce> | <Direccion_ce> | <TelefonoCelular_ce> | <TelefonoFijo_ce> | <Email_ce> | <Genero_ce> |
    And Se agregan productos al pedido
      | ean   |
      | <Ean> |
    And Se registran los datos del medio de pago
      | observaciones   |
      | <Observaciones> |
    Then Se crea el pedido quedando en estado confirmacion pago


    Examples:
      | Usuario | Password | UnidadVenta | FacturacionElectronica | TipoDocumento | NumeroDocumento | PrimerNombre | SegundoNombre | PrimerApellido | SegundoApellido | Ciudad      | Direccion         | TelefonoCelular | TelefonoFijo | Email                                 | Genero    | AutorizoTratamientoDatos | TipoDocumento_ce | NumeroDocumento_ce | PrimerNombre_ce | SegundoNombre_ce | PrimerApellido_ce | SegundoApellido_ce | Ciudad_ce   | Direccion_ce          | TelefonoCelular_ce | TelefonoFijo_ce | Email_ce                    | Genero_ce | Ean          | Observaciones         |
      | asesor1 | 123      | AKB68       | Si                     | C.C           | 80817985        | Roger        | Andres        | Gonzalez       | Gonzalez        | Bogotá d.c. | Calle 135 # 90 33 | 3203003038      | 6813271      | roger.gonzalez.ext@colcomercio.com.co | Masculino | No                       | C.C              | 35505690           | Martha          | Cecilia          | Gonzalez          | Parga              | Bogotá d.c. | calle 137 a # 98 b 04 | 3114997063         | 8009091         | 80817985@colcomercio.com.co | Femenino  | 723755138421 | Pruebas automatizadas |


