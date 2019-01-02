/**
 * HolaMundoFacilitoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.webservicespractica2;

public class HolaMundoFacilitoServiceLocator extends org.apache.axis.client.Service implements com.webservicespractica2.HolaMundoFacilitoService {

    public HolaMundoFacilitoServiceLocator() {
    }


    public HolaMundoFacilitoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HolaMundoFacilitoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HolaMundoFacilito
    private java.lang.String HolaMundoFacilito_address = "http://localhost:8080/WebServicesPractica2/services/HolaMundoFacilito";

    public java.lang.String getHolaMundoFacilitoAddress() {
        return HolaMundoFacilito_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HolaMundoFacilitoWSDDServiceName = "HolaMundoFacilito";

    public java.lang.String getHolaMundoFacilitoWSDDServiceName() {
        return HolaMundoFacilitoWSDDServiceName;
    }

    public void setHolaMundoFacilitoWSDDServiceName(java.lang.String name) {
        HolaMundoFacilitoWSDDServiceName = name;
    }

    public com.webservicespractica2.HolaMundoFacilito getHolaMundoFacilito() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HolaMundoFacilito_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHolaMundoFacilito(endpoint);
    }

    public com.webservicespractica2.HolaMundoFacilito getHolaMundoFacilito(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.webservicespractica2.HolaMundoFacilitoSoapBindingStub _stub = new com.webservicespractica2.HolaMundoFacilitoSoapBindingStub(portAddress, this);
            _stub.setPortName(getHolaMundoFacilitoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHolaMundoFacilitoEndpointAddress(java.lang.String address) {
        HolaMundoFacilito_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.webservicespractica2.HolaMundoFacilito.class.isAssignableFrom(serviceEndpointInterface)) {
                com.webservicespractica2.HolaMundoFacilitoSoapBindingStub _stub = new com.webservicespractica2.HolaMundoFacilitoSoapBindingStub(new java.net.URL(HolaMundoFacilito_address), this);
                _stub.setPortName(getHolaMundoFacilitoWSDDServiceName());
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
        if ("HolaMundoFacilito".equals(inputPortName)) {
            return getHolaMundoFacilito();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservicespractica2.com", "HolaMundoFacilitoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservicespractica2.com", "HolaMundoFacilito"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HolaMundoFacilito".equals(portName)) {
            setHolaMundoFacilitoEndpointAddress(address);
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
