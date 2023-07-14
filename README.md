# XML XPath Java Examples

This project demonstrates how to use different XML processing libraries with XPath in Java applications. These applications read an XML file and use XPath expressions to select certain elements.

## Prerequisites

You need to have Java 17 and Maven installed on your system to build and run this project.

## Dependencies

This project uses the following dependencies:

- JDOM2: A Java library for processing XML data. To use XPath with JDOM2, it requires the Jaxen library.
- Jaxen: A Java XPath Library, used in conjunction with JDOM2 for XPath processing.
- Apache Xerces: A set of software libraries for parsing, validating, serializing, and manipulating XML. Xerces is a standalone library that includes its own XPath processing capabilities.

These dependencies are specified in the `pom.xml` file and will be automatically downloaded by Maven.

Additionally, one of the examples uses Java's built-in DOM and XPath libraries, which do not require any additional dependencies.

## Running the Project

1. Clone the project to your local machine.
2. Navigate to the project directory in your terminal.
3. Run `mvn clean install` to build the project and download the dependencies.
4. Run the project. You may need to specify the main class in your run configuration. The main classes are `JDOM2XPathExample`, `XercesXPathExample`, and `BuiltInDOMXPathExample`.

## Using the Project

The `JDOM2XPathExample`, `XercesXPathExample`, and `BuiltInDOMXPathExample` classes read an XML file and evaluate an XPath expression to select elements. You can modify the XPath expression and the XML file path in these classes to suit your needs.

In the current setup, the XML file contains a list of books and the XPath expression selects all book titles.

## License

This project is open source, under the MIT license.
