package com.company.legalservapp.view.customertypes;

import com.company.legalservapp.entity.CustomerTypes;
import com.company.legalservapp.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "customerTypeses", layout = MainView.class)
@ViewController("CustomerTypes.list")
@ViewDescriptor("customer-types-list-view.xml")
@LookupComponent("customerTypesesDataGrid")
@DialogMode(width = "64em")
public class CustomerTypesListView extends StandardListView<CustomerTypes> {
}