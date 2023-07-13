package dev.roshin;

import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.filter.Filters;
import org.jdom2.input.SAXBuilder;
import org.jdom2.xpath.XPathFactory;
import org.jdom2.xpath.XPathExpression;

import java.util.List;

public class JDOM2XPathExample {
    public static void main(String[] args) {

        SAXBuilder saxBuilder = new SAXBuilder();
        try {
            Document document = saxBuilder.build("books.xml");

            // creating an XPathFactory instance
            XPathFactory xFactory = XPathFactory.instance();

            // create an XPathExpression instance
            XPathExpression<Element> expr = xFactory.compile("//title", Filters.element());

            // evaluate the xpath and get the results
            List<Element> elements = expr.evaluate(document);

            for(Element element : elements){
                System.out.println(element.getText());
            }

        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}