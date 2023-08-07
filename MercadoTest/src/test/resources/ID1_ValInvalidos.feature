@tag
Feature: Valores inválidos
en filtro precios

  @tag1
  Scenario: Valores inválidos en filtro precios
    Given Usuario entra a la pagina
    When click ofertas
    And establece un rango de precios
    And aplica el filtro rango de precios
    Then ver mesaje de advertencia, rango invalido

