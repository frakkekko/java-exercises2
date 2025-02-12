package org.app.exercises.related.structures;

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
}
