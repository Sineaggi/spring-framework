module spring.websocket {
    requires spring.core;
    requires spring.jcl;
    requires spring.web;
    requires spring.beans;
    requires java.xml;
    requires spring.context;
    requires jakarta.servlet;
    requires spring.webmvc;
    requires spring.messaging;
    requires org.eclipse.jetty.ee10.websocket.jetty.server;
    requires jakarta.websocket;
    requires org.glassfish.tyrus.core;
    requires org.glassfish.tyrus.spi;
    requires org.glassfish.tyrus.server;
    requires org.apache.tomcat.websocket;
    requires org.eclipse.jetty.client;
    requires org.glassfish.tyrus.container.servlet;
    requires org.eclipse.jetty.websocket.core.common;
    requires org.eclipse.jetty.websocket.common;
    requires com.fasterxml.jackson.databind;
    requires undertow.websockets.jsr;
}
