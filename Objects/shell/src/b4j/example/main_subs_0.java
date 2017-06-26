package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (main) ","main",0,main.ba,main.mostCurrent,57);
if (RapidSub.canDelegate("application_error")) return b4j.example.main.remoteMe.runUserSub(false, "main","application_error", _error, _stacktrace);
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 57;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Return True";
Debug.ShouldStop(33554432);
if (true) return main.__c.getField(true,"True");
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,27);
if (RapidSub.canDelegate("appstart")) return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 27;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(134217728);
main._mainform = _form1;
 BA.debugLineNum = 29;BA.debugLine="MainForm.RootPane.LoadLayout(\"1\") 'Load the layou";
Debug.ShouldStop(268435456);
main._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("1")));
 BA.debugLineNum = 30;BA.debugLine="MainForm.Resizable=False";
Debug.ShouldStop(536870912);
main._mainform.runMethod(true,"setResizable",main.__c.getField(true,"False"));
 BA.debugLineNum = 31;BA.debugLine="MainForm.Show";
Debug.ShouldStop(1073741824);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 32;BA.debugLine="prop.Initialize(\"prop\")";
Debug.ShouldStop(-2147483648);
main._prop.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("prop")));
 BA.debugLineNum = 33;BA.debugLine="If File.Exists(\"C:\\SmartOffice\\Files\",\"log.txt\")";
Debug.ShouldStop(1);
if (main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(BA.ObjectToString("C:\\SmartOffice\\Files")),(Object)(RemoteObject.createImmutable("log.txt"))).<Boolean>get().booleanValue()) { 
 }else {
 BA.debugLineNum = 36;BA.debugLine="File.MakeDir(\"C:\\\",\"SmartOffice\\core\\data\")";
Debug.ShouldStop(8);
main.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(BA.ObjectToString("C:\\")),(Object)(RemoteObject.createImmutable("SmartOffice\\core\\data")));
 BA.debugLineNum = 37;BA.debugLine="File.MakeDir(\"C:\\\",\"SmartOffice\\Projects\")";
Debug.ShouldStop(16);
main.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(BA.ObjectToString("C:\\")),(Object)(RemoteObject.createImmutable("SmartOffice\\Projects")));
 BA.debugLineNum = 38;BA.debugLine="File.MakeDir(\"C:\\Users\\Public\\Documents\",\"SmartO";
Debug.ShouldStop(32);
main.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(BA.ObjectToString("C:\\Users\\Public\\Documents")),(Object)(RemoteObject.createImmutable("SmartOffice\\Projects")));
 BA.debugLineNum = 39;BA.debugLine="File.WriteString(dir1,\"log.txt\",\"Willkommen\")";
Debug.ShouldStop(64);
main.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main._dir1),(Object)(BA.ObjectToString("log.txt")),(Object)(RemoteObject.createImmutable("Willkommen")));
 };
 BA.debugLineNum = 41;BA.debugLine="menulist.Initialize";
Debug.ShouldStop(256);
main._menulist.runVoidMethod ("Initialize");
 BA.debugLineNum = 42;BA.debugLine="menulist.AddAll(MenuBar1.Menus)";
Debug.ShouldStop(512);
main._menulist.runVoidMethod ("AddAll",(Object)(main._menubar1.runMethod(false,"getMenus")));
 BA.debugLineNum = 43;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
Debug.ShouldStop(1024);
main.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 44;BA.debugLine="time=DateTime.Time(DateTime.Now)";
Debug.ShouldStop(2048);
main._time = main.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(main.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 BA.debugLineNum = 45;BA.debugLine="date=DateTime.Date(DateTime.Now)";
Debug.ShouldStop(4096);
main._date = main.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(main.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 BA.debugLineNum = 46;BA.debugLine="timer1.Initialize(\"timer1\", 1000)";
Debug.ShouldStop(8192);
main._timer1.runVoidMethod ("Initialize",main.ba,(Object)(BA.ObjectToString("timer1")),(Object)(BA.numberCast(long.class, 1000)));
 BA.debugLineNum = 47;BA.debugLine="timer1.Enabled = True";
Debug.ShouldStop(16384);
main._timer1.runMethod(true,"setEnabled",main.__c.getField(true,"True"));
 BA.debugLineNum = 48;BA.debugLine="manager.Initialize(GetState)";
Debug.ShouldStop(32768);
main._manager.runClassMethod (b4j.example.undomanager.class, "_initialize",main.ba,(Object)((_getstate())));
 BA.debugLineNum = 49;BA.debugLine="cho.Initialize";
Debug.ShouldStop(65536);
main._cho.runVoidMethod ("Initialize");
 BA.debugLineNum = 50;BA.debugLine="save.Initialize";
Debug.ShouldStop(131072);
main._save.runVoidMethod ("Initialize");
 BA.debugLineNum = 51;BA.debugLine="cho.InitialDirectory=dir1&\"\\Projects\"";
Debug.ShouldStop(262144);
main._cho.runMethod(true,"setInitialDirectory",RemoteObject.concat(main._dir1,RemoteObject.createImmutable("\\Projects")));
 BA.debugLineNum = 52;BA.debugLine="save.InitialDirectory=cho.InitialDirectory";
Debug.ShouldStop(524288);
main._save.runMethod(true,"setInitialDirectory",main._cho.runMethod(true,"getInitialDirectory"));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnredo_action() throws Exception{
try {
		Debug.PushSubsStack("btnredo_Action (main) ","main",0,main.ba,main.mostCurrent,103);
if (RapidSub.canDelegate("btnredo_action")) return b4j.example.main.remoteMe.runUserSub(false, "main","btnredo_action");
RemoteObject _ud = RemoteObject.declareNull("b4j.example.main._undodata");
 BA.debugLineNum = 103;BA.debugLine="Sub btnredo_Action";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="Dim ud As UndoData = manager.Redo";
Debug.ShouldStop(128);
_ud = (main._manager.runClassMethod (b4j.example.undomanager.class, "_redo"));Debug.locals.put("ud", _ud);Debug.locals.put("ud", _ud);
 BA.debugLineNum = 105;BA.debugLine="If ud <> Null Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("N",_ud)) { 
 BA.debugLineNum = 106;BA.debugLine="SetState(ud)";
Debug.ShouldStop(512);
_setstate(_ud);
 BA.debugLineNum = 107;BA.debugLine="StatusBar1.Progress=100";
Debug.ShouldStop(1024);
main._statusbar1.runMethod(true,"setProgress",BA.numberCast(double.class, 100));
 BA.debugLineNum = 108;BA.debugLine="StatusBar1.Text=\"ReDone @\"&time";
Debug.ShouldStop(2048);
main._statusbar1.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("ReDone @"),main._time));
 };
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnundo_action() throws Exception{
try {
		Debug.PushSubsStack("btnundo_Action (main) ","main",0,main.ba,main.mostCurrent,96);
if (RapidSub.canDelegate("btnundo_action")) return b4j.example.main.remoteMe.runUserSub(false, "main","btnundo_action");
RemoteObject _ud = RemoteObject.declareNull("b4j.example.main._undodata");
 BA.debugLineNum = 96;BA.debugLine="Sub btnundo_Action";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="Dim ud As UndoData = manager.Undo";
Debug.ShouldStop(1);
_ud = (main._manager.runClassMethod (b4j.example.undomanager.class, "_undo"));Debug.locals.put("ud", _ud);Debug.locals.put("ud", _ud);
 BA.debugLineNum = 98;BA.debugLine="SetState(ud)";
Debug.ShouldStop(2);
_setstate(_ud);
 BA.debugLineNum = 99;BA.debugLine="StatusBar1.Progress=100";
Debug.ShouldStop(4);
main._statusbar1.runMethod(true,"setProgress",BA.numberCast(double.class, 100));
 BA.debugLineNum = 100;BA.debugLine="StatusBar1.Text=\"UnDone @\"&time";
Debug.ShouldStop(8);
main._statusbar1.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("UnDone @"),main._time));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_action() throws Exception{
try {
		Debug.PushSubsStack("Button1_Action (main) ","main",0,main.ba,main.mostCurrent,116);
if (RapidSub.canDelegate("button1_action")) return b4j.example.main.remoteMe.runUserSub(false, "main","button1_action");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
 BA.debugLineNum = 116;BA.debugLine="Sub Button1_Action";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="Dim filename As String = save.ShowSave(MainForm)";
Debug.ShouldStop(1048576);
_filename = main._save.runMethodAndSync(true,"ShowSave",(Object)(main._mainform));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 118;BA.debugLine="save.setExtensionFilter(\"TextFile\", Array As Stri";
Debug.ShouldStop(2097152);
main._save.runVoidMethod ("SetExtensionFilter",(Object)(BA.ObjectToString("TextFile")),(Object)(main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("*.txt")})))));
 BA.debugLineNum = 119;BA.debugLine="save.InitialFileName=\"default.txt\"";
Debug.ShouldStop(4194304);
main._save.runMethod(true,"setInitialFileName",BA.ObjectToString("default.txt"));
 BA.debugLineNum = 120;BA.debugLine="save.Title=\"Save File\"";
Debug.ShouldStop(8388608);
main._save.runMethod(true,"setTitle",BA.ObjectToString("Save File"));
 BA.debugLineNum = 121;BA.debugLine="If filename <> \"\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("!",_filename,BA.ObjectToString(""))) { 
 BA.debugLineNum = 122;BA.debugLine="If filename.ToLowerCase.EndsWith(\".txt\") = False";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_filename.runMethod(true,"toLowerCase").runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".txt"))),main.__c.getField(true,"False"))) { 
_filename = RemoteObject.concat(_filename,RemoteObject.createImmutable(".txt"));Debug.locals.put("filename", _filename);};
 BA.debugLineNum = 123;BA.debugLine="Dim out As OutputStream = File.OpenOutput(\"\", fil";
Debug.ShouldStop(67108864);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = main.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(BA.ObjectToString("")),(Object)(_filename),(Object)(main.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 124;BA.debugLine="File.Delete(dir,\"nosave.txt\")";
Debug.ShouldStop(134217728);
main.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main._dir),(Object)(RemoteObject.createImmutable("nosave.txt")));
 BA.debugLineNum = 125;BA.debugLine="out.Close";
Debug.ShouldStop(268435456);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 126;BA.debugLine="Log(\"File saved: \" & filename)";
Debug.ShouldStop(536870912);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("File saved: "),_filename)));
 };
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button2_action() throws Exception{
try {
		Debug.PushSubsStack("Button2_Action (main) ","main",0,main.ba,main.mostCurrent,112);
if (RapidSub.canDelegate("button2_action")) return b4j.example.main.remoteMe.runUserSub(false, "main","button2_action");
 BA.debugLineNum = 112;BA.debugLine="Sub Button2_Action";
Debug.ShouldStop(32768);
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstate() throws Exception{
try {
		Debug.PushSubsStack("GetState (main) ","main",0,main.ba,main.mostCurrent,61);
if (RapidSub.canDelegate("getstate")) return b4j.example.main.remoteMe.runUserSub(false, "main","getstate");
RemoteObject _ud = RemoteObject.declareNull("b4j.example.main._undodata");
 BA.debugLineNum = 61;BA.debugLine="Sub GetState As UndoData";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="Dim ud As UndoData";
Debug.ShouldStop(536870912);
_ud = RemoteObject.createNew ("b4j.example.main._undodata");Debug.locals.put("ud", _ud);
 BA.debugLineNum = 63;BA.debugLine="ud.Initialize";
Debug.ShouldStop(1073741824);
_ud.runVoidMethod ("Initialize");
 BA.debugLineNum = 64;BA.debugLine="ud.Text = edit.HtmlText";
Debug.ShouldStop(-2147483648);
_ud.setField ("Text",main._edit.runMethod(true,"getHtmlText"));
 BA.debugLineNum = 66;BA.debugLine="Return ud";
Debug.ShouldStop(2);
if (true) return _ud;
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainform_closerequest(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("Mainform_CloseRequest (main) ","main",0,main.ba,main.mostCurrent,143);
if (RapidSub.canDelegate("mainform_closerequest")) return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_closerequest", _eventdata);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 143;BA.debugLine="Sub Mainform_CloseRequest (EventData As Event)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 144;BA.debugLine="If File.Exists(dir,\"nosave.txt\") Then";
Debug.ShouldStop(32768);
if (main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main._dir),(Object)(RemoteObject.createImmutable("nosave.txt"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 146;BA.debugLine="If fx.Msgbox2(MainForm,\"You apear to close witho";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",main._fx.runMethodAndSync(true,"Msgbox2",(Object)(main._mainform),(Object)(BA.ObjectToString("You apear to close without Saving the File! would you like to Save the current document?")),(Object)(BA.ObjectToString("Save?!")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)(main._fx.getField(false,"MSGBOX_WARNING"))),BA.numberCast(double.class, main._fx.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 147;BA.debugLine="Button1_Action";
Debug.ShouldStop(262144);
_button1_action();
 }else {
 BA.debugLineNum = 149;BA.debugLine="File.WriteString(dir,\"nosave.txt\",\"true\")";
Debug.ShouldStop(1048576);
main.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main._dir),(Object)(BA.ObjectToString("nosave.txt")),(Object)(RemoteObject.createImmutable("true")));
 };
 }else {
 BA.debugLineNum = 152;BA.debugLine="EventData.Consume";
Debug.ShouldStop(8388608);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 153;BA.debugLine="MainForm.Close";
Debug.ShouldStop(16777216);
main._mainform.runVoidMethod ("Close");
 };
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menubar1_action() throws Exception{
try {
		Debug.PushSubsStack("MenuBar1_Action (main) ","main",0,main.ba,main.mostCurrent,74);
if (RapidSub.canDelegate("menubar1_action")) return b4j.example.main.remoteMe.runUserSub(false, "main","menubar1_action");
 BA.debugLineNum = 74;BA.debugLine="Sub MenuBar1_Action";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="mi = Sender";
Debug.ShouldStop(1024);
main._mi.setObject(main.__c.runMethod(false,"Sender",main.ba));
 BA.debugLineNum = 76;BA.debugLine="If mi.Text=\"_Close\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",main._mi.runMethod(true,"getText"),BA.ObjectToString("_Close"))) { 
 BA.debugLineNum = 77;BA.debugLine="MainForm.Close";
Debug.ShouldStop(4096);
main._mainform.runVoidMethod ("Close");
 BA.debugLineNum = 78;BA.debugLine="Log(\"close..\")";
Debug.ShouldStop(8192);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("close..")));
 };
 BA.debugLineNum = 80;BA.debugLine="If mi.Text=\"_Undo\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",main._mi.runMethod(true,"getText"),BA.ObjectToString("_Undo"))) { 
 BA.debugLineNum = 81;BA.debugLine="btnundo_Action";
Debug.ShouldStop(65536);
_btnundo_action();
 };
 BA.debugLineNum = 83;BA.debugLine="If mi.Text=\"_Redo\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",main._mi.runMethod(true,"getText"),BA.ObjectToString("_Redo"))) { 
 BA.debugLineNum = 84;BA.debugLine="btnredo_Action";
Debug.ShouldStop(524288);
_btnredo_action();
 };
 BA.debugLineNum = 86;BA.debugLine="If mi.Text=\"_Save\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",main._mi.runMethod(true,"getText"),BA.ObjectToString("_Save"))) { 
 BA.debugLineNum = 87;BA.debugLine="Button1_Action";
Debug.ShouldStop(4194304);
_button1_action();
 };
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menubar1_selectedchange(RemoteObject _selected) throws Exception{
try {
		Debug.PushSubsStack("MenuBar1_SelectedChange (main) ","main",0,main.ba,main.mostCurrent,131);
if (RapidSub.canDelegate("menubar1_selectedchange")) return b4j.example.main.remoteMe.runUserSub(false, "main","menubar1_selectedchange", _selected);
Debug.locals.put("Selected", _selected);
 BA.debugLineNum = 131;BA.debugLine="Sub MenuBar1_SelectedChange (Selected As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mi_action() throws Exception{
try {
		Debug.PushSubsStack("mi_Action (main) ","main",0,main.ba,main.mostCurrent,135);
if (RapidSub.canDelegate("mi_action")) return b4j.example.main.remoteMe.runUserSub(false, "main","mi_action");
 BA.debugLineNum = 135;BA.debugLine="Sub mi_Action";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="mi = Sender";
Debug.ShouldStop(128);
main._mi.setObject(main.__c.runMethod(false,"Sender",main.ba));
 BA.debugLineNum = 137;BA.debugLine="If mi.Text=\"_Kopieren\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",main._mi.runMethod(true,"getText"),BA.ObjectToString("_Kopieren"))) { 
 BA.debugLineNum = 139;BA.debugLine="Log(\"close..\")";
Debug.ShouldStop(1024);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("close..")));
 };
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
cssutils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
textflow.myClass = BA.getDeviceClass ("b4j.example.textflow");
undomanager.myClass = BA.getDeviceClass ("b4j.example.undomanager");
cssutils.myClass = BA.getDeviceClass ("b4j.example.cssutils");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 9;BA.debugLine="Private MenuBar1 As MenuBar";
main._menubar1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper");
 //BA.debugLineNum = 10;BA.debugLine="Dim dir As String=\"C:\\SmartOffice\\core\\data\"";
main._dir = BA.ObjectToString("C:\\SmartOffice\\core\\data");
 //BA.debugLineNum = 11;BA.debugLine="Dim dir1 As String=\"C:\\Users\\Public\\Documents\\Sma";
main._dir1 = BA.ObjectToString("C:\\Users\\Public\\Documents\\SmartOffice");
 //BA.debugLineNum = 12;BA.debugLine="Dim menulist As List";
main._menulist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 13;BA.debugLine="Dim prop As PropertySheet";
main._prop = RemoteObject.createNew ("anywheresoftware.b4j.objects.PropertySheetWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Type Record(Text As String, Number As Double, _";
;
 //BA.debugLineNum = 16;BA.debugLine="Type UndoData (Text As String, clr As Int)";
;
 //BA.debugLineNum = 17;BA.debugLine="Private timer1 As Timer";
main._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 18;BA.debugLine="Private manager As UndoManager";
main._manager = RemoteObject.createNew ("b4j.example.undomanager");
 //BA.debugLineNum = 19;BA.debugLine="Private cho As DirectoryChooser";
main._cho = RemoteObject.createNew ("anywheresoftware.b4j.objects.DirectoryChooserWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim save As FileChooser";
main._save = RemoteObject.createNew ("anywheresoftware.b4j.objects.FileChooserWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim time, date As String";
main._time = RemoteObject.createImmutable("");
main._date = RemoteObject.createImmutable("");
 //BA.debugLineNum = 22;BA.debugLine="Dim mi As MenuItem";
main._mi = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private edit As HTMLEditor";
main._edit = RemoteObject.createNew ("anywheresoftware.b4j.objects.HTMLEditorWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private StatusBar1 As StatusBar";
main._statusbar1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.StatusBarWrapper");
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setstate(RemoteObject _ud) throws Exception{
try {
		Debug.PushSubsStack("SetState (main) ","main",0,main.ba,main.mostCurrent,69);
if (RapidSub.canDelegate("setstate")) return b4j.example.main.remoteMe.runUserSub(false, "main","setstate", _ud);
Debug.locals.put("ud", _ud);
 BA.debugLineNum = 69;BA.debugLine="Sub SetState (ud As UndoData)";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="edit.HtmlText = ud.Text";
Debug.ShouldStop(32);
main._edit.runMethod(true,"setHtmlText",_ud.getField(true,"Text"));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timer1_tick() throws Exception{
try {
		Debug.PushSubsStack("Timer1_Tick (main) ","main",0,main.ba,main.mostCurrent,92);
if (RapidSub.canDelegate("timer1_tick")) return b4j.example.main.remoteMe.runUserSub(false, "main","timer1_tick");
 BA.debugLineNum = 92;BA.debugLine="Sub Timer1_Tick";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="manager.AddState(GetState) 'nothing will happen i";
Debug.ShouldStop(268435456);
main._manager.runClassMethod (b4j.example.undomanager.class, "_addstate",(Object)((_getstate())));
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}