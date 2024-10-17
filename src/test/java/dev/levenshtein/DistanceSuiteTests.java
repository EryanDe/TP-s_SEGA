package dev.levenshtein;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ csvTest.class }) // Inclure les classes contenant les tests de distance
@IncludeTags("distance") // Sélectionner uniquement les tests avec le tag "distance"
public class DistanceSuiteTests {
    // Cette classe reste vide, elle sert uniquement à regrouper les tests
}
