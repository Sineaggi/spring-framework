module spring.jcl {
	exports org.apache.commons.logging.impl;
	exports org.apache.commons.logging;

	requires java.logging; // todo: validate we actually need java.loggin
	requires static org.apache.logging.log4j;
	requires static org.slf4j;
}
