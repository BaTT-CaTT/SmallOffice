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
public static anywheresoftware.b4j.objects.FileChooserWrapper _save1 = null;
public static String _time = "";
public static String _date = "";
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
public static anywheresoftware.b4j.objects.HTMLEditorWrapper _edit = null;
public static anywheresoftware.b4j.objects.StatusBarWrapper _statusbar1 = null;
public static anywheresoftware.b4a.objects.streams.File.TextReaderWrapper _tr = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pane1 = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper _textarea1 = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ContextMenuWrapper _cmenu = null;
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
 //BA.debugLineNum = 65538;BA.debugLine="MainForm.SetFormStyle(\"DECORATED\")";
_mainform.SetFormStyle("DECORATED");
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="MainForm.title=\"SmallNode\"";
_mainform.setTitle("SmallNode");
RDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="MainForm.WindowWidth = fx.PrimaryScreen.MaxX - fx";
_mainform.setWindowWidth(_fx.getPrimaryScreen().getMaxX()-_fx.getPrimaryScreen().getMinX());
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="MainForm.WindowLeft = fx.PrimaryScreen.MinX";
_mainform.setWindowLeft(_fx.getPrimaryScreen().getMinX());
RDebugUtils.currentLine=65543;
 //BA.debugLineNum = 65543;BA.debugLine="MainForm.WindowHeight = fx.PrimaryScreen.MaxY - f";
_mainform.setWindowHeight(_fx.getPrimaryScreen().getMaxY()-_fx.getPrimaryScreen().getMinY());
RDebugUtils.currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="MainForm.WindowTop = fx.PrimaryScreen.MinY";
_mainform.setWindowTop(_fx.getPrimaryScreen().getMinY());
RDebugUtils.currentLine=65545;
 //BA.debugLineNum = 65545;BA.debugLine="MainForm.RootPane.LoadLayout(\"1\") 'Load the layou";
_mainform.getRootPane().LoadLayout(ba,"1");
RDebugUtils.currentLine=65546;
 //BA.debugLineNum = 65546;BA.debugLine="MainForm.Resizable=True";
_mainform.setResizable(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=65547;
 //BA.debugLineNum = 65547;BA.debugLine="menulist.Initialize";
_menulist.Initialize();
RDebugUtils.currentLine=65548;
 //BA.debugLineNum = 65548;BA.debugLine="CMenu.Initialize(\"CM\")";
_cmenu.Initialize(ba,"CM");
RDebugUtils.currentLine=65549;
 //BA.debugLineNum = 65549;BA.debugLine="prop.Initialize(\"prop\")";
_prop.Initialize(ba,"prop");
RDebugUtils.currentLine=65550;
 //BA.debugLineNum = 65550;BA.debugLine="If File.Exists(dir,\"logs.txt\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_dir,"logs.txt")) { 
 }else {
RDebugUtils.currentLine=65553;
 //BA.debugLineNum = 65553;BA.debugLine="File.MakeDir(\"C:\\Users\\Public\\Documents\",\"SmartO";
anywheresoftware.b4a.keywords.Common.File.MakeDir("C:\\Users\\Public\\Documents","SmartOffice\\Projects\\Web");
RDebugUtils.currentLine=65554;
 //BA.debugLineNum = 65554;BA.debugLine="File.MakeDir(\"C:\\\",\"SmartOffice\\core\\data\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir("C:\\","SmartOffice\\core\\data");
RDebugUtils.currentLine=65555;
 //BA.debugLineNum = 65555;BA.debugLine="File.MakeDir(\"C:\\\",\"SmartOffice\\Projects\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir("C:\\","SmartOffice\\Projects");
RDebugUtils.currentLine=65556;
 //BA.debugLineNum = 65556;BA.debugLine="File.WriteList(dir,\"setlist.txt\",menulist)";
anywheresoftware.b4a.keywords.Common.File.WriteList(_dir,"setlist.txt",_menulist);
RDebugUtils.currentLine=65558;
 //BA.debugLineNum = 65558;BA.debugLine="File.WriteString(dir,\"log.txt\",\"Willkommen\")";
anywheresoftware.b4a.keywords.Common.File.WriteString(_dir,"log.txt","Willkommen");
RDebugUtils.currentLine=65559;
 //BA.debugLineNum = 65559;BA.debugLine="File.WriteString(dir,\"new.txt\",\"Welcome this is";
anywheresoftware.b4a.keywords.Common.File.WriteString(_dir,"new.txt","Welcome this is a New Texted file.");
 };
RDebugUtils.currentLine=65561;
 //BA.debugLineNum = 65561;BA.debugLine="menulist.Clear";
_menulist.Clear();
RDebugUtils.currentLine=65563;
 //BA.debugLineNum = 65563;BA.debugLine="mi.Initialize(\"Html Code\",\"mi\")";
_mi.Initialize(ba,"Html Code","mi");
RDebugUtils.currentLine=65564;
 //BA.debugLineNum = 65564;BA.debugLine="CMenu.MenuItems.Add(mi)";
_cmenu.getMenuItems().Add((Object)(_mi.getObject()));
RDebugUtils.currentLine=65565;
 //BA.debugLineNum = 65565;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=65566;
 //BA.debugLineNum = 65566;BA.debugLine="time=DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=65567;
 //BA.debugLineNum = 65567;BA.debugLine="date=DateTime.Date(DateTime.Now)";
_date = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=65568;
 //BA.debugLineNum = 65568;BA.debugLine="timer1.Initialize(\"timer1\", 1000)";
_timer1.Initialize(ba,"timer1",(long) (1000));
RDebugUtils.currentLine=65569;
 //BA.debugLineNum = 65569;BA.debugLine="timer1.Enabled = True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=65570;
 //BA.debugLineNum = 65570;BA.debugLine="manager.Initialize(GetState)";
_manager._initialize(null,ba,(Object)(_getstate()));
RDebugUtils.currentLine=65571;
 //BA.debugLineNum = 65571;BA.debugLine="cho.Initialize";
_cho.Initialize();
RDebugUtils.currentLine=65572;
 //BA.debugLineNum = 65572;BA.debugLine="save1.Initialize";
_save1.Initialize();
RDebugUtils.currentLine=65573;
 //BA.debugLineNum = 65573;BA.debugLine="cho.InitialDirectory=dir1&\"\\Projects\"";
_cho.setInitialDirectory(_dir1+"\\Projects");
RDebugUtils.currentLine=65574;
 //BA.debugLineNum = 65574;BA.debugLine="save1.InitialDirectory=dir1&\"\\Projects\"";
_save1.setInitialDirectory(_dir1+"\\Projects");
RDebugUtils.currentLine=65575;
 //BA.debugLineNum = 65575;BA.debugLine="RedirectOutput(dir, \"logs.txt\")";
_redirectoutput(_dir,"logs.txt");
RDebugUtils.currentLine=65578;
 //BA.debugLineNum = 65578;BA.debugLine="MainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=65579;
 //BA.debugLineNum = 65579;BA.debugLine="End Sub";
return "";
}
public static b4j.example.main._undodata  _getstate() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getstate"))
	return (b4j.example.main._undodata) Debug.delegate(ba, "getstate", null);
b4j.example.main._undodata _ud = null;
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub GetState As UndoData";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Dim ud As UndoData";
_ud = new b4j.example.main._undodata();
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="ud.Initialize";
_ud.Initialize();
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="ud.Text = edit.HtmlText";
_ud.Text = _edit.getHtmlText();
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="Return ud";
if (true) return _ud;
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="End Sub";
return null;
}
public static String  _redirectoutput(String _dir2,String _filename) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "redirectoutput"))
	return (String) Debug.delegate(ba, "redirectoutput", new Object[] {_dir2,_filename});
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub RedirectOutput (dir2 As String, FileName As St";
RDebugUtils.currentLine=262154;
 //BA.debugLineNum = 262154;BA.debugLine="End Sub";
return "";
}
public static String  _btnredo_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnredo_action"))
	return (String) Debug.delegate(ba, "btnredo_action", null);
b4j.example.main._undodata _ud = null;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub btnredo_Action";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Dim ud As UndoData = manager.Redo";
_ud = (b4j.example.main._undodata)(_manager._redo(null));
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="If ud <> Null Then";
if (_ud!= null) { 
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="SetState(ud)";
_setstate(_ud);
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="StatusBar1.Progress=100";
_statusbar1.setProgress(100);
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="StatusBar1.Text=\"ReDone @\"&time";
_statusbar1.setText("ReDone @"+_time);
 };
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="End Sub";
return "";
}
public static String  _setstate(b4j.example.main._undodata _ud) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "setstate"))
	return (String) Debug.delegate(ba, "setstate", new Object[] {_ud});
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub SetState (ud As UndoData)";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="edit.HtmlText = ud.Text";
_edit.setHtmlText(_ud.Text);
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="End Sub";
return "";
}
public static String  _btnundo_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnundo_action"))
	return (String) Debug.delegate(ba, "btnundo_action", null);
b4j.example.main._undodata _ud = null;
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub btnundo_Action";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Dim ud As UndoData = manager.Undo";
_ud = (b4j.example.main._undodata)(_manager._undo(null));
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="SetState(ud)";
_setstate(_ud);
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="StatusBar1.Progress=100";
_statusbar1.setProgress(100);
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="StatusBar1.Text=\"UnDone @\"&time";
_statusbar1.setText("UnDone @"+_time);
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="End Sub";
return "";
}
public static String  _button1_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "button1_action"))
	return (String) Debug.delegate(ba, "button1_action", null);
String _filename = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub Button1_Action";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="save1.setExtensionFilter(\"TextFile\", Array As Str";
_save1.SetExtensionFilter("TextFile",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"*.txt"}));
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="save1.InitialFileName=\"default.txt\"";
_save1.setInitialFileName("default.txt");
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="save1.Title=\"Save File\"";
_save1.setTitle("Save File");
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Dim filename As String = save1.ShowSave(MainForm)";
_filename = _save1.ShowSave(_mainform);
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="If filename <> \"\" Then";
if ((_filename).equals("") == false) { 
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="If filename.ToLowerCase.EndsWith(\".txt\") = False";
if (_filename.toLowerCase().endsWith(".txt")==anywheresoftware.b4a.keywords.Common.False) { 
_filename = _filename+".txt";};
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="Dim out As OutputStream = File.OpenOutput(\"\", fil";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput("",_filename,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="File.Delete(dir,\"nosave.txt\")";
anywheresoftware.b4a.keywords.Common.File.Delete(_dir,"nosave.txt");
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="File.WriteString(\"\",filename,edit.HtmlText)";
anywheresoftware.b4a.keywords.Common.File.WriteString("",_filename,_edit.getHtmlText());
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="MainForm.Title=filename";
_mainform.setTitle(_filename);
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="menulist.Add(filename)";
_menulist.Add((Object)(_filename));
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="new_file(filename)";
_new_file(_filename);
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=917518;
 //BA.debugLineNum = 917518;BA.debugLine="Log(\"File saved: \" & filename)";
anywheresoftware.b4a.keywords.Common.Log("File saved: "+_filename);
 };
RDebugUtils.currentLine=917521;
 //BA.debugLineNum = 917521;BA.debugLine="End Sub";
return "";
}
public static String  _new_file(String _text) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "new_file"))
	return (String) Debug.delegate(ba, "new_file", new Object[] {_text});
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub new_file(text As String)";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="File.WriteString(dir,\"new.txt\",text)";
anywheresoftware.b4a.keywords.Common.File.WriteString(_dir,"new.txt",_text);
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="read_file";
_read_file();
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_closerequest(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "mainform_closerequest"))
	return (String) Debug.delegate(ba, "mainform_closerequest", new Object[] {_eventdata});
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub Mainform_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="If File.Exists(dir,\"nosave.txt\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_dir,"nosave.txt")) { 
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="If fx.Msgbox2(MainForm,\"You apear to close witho";
if (_fx.Msgbox2(_mainform,"You apear to close without Saving the File! would you like to Save the current document?","Save?!","Yes","","No",_fx.MSGBOX_WARNING)==_fx.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="Button1_Action";
_button1_action();
 }else {
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="File.WriteString(dir,\"nosave.txt\",\"true\")";
anywheresoftware.b4a.keywords.Common.File.WriteString(_dir,"nosave.txt","true");
 };
 }else {
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="MainForm.Close";
_mainform.Close();
 };
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="End Sub";
return "";
}
public static String  _menubar1_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "menubar1_action"))
	return (String) Debug.delegate(ba, "menubar1_action", null);
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub MenuBar1_Action";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="mi = Sender";
_mi.setObject((javafx.scene.control.MenuItem)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="If mi.Text=\"_Close\" Then";
if ((_mi.getText()).equals("_Close")) { 
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="MainForm.Close";
_mainform.Close();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Log(\"close..\")";
anywheresoftware.b4a.keywords.Common.Log("close..");
 };
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="If mi.Text=\"_New\" Then";
if ((_mi.getText()).equals("_New")) { 
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="new_file(\"New Text\")";
_new_file("New Text");
 };
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="If mi.Text=\"_Show Code\" Then";
if ((_mi.getText()).equals("_Show Code")) { 
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="show_su";
_show_su();
 };
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="If mi.Text=\"_Open\" Then";
if ((_mi.getText()).equals("_Open")) { 
RDebugUtils.currentLine=458765;
 //BA.debugLineNum = 458765;BA.debugLine="open_new";
_open_new();
 };
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="If mi.Text=\"_Undo\" Then";
if ((_mi.getText()).equals("_Undo")) { 
RDebugUtils.currentLine=458768;
 //BA.debugLineNum = 458768;BA.debugLine="btnundo_Action";
_btnundo_action();
 };
RDebugUtils.currentLine=458770;
 //BA.debugLineNum = 458770;BA.debugLine="If mi.Text=\"_Redo\" Then";
if ((_mi.getText()).equals("_Redo")) { 
RDebugUtils.currentLine=458771;
 //BA.debugLineNum = 458771;BA.debugLine="btnredo_Action";
_btnredo_action();
 };
RDebugUtils.currentLine=458773;
 //BA.debugLineNum = 458773;BA.debugLine="If mi.Text=\"_Save\" Then";
if ((_mi.getText()).equals("_Save")) { 
RDebugUtils.currentLine=458774;
 //BA.debugLineNum = 458774;BA.debugLine="Button1_Action";
_button1_action();
 };
RDebugUtils.currentLine=458776;
 //BA.debugLineNum = 458776;BA.debugLine="End Sub";
return "";
}
public static String  _show_su() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "show_su"))
	return (String) Debug.delegate(ba, "show_su", null);
b4j.example.modalform _mf = null;
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub show_su";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Dim mf As ModalForm";
_mf = new b4j.example.modalform();
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize(null,ba,_mainform);
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="mf.read_file";
_mf._read_file(null);
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="End Sub";
return "";
}
public static String  _open_new() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "open_new"))
	return (String) Debug.delegate(ba, "open_new", null);
String _filen = "";
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub open_new";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Dim filen As String = save1.ShowOpen(MainForm)";
_filen = _save1.ShowOpen(_mainform);
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="save1.Title=\"Open File\"";
_save1.setTitle("Open File");
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="If filen <> \"\" Then";
if ((_filen).equals("") == false) { 
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="menulist.Clear";
_menulist.Clear();
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="menulist.Add(filen)";
_menulist.Add((Object)(_filen));
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="edit.HtmlText=File.ReadString(filen,\"\")";
_edit.setHtmlText(anywheresoftware.b4a.keywords.Common.File.ReadString(_filen,""));
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="File.WriteString(dir,\"new.txt\",filen)";
anywheresoftware.b4a.keywords.Common.File.WriteString(_dir,"new.txt",_filen);
 };
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="End Sub";
return "";
}
public static String  _menubar1_selectedchange(boolean _selected) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "menubar1_selectedchange"))
	return (String) Debug.delegate(ba, "menubar1_selectedchange", new Object[] {_selected});
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub MenuBar1_SelectedChange (Selected As Boolean)";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="End Sub";
return "";
}
public static String  _read_file() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "read_file"))
	return (String) Debug.delegate(ba, "read_file", null);
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub read_file";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="edit.HtmlText=File.ReadString(dir,\"new.txt\")";
_edit.setHtmlText(anywheresoftware.b4a.keywords.Common.File.ReadString(_dir,"new.txt"));
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="End Sub";
return "";
}
public static String  _pan1_resize(double _width,double _height) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "pan1_resize"))
	return (String) Debug.delegate(ba, "pan1_resize", new Object[] {_width,_height});
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub pan1_Resize (Width As Double, Height As Double";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Pane1.PrefHeight=-1";
_pane1.setPrefHeight(-1);
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="pane1.PrefWidth=-1";
_pane1.setPrefWidth(-1);
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="End Sub";
return "";
}
public static String  _timer1_tick() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "timer1_tick"))
	return (String) Debug.delegate(ba, "timer1_tick", null);
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Timer1_Tick";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="manager.AddState(GetState) 'nothing will happen i";
_manager._addstate(null,(Object)(_getstate()));
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return "";
}
}