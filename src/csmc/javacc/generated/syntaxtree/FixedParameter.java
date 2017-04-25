//
// Generated by JTB 1.3.2
//

package csmc.javacc.generated.syntaxtree;

/**
 * Grammar production:
 * f0 -> AttributesOpt()
 * f1 -> ParameterModifierOpt()
 * f2 -> Type()
 * f3 -> Identifier()
 * f4 -> DefaultArgumentOpt()
 */
public class FixedParameter implements Node {
   public AttributesOpt f0;
   public ParameterModifierOpt f1;
   public Type f2;
   public Identifier f3;
   public DefaultArgumentOpt f4;

   public FixedParameter(AttributesOpt n0, ParameterModifierOpt n1, Type n2, Identifier n3, DefaultArgumentOpt n4) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
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

