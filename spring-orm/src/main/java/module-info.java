module spring.orm {
    requires jakarta.transaction;
    requires org.hibernate.orm.core;
    requires spring.core;
    requires spring.tx;
    requires jakarta.persistence;
    requires spring.jcl;
    requires spring.beans;
    requires spring.jdbc;
    requires spring.context;
    requires spring.aop;
    requires jakarta.servlet;
    requires jakarta.validation;
    requires spring.web;
    requires java.desktop;
    requires java.compiler;
    requires static org.graalvm.sdk;
    requires org.eclipse.persistence.core;
    requires org.eclipse.persistence.jpa;
}
