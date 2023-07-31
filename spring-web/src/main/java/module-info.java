module spring.web {
    requires spring.core;
    requires org.apache.httpcomponents.client5.httpclient5;
    requires org.apache.httpcomponents.core5.httpcore5;
    requires spring.beans;
    requires java.net.http;
    requires org.eclipse.jetty.client;
    requires org.reactivestreams;
    requires spring.context;
    requires org.eclipse.jetty.reactive.client;
    requires reactor.core;
    requires spring.jcl;
    requires io.netty.codec.http;
    requires io.netty.buffer;
    requires reactor.netty.core;
    requires reactor.netty.http;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.dataformat.cbor;
    requires kotlinx.serialization.cbor;
    requires com.fasterxml.jackson.dataformat.smile;
    requires kotlinx.serialization.json;
    requires kotlinx.serialization.protobuf;
    requires jakarta.xml.bind;
    requires com.fasterxml.aalto;
    requires java.desktop;
    requires com.fasterxml.jackson.dataformat.xml;
    requires jakarta.json.bind;
    requires jakarta.servlet;
    requires jakarta.faces.api;
    // requires org.apache.tomcat.embed.core; // can't cuz this also has jakarta.servlet the fucking bastards
    // todo: requires protobuf.java;
}
