import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
      List<Float> numeros = new ArrayList();
      // Pegar o numero de elementos
      
      int numeroDeElementos = numeros.size();
      System.out.println(numeroDeElementos);
      //Adicionar elementos
      numeros.add(10f);
      numeros.add(12.45f);

      numeroDeElementos = numeros.size();
      System.out.println(numeroDeElementos);

      //Mostrando os elementos
      //1ª Pegando o primeiro elemento pelo indice
      float primeiroElemento = numeros.get(0);
      System.out.println(primeiroElemento);
      // Pegando o ultimo elemento
      float ultimoElemento = numeros.get(numeroDeElementos-1);
      System.out.println(ultimoElemento);

      // 2ª Listar os elementos
      numeros.forEach(
       el -> System.out.println(el*el)
      );
      // 3ª Buscar por um predicado
      List<Float> pares = numeros.stream().filter(

         el-> el % 2 == 0
      ).collect(Collectors.toList());

      //System.out.println(pares);

      pares.forEach(
          el-> System.out.println(el)

      );
        
    } 
    
}