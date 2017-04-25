//
// Generated by JTB 1.3.2
//

package csmc.javacc.generated.syntaxtree;

/**
 * Grammar production:
 * f0 -> <EXTERN>
 * f1 -> <ALIAS>
 * f2 -> Identifier()
 * f3 -> <SEMICOLON>
 */
public class ExternAliasDirective implements Node {
   public NodeToken f0;
   public NodeToken f1;
   public Identifier f2;
   public NodeToken f3;

   public ExternAliasDirective(NodeToken n0, NodeToken n1, Identifier n2, NodeToken n3) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
   }

   public ExternAliasDirective(Identifier n0) {
      f0 = new NodeToken("extern");
      f1 = new NodeToken("alias");
      f2 = n0;
      f3 = new NodeToken(";");
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

