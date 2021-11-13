package formato_xml;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class Formato_XML {

    //ubicación del archivo 
    public static final String xmlFilePath = "E:\\ciencias computacionales\\Tercer semestre\\Laboratorio de Programación Orientado a Objetos\\Practicas\\xmlfie.xml";
    
    public static void main(String[] args) {
        
        int opc,i,j,num;
        String matr,sem,nom;
        Scanner sc = new Scanner(System.in);
        
        try 
        {
            // crear archivo xml
            
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
           
            DOMImplementation implementation = builder.getDOMImplementation();
            Document documento = implementation.createDocument(null, "UANL", null);
            documento.setXmlVersion("1.0");
            
            Element alumnos = documento.createElement("Alumnos");
            
            
            System.out.println("Ingrese el numero de alumnos a ingresar: ");
            num = sc.nextInt();
            for (i = 0; i < num; i++)
            {
                Element alumno = documento.createElement("Alumno");
                Element matricula = documento.createElement("matricula");
                System.out.println("Ingrese la matricula del alumno");
                matr = sc.next();
                Text textMatricula  = documento.createTextNode(matr);
                matricula.appendChild(textMatricula);
                alumno.appendChild(matricula);
            
                Element semestre = documento.createElement("Semestre");
                System.out.println("Ingrese el semestre  del alumno");
                sem = sc.next();
                Text textSemestre  = documento.createTextNode(sem + " semestre");
                semestre.appendChild(textSemestre);
                alumno.appendChild(semestre);
            
                Element nombre = documento.createElement("Nombre");
                System.out.println("Ingrese el nombre del alumno");
                nom = sc.next();
                Text textNombre  = documento.createTextNode(nom);
                nombre.appendChild(textNombre);
                alumno.appendChild(nombre);
            
                alumnos.appendChild(alumno);
            }
            
            
            documento.getDocumentElement().appendChild(alumnos);
            
            
            Source source = new DOMSource(documento);
            Result result = new StreamResult( new File(xmlFilePath));
            
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
            
            System.out.println("Archivo XML creado\n");
            
            //leer archivo xml
            
            Document documentos = builder.parse(new File (xmlFilePath));
            
            NodeList listaAlumnos = documentos.getElementsByTagName("Alumno");
            
            for ( i = 0; i < listaAlumnos.getLength(); i++)
            {
                Node nodo = listaAlumnos.item(i);
                if(nodo.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element e = (Element) nodo;
                    NodeList hijos = e.getChildNodes();
                    for( j = 0; j < hijos.getLength(); j++)
                    {
                        Node hijo = hijos.item(j);
                        if (hijo.getNodeType() == Node.ELEMENT_NODE)
                        {
                            Element eHijo = (Element) hijo;
                            System.out.println("Propiedad: " + eHijo.getNodeName() + ", Valor: " + eHijo.getTextContent());
                        }
                    }
                    System.out.println();
                    
                }
                
                
            }
            
        } catch (ParserConfigurationException | SAXException | IOException | TransformerException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
