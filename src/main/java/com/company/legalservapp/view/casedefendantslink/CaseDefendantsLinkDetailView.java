package com.company.legalservapp.view.casedefendantslink;

import com.company.legalservapp.entity.CaseDefendantsLink;
import com.company.legalservapp.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "caseDefendantsLinks/:id", layout = MainView.class)
@ViewController("CaseDefendantsLink.detail")
@ViewDescriptor("case-defendants-link-detail-view.xml")
@EditedEntityContainer("caseDefendantsLinkDc")
public class CaseDefendantsLinkDetailView extends StandardDetailView<CaseDefendantsLink> {
}