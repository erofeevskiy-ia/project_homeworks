package com.epam.javacore.homework.hw7.task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bill {
    private final String name;
    private final static String URI = "homework7Multithreading\\src\\main\\resources\\infobills";
    private long balance;

    public static synchronized void transaction(Bill fromBill, Bill toBill, long deposit) {
        fromBill.setBalance(fromBill.getBalance() - deposit);
        toBill.setBalance(toBill.getBalance() + deposit);

    }


    public Bill(String name) {
        this.name = name;
        this.balance = getBalanceFromXML();
    }

    public /*synchronized*/ long getBalance() {
        return balance;
    }

    public /*synchronized*/ void setBalance(long balance) {
       this.balance=balance;
    }


    private void setBalanceToXML(final long balan) throws TransformerException, FileNotFoundException {
        Element element;
        Document document=null;
        DocumentBuilder documentBuilder;
        try {

            documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            document = documentBuilder.parse(URI);
            NodeList nll1 = document.getElementsByTagName("bill");
            for (int i = 0; i < nll1.getLength(); i++) {
                element = (Element) nll1.item(i);
                if (element.getAttribute("id").equals(name)) {
                    element.setTextContent(Long.toString(balan));
                    break;
                }
            }
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
        Transformer t= TransformerFactory.newInstance().newTransformer();
        t.transform(new DOMSource(document), new StreamResult(new FileOutputStream(
                URI)));

    }

    private long getBalanceFromXML() {
        Element element;
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse(URI);
            NodeList nll1 = document.getElementsByTagName("bill");
            for (int i = 0; i < nll1.getLength(); i++) {
                element = (Element) nll1.item(i);
                if (element.getAttribute("id").equals(name))
                return Long.parseLong(element.getTextContent().trim());
            }
            return -1;
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
            return -1;
        }

    }

    public void saveAndClose(){
        try {
            setBalanceToXML(balance);
        } catch (TransformerException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
