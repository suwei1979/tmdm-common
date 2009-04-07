// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.2_01, construire R40)
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.xsd.XSDConstants;
import com.sun.xml.rpc.encoding.literal.*;
import com.sun.xml.rpc.encoding.literal.DetailFragmentDeserializer;
import com.sun.xml.rpc.encoding.simpletype.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;
import java.util.List;
import java.util.ArrayList;

public class WSPutTransformerV2_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final QName ns1_wsTransformerV2_QNAME = new QName("", "wsTransformerV2");
    private static final QName ns2_WSTransformerV2_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSTransformerV2");
    private CombinedSerializer ns2_myWSTransformerV2_LiteralSerializer;
    
    public WSPutTransformerV2_LiteralSerializer(QName type, String encodingStyle) {
        this(type, encodingStyle, false);
    }
    
    public WSPutTransformerV2_LiteralSerializer(QName type, String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns2_myWSTransformerV2_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.workbench.webservices.WSTransformerV2.class, ns2_WSTransformerV2_TYPE_QNAME);
    }
    
    public Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSPutTransformerV2 instance = new com.amalto.workbench.webservices.WSPutTransformerV2();
        Object member=null;
        QName elementName;
        List values;
        Object value;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_wsTransformerV2_QNAME)) {
                member = ns2_myWSTransformerV2_LiteralSerializer.deserialize(ns1_wsTransformerV2_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setWsTransformerV2((com.amalto.workbench.webservices.WSTransformerV2)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_wsTransformerV2_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (Object)instance;
    }
    
    public void doSerializeAttributes(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSPutTransformerV2 instance = (com.amalto.workbench.webservices.WSPutTransformerV2)obj;
        
    }
    public void doSerialize(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSPutTransformerV2 instance = (com.amalto.workbench.webservices.WSPutTransformerV2)obj;
        
        if (instance.getWsTransformerV2() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns2_myWSTransformerV2_LiteralSerializer.serialize(instance.getWsTransformerV2(), ns1_wsTransformerV2_QNAME, null, writer, context);
    }
}
