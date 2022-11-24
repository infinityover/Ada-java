package Model;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    public List getDecklist() {
        return decklist;
    }

    public void setDecklist(List decklist) {
        this.decklist = decklist;
    }

    private List decklist = new ArrayList();

}
