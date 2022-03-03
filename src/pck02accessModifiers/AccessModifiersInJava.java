package pck02accessModifiers;

public class AccessModifiersInJava {
    public static void main ( String[] args){

        /*
                        class   |   package |   subclass    |   world   |
        public      |   Y       |   Y       |   Y           |   Y       |
        protected   |   Y       |   Y       |   Y           |   N       |
        no modifier |   Y       |   Y       |   N           |   N       |
        private     |   Y       |   N       |   N           |   N       |

        pode-se usar em frente de classes, variáveis e métodos.
        public      -> acessível a todos
        protected   -> acessível a toda classe onde está a classe/variável/método declarado como protected.
                       também acessível a todos os pacotes onde está a c/v/m declarado com protected.
                       também acessível a todas classes filhas da classe em questão.
        no modifier -> subclasses e o público não têm acesso.
        private     -> apenas a classe em questão tem acesso.
         */
    }
}
