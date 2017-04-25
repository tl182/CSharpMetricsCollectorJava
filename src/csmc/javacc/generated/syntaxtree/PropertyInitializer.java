//
// Generated by JTB 1.3.2
//

package csmc.javacc.generated.syntaxtree;

/**
 * Grammar production:
 * f0 -> <EQUAL>
 * f1 -> VariableInitializer()
 * f2 -> <SEMICOLON>
 */
public class PropertyInitializer implements Node {
   public NodeToken f0;
   public VariableInitializer f1;
   public NodeToken f2;

   public PropertyInitializer(NodeToken n0, VariableInitializer n1, NodeToken n2) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
   }

   public PropertyInitializer(VariableInitializer n0) {
      f0 = new NodeToken("=");
      f1 = n0;
      f2 = new NodeToken(";");
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

