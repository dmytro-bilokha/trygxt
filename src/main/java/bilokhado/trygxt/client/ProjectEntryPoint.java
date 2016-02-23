package bilokhado.trygxt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.core.client.Style.LayoutRegion;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer.BorderLayoutData;
import com.sencha.gxt.widget.core.client.container.Viewport;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ProjectEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		BorderLayoutContainer con = new BorderLayoutContainer();

	    ContentPanel cp = new ContentPanel();
	    cp.setHeadingText("North");
	    cp.add(new Label("North Content"));
	    BorderLayoutData d = new BorderLayoutData(.20);
	    d.setMargins(new Margins(5));
	    d.setCollapsible(true);
	    d.setSplit(true);
	    con.setNorthWidget(cp, d);

	    cp = new ContentPanel();
	    cp.setHeadingText("Navigator");
	    cp.add(new Label("West Content"));
	    TextButton textButton = new TextButton("Button1");
	    cp.add(textButton);
	    d = new BorderLayoutData(.20);
	    d.setMargins(new Margins(0, 5, 5, 5));
	    d.setCollapsible(true);
	    d.setSplit(true);
	    d.setCollapseMini(true);
	    con.setWestWidget(cp, d);

	    cp = new ContentPanel();
	    cp.setHeadingText("Map");
	    cp.add(new Label("Center Content"));
	    d = new BorderLayoutData();
	    d.setMargins(new Margins(0, 5, 5, 0));
	    con.setCenterWidget(cp, d);

	    Viewport v = new Viewport();
	    v.add(con);
	    RootPanel.get().add(v);
	}

}
