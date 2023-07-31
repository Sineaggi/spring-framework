module spring.spring.jcl.main {
    exports org.apache.commons.logging;
    exports org.apache.commons.logging.impl;

    requires static org.slf4j;
    requires static org.apache.logging.log4j;
    requires java.logging; // todo: validate we actually need java.logging
}
