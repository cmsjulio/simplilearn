package pck01stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class streamsMapInJava {

    /*

    10 lines of code reduced to a smaller amount using the function programming paradigm.

    To help you manipulate and iterate over collections.

    A video is streamed: the whole video is not downloaded at once, but in a stream fashion.

    Stream is an API.

     */

    public static void main(String[] args) {

        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);

        List<Integer> squaresList = new ArrayList<>();
        for(Integer i:numbersList){
            squaresList.add(i*i);
        }

        // Lines above without using streams.
        System.out.println("numbersList: " + numbersList);
        System.out.println("squaresList: " + squaresList);

        List<Integer> squaresListStream = numbersList.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println("squaresListStream: " + squaresListStream);

        // collection.stream() inicia o stream: elementos sendo acessados um a um.
        // .stream() tem muitos métodos
        // .map() - usado para alterar a representação dos elementos. Não confundir com a collection Map.
        // (x -> x*x) - lambda function, introduced in Java 8.
        //      each element is represented by x, then the arrow ->, then the final value which you want to see for that
        //      particular element.
        // até .stream().map(x -> x*x) : converteu em stream e calculou o quadrado dos elementos um por um.
        // para converter de volta para collection, usar .collect(Collectors.toList())
        // o método collect é um método terminal (terminal operation), nenhum método posto após
        // .collect não será computado.

        // STREAM FILTER IN JAVA

        Set<Integer> squareSet = new HashSet<>();
        for (Integer i: numbersList){
            squareSet.add(i*i);
        }

        System.out.println("Set of squared numbers: " + squareSet);

        Set<Integer> squareSetStream =
                numbersList.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println("Set of streamed squared numbers: " + squareSetStream);


        List<String> languages = new ArrayList<>();
        languages.add("java");
        languages.add("python");
        languages.add("scala");

        // Obtendo todos os elementos da lista que começam com a letra p. Sem usar stream.

        List<String> filteredResult = new ArrayList<>();
        for (String s:languages){
            if(s.startsWith("p")){
                filteredResult.add(s);
            }
        }

        System.out.println("Filter list sem stream: " + filteredResult);

        // Same code using the stream() API.

        List<String> filteredResultStream = languages.stream().filter(s->s.startsWith("p")).collect(Collectors.toList());

        System.out.println("Filter list com stream: " + filteredResultStream);


        // FOR EACH IN JAVA.

        // Sorting a list.
        languages.add("basic");

        // o stream() API traz o .sort method, para facilitar justamente o List sorting.

        List<String> sortedListStreamed = languages.stream().sorted().collect(Collectors.toList());
        System.out.println("Languages sorted alphabet.: " + sortedListStreamed);

        // ITERANDO EM COLEÇÕES USANDO A stream() API.
        // Usa-se o método .forEach().

        System.out.println("Printing elements one by one:");
        languages.stream().forEach(element -> System.out.println(element));

        // para rodar mais linhas dentro do .forEach(), usar {}, exemplo:
        languages.stream().forEach(x -> {
            System.out.println("Imprimindo elemento");
            System.out.println(x);
            System.out.println(x.toUpperCase());
        });


        // STREAMS REDUCE IN JAVA.

        /*
            Imagine a list of numbers and you having to calculate the sum of them all.
            Without stream, that can be done with a for.
            We can do it using a reduce method.
            Reduce: change the whole collection representation to a single result.

            Identity - an element that is the initial value of the reduction operation and the default
                result if the stream is empty.
                    The default or initial value of the reduce operation.

            Accumulator - a function that takes two parameters:
                a partial result of the reduction operation and the next element of the stream.
                    Two params:     1. Ongoing partial result - ans.
                                    2. The next element of the stream - i.

            Combiner - [OPT] a function used to combine the partial result of the reduction operation
                when the reduction is parallelized, or when there is a mismatch between the types
                of the accumulator arguments and the types of the accumulator implementation.
                    Necessary if you want to sum elements that do not combine the same data type.

         */

        int sum = numbersList.stream().reduce(0, (ans,i)->ans+i);
        System.out.println("A some de todos os elementos de numbersList é: " + sum);
        System.out.println("numbersList: " + numbersList);



    }

}
