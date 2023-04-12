// convertendo um tipo maior em um tipo de tamanho menor
// double-> float-> long-> int-> char-> short->byte


// convertendo um tipo menor em um tamanho maior
// byte-> short-> char-> int-> long-> float->double

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
      byte numero1 = 100;
      short  numero2=numero1;
      numero1 = (byte) numero2;
      System.out.println(numero1);
    }

}