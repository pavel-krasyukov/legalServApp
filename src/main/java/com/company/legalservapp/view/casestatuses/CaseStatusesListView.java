package com.company.legalservapp.view.casestatuses;

import com.company.legalservapp.entity.CaseStatuses;
import com.company.legalservapp.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "caseStatuseses", layout = MainView.class)
@ViewController("CaseStatuses.list")
@ViewDescriptor("case-statuses-list-view.xml")
@LookupComponent("caseStatusesesDataGrid")
@DialogMode(width = "64em")
public class CaseStatusesListView extends StandardListView<CaseStatuses> {
}