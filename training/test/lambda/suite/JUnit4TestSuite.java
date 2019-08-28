package lambda.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(value = {
        lambda.exercises.A_Lambdas.class,
        lambda.exercises.B_Comparators.class,
        lambda.exercises.C_DefaultMethods.class,
        lambda.exercises.D_SimpleStreams.class,
        lambda.exercises.E_IntermediateStreams.class,
        lambda.exercises.F_AdvancedStreams.class,
        lambda.exercises.G_MatcherScanner.class,
        lambda.exercises.H_Challenges.class
})
public class JUnit4TestSuite {
}
