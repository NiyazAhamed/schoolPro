/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.schoolpro.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.springframework.beans.factory.BeanNotOfRequiredTypeException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;

/**
 *
 * @author training
 */
public class SchemaExportUtil {

    public static void main(String args[]) {

        SchemaExportUtil util = new SchemaExportUtil();
        util.exportSchema();
    }

    public void exportSchema() {


        ConfigurableApplicationContext context = null;

        try {
            context = new ClassPathXmlApplicationContext("classpath:schemaExportContext.xml");
            LocalSessionFactoryBean sessionFacatory = (LocalSessionFactoryBean) context.getBean("&sessionFactory");
            Configuration configuration = sessionFacatory.getConfiguration();
            SchemaExport schemaExport = new SchemaExport(configuration);
            schemaExport.setDelimiter(",");
            schemaExport.create(true, false);
        } catch (BeanNotOfRequiredTypeException e) {
            e.printStackTrace();
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            if (context != null) {
                context.close();
            }
        }
    }
}
