module spring.beans {
    exports org.springframework.beans.factory;
    exports org.springframework.beans.factory.annotation;
    exports org.springframework.beans.factory.config;
    exports org.springframework.beans;
    exports org.springframework.beans.factory.aot;
    exports org.springframework.beans.factory.support;
    exports org.springframework.beans.factory.xml;
    exports org.springframework.beans.factory.parsing;
    exports org.springframework.beans.support;
    exports org.springframework.beans.factory.groovy;
    exports org.springframework.beans.propertyeditors;
    requires spring.jcl;
	requires spring.core;
	requires kotlin.stdlib;
	requires kotlin.reflect;
	requires java.desktop;
	requires java.compiler;
	requires java.prefs;
	requires jakarta.inject;
	requires org.yaml.snakeyaml;
	requires org.apache.groovy;
}
