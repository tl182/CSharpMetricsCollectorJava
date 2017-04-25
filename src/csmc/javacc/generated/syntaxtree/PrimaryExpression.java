//
// Generated by JTB 1.3.2
//

package csmc.javacc.generated.syntaxtree;

/**
 * Grammar production:
 * f0 -> ArrayCreationExpression() PrimaryExpressionPrime()
 *       | PrimaryNoArrayCreationExpressionPrime() <LBRACKET> ExpressionList() <RBRACKET> PrimaryExpressionPrime()
 *       | PrimaryNoArrayCreationExpressionPrime() PrimaryExpressionPrime()
 *       | SizeofExpression() PrimaryExpressionPrime()
 *       | PredefinedType() <DOT> Identifier() TypeArgumentListOpt() PrimaryExpressionPrime()
 *       | QualifiedAliasMember() <DOT> Identifier() PrimaryExpressionPrime()
 */
public class PrimaryExpression implements Node {
   public NodeChoice f0;

   public PrimaryExpression(NodeChoice n0) {
      f0 = n0;
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

