module spring.aop {
	requires java.compiler;
	requires java.xml;
	requires org.aspectj.weaver;
	requires spring.beans;
	requires spring.core;
	requires spring.jcl;
	requires static kotlinx.coroutines.core;
    requires static kotlinx.coroutines.reactive;
    requires static kotlinx.coroutines.reactor;
    requires static org.reactivestreams;
    requires static reactor.core;
    requires org.apache.commons.pool2;

    exports org.aopalliance.aop;
	exports org.aopalliance.intercept;
	exports org.springframework.aop.config;
	exports org.springframework.aop.framework.autoproxy;
	exports org.springframework.aop.framework;
	exports org.springframework.aop.interceptor;
	exports org.springframework.aop.scope;
	exports org.springframework.aop.support.annotation;
	exports org.springframework.aop.support;
	exports org.springframework.aop.target.dynamic;
	exports org.springframework.aop.target;
	exports org.springframework.aop;
}
