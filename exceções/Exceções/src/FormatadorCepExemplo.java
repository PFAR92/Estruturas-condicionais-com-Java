public class FormatadorCepExemplo {
    public static void main(String[] args) {

        try {
            String cepFormatado = formatarCep("23756064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExeption e) {
            System.out.println("O cep não corresponde");;
        }
        
    }

    static String formatarCep(String cep) throws CepInvalidoExeption{
        if(cep.length() != 8)
            throw new CepInvalidoExeption();

            //simulando um cep formatado
            return "23.756-064";
    }
}
