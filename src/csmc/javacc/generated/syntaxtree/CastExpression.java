//
// Generated by JTB 1.3.2
//

package csmc.javacc.generated.syntaxtree;

/**
 * Grammar production:
 * f0 -> <LPAREN>
 * f1 -> Type()
 * f2 -> <RPAREN>
 * f3 -> UnaryExpression()
 */
public class CastExpression implements Node {
   public NodeToken f0;
   public Type f1;
   public NodeToken f2;
   public UnaryExpression f3;

   public CastExpression(NodeToken n0, Type n1, NodeToken n2, UnaryExpression n3) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
   }

   public CastExpression(Type n0, UnaryExpression n1) {
      f0 = new NodeToken("(");
      f1 = n0;
      f2 = new NodeToken(")");
      f3 = n1;
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

