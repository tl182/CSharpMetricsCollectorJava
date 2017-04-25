//
// Generated by JTB 1.3.2
//

package csmc.javacc.generated.syntaxtree;

/**
 * Grammar production:
 * f0 -> AttributesOpt()
 * f1 -> MethodModifierList()
 * f2 -> PartialOpt()
 * f3 -> ReturnType()
 * f4 -> MemberName()
 * f5 -> TypeParameterListOpt()
 * f6 -> <LPAREN>
 */
public class MethodHeaderLookahead implements Node {
   public AttributesOpt f0;
   public MethodModifierList f1;
   public PartialOpt f2;
   public ReturnType f3;
   public MemberName f4;
   public TypeParameterListOpt f5;
   public NodeToken f6;

   public MethodHeaderLookahead(AttributesOpt n0, MethodModifierList n1, PartialOpt n2, ReturnType n3, MemberName n4, TypeParameterListOpt n5, NodeToken n6) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
      f5 = n5;
      f6 = n6;
   }

   public MethodHeaderLookahead(AttributesOpt n0, MethodModifierList n1, PartialOpt n2, ReturnType n3, MemberName n4, TypeParameterListOpt n5) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
      f5 = n5;
      f6 = new NodeToken("(");
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

