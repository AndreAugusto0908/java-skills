public class ContagemOperacoes {

    public static void main(String[] args) {
        
        System.out.println(operacoes(90000000));



    }

    public static String operacoes(int n){

        long startTime = System.nanoTime();
        int a = 1;
        for (int i = n + 1; i > 0; i/=2){
            a *= 2;
        }

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        long micros = elapsedTime / 1000;
        long nanos = elapsedTime;
        long picos = elapsedTime * 1000;

        StringBuilder builder = new StringBuilder();
builder.append("Tempo de execução: ")
        .append("Microssegundos: ").append(micros)
        .append(", Nanossegundos: ").append(nanos)
        .append(", Picossegundos: ").append(picos);

    return builder.toString();
}
}