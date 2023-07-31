module spring.messaging {
    exports org.springframework.messaging.handler.annotation.support;
    exports org.springframework.messaging.handler.invocation;
    exports org.springframework.messaging.handler.annotation;
    exports org.springframework.messaging;
    exports org.springframework.messaging.core;
    exports org.springframework.messaging.support;
    exports org.springframework.messaging.converter;
    requires spring.core;
    requires spring.jcl;
    requires com.google.gson;
    requires jakarta.json.bind;
    requires kotlinx.serialization.core;
    requires kotlinx.serialization.json;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires spring.beans;
    requires java.xml;
    requires spring.oxm;
    requires spring.context;
    requires reactor.core;
    requires spring.aop;
    requires spring.expression;
    requires org.reactivestreams;
    requires com.google.protobuf;
    requires com.google.protobuf.util;
}
