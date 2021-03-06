package fitnesse.reporting;

import fitnesse.testsystems.TestSystemListener;

/**
 * This factory is instantiated as FitNesse component, hence can use constructor arguments.
 *
 * Optionally implement java.io.Closeable and/or fitnesse.testrunner.TestsRunnerListener.
 */
public interface Formatter extends TestSystemListener {

}
