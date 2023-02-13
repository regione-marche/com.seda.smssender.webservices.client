/**
 * SMSSenderServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.smssender.webservices.source;

public class SMSSenderServiceLocator extends org.apache.axis.client.Service implements com.seda.smssender.webservices.source.SMSSenderService {

    public SMSSenderServiceLocator() {
    }


    public SMSSenderServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SMSSenderServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SMSSenderPort
    private java.lang.String SMSSenderPort_address = "http://10.10.9.107:9081/SMSSender/service";

    public java.lang.String getSMSSenderPortAddress() {
        return SMSSenderPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SMSSenderPortWSDDServiceName = "SMSSenderPort";

    public java.lang.String getSMSSenderPortWSDDServiceName() {
        return SMSSenderPortWSDDServiceName;
    }

    public void setSMSSenderPortWSDDServiceName(java.lang.String name) {
        SMSSenderPortWSDDServiceName = name;
    }

    public com.seda.smssender.webservices.source.SMSSenderInterface getSMSSenderPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SMSSenderPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSMSSenderPort(endpoint);
    }

    public com.seda.smssender.webservices.source.SMSSenderInterface getSMSSenderPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.seda.smssender.webservices.source.SMSSenderSOAPBindingStub _stub = new com.seda.smssender.webservices.source.SMSSenderSOAPBindingStub(portAddress, this);
            _stub.setPortName(getSMSSenderPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSMSSenderPortEndpointAddress(java.lang.String address) {
        SMSSenderPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.seda.smssender.webservices.source.SMSSenderInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.seda.smssender.webservices.source.SMSSenderSOAPBindingStub _stub = new com.seda.smssender.webservices.source.SMSSenderSOAPBindingStub(new java.net.URL(SMSSenderPort_address), this);
                _stub.setPortName(getSMSSenderPortWSDDServiceName());
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
        if ("SMSSenderPort".equals(inputPortName)) {
            return getSMSSenderPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://source.webservices.smssender.seda.com", "SMSSenderService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://source.webservices.smssender.seda.com", "SMSSenderPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SMSSenderPort".equals(portName)) {
            setSMSSenderPortEndpointAddress(address);
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
