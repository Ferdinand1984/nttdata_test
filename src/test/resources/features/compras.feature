#language:es
Característica: Realizar una compra

  @Test
  Esquema del escenario: Comprar
    Dado que el cliente visita la pagina de compras
    Cuando selecciona los articulos y realiza la compra con los datos <tipoArticulo> <listaArticulos> <nombre> <pais> <ciudad> <tarjeta> <mes> <anio>
    Entonces revisa que se realize la compra exitosamente <resultado>
    Ejemplos:
      | tipoArticulo | listaArticulos | nombre | pais    | ciudad | tarjeta          | mes | anio | resultado                    |
      | Phones       | s6;s7          | Ivan   | Ecuador | Quito  | 4512789632547854 | 03  | 2028 | Thank you for your purchase! |



