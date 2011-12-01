package org.vaadin.melodion.demo;

import org.vaadin.melodion.Melodion;
import org.vaadin.melodion.Melodion.Tab;

import com.vaadin.Application;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.Window;

public class MelodionDemo extends Application {
    @Override
    public void init() {
        setTheme("melodion-demo");
        Window mainWindow = new Window("Melodion demo");
        mainWindow.addComponent(melodion());
        setMainWindow(mainWindow);
    }

    private ComponentContainer melodion() {
        Melodion melodion = new Melodion();
        // melodion.setWidth(20, Sizeable.UNITS_EM);

        Tab templates = melodion.addTab(new Label("Templates"));
        templates.addButton(new NativeButton("Site-wide templates"));
        templates.addButton(new NativeButton("Cross-site templates"));

        melodion.addTab(new Label("Security"));
        melodion.addTab(new Label("Configuration"));

        melodion.addSpacer();

        Tab tools = melodion.addTab(new Label("Tools"));
        tools.addButton(new NativeButton("Browser"));
        tools.addButton(new NativeButton("Export your design"));
        tools.addButton(new NativeButton("Import templates"));

        melodion.addTab(new Label("Packager"));
        melodion.addTab(new Label("Store"));

        melodion.addSpacer();

        Label workItems = new Label("Work items");
        workItems.setCaption("5 new");
        melodion.addTab(workItems);

        Label moderation = new Label("Moderation");
        moderation.setCaption("2 new");
        melodion.addTab(moderation);
        melodion.addTab(new Label("Internal messages"));

        melodion.addSpacer();

        Label welcomeBoard = new Label("Welcome board");
        welcomeBoard.setIcon(new ThemeResource("../runo/icons/16/note.png"));
        melodion.addTab(welcomeBoard);

        Label settings = new Label("Settings");
        settings.setIcon(new ThemeResource("../runo/icons/16/settings.png"));
        melodion.addTab(settings);

        Label profile = new Label("Profile");
        profile.setIcon(new ThemeResource("../runo/icons/16/user.png"));
        melodion.addTab(profile);

        melodion.addSpacer();

        Label systemMessagesLabel = new Label("System messages");
        systemMessagesLabel.setCaption("3 new");
        Tab systemMessagesTab = melodion.addTab(systemMessagesLabel);
        systemMessagesTab.addButton(new NativeButton("Warnings"));
        systemMessagesTab.addButton(new NativeButton("Errors"));

        melodion.addTab(new Label("Audit log"));

        return melodion;
    }
}
