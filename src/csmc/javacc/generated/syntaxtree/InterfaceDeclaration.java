//
// Generated by JTB 1.3.2
//

package csmc.javacc.generated.syntaxtree;

/**
 * Grammar production:
 * f0 -> AttributesOpt()
 * f1 -> InterfaceModifierList()
 * f2 -> PartialOpt()
 * f3 -> <INTERFACE>
 * f4 -> Identifier()
 * f5 -> VariantTypeParameterListOpt()
 * f6 -> InterfaceBaseOpt()
 * f7 -> TypeParameterConstraintsClauseList()
 * f8 -> InterfaceBody()
 * f9 -> SemicolonOpt()
 */
public class InterfaceDeclaration implements Node {
   public AttributesOpt f0;
   public InterfaceModifierList f1;
   public PartialOpt f2;
   public NodeToken f3;
   public Identifier f4;
   public VariantTypeParameterListOpt f5;
   public InterfaceBaseOpt f6;
   public TypeParameterConstraintsClauseList f7;
   public InterfaceBody f8;
   public SemicolonOpt f9;

   public InterfaceDeclaration(AttributesOpt n0, InterfaceModifierList n1, PartialOpt n2, NodeToken n3, Identifier n4, VariantTypeParameterListOpt n5, InterfaceBaseOpt n6, TypeParameterConstraintsClauseList n7, InterfaceBody n8, SemicolonOpt n9) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
      f5 = n5;
      f6 = n6;
      f7 = n7;
      f8 = n8;
      f9 = n9;
   }

   public InterfaceDeclaration(AttributesOpt n0, InterfaceModifierList n1, PartialOpt n2, Identifier n3, VariantTypeParameterListOpt n4, InterfaceBaseOpt n5, TypeParameterConstraintsClauseList n6, InterfaceBody n7, SemicolonOpt n8) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = new NodeToken("interface");
      f4 = n3;
      f5 = n4;
      f6 = n5;
      f7 = n6;
      f8 = n7;
      f9 = n8;
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

