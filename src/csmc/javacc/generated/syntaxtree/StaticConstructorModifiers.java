//
// Generated by JTB 1.3.2
//

package csmc.javacc.generated.syntaxtree;

/**
 * Grammar production:
 * f0 -> ( <EXTERN> | <UNSAFE> )*
 * f1 -> <STATIC>
 * f2 -> ( <EXTERN> | <UNSAFE> )*
 */
public class StaticConstructorModifiers implements Node {
   public NodeListOptional f0;
   public NodeToken f1;
   public NodeListOptional f2;

   public StaticConstructorModifiers(NodeListOptional n0, NodeToken n1, NodeListOptional n2) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
   }

   public StaticConstructorModifiers(NodeListOptional n0, NodeListOptional n1) {
      f0 = n0;
      f1 = new NodeToken("static");
      f2 = n1;
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

