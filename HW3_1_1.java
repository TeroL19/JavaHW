public class HW3_1_1 {
    public class Person {
        private String privateField = "PRIVATE"; // внутри Person
        String defaultField = "DEFAULT"; // в этом пакете
        protected String protectedField = "PROTECTED"; // этот пакет + наследники в других пакетах
        public String publicField = "PUBLIC"; // доступно всем

        public void showAccessInsideClass() {
            System.out.println(privateField);
            System.out.println(defaultField);
            System.out.println(protectedField);
            System.out.println(publicField);
        }
    }
    public void test() {
        Person p = new Person();

        // System.out.println(p.privateField); // недоступно
        System.out.println(p.defaultField);
        System.out.println(p.protectedField);
        System.out.println(p.publicField);
    }
}
