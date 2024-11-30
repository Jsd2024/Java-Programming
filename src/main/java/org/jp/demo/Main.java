package org.jp.demo;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        String name="Anindita";
        String[] stringChars = name.split("");
        List<String> nameChars = Arrays.asList(stringChars);
        LinkedHashMap<String, Long> collectedMap =
                nameChars
                .stream()

                .map(c-> c.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()))

                ;
        System.out.println("i = " + collectedMap);
        String s = collectedMap
                .entrySet()
                .stream()
                .filter((entry) -> entry.getValue() == 1)
                .map((entry) ->
                {
                    return entry.getKey();
                })
                .findFirst()
                .get();
        System.out.println("s = " + s);
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
//find out 1st non-repeated char
//        String name="Anindita";
//        String[] stringChars = name.split("");
//        List<String> nameChars = Arrays.asList(stringChars);

//        nameChars
//                .stream()
//                .distinct()
//        LinkedHashMap<String, Long> collectedMap = nameChars
//                .stream()
//                .map(c-> c.toLowerCase())
//                .collect(Collectors.groupingBy(Function.identity(),
//                        LinkedHashMap::new, Collectors.counting()));
//        System.out.println("i = " + collectedMap);
//        String s = collectedMap
//                .entrySet()
//                .stream()
//                .filter((entry) -> entry.getValue() == 1)
//                .map((entry) ->
//                {
//                    return entry.getKey();
//                })
//                .findFirst()
//                .get();
//        System.out.println("s = " + s);


    }
}