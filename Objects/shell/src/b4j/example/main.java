
package b4j.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new main();
		remoteMe = RemoteObject.declareNull("b4j.example.main");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4j.example.main");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, main.class);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
    public static RemoteObject getObject() {
		return myClass;
	 }
	public PCBA create(Object[] args) throws ClassNotFoundException{
		ba = (RemoteObject) args[1];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _mainform = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _menubar1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper");
public static RemoteObject _dir = RemoteObject.createImmutable("");
public static RemoteObject _dir1 = RemoteObject.createImmutable("");
public static RemoteObject _menulist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _prop = RemoteObject.declareNull("anywheresoftware.b4j.objects.PropertySheetWrapper");
public static RemoteObject _timer1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _manager = RemoteObject.declareNull("b4j.example.undomanager");
public static RemoteObject _cho = RemoteObject.declareNull("anywheresoftware.b4j.objects.DirectoryChooserWrapper");
public static RemoteObject _save1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.FileChooserWrapper");
public static RemoteObject _time = RemoteObject.createImmutable("");
public static RemoteObject _date = RemoteObject.createImmutable("");
public static RemoteObject _mi = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
public static RemoteObject _edit = RemoteObject.declareNull("anywheresoftware.b4j.objects.HTMLEditorWrapper");
public static RemoteObject _statusbar1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.StatusBarWrapper");
public static RemoteObject _tr = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.TextReaderWrapper");
public static RemoteObject _pane1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _textarea1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");
public static RemoteObject _cmenu = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.ContextMenuWrapper");
public static b4j.example.cssutils _cssutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"cho",main._cho,"CMenu",main._cmenu,"CSSUtils",Debug.moduleToString(b4j.example.cssutils.class),"date",main._date,"dir",main._dir,"dir1",main._dir1,"edit",main._edit,"fx",main._fx,"MainForm",main._mainform,"manager",main._manager,"MenuBar1",main._menubar1,"menulist",main._menulist,"mi",main._mi,"Pane1",main._pane1,"prop",main._prop,"save1",main._save1,"StatusBar1",main._statusbar1,"TextArea1",main._textarea1,"time",main._time,"timer1",main._timer1,"tr",main._tr};
}
}