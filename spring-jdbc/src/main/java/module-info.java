module spring.jdbc {
    exports org.springframework.jdbc.support;
    exports org.springframework.jdbc.datasource;
    exports org.springframework.jdbc.datasource.lookup;
    exports org.springframework.jdbc.core;
    exports org.springframework.jdbc.datasource.init;
    exports org.springframework.jdbc.core.simple;
    requires java.sql;
    requires spring.tx;
    requires spring.core;
    requires spring.beans;
    requires spring.context;
    requires java.desktop;
    requires spring.jcl;
    requires java.sql.rowset;
    requires org.apache.derby.tools;
}
