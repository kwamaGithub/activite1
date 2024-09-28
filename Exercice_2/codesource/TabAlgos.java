
public final class TabAlgos {


    private TabAlgos() {

    }
    /**
     * @return valeur la plus grande d'un tableau.
     * @param tab
     * @throws IllegalArgumentException si le tableau est vide ou nul.
     */
    public static int plusGrand(final int[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est nul ou vide.");
        }

        int maximum = tab[0]; // initialiser maximum avec le premier élément
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > maximum) {
                maximum = tab[i];
            }
        }
        return maximum;
    }

    /**
     * @return moyenne des valeurs du tableau.
     * @param tab
     * @throws IllegalArgumentException si le tableau est nul ou vide.
     **/
    public static double moyenne(final int[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau est nul ou vide.");
        }

        double sm = 0;
        for (int i = 0; i < tab.length; i++) {
            sm += tab[i];
        }
        return sm / tab.length;
    }

    /**
     * Compare le contenu de 2 tableaux en tenant compte de l'ordre.
     * @param tab1
     * @param tab2
     * @return true si les 2 tableaux contiennent les mêmes éléments
     *         avec les mêmes nombres d'occurrences dans le même ordre.
     **/
    public static boolean egaux(final int[] tab1, final int[] tab2) {
        if (tab1 == null || tab2 == null) {
            return false;
        }
        if (tab1.length != tab2.length) {
            return false;
        }

        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] != tab2[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Compare le contenu de 2 tableaux sans tenir compte de l'ordre.
     * @param tab1
     * @param tab2
     * @return true si les 2 tableaux contiennent les mêmes éléments
     *         avec les mêmes nombres d'occurrence (pas forcément dans le même
     *         ordre).
     **/
    public static boolean similaires(final int[] tab1, final int[] tab2) {
        if (tab1 == null || tab2 == null) {
            return false;
        }
        if (tab1.length != tab2.length) {
            return false;
        }

        for (int i = 0; i < tab1.length; i++) {
            int cpt1 = 0;
            int cpt2 = 0;
            for (int j = 0; j < tab1.length; j++) {
                if (tab1[i] == tab1[j]) {
                    cpt1++;
                }
                if (tab1[i] == tab2[j]) {
                    cpt2++;
                }
            }
            if (cpt1 != cpt2) {
                return false;
            }

        }
        return true;
    }
}
