-include= ~${workspace}/cnf/resources/bnd/feature.props
symbolicName = io.openliberty.samlWeb2.0.internal.ee-6.0
singleton=true
WLP-DisableAllFeatures-OnConflict: false
visibility = private
-features=\
  com.ibm.websphere.appserver.servlet-3.0; ibm.tolerates:="3.1,4.0", \
  com.ibm.websphere.appserver.appSecurity-2.0; ibm.tolerates:=3.0
-bundles=\
  com.ibm.ws.org.opensaml.opensaml.2.6.1, \
  com.ibm.ws.org.opensaml.openws.1.5.6, \
  com.ibm.ws.security.saml.sso.2.0,\
  com.ibm.ws.security.saml.wab.2.0, \
  com.ibm.ws.security.common
kind=ga
edition=core
