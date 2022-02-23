Feature: Acheter une liste de livre avec reduction

  Scenario: On achete une liste d'un livre
    Given 1 livre de type Harry_potter
    When On achete la liste de livre
    Then la liste doit nous couter 8.0 euros

  Scenario: On achete une liste d'un livre
    Given 1 livre de type Guerre_et_paix
    When On achete la liste de livre
    Then la liste doit nous couter 8.0 euros

  Scenario: On achete une liste d'un livre
    Given 1 livre de type Narnia
    When On achete la liste de livre
    Then la liste doit nous couter 8.0 euros

  Scenario: On achete une liste d'un livre
    Given 1 livre de type Seigneur_des_anneaux
    When On achete la liste de livre
    Then la liste doit nous couter 8.0 euros

  Scenario: On achete une liste d'un livre
    Given 1 livre de type BDD_pour_les_nuls
    When On achete la liste de livre
    Then la liste doit nous couter 8.0 euros

  Scenario: On achete une liste de deux livres
    Given 2 livre de type Harry_potter
    When On achete la liste de livre
    Then la liste doit nous couter 16.0 euros

  Scenario: On achete une liste de deux livres differents
    Given 1 livre de type Harry_potter
    Given 1 livre de type Guerre_et_paix
    When On achete la liste de livre
    Then la liste doit nous couter 15.2 euros

  Scenario: On achete une liste de trois livres differents dont deux identique
    Given 2 livre de type Harry_potter
    Given 1 livre de type Guerre_et_paix
    When On achete la liste de livre
    Then la liste doit nous couter 23.2 euros

  Scenario: On achete une liste de 4 livres differents dont deux identique
    Given 2 livre de type Harry_potter
    Given 1 livre de type Guerre_et_paix
    Given 1 livre de type Narnia
    When On achete la liste de livre
    Then la liste doit nous couter 29.6 euros


  Scenario: On achete une liste de cinq livres differents dont deux identique
    Given 2 livre de type Harry_potter
    Given 1 livre de type Guerre_et_paix
    Given 1 livre de type Narnia
    Given 1 livre de type Seigneur_des_anneaux
    When On achete la liste de livre
    Then la liste doit nous couter 33.6 euros


  Scenario: On achete une liste de six livres differents dont deux identique
    Given 2 livre de type Harry_potter
    Given 1 livre de type Guerre_et_paix
    Given 1 livre de type Narnia
    Given 1 livre de type Seigneur_des_anneaux
    Given 1 livre de type BDD_pour_les_nuls
    When On achete la liste de livre
    Then la liste doit nous couter 38.0 euros


  Scenario: On achete une liste de 8 livres differents dont trois series de deux identique
    Given 2 livre de type Harry_potter
    Given 2 livre de type Guerre_et_paix
    Given 2 livre de type Narnia
    Given 1 livre de type Seigneur_des_anneaux
    Given 1 livre de type BDD_pour_les_nuls
    When On achete la liste de livre
    Then la liste doit nous couter 51.6 euros


  Scenario: On achete une liste de 23 livres differents dont trois serie de 5 identique et deux series de 4 identique
    Given 5 livre de type Harry_potter
    Given 5 livre de type Guerre_et_paix
    Given 4 livre de type Narnia
    Given 5 livre de type Seigneur_des_anneaux
    Given 4 livre de type BDD_pour_les_nuls
    When On achete la liste de livre
    Then la liste doit nous couter 141.6 euros
