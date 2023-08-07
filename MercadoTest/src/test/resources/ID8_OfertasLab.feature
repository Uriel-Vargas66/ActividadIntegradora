
@tag
Feature: Ofertas Laborales
  

  @tag1
  Scenario: usuario entra al apartado de ofertas laborales
    Given Usuario entra a mercado libre
    When click en trabaja con nosotros
    Then se muestra la pagina de ofertas laborales