module spring.jdbc {
    exports org.springframework.jdbc.support;
    exports org.springframework.jdbc.datasource;
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
