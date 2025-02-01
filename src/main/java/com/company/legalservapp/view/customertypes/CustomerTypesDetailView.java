package com.company.legalservapp.view.customertypes;

import com.company.legalservapp.entity.CustomerTypes;
import com.company.legalservapp.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "customerTypeses/:id", layout = MainView.class)
@ViewController("CustomerTypes.detail")
@ViewDescriptor("customer-types-detail-view.xml")
@EditedEntityContainer("customerTypesDc")
public class CustomerTypesDetailView extends StandardDetailView<CustomerTypes> {
}