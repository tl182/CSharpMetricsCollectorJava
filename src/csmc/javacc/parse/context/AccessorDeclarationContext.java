package csmc.javacc.parse.context;

import csmc.javacc.lang.CSMethod;
import csmc.javacc.util.Tuple2;

public class AccessorDeclarationContext extends ParseContext<Tuple2<String, String>, Tuple2<CSMethod, CSMethod>> {

    public AccessorDeclarationContext(ParseContext parent, Tuple2<String, String> accessorConfiguration, Tuple2<CSMethod, CSMethod> accessors) {
        this.parent = parent;
        this.key = accessorConfiguration;
        this.value = accessors;
    }
}
