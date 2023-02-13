/**
 * SMSSenderService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.smssender.webservices.source;

public interface SMSSenderService extends javax.xml.rpc.Service {
    public java.lang.String getSMSSenderPortAddress();

    public com.seda.smssender.webservices.source.SMSSenderInterface getSMSSenderPort() throws javax.xml.rpc.ServiceException;

    public com.seda.smssender.webservices.source.SMSSenderInterface getSMSSenderPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
