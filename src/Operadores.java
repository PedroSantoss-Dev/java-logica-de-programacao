public class Operadores {
    
    public static void main(String[] args) {
        
        String name = "Pedro";
        int number = 7;
        int number2 = 3;

        // o simbolo + quando utilizado com uma string ao inves de somar ele concatena
        //OPERADOR +
        String concatenaString = name + number; //Pedro7
        int soma = number + number2;// 10
        System.out.println(concatenaString);
        System.out.println(soma);
        System.out.println("*********************************");

        // OPERADOR -

        int subtrair = number - number2;
        System.out.println(subtrair); // 4


    }
}
