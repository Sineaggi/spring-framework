module spring.oxm {
    exports org.springframework.oxm;
    requires java.xml;
    requires spring.beans;
    requires spring.core;
    requires jakarta.xml.bind;
    requires java.desktop;
    requires spring.jcl;
    //requires xstream;
}
