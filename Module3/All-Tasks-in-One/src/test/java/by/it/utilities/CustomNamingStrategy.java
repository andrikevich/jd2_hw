package by.it.utilities;



import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;

public class CustomNamingStrategy extends PhysicalNamingStrategyStandardImpl {

    @Override
    public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment context) {
        final List parts = splitAndReplace( name.getText() );
        return context.getIdentifierHelper().toIdentifier(
                "T_" +  join( parts ),
                name.isQuoted()
        );
    }

    @Override
    public Identifier toPhysicalColumnName(Identifier name, JdbcEnvironment context) {
        final List parts = splitAndReplace( name.getText() );
        return context.getIdentifierHelper().toIdentifier(
                "C_" + join( parts ),
                name.isQuoted()
        );
    }
    private LinkedList splitAndReplace(String name) {
        LinkedList result = new LinkedList<>();
        for ( String part : StringUtils.splitByCharacterTypeCamelCase( name ) ) {
            if ( part == null || part.trim().isEmpty() ) {
                continue;
            }
            result.add( part.toUpperCase( Locale.ROOT ) );
        }
        return result;
    }

    private String join(List parts) {
        boolean firstPass = true;
        String separator = "";
        StringBuilder joined = new StringBuilder();
        for ( Object part : parts ) {
            joined.append( separator ).append( (String) part );
            if ( firstPass ) {
                firstPass = false;
                separator = "_";
            }
        }
        return joined.toString();
    }

}
