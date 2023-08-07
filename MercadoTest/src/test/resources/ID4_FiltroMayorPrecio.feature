@tag
Feature: Probar filtro mayor precio

  @tag1
  Scenario: usuario filtra producto por mayor precio
     Given usuario entra a la página
    When escribe un producto en el buscador
    And click en buscar producto
    And filtra por mayor precio
    Then productos ordenados por mayor precio