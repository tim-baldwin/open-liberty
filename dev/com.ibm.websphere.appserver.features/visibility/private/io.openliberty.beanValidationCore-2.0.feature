-include= ~${workspace}/cnf/resources/bnd/feature.props
symbolicName=io.openliberty.beanValidationCore-2.0
IBM-App-ForceRestart: install, \
 uninstall
-features=com.ibm.websphere.appserver.injection-2.0, \
 com.ibm.websphere.appserver.containerServices-1.0, \
 com.ibm.websphere.appserver.classloading-1.0, \
 com.ibm.websphere.appserver.anno-2.0
-bundles=com.ibm.ws.org.apache.commons.lang3, \
 com.ibm.ws.managedobject, \
 com.ibm.ws.org.apache.commons.beanutils.1.9.4, \
 com.ibm.ws.org.apache.commons.collections, \
 com.ibm.ws.javaee.dd, \
 com.ibm.ws.javaee.dd.common, \
 io.openliberty.org.apache.commons.logging, \
 com.ibm.ws.beanvalidation.jakarta
kind=beta
edition=core
WLP-Activation-Type: parallel
