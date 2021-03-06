/**
 * LoginRemoteServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class LoginRemoteServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.dfa.axis.v1_19.LoginRemoteService {

    public LoginRemoteServiceLocator() {
    }


    public LoginRemoteServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LoginRemoteServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for login
    private java.lang.String login_address = "https://advertisersapi.doubleclick.net/v1.19/api/dfa-api/login";

    public java.lang.String getloginAddress() {
        return login_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String loginWSDDServiceName = "login";

    public java.lang.String getloginWSDDServiceName() {
        return loginWSDDServiceName;
    }

    public void setloginWSDDServiceName(java.lang.String name) {
        loginWSDDServiceName = name;
    }

    public com.google.api.ads.dfa.axis.v1_19.LoginRemote getlogin() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(login_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getlogin(endpoint);
    }

    public com.google.api.ads.dfa.axis.v1_19.LoginRemote getlogin(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.dfa.axis.v1_19.LoginSoapBindingStub _stub = new com.google.api.ads.dfa.axis.v1_19.LoginSoapBindingStub(portAddress, this);
            _stub.setPortName(getloginWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setloginEndpointAddress(java.lang.String address) {
        login_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.dfa.axis.v1_19.LoginRemote.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.dfa.axis.v1_19.LoginSoapBindingStub _stub = new com.google.api.ads.dfa.axis.v1_19.LoginSoapBindingStub(new java.net.URL(login_address), this);
                _stub.setPortName(getloginWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("login".equals(inputPortName)) {
            return getlogin();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "LoginRemoteService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "login"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("login".equals(portName)) {
            setloginEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
