module spring.jcl {
	requires java.logging; // todo: validate we actually need java.logging
	requires static org.apache.logging.log4j;
	requires static org.slf4j;

	exports org.apache.commons.logging.impl
			to spring.core;
	exports org.apache.commons.logging;
}
