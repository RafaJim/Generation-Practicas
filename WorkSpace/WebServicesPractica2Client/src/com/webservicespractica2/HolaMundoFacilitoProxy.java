package com.webservicespractica2;

public class HolaMundoFacilitoProxy implements com.webservicespractica2.HolaMundoFacilito {
  private String _endpoint = null;
  private com.webservicespractica2.HolaMundoFacilito holaMundoFacilito = null;
  
  public HolaMundoFacilitoProxy() {
    _initHolaMundoFacilitoProxy();
  }
  
  public HolaMundoFacilitoProxy(String endpoint) {
    _endpoint = endpoint;
    _initHolaMundoFacilitoProxy();
  }
  
  private void _initHolaMundoFacilitoProxy() {
    try {
      holaMundoFacilito = (new com.webservicespractica2.HolaMundoFacilitoServiceLocator()).getHolaMundoFacilito();
      if (holaMundoFacilito != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)holaMundoFacilito)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)holaMundoFacilito)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (holaMundoFacilito != null)
      ((javax.xml.rpc.Stub)holaMundoFacilito)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.webservicespractica2.HolaMundoFacilito getHolaMundoFacilito() {
    if (holaMundoFacilito == null)
      _initHolaMundoFacilitoProxy();
    return holaMundoFacilito;
  }
  
  public java.lang.String mostrarMensajeRaro() throws java.rmi.RemoteException{
    if (holaMundoFacilito == null)
      _initHolaMundoFacilitoProxy();
    return holaMundoFacilito.mostrarMensajeRaro();
  }
  
  
}