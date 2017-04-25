//
// Generated by JTB 1.3.2
//

package csmc.javacc.generated.syntaxtree;

/**
 * Grammar production:
 * f0 -> AttributesOpt()
 * f1 -> <PARAMS>
 * f2 -> ArrayType()
 * f3 -> Identifier()
 */
public class ParameterArray implements Node {
   public AttributesOpt f0;
   public NodeToken f1;
   public ArrayType f2;
   public Identifier f3;

   public ParameterArray(AttributesOpt n0, NodeToken n1, ArrayType n2, Identifier n3) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
   }

   public ParameterArray(AttributesOpt n0, ArrayType n1, Identifier n2) {
      f0 = n0;
      f1 = new NodeToken("params");
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

