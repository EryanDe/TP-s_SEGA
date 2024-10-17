package dev.levenshtein;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ DistanceLevenshteinTest.class }) // Inclure la classe qui contient les tests de validation
@IncludeTags("validation") // Sélectionner uniquement les tests avec le tag "validation"
public class ValidationSuiteTests {
    // Cette classe reste vide, elle sert uniquement à regrouper les tests
}
