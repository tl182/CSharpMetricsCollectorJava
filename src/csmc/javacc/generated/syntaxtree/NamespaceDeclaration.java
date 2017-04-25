//
// Generated by JTB 1.3.2
//

package csmc.javacc.generated.syntaxtree;

/**
 * Grammar production:
 * f0 -> <NAMESPACE>
 * f1 -> QualifiedIdentifier()
 * f2 -> NamespaceBody()
 * f3 -> SemicolonOpt()
 */
public class NamespaceDeclaration implements Node {
   public NodeToken f0;
   public QualifiedIdentifier f1;
   public NamespaceBody f2;
   public SemicolonOpt f3;

   public NamespaceDeclaration(NodeToken n0, QualifiedIdentifier n1, NamespaceBody n2, SemicolonOpt n3) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
   }

   public NamespaceDeclaration(QualifiedIdentifier n0, NamespaceBody n1, SemicolonOpt n2) {
      f0 = new NodeToken("namespace");
      f1 = n0;
      f2 = n1;
      f3 = n2;
   }

   public void accept(csmc.javacc.generated.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(csmc.javacc.generated.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(csmc.javacc.generated.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(csmc.javacc.generated.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

