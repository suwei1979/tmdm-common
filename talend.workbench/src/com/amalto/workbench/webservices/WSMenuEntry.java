// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.2_01, construire R40)
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;


public class WSMenuEntry {
    protected java.lang.String id;
    protected com.amalto.workbench.webservices.WSMenuMenuEntriesDescriptions[] descriptions;
    protected java.lang.String context;
    protected java.lang.String application;
    protected com.amalto.workbench.webservices.WSMenuEntry[] subMenus;
    
    public WSMenuEntry() {
    }
    
    public WSMenuEntry(java.lang.String id, com.amalto.workbench.webservices.WSMenuMenuEntriesDescriptions[] descriptions, java.lang.String context, java.lang.String application, com.amalto.workbench.webservices.WSMenuEntry[] subMenus) {
        this.id = id;
        this.descriptions = descriptions;
        this.context = context;
        this.application = application;
        this.subMenus = subMenus;
    }
    
    public java.lang.String getId() {
        return id;
    }
    
    public void setId(java.lang.String id) {
        this.id = id;
    }
    
    public com.amalto.workbench.webservices.WSMenuMenuEntriesDescriptions[] getDescriptions() {
        return descriptions;
    }
    
    public void setDescriptions(com.amalto.workbench.webservices.WSMenuMenuEntriesDescriptions[] descriptions) {
        this.descriptions = descriptions;
    }
    
    public java.lang.String getContext() {
        return context;
    }
    
    public void setContext(java.lang.String context) {
        this.context = context;
    }
    
    public java.lang.String getApplication() {
        return application;
    }
    
    public void setApplication(java.lang.String application) {
        this.application = application;
    }
    
    public com.amalto.workbench.webservices.WSMenuEntry[] getSubMenus() {
        return subMenus;
    }
    
    public void setSubMenus(com.amalto.workbench.webservices.WSMenuEntry[] subMenus) {
        this.subMenus = subMenus;
    }
}
