package com.example.VersionAndroid;

import android.app.Application;
import model.CalculatorModel;
import model.I_CalculatorModel;
import presenter.CalculatorPresenter;
import presenter.I_CalculatorPresenter;
import view.I_CalculatorView;

public class AndroidAppMediator extends Application {
    private I_CalculatorModel _model;
    private I_CalculatorView _view;
    private I_CalculatorPresenter _presenter;

	public void register(I_CalculatorView view) {
        _view = view;
		_model = new CalculatorModel();
        _presenter = new CalculatorPresenter(_model, _view);
	}

    public I_CalculatorPresenter getPresenter(I_CalculatorView view) {
        return _presenter;
    }

    public I_CalculatorView getView(I_CalculatorPresenter presenter) {
        return _view;
    }

	public I_CalculatorModel getModel(I_CalculatorPresenter presenter) {
		return _model;
	}

}
