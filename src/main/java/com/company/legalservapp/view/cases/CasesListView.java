package com.company.legalservapp.view.cases;

import com.company.legalservapp.entity.Cases;
import com.company.legalservapp.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "caseses", layout = MainView.class)
@ViewController("Case_.list")
@ViewDescriptor("cases-list-view.xml")
@LookupComponent("casesesDataGrid")
@DialogMode(width = "64em")
public class CasesListView extends StandardListView<Cases> {
}