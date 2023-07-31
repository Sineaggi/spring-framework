module spring.aop {
    exports org.springframework.aop.support;
    exports org.aopalliance.intercept;
    exports org.springframework.aop.framework;
    exports org.springframework.aop;
    exports org.springframework.aop.config;
    exports org.springframework.aop.scope;
    exports org.springframework.aop.framework.autoproxy;
    exports org.springframework.aop.target;
    exports org.springframework.aop.interceptor;
    exports org.aopalliance.aop;
    exports org.springframework.aop.support.annotation;
    exports org.springframework.aop.target.dynamic;
    requires spring.core;
    requires org.aspectj.weaver;
    requires spring.jcl;
    requires spring.beans;
    requires java.xml;
    requires java.compiler;
}
