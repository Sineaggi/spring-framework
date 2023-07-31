module spring.core {
	// todo: check how much of this is required
    requires java.xml;
    requires spring.spring.jcl.main;
	requires kotlin.stdlib;
    requires kotlin.reflect;
    requires jdk.jfr;
    requires org.reactivestreams;
    requires reactor.core;
    requires kotlinx.coroutines.reactor;
    requires kotlinx.coroutines.core;
    requires java.desktop;
    requires joptsimple;
}
