public class TestKT {
    public class testMass {
        @TestKT
        public void testExpression() {
          Joogipudel joogipudel = new Joogipudel();
          joogipudel.setPudel(2, "plast", 1, 42);
          int vastus = joogipudel.findMass();
          assertEquals(2000042, vastus);
        }
      }
}
