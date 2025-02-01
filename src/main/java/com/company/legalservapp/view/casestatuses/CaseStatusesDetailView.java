package com.company.legalservapp.view.casestatuses;

import com.company.legalservapp.entity.CaseStatuses;
import com.company.legalservapp.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "caseStatuseses/:id", layout = MainView.class)
@ViewController("CaseStatuses.detail")
@ViewDescriptor("case-statuses-detail-view.xml")
@EditedEntityContainer("caseStatusesDc")
public class CaseStatusesDetailView extends StandardDetailView<CaseStatuses> {
}