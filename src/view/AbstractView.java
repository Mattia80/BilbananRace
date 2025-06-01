package view;

import controller.AbstractController;
import model.AbstractModel;

/**
 * Classe astratta generale per tutte le viste.
 * Associa un modello e un controller
 */
public abstract class AbstractView {
    protected AbstractModel model;
    protected AbstractController controller;

    /**
     * Costruisce una vista con un modello e un controller
     *
     * @param model      modello associato alla vista
     * @param controller controller associato alla vista
     */
    public AbstractView(AbstractModel model, AbstractController controller) {
        this.model = model;
        this.controller = controller;
    }

}
