/*******************************************************************************
 * Copyright (c) 2017, 2021 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
// NOTE: This is a generated file. Do not edit it directly.
package com.ibm.ws.javaee.ddmodel.clientbnd;

import com.ibm.ws.javaee.dd.client.ApplicationClient;
import com.ibm.ws.javaee.ddmodel.DDParser;
import com.ibm.wsspi.adaptable.module.Container;
import com.ibm.wsspi.adaptable.module.Entry;

public class ApplicationClientBndDDParser extends DDParser {
    private final boolean xmi;

    public ApplicationClientBndDDParser(Container ddRootContainer, Entry ddEntry, boolean xmi) throws DDParser.ParseException {
        super(ddRootContainer, ddEntry, ApplicationClient.class);
        this.xmi = xmi;
    }

    @Override
    public ApplicationClientBndType parse() throws ParseException {
        super.parseRootElement();

        return (ApplicationClientBndType) rootParsable;
    }

    @Override
    protected ApplicationClientBndType createRootParsable() throws ParseException {
        if (!xmi && "application-client-bnd".equals(rootElementLocalName)) {
            return createXMLRootParsable();
        } else if (xmi && "ApplicationClientBinding".equals(rootElementLocalName)) {
            ApplicationClientBndType rootParsableElement = createXMIRootParsable();
            namespace = null;
            idNamespace = "http://www.omg.org/XMI";
            return rootParsableElement;
        } else {
            throw new ParseException(invalidRootElement());
        }
    }

    private ApplicationClientBndType createXMLRootParsable() throws ParseException {
        if (namespace == null) {
            throw new ParseException(missingDeploymentDescriptorNamespace());
        }
        String versionString = getAttributeValue("", "version");
        if (versionString == null) {
            throw new ParseException(missingDeploymentDescriptorVersion());
        }
        if ("http://websphere.ibm.com/xml/ns/javaee".equals(namespace)) {
            if ("1.0".equals(versionString)) {
                version = 10;
                return new ApplicationClientBndType(getDeploymentDescriptorPath());
            }
            if ("1.1".equals(versionString)) {
                version = 11;
                return new ApplicationClientBndType(getDeploymentDescriptorPath());
            }
            if ("1.2".equals(versionString)) {
                version = 12;
                return new ApplicationClientBndType(getDeploymentDescriptorPath());
            }
            throw new ParseException(invalidDeploymentDescriptorVersion(versionString));
        }
        throw new ParseException(invalidDeploymentDescriptorNamespace(versionString));
    }

    private ApplicationClientBndType createXMIRootParsable() throws ParseException {
        if (namespace == null) {
            throw new ParseException(missingDeploymentDescriptorNamespace());
        }
        if ("clientbnd.xmi".equals(namespace)) {
            version = 9;
            return new ApplicationClientBndType(getDeploymentDescriptorPath(), true);
        }
        throw new ParseException(missingDeploymentDescriptorVersion());
    }

    @Override
    protected VersionData[] getVersionData() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected void validateRootElementName() throws ParseException {
        // TODO Auto-generated method stub
    }

    @Override
    protected ApplicationClientBndType createRootElement() {
        // TODO Auto-generated method stub
        return null;
    }
}
