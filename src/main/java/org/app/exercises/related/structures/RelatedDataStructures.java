package org.app.exercises.related.structures;

import java.util.*;
import java.util.stream.Collectors;

public class RelatedDataStructures {

    public static class Colors {
        public static String[] getGreyNuances(int number){
            String[] nuances = new String[Math.min(254, Math.max(0, number))];
            System.out.println("String length " + nuances.length);
            for(int i = 0; i < nuances.length; i++){
                nuances[i] = String.format("#%s", String.format("%1$2s", Integer.toHexString(i + 1)).replace(" ", "0").repeat(3)).toUpperCase();
            }


            return nuances;
        }
    }

    public static class Group {
        public static boolean checkGroup(String str){

            // LIFO
            Stack<String> openingParenthesis = Arrays.stream(str.split(""))
                    .filter(character -> character.equals("(") || character.equals("[") || character.equals("{"))
                    .collect(Collectors.toCollection(Stack::new));

            // FIFO
            Queue<String> closingParenthesis = Arrays.stream(str.split(""))
                    .filter(character -> character.equals(")") || character.equals("]") || character.equals("}"))
                    .collect(Collectors.toCollection(LinkedList::new));

            if(openingParenthesis.size() != closingParenthesis.size()) {
                return false;
            }

            while (openingParenthesis.size() > 0 && closingParenthesis.size() > 0) {
                String open = openingParenthesis.getLast();
                String close = closingParenthesis.element();

                if (
                        (open.equals("(") && !close.equals(")")) ||
                        (open.equals("[") && !close.equals("]")) ||
                        (open.equals("{") && !close.equals("}"))
                ) {
                    return false;
                }

                openingParenthesis.pop();
                closingParenthesis.remove();
            }

            return true;
        }
    }
}
