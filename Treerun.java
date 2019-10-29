public class Treerun
{
  public static void main(String[] args)
  {
     Tree coolTree = new Tree(69,420,431.431,true);
     coolTree.numBranches = 72;
     System.out.println(coolTree.getNumBranches());
     System.out.println(coolTree.getNumLeaves());
     System.out.println(coolTree.getNumHeight());
     System.out.println(coolTree.getIsConiferous());
     coolTree.blowInTheWind();
     coolTree.grow(85);
     System.out.println(coolTree.getNumHeight());
     coolTree.loseLeaves();
     System.out.println(coolTree.getNumLeaves());
     coolTree.trimBranches();
     System.out.println(coolTree.getNumBranches());
  }
}
