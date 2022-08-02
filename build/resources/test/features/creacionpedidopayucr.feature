Feature: Crear un pedido cliente recoge con medio de pago PayU

  Scenario Outline: Creacion pedido cliente recoge con medio de pago PayU
    Given Se despliega la pagina cmpqr_cartera e ingresan las credenciales
      | usuario   | password   |
      | <Usuario> | <Password> |
    When Se ingresa al modulo principal y luego a televentas
    Then Se hace clic en el boton Crear y registran los datos del formulario cliente factura
      | unidadventa   | facturacionelectronica   | tipodocumento   | numerodocumento   | primernombre   | segundonombre   | primerapellido   | segundoapellido   | ciudad   | direccion   | telefonocelular   | telefonofijo   | email   | genero   | autorizotratamientodatos   |
      | <UnidadVenta> | <FacturacionElectronica> | <TipoDocumento> | <NumeroDocumento> | <PrimerNombre> | <SegundoNombre> | <PrimerApellido> | <SegundoApellido> | <Ciudad> | <Direccion> | <TelefonoCelular> | <TelefonoFijo> | <Email> | <Genero> | <AutorizoTratamientoDatos> |
    And Se registran los datos del formulario cliente recoge
      | tipodocumento_cr   | numerodocumento_cr   | primernombre_cr   | segundonombre_cr   | primerapellido_cr   | segundoapellido_cr   | telefonocelular_cr   | recoge_en   |
      | <TipoDocumento_cr> | <NumeroDocumento_cr> | <PrimerNombre_cr> | <SegundoNombre_cr> | <PrimerApellido_cr> | <SegundoApellido_cr> | <TelefonoCelular_cr> | <Recoge_en> |
    And Se agregan productos al pedido
      | ean   | cantidad   |
      | <Ean> | <Cantidad> |
    And Se registran los datos del medio de pago
      | metodo_pago   | tipo_pago   | link   | observaciones   |
      | <Metodo_Pago> | <Tipo_Pago> | <Link> | <Observaciones> |
    Then Se crea el pedido quedando en estado confirmacion pago


    Examples:
      | Usuario | Password | UnidadVenta | FacturacionElectronica | TipoDocumento | NumeroDocumento | PrimerNombre | SegundoNombre | PrimerApellido | SegundoApellido | Ciudad      | Direccion         | TelefonoCelular | TelefonoFijo | Email                                 | Genero    | AutorizoTratamientoDatos | TipoDocumento_cr | NumeroDocumento_cr | PrimerNombre_cr | SegundoNombre_cr | PrimerApellido_cr | SegundoApellido_cr | TelefonoCelular_cr | Recoge_en | Ean          | Cantidad | Metodo_Pago | Tipo_Pago           | Link  | Observaciones         |
      | asesor1 | 123      | AKB68       | Si                     | C.C           | 80817985        | Roger        | Andres        | Gonzalez       | Gonzalez        | Bogotá d.c. | Calle 135 # 90 33 | 3203003038      | 6813271      | roger.gonzalez.ext@colcomercio.com.co | Masculino | No                       | C.C              | 35505690           | Martha          | Cecilia          | Gonzalez          | Parga              | 3114997063         | AKB68     | 723755138421 | 1        | Payu        | PSE/Tarjeta crédito | Email | Pruebas automatizadas |


