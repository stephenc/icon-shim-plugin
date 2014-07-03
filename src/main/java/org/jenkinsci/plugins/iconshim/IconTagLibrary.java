package org.jenkinsci.plugins.iconshim;

import org.apache.commons.jelly.JellyContext;
import org.apache.commons.jelly.TagLibrary;

/**
 * @author Stephen Connolly
 */
public class IconTagLibrary extends TagLibrary {
    public IconTagLibrary() {
        registerTag("icon", IconTag.class);
    }

    public static void ensureRegistered(JellyContext context) {
        if (!context.isTagLibraryRegistered("jelly:org.jenkinsci.plugins.iconshim.IconTagLibrary")) {
            context.registerTagLibrary("jelly:org.jenkinsci.plugins.iconshim.IconTagLibrary", new IconTagLibrary());
        }
    }
}
