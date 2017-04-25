//
// Generated by JTB 1.3.2
//

package csmc.javacc.generated.syntaxtree;

/**
 * Grammar production:
 * f0 -> <LBRACE>
 * f1 -> VariableInitializerListOpt()
 * f2 -> [ <COMMA> ]
 * f3 -> <RBRACE>
 */
public class ArrayInitializer implements Node {
   public NodeToken f0;
   public VariableInitializerListOpt f1;
   public NodeOptional f2;
   public NodeToken f3;

   public ArrayInitializer(NodeToken n0, VariableInitializerListOpt n1, NodeOptional n2, NodeToken n3) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
   }

   public ArrayInitializer(VariableInitializerListOpt n0, NodeOptional n1) {
      f0 = new NodeToken("{");
      f1 = n0;
      f2 = n1;
      f3 = new NodeToken("}");
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

