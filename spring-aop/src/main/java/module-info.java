module spring.aop {
	requires java.compiler;
	requires java.xml;
	requires org.aspectj.weaver;
	requires spring.beans;
	requires spring.core;
	requires spring.jcl;

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
