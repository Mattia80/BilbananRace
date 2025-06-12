package controller;

import model.AbstractModel;
import view.AbstractView;

public abstract class AbstractController {
    protected AbstractModel model;
    protected AbstractView view;

    public AbstractController(AbstractModel model, AbstractView view) {
        this.model = model;
        this.view = view;
    }

    public AbstractModel getModel() {
        return model;
    }

    public void setModel(AbstractModel model) {
        this.model = model;
    }

    public AbstractView getView() {
        return view;
    }

    public void setView(AbstractView view) {
        this.view = view;
    }
}
