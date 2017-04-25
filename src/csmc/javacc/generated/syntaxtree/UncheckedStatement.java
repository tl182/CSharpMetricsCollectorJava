//
// Generated by JTB 1.3.2
//

package csmc.javacc.generated.syntaxtree;

/**
 * Grammar production:
 * f0 -> <UNCHECKED>
 * f1 -> Block()
 */
public class UncheckedStatement implements Node {
   public NodeToken f0;
   public Block f1;

   public UncheckedStatement(NodeToken n0, Block n1) {
      f0 = n0;
      f1 = n1;
   }

   public UncheckedStatement(Block n0) {
      f0 = new NodeToken("unchecked");
      f1 = n0;
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

