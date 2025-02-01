package com.company.legalservapp.view.casetypes;

import com.company.legalservapp.entity.CaseTypes;
import com.company.legalservapp.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "caseTypeses/:id", layout = MainView.class)
@ViewController("CaseTypes.detail")
@ViewDescriptor("case-types-detail-view.xml")
@EditedEntityContainer("caseTypesDc")
public class CaseTypesDetailView extends StandardDetailView<CaseTypes> {
}