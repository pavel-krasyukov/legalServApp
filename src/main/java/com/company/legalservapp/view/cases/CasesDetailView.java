package com.company.legalservapp.view.cases;

import com.company.legalservapp.entity.CasePlaintiffsLink;
import com.company.legalservapp.entity.Cases;
import com.company.legalservapp.view.caseplaintiffslink.CasePlaintiffsLinkDetailView;
import com.company.legalservapp.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.flowui.DialogWindows;
import io.jmix.flowui.Notifications;
import io.jmix.flowui.kit.action.ActionPerformedEvent;
import io.jmix.flowui.model.InstanceLoader;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "caseses/:id", layout = MainView.class)
@ViewController("Case_.detail")
@ViewDescriptor("cases-detail-view.xml")
@EditedEntityContainer("casesDc")
public class CasesDetailView extends StandardDetailView<Cases> {

    @Autowired
    private Notifications notifications;
    @Autowired
    private DialogWindows dialogWindows;
    @Autowired
    private DataManager dataManager;

    @ViewComponent
    private InstanceLoader<Cases> caseLoader;

    @Subscribe
    public void onInit(InitEvent event) {
    }

    @Subscribe("plaintiffsDataGrid.createPlantiffsCustom")
    public void onPlaintiffsDataGridCreate(final ActionPerformedEvent event) {
	//notifications.create("Hello").show();
        CasePlaintiffsLink casePlaintiffsLink = dataManager.create(CasePlaintiffsLink.class);
        casePlaintiffsLink.setCase_(getEditedEntity());
        dialogWindows.detail(this, CasePlaintiffsLink.class)
                        .withViewClass(CasePlaintiffsLinkDetailView.class)
                        .editEntity(casePlaintiffsLink)
                        .withAfterCloseListener(afterCloseEvent -> {
                            if (afterCloseEvent.closedWith(StandardOutcome.SAVE)) {
                                caseLoader.load();
                            }
                        })
                        .open();
    }
}