module spring.context.support {
    exports org.springframework.ui.freemarker;
    requires freemarker;
    requires spring.jcl;
    requires spring.core;
    requires spring.beans;
    requires spring.context;
    requires spring.tx;
    requires com.github.benmanes.caffeine;
    requires spring.aop;
	requires spring.jdbc;
    requires java.sql;
    // requires quartz;
	// requires cache.api;
    requires jakarta.activation;
    requires java.desktop;
    requires jakarta.mail;
}
