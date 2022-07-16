package io.tpd.dadjokes.jokes;

import org.springframework.stereotype.Component;

import no.finn.unleash.Unleash;

@Component
public class  DadJokesAppConfiguration {

    private final Unleash unleash;

    public DadJokesAppConfiguration(final Unleash unleash) {
        this.unleash = unleash;
    }

    public boolean releaseToggleEnabled() {
        return unleash.isEnabled("test_1_toggle");
    }
    public boolean version2Enabled() {
        return unleash.isEnabled("Version2");
    }

    public boolean featurePermissionsEnabled() {
        return unleash.isEnabled("FeaturePermissions");
    }

}
