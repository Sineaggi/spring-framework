module spring.tx {
    exports org.springframework.transaction.jta;
    exports org.springframework.dao;
    exports org.springframework.dao.support;
    exports org.springframework.transaction.support;
    exports org.springframework.transaction;
    exports org.springframework.transaction.reactive;
    exports org.springframework.jca.endpoint;
    requires spring.aop;
    requires spring.beans;
    requires spring.core;
    requires spring.context;
    requires spring.jcl;
    requires jakarta.transaction;
    requires jakarta.resource;
    requires jakarta.ejb;
    requires kotlin.stdlib;
    requires kotlinx.coroutines.core;
    requires kotlinx.coroutines.reactive;
    requires kotlinx.coroutines.reactor;
    requires org.reactivestreams;
    requires reactor.core;
    requires java.desktop;
    requires io.vavr;
}
