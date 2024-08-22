import java.util.Scanner;

public class AlgebraBoolean {

    public static String resolverExpressao(String expressao, boolean[] valores) {
        for (int i = 0; i < valores.length; i++) {
            String variavel = "\\b" + (char) ('A' + i) + "\\b";
            expressao = expressao.replaceAll(variavel, valores[i] ? "1" : "0");
        }

        expressao = expressao.replaceAll("\\s", "");

        int indiceUltimoParenteseAberto = expressao.lastIndexOf('(');

        if (indiceUltimoParenteseAberto > 0) {
            if (expressao.charAt(indiceUltimoParenteseAberto - 1) == 't') {
                String novaExpressao = funcaoNot(expressao, indiceUltimoParenteseAberto);
                return resolverExpressao(novaExpressao, valores);
            }
            if (expressao.charAt(indiceUltimoParenteseAberto - 1) == 'r') {
                String novaExpressao = funcaoOr(expressao, indiceUltimoParenteseAberto);
                return resolverExpressao(novaExpressao, valores);
            }
            if (expressao.charAt(indiceUltimoParenteseAberto - 1) == 'd') {
                String novaExpressao = funcaoAnd(expressao, indiceUltimoParenteseAberto);
                return resolverExpressao(novaExpressao, valores);
            }
        } else
            return expressao;
        return "Oi";
    }

    public static String funcaoNot(String expressao, int indiceUltimoParenteseAberto) {
        String novaExpressao = "";
        if (expressao.charAt(indiceUltimoParenteseAberto + 1) == '0') {
            novaExpressao = expressao.substring(0, (indiceUltimoParenteseAberto - 3)) + "1"
                    + expressao.substring((indiceUltimoParenteseAberto) + 3);
        } else {
            novaExpressao = expressao.substring(0, (indiceUltimoParenteseAberto - 3)) + "0"
                    + expressao.substring((indiceUltimoParenteseAberto) + 3);
        }
        return novaExpressao;
    }

    public static String funcaoAnd(String expressao, int indiceUltimoParenteseAberto) {
        String novaExpressao = "";
        if (expressao.charAt(indiceUltimoParenteseAberto + 1) == '1'
                && expressao.charAt(indiceUltimoParenteseAberto + 3) == '1') {

            if (expressao.charAt(indiceUltimoParenteseAberto + 4) == ',') {

                if (expressao.charAt(indiceUltimoParenteseAberto + 5) == '1') {
                    novaExpressao = expressao.substring(0, (indiceUltimoParenteseAberto - 3)) + "1"
                            + expressao.substring((indiceUltimoParenteseAberto) + 7);
                } else {
                    novaExpressao = expressao.substring(0, (indiceUltimoParenteseAberto - 3)) + "0"
                            + expressao.substring((indiceUltimoParenteseAberto) + 7);
                }

            } else {
                novaExpressao = expressao.substring(0, (indiceUltimoParenteseAberto - 3)) + "1"
                        + expressao.substring((indiceUltimoParenteseAberto) + 5);
            }

        } else {

            if (expressao.charAt(indiceUltimoParenteseAberto + 4) == ',') {
                novaExpressao = expressao.substring(0, (indiceUltimoParenteseAberto - 3)) + "0"
                        + expressao.substring((indiceUltimoParenteseAberto) + 7);

            } else {
                novaExpressao = expressao.substring(0, (indiceUltimoParenteseAberto - 3)) + "0"
                        + expressao.substring((indiceUltimoParenteseAberto) + 5);
            }
        }
        return novaExpressao;
    }

    public static String funcaoOr(String expressao, int indiceUltimoParenteseAberto) {
        String novaExpressao = "";
        if (expressao.charAt(indiceUltimoParenteseAberto + 1) == '0'
                && expressao.charAt(indiceUltimoParenteseAberto + 3) == '0') {

            if (expressao.charAt(indiceUltimoParenteseAberto + 4) == ',') {

                if (expressao.charAt(indiceUltimoParenteseAberto + 5) == '0') {

                    if (expressao.charAt(indiceUltimoParenteseAberto + 6) == ',') {
                        if (expressao.charAt(indiceUltimoParenteseAberto + 7) == '0') {
                            novaExpressao = expressao.substring(0, (indiceUltimoParenteseAberto - 2)) + "0"
                                    + expressao.substring((indiceUltimoParenteseAberto) + 9);
                        } else {
                            novaExpressao = expressao.substring(0, (indiceUltimoParenteseAberto - 2)) + "1"
                                    + expressao.substring((indiceUltimoParenteseAberto) + 9);
                        }
                    } else {
                        novaExpressao = expressao.substring(0, (indiceUltimoParenteseAberto - 2)) + "0"
                                + expressao.substring((indiceUltimoParenteseAberto) + 7);
                    }

                } else { // se 3 for 1
                    if (expressao.charAt(indiceUltimoParenteseAberto + 6) == ',') { // se tiver 4
                        novaExpressao = expressao.substring(0, (indiceUltimoParenteseAberto - 2)) + "1"
                                + expressao.substring((indiceUltimoParenteseAberto) + 9);

                    } else {
                        novaExpressao = expressao.substring(0, (indiceUltimoParenteseAberto - 2)) + "1"
                                + expressao.substring((indiceUltimoParenteseAberto) + 7);

                    }

                }

            } else {
                novaExpressao = expressao.substring(0, (indiceUltimoParenteseAberto - 2)) + "0"
                        + expressao.substring((indiceUltimoParenteseAberto) + 5);

            }
        } else {
            if (expressao.charAt(indiceUltimoParenteseAberto + 4) == ',') {
                if (expressao.charAt(indiceUltimoParenteseAberto + 6) == ',') {
                    novaExpressao = expressao.substring(0, (indiceUltimoParenteseAberto - 2)) + "1"
                            + expressao.substring((indiceUltimoParenteseAberto) + 9);

                } else {
                    novaExpressao = expressao.substring(0, (indiceUltimoParenteseAberto - 2)) + "1"
                            + expressao.substring((indiceUltimoParenteseAberto) + 7);

                }
            } else {
                novaExpressao = expressao.substring(0, (indiceUltimoParenteseAberto - 2)) + "1"
                        + expressao.substring((indiceUltimoParenteseAberto) + 5);
            }
        }
        return novaExpressao;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();

            if (line.equals("0")) {
                break;
            }

            String[] parts = line.split(" ");

            int numberOfElements = Integer.parseInt(parts[0]);

            if (parts.length < numberOfElements + 2) {
                System.out.println("Entrada Inválida");
                continue;
            }

            boolean[] values = new boolean[numberOfElements];

            for (int i = 0; i < numberOfElements; i++) {
                values[i] = "1".equals(parts[i + 1]);
            }

            StringBuilder expressionBuilder = new StringBuilder();
            for (int i = numberOfElements + 1; i < parts.length; i++) {
                expressionBuilder.append(parts[i]);
                if (i < parts.length - 1) {
                    expressionBuilder.append(" ");
                }
            }
            String expressao = expressionBuilder.toString();
            System.out.println(resolverExpressao(expressao, values));
        }

        scanner.close();
    }

}
