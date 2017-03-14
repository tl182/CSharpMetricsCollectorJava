package csmc.javacc.lang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CSNamespace {
    private String name;
    private CSNamespace parent;

    private List<String> imports;
    private List<String> staticImports;
    private Map<String, String> aliases;

    private List<CSNamespace> namespaces;
    private List<CSClass> classes;

    public CSNamespace(String name, CSNamespace parent) {
        this.name = name;
        this.parent = parent;
        this.imports = new ArrayList<>();
        this.staticImports = new ArrayList<>();
        this.aliases = new HashMap<>();
        this.namespaces = new ArrayList<>();
        this.classes = new ArrayList<>();
    }

    public List<String> getImports() {
        return imports;
    }

    public List<String> getStaticImports() {
        return staticImports;
    }

    public void addStaticImport(String importName) {
        if (this.staticImports.contains(importName)) {
            throw new IllegalArgumentException("Namespace "
                    + this.toString()
                    + "already contains static import "
                    + importName);
        }
        this.staticImports.add(importName);
    }

    public void addImport(String importName) {
        if (this.imports.contains(importName)) {
            throw new IllegalArgumentException("Namespace "
                    + this.toString()
                    + "already contains import "
                    + importName);
        }
        this.imports.add(importName);
    }

    public Map<String, String> getAliases() {
        return aliases;
    }

    public void addAlias(String aliasName, String importName) {
        if (this.aliases.containsKey(aliasName)) {
            throw new IllegalArgumentException("Namespace "
                    + this.toString()
                    + "already contains alias "
                    + aliasName + " = " + this.aliases.get(aliasName));
        }
        this.aliases.put(aliasName, importName);
    }

    public String getName() {
        return name;
    }

    public CSNamespace getParent() {
        return parent;
    }

    public List<CSNamespace> getNamespaces() {
        return namespaces;
    }

    public CSNamespace getNamespace(String namespaceName) {

    }

    public List<CSClass> getClasses() {
        return classes;
    }

    public void addNamespace(CSNamespace namespace) {
        if (!namespaces.contains(namespace)) {
            if (namespace.getParent() != this) {
                throw new IllegalArgumentException(
                        "Trying to add namespace " +
                        namespace.getName() +
                        " that already has parent namespace");
            }
            namespaces.add(namespace);
        }
    }

    public void addClass(CSClass csClass) {
        if (!classes.contains(csClass)) {
            classes.add(csClass);
        }
    }
}