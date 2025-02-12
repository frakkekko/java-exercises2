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
            Stack<String> opening = Arrays.stream(str.split("")).filter(character -> character.equals("(") || character.equals("[") || character.equals("{")).collect(Collectors.toCollection(Stack::new));
            Queue<String> closing = Arrays.stream(str.split("")).filter(character -> character.equals(")") || character.equals("]") || character.equals("}")).collect(Collectors.toCollection(LinkedList::new));

            System.out.println("opening: " + opening);
            System.out.println("closing: " + closing);

            if(opening.size() != closing.size()) {
                return false;
            }

            while (opening.size() > 0 && closing.size() > 0) {
                String open = opening.getLast();
                String close = closing.element();

                System.out.println("open: " + open);
                System.out.println("close: " + close);

                if (
                        (open.equals("(") && !close.equals(")")) ||
                        (open.equals("[") && !close.equals("]")) ||
                        (open.equals("{") && !close.equals("}"))
                ) {
                    return false;
                }

                opening.pop();
                closing.remove();
            }

            return true;
        }
    }
}
