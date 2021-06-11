/*******************************************************************************
 * Copyright (c) 2012, 2021 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.javaee.ddmodel.app;

import com.ibm.ws.javaee.dd.app.Application;
import com.ibm.ws.javaee.ddmodel.DDParser;
import com.ibm.ws.javaee.version.JavaEEVersion;
import com.ibm.wsspi.adaptable.module.Container;
import com.ibm.wsspi.adaptable.module.Entry;

public class ApplicationDDParser extends DDParser {
    public static final String APPLICATION_DTD_PUBLIC_ID_12 =
        "-//Sun Microsystems, Inc.//DTD J2EE Application 1.2//EN";
    public static final String APPLICATION_DTD_PUBLIC_ID_13 =
        "-//Sun Microsystems, Inc.//DTD J2EE Application 1.3//EN";

    private static final VersionData[] VERSION_DATA = {
        new VersionData("1.2", APPLICATION_DTD_PUBLIC_ID_12, null, Application.VERSION_1_2, JavaEEVersion.VERSION_1_2_INT),    
        new VersionData("1.3", APPLICATION_DTD_PUBLIC_ID_13, null, Application.VERSION_1_3, JavaEEVersion.VERSION_1_3_INT),

        new VersionData("1.4", null, NAMESPACE_SUN_J2EE,   Application.VERSION_1_4, JavaEEVersion.VERSION_1_4_INT),            
        new VersionData("5",   null, NAMESPACE_SUN_JAVAEE, Application.VERSION_5, JavaEEVersion.VERSION_5_0_INT),                    
        new VersionData("6",   null, NAMESPACE_SUN_JAVAEE, Application.VERSION_6, JavaEEVersion.VERSION_6_0_INT),                            
        new VersionData("7",   null, NAMESPACE_JCP_JAVAEE, Application.VERSION_7, JavaEEVersion.VERSION_7_0_INT),                            
        new VersionData("8",   null, NAMESPACE_JCP_JAVAEE, Application.VERSION_8, JavaEEVersion.VERSION_8_0_INT),                            
        
        new VersionData("9", null, NAMESPACE_JAKARTA, Application.VERSION_9, JavaEEVersion.VERSION_9_0_INT)
    };

    @Override
    protected VersionData[] getVersionData() {
        return VERSION_DATA;
    }

    /**
     * Obtain the runtime version which corresponds to
     * a specified maximum supported schema version.
     *
     * @param schemaVersion The maximum supported schema version.
     *
     * @return The runtime version which corresponds to
     *     the specified maximum schema version.
     */
    protected static int getRuntimeVersion(int schemaVersion) {
        if ( schemaVersion > Application.VERSION_9 ) {
            throw new IllegalArgumentException("Unsupported Application version [ " + schemaVersion + " ]");
        } else if ( schemaVersion < Application.VERSION_6 ) {
            return JavaEEVersion.VERSION_6_0_INT;
        } else {
            // Application schema versions are the same as the corresponding
            // platform versions.
            return schemaVersion;
        }
    }        
        
    protected static int adjustSchemaVersion(int maxSchemaVersion) {
        return ( (maxSchemaVersion < Application.VERSION_6) ? Application.VERSION_6 : maxSchemaVersion );
    }
        
    public ApplicationDDParser(Container ddRootContainer, Entry ddEntry, int maxSchemaVersion)
        throws ParseException {

        super( ddRootContainer, ddEntry,
               adjustSchemaVersion(maxSchemaVersion),
               getRuntimeVersion(maxSchemaVersion) );
    }

    @Override
    public ApplicationType parse() throws ParseException {
        return (ApplicationType) super.parse();
    }

    @Override
    protected void validateRootElementName() throws ParseException {
        if ( !"application".equals(rootElementLocalName) ) {
            throw new ParseException(invalidRootElement());
        }
    }
    
    @Override
    protected ParsableElement createRootElement() {
        return new ApplicationType( getDeploymentDescriptorPath() );
    }
}
