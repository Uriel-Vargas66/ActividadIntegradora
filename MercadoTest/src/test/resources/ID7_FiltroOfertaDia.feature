

@tag
Feature: Filtro oferta del dia
  

  @tag1
  Scenario: usuario ordena por oferta del dia
    Given Usuario entra a la pagina
    When click ofertas
    And click filtro oferta del dia
    Then productos se muestran de acuerdo a oferta del dia
