/*
 * Copyright (c) 2026 Ivan Boyko.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */
package io.ivanbyone.ghook;

import io.ivanbyone.ghook.types.ConfigFormat;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Initialize Ghook Maven Plugin configuration file if not exists.
 *
 * @author Ivan Boyko
 */
@Mojo(name = "init", threadSafe = true)
public class GhookInitializeMojo extends AbstractMojo {

    /* Provide configuration file format (".yaml" set as default) */
    @Parameter(defaultValue = "yaml")
    private ConfigFormat configFormat;

    @Override
    public void execute() throws MojoFailureException {

    }
}
