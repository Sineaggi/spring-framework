module spring.jms {
    exports org.springframework.jms.annotation;
    exports org.springframework.jms.config;
    exports org.springframework.jms.core;
    requires spring.context;
    requires spring.beans;
    requires spring.jcl;
    requires spring.aop;
    requires spring.core;
    requires jakarta.messaging;
    requires jakarta.resource;
    requires spring.tx;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.databind;
    requires spring.messaging;
    requires spring.oxm;
    requires micrometer.core;
    requires micrometer.observation;
}
