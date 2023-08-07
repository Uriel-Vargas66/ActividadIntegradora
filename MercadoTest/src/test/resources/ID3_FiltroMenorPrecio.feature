@tag
Feature: Probar filtro menor precio

  @tag1
  Scenario: usuario filtra producto por menor precio
     Given usuario entra a la página
    When escribe un producto en el buscador
    And click en buscar producto
    And filtra por menor precio
    Then productos ordenados por menor precio

