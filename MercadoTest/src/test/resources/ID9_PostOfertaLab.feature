
@tag
Feature: Ofertas Laborales Postulacion
  

  @tag1
  Scenario: usuario se postula a una oferta laboral
    Given Usuario entra a mercado libre
    When click en trabaja con nosotros
    And click en ver oportunidades
    And click postularse
    And rellenar formulario
    And click continuar
    Then postulacion exitosa