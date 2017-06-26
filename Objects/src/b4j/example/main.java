package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 600, 800);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static class _record{
public boolean IsInitialized;
public String Text;
public double Number;
public anywheresoftware.b4j.objects.JFX.PaintWrapper Color;
public anywheresoftware.b4j.objects.JFX.FontWrapper Fnt;
public String Choices;
public boolean YesNo;
public void Initialize() {
IsInitialized = true;
Text = "";
Number = 0;
Color = new anywheresoftware.b4j.objects.JFX.PaintWrapper();
Fnt = new anywheresoftware.b4j.objects.JFX.FontWrapper();
Choices = "";
YesNo = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _undodata{
public boolean IsInitialized;
public String Text;
public int clr;
public void Initialize() {
IsInitialized = true;
Text = "";
clr = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper _menubar1 = null;
public static String _dir = "";
public static String _dir1 = "";
public static anywheresoftware.b4a.objects.collections.List _menulist = null;
public static anywheresoftware.b4j.objects.PropertySheetWrapper _prop = null;
public static anywheresoftware.b4a.objects.Timer _timer1 = null;
public static b4j.example.undomanager _manager = null;
public static anywheresoftware.b4j.objects.DirectoryChooserWrapper _cho = null;
public static anywheresoftware.b4j.objects.FileChooserWrapper _save = null;
public static String _time = "";
public static String _date = "";
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
public static anywheresoftware.b4j.objects.HTMLEditorWrapper _edit = null;
public static anywheresoftware.b4j.objects.StatusBarWrapper _statusbar1 = null;
public static b4j.example.cssutils _cssutils = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "application_error"))
	return (Boolean) Debug.delegate(ba, "application_error", new Object[] {_error,_stacktrace});
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="End Sub";
return false;
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart"))
	return (String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args});
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="MainForm = Form1";
_mainform = _form1;
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="MainForm.RootPane.LoadLayout(\"1\") 'Load the layou";
_mainform.getRootPane().LoadLayout(ba,"1");
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="MainForm.Resizable=False";
_mainform.setResizable(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="MainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="prop.Initialize(\"prop\")";
_prop.Initialize(ba,"prop");
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="If File.Exists(\"C:\\SmartOffice\\Files\",\"log.txt\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists("C:\\SmartOffice\\Files","log.txt")) { 
 }else {
RDebugUtils.currentLine=65545;
 //BA.debugLineNum = 65545;BA.debugLine="File.MakeDir(\"C:\\\",\"SmartOffice\\core\\data\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir("C:\\","SmartOffice\\core\\data");
RDebugUtils.currentLine=65546;
 //BA.debugLineNum = 65546;BA.debugLine="File.MakeDir(\"C:\\\",\"SmartOffice\\Projects\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir("C:\\","SmartOffice\\Projects");
RDebugUtils.currentLine=65547;
 //BA.debugLineNum = 65547;BA.debugLine="File.MakeDir(\"C:\\Users\\Public\\Documents\",\"SmartO";
anywheresoftware.b4a.keywords.Common.File.MakeDir("C:\\Users\\Public\\Documents","SmartOffice\\Projects");
RDebugUtils.currentLine=65548;
 //BA.debugLineNum = 65548;BA.debugLine="File.WriteString(dir1,\"log.txt\",\"Willkommen\")";
anywheresoftware.b4a.keywords.Common.File.WriteString(_dir1,"log.txt","Willkommen");
 };
RDebugUtils.currentLine=65550;
 //BA.debugLineNum = 65550;BA.debugLine="menulist.Initialize";
_menulist.Initialize();
RDebugUtils.currentLine=65551;
 //BA.debugLineNum = 65551;BA.debugLine="menulist.AddAll(MenuBar1.Menus)";
_menulist.AddAll(_menubar1.getMenus());
RDebugUtils.currentLine=65552;
 //BA.debugLineNum = 65552;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=65553;
 //BA.debugLineNum = 65553;BA.debugLine="time=DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=65554;
 //BA.debugLineNum = 65554;BA.debugLine="date=DateTime.Date(DateTime.Now)";
_date = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=65555;
 //BA.debugLineNum = 65555;BA.debugLine="timer1.Initialize(\"timer1\", 1000)";
_timer1.Initialize(ba,"timer1",(long) (1000));
RDebugUtils.currentLine=65556;
 //BA.debugLineNum = 65556;BA.debugLine="timer1.Enabled = True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=65557;
 //BA.debugLineNum = 65557;BA.debugLine="manager.Initialize(GetState)";
_manager._initialize(null,ba,(Object)(_getstate()));
RDebugUtils.currentLine=65558;
 //BA.debugLineNum = 65558;BA.debugLine="cho.Initialize";
_cho.Initialize();
RDebugUtils.currentLine=65559;
 //BA.debugLineNum = 65559;BA.debugLine="save.Initialize";
_save.Initialize();
RDebugUtils.currentLine=65560;
 //BA.debugLineNum = 65560;BA.debugLine="cho.InitialDirectory=dir1&\"\\Projects\"";
_cho.setInitialDirectory(_dir1+"\\Projects");
RDebugUtils.currentLine=65561;
 //BA.debugLineNum = 65561;BA.debugLine="save.InitialDirectory=cho.InitialDirectory";
_save.setInitialDirectory(_cho.getInitialDirectory());
RDebugUtils.currentLine=65563;
 //BA.debugLineNum = 65563;BA.debugLine="End Sub";
return "";
}
public static b4j.example.main._undodata  _getstate() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getstate"))
	return (b4j.example.main._undodata) Debug.delegate(ba, "getstate", null);
b4j.example.main._undodata _ud = null;
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub GetState As UndoData";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Dim ud As UndoData";
_ud = new b4j.example.main._undodata();
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="ud.Initialize";
_ud.Initialize();
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="ud.Text = edit.HtmlText";
_ud.Text = _edit.getHtmlText();
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="Return ud";
if (true) return _ud;
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="End Sub";
return null;
}
public static String  _btnredo_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnredo_action"))
	return (String) Debug.delegate(ba, "btnredo_action", null);
b4j.example.main._undodata _ud = null;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub btnredo_Action";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Dim ud As UndoData = manager.Redo";
_ud = (b4j.example.main._undodata)(_manager._redo(null));
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="If ud <> Null Then";
if (_ud!= null) { 
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="SetState(ud)";
_setstate(_ud);
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="StatusBar1.Progress=100";
_statusbar1.setProgress(100);
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="StatusBar1.Text=\"ReDone @\"&time";
_statusbar1.setText("ReDone @"+_time);
 };
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="End Sub";
return "";
}
public static String  _setstate(b4j.example.main._undodata _ud) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "setstate"))
	return (String) Debug.delegate(ba, "setstate", new Object[] {_ud});
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub SetState (ud As UndoData)";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="edit.HtmlText = ud.Text";
_edit.setHtmlText(_ud.Text);
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="End Sub";
return "";
}
public static String  _btnundo_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnundo_action"))
	return (String) Debug.delegate(ba, "btnundo_action", null);
b4j.example.main._undodata _ud = null;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub btnundo_Action";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Dim ud As UndoData = manager.Undo";
_ud = (b4j.example.main._undodata)(_manager._undo(null));
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="SetState(ud)";
_setstate(_ud);
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="StatusBar1.Progress=100";
_statusbar1.setProgress(100);
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="StatusBar1.Text=\"UnDone @\"&time";
_statusbar1.setText("UnDone @"+_time);
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="End Sub";
return "";
}
public static String  _button1_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "button1_action"))
	return (String) Debug.delegate(ba, "button1_action", null);
String _filename = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub Button1_Action";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Dim filename As String = save.ShowSave(MainForm)";
_filename = _save.ShowSave(_mainform);
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="save.setExtensionFilter(\"TextFile\", Array As Stri";
_save.SetExtensionFilter("TextFile",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"*.txt"}));
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="save.InitialFileName=\"default.txt\"";
_save.setInitialFileName("default.txt");
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="save.Title=\"Save File\"";
_save.setTitle("Save File");
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="If filename <> \"\" Then";
if ((_filename).equals("") == false) { 
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="If filename.ToLowerCase.EndsWith(\".txt\") = False";
if (_filename.toLowerCase().endsWith(".txt")==anywheresoftware.b4a.keywords.Common.False) { 
_filename = _filename+".txt";};
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="Dim out As OutputStream = File.OpenOutput(\"\", fil";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput("",_filename,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="File.Delete(dir,\"nosave.txt\")";
anywheresoftware.b4a.keywords.Common.File.Delete(_dir,"nosave.txt");
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="Log(\"File saved: \" & filename)";
anywheresoftware.b4a.keywords.Common.Log("File saved: "+_filename);
 };
RDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="End Sub";
return "";
}
public static String  _button2_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "button2_action"))
	return (String) Debug.delegate(ba, "button2_action", null);
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub Button2_Action";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_closerequest(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "mainform_closerequest"))
	return (String) Debug.delegate(ba, "mainform_closerequest", new Object[] {_eventdata});
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub Mainform_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="If File.Exists(dir,\"nosave.txt\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_dir,"nosave.txt")) { 
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="If fx.Msgbox2(MainForm,\"You apear to close witho";
if (_fx.Msgbox2(_mainform,"You apear to close without Saving the File! would you like to Save the current document?","Save?!","Yes","","No",_fx.MSGBOX_WARNING)==_fx.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="Button1_Action";
_button1_action();
 }else {
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="File.WriteString(dir,\"nosave.txt\",\"true\")";
anywheresoftware.b4a.keywords.Common.File.WriteString(_dir,"nosave.txt","true");
 };
 }else {
RDebugUtils.currentLine=3801097;
 //BA.debugLineNum = 3801097;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=3801098;
 //BA.debugLineNum = 3801098;BA.debugLine="MainForm.Close";
_mainform.Close();
 };
RDebugUtils.currentLine=3801100;
 //BA.debugLineNum = 3801100;BA.debugLine="End Sub";
return "";
}
public static String  _menubar1_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "menubar1_action"))
	return (String) Debug.delegate(ba, "menubar1_action", null);
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub MenuBar1_Action";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="mi = Sender";
_mi.setObject((javafx.scene.control.MenuItem)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="If mi.Text=\"_Close\" Then";
if ((_mi.getText()).equals("_Close")) { 
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="MainForm.Close";
_mainform.Close();
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="Log(\"close..\")";
anywheresoftware.b4a.keywords.Common.Log("close..");
 };
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="If mi.Text=\"_Undo\" Then";
if ((_mi.getText()).equals("_Undo")) { 
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="btnundo_Action";
_btnundo_action();
 };
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="If mi.Text=\"_Redo\" Then";
if ((_mi.getText()).equals("_Redo")) { 
RDebugUtils.currentLine=327690;
 //BA.debugLineNum = 327690;BA.debugLine="btnredo_Action";
_btnredo_action();
 };
RDebugUtils.currentLine=327692;
 //BA.debugLineNum = 327692;BA.debugLine="If mi.Text=\"_Save\" Then";
if ((_mi.getText()).equals("_Save")) { 
RDebugUtils.currentLine=327693;
 //BA.debugLineNum = 327693;BA.debugLine="Button1_Action";
_button1_action();
 };
RDebugUtils.currentLine=327695;
 //BA.debugLineNum = 327695;BA.debugLine="End Sub";
return "";
}
public static String  _menubar1_selectedchange(boolean _selected) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "menubar1_selectedchange"))
	return (String) Debug.delegate(ba, "menubar1_selectedchange", new Object[] {_selected});
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub MenuBar1_SelectedChange (Selected As Boolean)";
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return "";
}
public static String  _mi_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "mi_action"))
	return (String) Debug.delegate(ba, "mi_action", null);
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub mi_Action";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="mi = Sender";
_mi.setObject((javafx.scene.control.MenuItem)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="If mi.Text=\"_Kopieren\" Then";
if ((_mi.getText()).equals("_Kopieren")) { 
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="Log(\"close..\")";
anywheresoftware.b4a.keywords.Common.Log("close..");
 };
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="End Sub";
return "";
}
public static String  _timer1_tick() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "timer1_tick"))
	return (String) Debug.delegate(ba, "timer1_tick", null);
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub Timer1_Tick";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="manager.AddState(GetState) 'nothing will happen i";
_manager._addstate(null,(Object)(_getstate()));
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="End Sub";
return "";
}
}