module spring.core.test {
    exports org.springframework.aot.test.agent;
    requires org.assertj.core;
    requires spring.core;
    requires com.thoughtworks.qdox;
    requires java.compiler;
    requires org.junit.jupiter.api;
    requires org.junit.jupiter.params;
    requires org.junit.platform.launcher;
    requires java.instrument;
}
