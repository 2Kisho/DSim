package de.nerdfactory.dsim;

import java.util.List;

import de.nerdfactory.dsim.skat.Card;
import de.nerdfactory.dsim.skat.CardDeckBuilderImpl;
import de.nerdfactory.dsim.skat.SkatPanelModel;
import de.nerdfactory.dsim.skat.SkatPanelPresenter;
import de.nerdfactory.dsim.skat.SkatPanelView;
import de.nerdfactory.dsim.ui.DSimFrame;

public class StartDSim {

    public static void main(String[] args) {
        List<Card> cards = new CardDeckBuilderImpl().setThirtyTwo(true).build();
        cards.forEach(e -> System.out.println(e));
        System.out.println(cards.size());
        DSimFrame frame = new DSimFrame();
        SkatPanelModel model = new SkatPanelModel();
        SkatPanelView view = new SkatPanelView();
        SkatPanelPresenter presenter = new SkatPanelPresenter(model, view);
        presenter.present();
        frame.setMainPanel(presenter);
    }
}
