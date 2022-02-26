package fv1;

import gate.Factory;
import gate.LanguageAnalyser;
import gate.util.GateException;
import gate.test.GATEPluginTests;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Using this class automatically prepares GATE and the plugin for testing.
 * 
 * This class automatically initializes GATE and loads the plugin. 
 * Any method in this class with the "@Test" annotation will then get
 * run with the plugin already properly loaded.
 * 
 */
public class Testkcklx extends GATEPluginTests {

  @Test
  public void testSomething() throws GateException {
    LanguageAnalyser pr = (LanguageAnalyser)Factory.createResource("fv1.kcklx");
    try {
      // testing code goes here
    } finally {
      Factory.deleteResource(pr);
    }
  }
}
