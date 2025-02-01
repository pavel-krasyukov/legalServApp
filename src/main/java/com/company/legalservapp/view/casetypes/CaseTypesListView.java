package com.company.legalservapp.view.casetypes;

import com.company.legalservapp.entity.CaseTypes;
import com.company.legalservapp.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "caseTypeses", layout = MainView.class)
@ViewController("CaseTypes.list")
@ViewDescriptor("case-types-list-view.xml")
@LookupComponent("caseTypesesDataGrid")
@DialogMode(width = "64em")
public class CaseTypesListView extends StandardListView<CaseTypes> {
}