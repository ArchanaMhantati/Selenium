package archana.javaprograms.stringprograms;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class InverseStringUsingStringBuilderAndBuffer {
    public static void main(String[] args) {
        String name = "Mhantati";
        StringBuilder obj = new StringBuilder("Archana Mhantati");
            System.out.println(obj.reverse());
        StringBuffer obj1 = new StringBuffer(name);
        System.out.println(obj1.reverse());
    }
}
