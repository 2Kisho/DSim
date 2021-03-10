package de.nerdfactory.dsim;

import de.nerdfactory.dsim.rkub.RummikubGame;

public class StartDSim {

    public static void main(String[] args) {
//        List<Card> cards = new CardDeckBuilderImpl().setThirtyTwo(true).build();
//        cards.forEach(e -> System.out.println(e));
//        System.out.println(cards.size());
//        DSimFrame frame = new DSimFrame();
//        SkatPanelModel model = new SkatPanelModel();
//        SkatPanelView view = new SkatPanelView();
//        SkatPanelPresenter presenter = new SkatPanelPresenter(model, view);
//        presenter.present();
//        frame.setMainPanel(presenter);
    	RummikubGame game = new RummikubGame(2);
    	game.getPlayers().stream().forEach(e -> System.out.println(e));
    	System.out.println(game);
    }
}
