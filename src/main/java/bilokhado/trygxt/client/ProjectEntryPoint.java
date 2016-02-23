package bilokhado.trygxt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.core.client.GXT;
import com.sencha.gxt.core.client.dom.ScrollSupport.ScrollMode;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.widget.core.client.box.MessageBox;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.FlowLayoutContainer;
import com.sencha.gxt.widget.core.client.container.MarginData;
import com.sencha.gxt.widget.core.client.container.Viewport;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ProjectEntryPoint implements EntryPoint {

  @Override
  public void onModuleLoad() {
	  FlowLayoutContainer c = new FlowLayoutContainer();
	    c.setScrollMode(ScrollMode.ALWAYS);
	    MarginData layoutData = new MarginData(new Margins(0, 5, 0, 0));
	    c.add(new TextButton("Button A"), layoutData);
	    c.add(new TextButton("Button B"), layoutData);
	    c.add(new TextButton("Button C"), layoutData);
	    Viewport v = new Viewport();
	    v.add(c);
	    RootPanel.get().add(v);
  }
  
}
