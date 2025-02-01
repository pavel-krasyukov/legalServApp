package com.company.legalservapp.view.caseplaintiffslink;

import com.company.legalservapp.entity.CasePlaintiffsLink;
import com.company.legalservapp.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "casePlaintiffsLinks/:id", layout = MainView.class)
@ViewController("CasePlaintiffsLink.detail")
@ViewDescriptor("case-plaintiffs-link-detail-view.xml")
@EditedEntityContainer("casePlaintiffsLinkDc")
public class CasePlaintiffsLinkDetailView extends StandardDetailView<CasePlaintiffsLink> {
}