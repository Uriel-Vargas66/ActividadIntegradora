@tag
Feature: Probar filtro mas
relevantes

  @tag1
  Scenario: Probar filtro mas relevantes
    Given usuario entra a la página
    When escribe un producto en el buscador
    And click en buscar producto
    And filtra por mas relevantes
    Then productos ordenados por relevancia

