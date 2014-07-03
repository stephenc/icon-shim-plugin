package org.jenkinsci.plugins.iconshim;

import org.apache.commons.jelly.JellyTagException;
import org.apache.commons.jelly.MissingAttributeException;
import org.apache.commons.jelly.TagSupport;
import org.apache.commons.jelly.XMLOutput;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/**
 * @author Stephen Connolly
 */
public class IconTag extends TagSupport {

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void doTag(XMLOutput xml) throws MissingAttributeException, JellyTagException {
        try {
            final AttributesImpl attributes = new AttributesImpl();
            attributes.addAttribute("", "src", "", null, url);
            xml.startElement("img", attributes);
            xml.endElement("img");
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
