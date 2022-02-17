package esame.alphabeticsort;

public class AlphabeticSortOfNames {

    private AlphabeticSortOfNames(){

    }

    public static void alphabeticSort(String[] names) {

            String temp;
            int i;
            int j;

            for(i = 0; i < names.length; i++) {

                for(j = i + 1; j < names.length; j++) {

                    if(names[i].compareTo(names[j]) > 0) {

                        temp = names[i];
                        names[i] = names[j];
                        names[j] = temp;

                    }

                }
            }

    }
}


