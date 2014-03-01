package org.jenkinsci.test.acceptance.steps;

import cucumber.api.java.en.And;

import javax.inject.Inject;

/**
 * @author Kohsuke Kawaguchi
 */
public class JobConfigurationSteps extends AbstractSteps {
    @Inject
    GeneralSteps generalsteps;

    @And("^I add a shell build step \"([^\"]*)\"$")
    public void I_add_a_shell_build_step(String shell) throws Exception {
        my.step = my.job.addShellStep(shell);
    }

    @And("^I enable concurrent builds$")
    public void I_enable_concurrent_builds() throws Exception {
        generalsteps.checkTheCheckbox("_.concurrentBuild");
    }
}
