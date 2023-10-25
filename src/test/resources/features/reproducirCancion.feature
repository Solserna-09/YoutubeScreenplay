
Feature: Reproducir cancion en youtube

  @SmokeTest
  Scenario:  Reproducir cancion
    Given que el usuario se encuentre en la pagina de youtube
    When el busque una cancion para reproducirla
    Then el usuario podra visualizar que la cancion que se reproduce es la cancion que busco