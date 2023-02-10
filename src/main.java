import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main
{
    public static void main(String[] args)
    {
        String expresionAutomata = "([a-z]|[A-Z])([0-9]|[a-z]|[A-Z]|-)*@([A-Z]|[0-9]|[a-z])([0-9]|[a-z]|[A-Z]|-|\\.([a-z]|[0-9]|[A-Z]))*";
        Pattern patron = Pattern.compile(expresionAutomata);
        List<String>  listaCorreos = new ArrayList<String>();

        listaCorreos.add("betoveluis@gmail.com");
        listaCorreos.add("mimamamemima@gmail.co");
        listaCorreos.add("Usuario@hotmail.com");
        listaCorreos.add("JuanJose97@gmail.com");
        listaCorreos.add("JuanJose97gmail");
        listaCorreos.add("a-vigna@javeriana.edu.co");

        for(String buffer : listaCorreos)
        {
            Matcher matcher = patron.matcher(buffer);

            
            if (matcher.matches())
            {
                System.out.println("La cadena: " + buffer+ " coincide con el lenguaje regular");
            }else
            {
                System.out.println("La cadena: "+ buffer + " NO coincide con el lenguaje regular");
            }
        }
    }
}
