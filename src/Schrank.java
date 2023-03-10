public class Schrank {
    public String art;
    public int türen;
    public int schubladen;

    public Schrank(String art, int türen, int schubladen) {
        this.art = art;
        this.türen = türen;
        this.schubladen = schubladen;
    }

    public void türAuf() {
        if (türen == 0)
            System.out.println("Der " + art + " hat keine Türen");
        else if (türen < 2)
            System.out.println("Die Tür von " + art + " wurde geöffnet");
        else
            System.out.println("Die " + türen + " Türen von " + art + " wurden geöffnet");
    }

    public void schubladenAuf() {
        if (schubladen == 0)
            System.out.println("Der " + art + " hat keine Schubladen");
        else if (schubladen < 2)
            System.out.println("Die Schublade von " + art + " wurde geöffnet");
        else
            System.out.println("Die " + schubladen + " Schubladen von "
                    + art + " wurden geöffnet");
    }

}
