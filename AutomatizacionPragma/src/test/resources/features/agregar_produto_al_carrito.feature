#language:es
  Característica: agregar producto al carrito

    Como usuario
    Necesito seleccionar productos
    Para agregar al carrito de compras

    Antecedentes:
      Dado que el usuario esta en la pagina de automation practice

    @BuscarProductoParaAgregarAlCarrito
    Escenario: Buscar un producto para agregar al carrito
      Cuando agrega "1" cantidad del producto "Faded Short Sleeve T-shirts" al carrito
      Entonces El visualizara el mensaje "Product successfully added to your shopping cart"


    @AgregarAlCarritoUnProductoDesdeUnaCategoria
    Escenario: Agregar al carrito un producto desde una categoria
      Cuando agrega "1" "Blouse" de la categoria "Women" al carrito
      Entonces El visualizara el mensaje "Product successfully added to your shopping cart"


    @AgregarAlCarritoUnProductoConCantidadSuperiorAUno
    Escenario: Agregar al carrito un producto con cantidad superior a uno
      Cuando agrega "5" unidades del producto "Printed Dress" al carrito
      Entonces El visualizara el "5" en la cantidad de la pantalla de confirmacion

    @AgregarMasDeDoceDigitosEnLaCantidadDeProductos
    Escenario: Agregar Mas De Doce Digitos En La Cantidad De Productos
      Cuando agrega "1234567890123" unidades del producto "Faded Short Sleeve T-shirts" al carrito
      Entonces El visualizara el "1234567890123" en la cantidad de la pantalla de confirmacion

    @AgregarUnaLetraEnLaCantidadDeProductos
    Escenario: Agregar Una Letra En La Cantidad De Productos
      Cuando agrega "e" unidades del producto "Printed Chiffon Dress" al carrito
      Entonces El visualizara el mensaje de error "Null quantity."

      @AgregarUnProductoDesdeElHome
      Escenario: Agregar un producto desde el Home
        Cuando agrega "1" cantidad del producto "Printed Summer Dress" al carrito desde home
        Entonces El visualizara el mensaje "Product successfully added to your shopping cart"


