/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.schoolpro.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;

/**
 *
 * @author training
 */
public class SchemaExportUtil {
    
    public static void exportSchema(ApplicationContext applicationContext){
        LocalSessionFactoryBean sessionFacatory = (LocalSessionFactoryBean) applicationContext.getBean("sessionFactory");
        Configuration configuration = sessionFacatory.getConfiguration();
        SchemaExport schemaExport = new SchemaExport(configuration);
        schemaExport.setDelimiter(",");
        schemaExport.create(true,true);
    }
    
}
