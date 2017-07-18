package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (main) ","main",0,main.ba,main.mostCurrent,77);
if (RapidSub.canDelegate("application_error")) return b4j.example.main.remoteMe.runUserSub(false, "main","application_error", _error, _stacktrace);
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 77;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="Return True";
Debug.ShouldStop(8192);
if (true) return main.__c.getField(true,"True");
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,31);
if (RapidSub.canDelegate("appstart")) return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 31;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(-2147483648);
main._mainform = _form1;
 BA.debugLineNum = 33;BA.debugLine="MainForm.SetFormStyle(\"DECORATED\")";
Debug.ShouldStop(1);
main._mainform.runVoidMethod ("SetFormStyle",(Object)(RemoteObject.createImmutable("DECORATED")));
 BA.debugLineNum = 35;BA.debugLine="MainForm.title=\"SmallNode\"";
Debug.ShouldStop(4);
main._mainform.runMethod(true,"setTitle",BA.ObjectToString("SmallNode"));
 BA.debugLineNum = 36;BA.debugLine="MainForm.WindowWidth = fx.PrimaryScreen.MaxX - fx";
Debug.ShouldStop(8);
main._mainform.runMethod(true,"setWindowWidth",RemoteObject.solve(new RemoteObject[] {main._fx.runMethod(false,"getPrimaryScreen").runMethod(true,"getMaxX"),main._fx.runMethod(false,"getPrimaryScreen").runMethod(true,"getMinX")}, "-",1, 0));
 BA.debugLineNum = 37;BA.debugLine="MainForm.WindowLeft = fx.PrimaryScreen.MinX";
Debug.ShouldStop(16);
main._mainform.runMethod(true,"setWindowLeft",main._fx.runMethod(false,"getPrimaryScreen").runMethod(true,"getMinX"));
 BA.debugLineNum = 38;BA.debugLine="MainForm.WindowHeight = fx.PrimaryScreen.MaxY - f";
Debug.ShouldStop(32);
main._mainform.runMethod(true,"setWindowHeight",RemoteObject.solve(new RemoteObject[] {main._fx.runMethod(false,"getPrimaryScreen").runMethod(true,"getMaxY"),main._fx.runMethod(false,"getPrimaryScreen").runMethod(true,"getMinY")}, "-",1, 0));
 BA.debugLineNum = 39;BA.debugLine="MainForm.WindowTop = fx.PrimaryScreen.MinY";
Debug.ShouldStop(64);
main._mainform.runMethod(true,"setWindowTop",main._fx.runMethod(false,"getPrimaryScreen").runMethod(true,"getMinY"));
 BA.debugLineNum = 40;BA.debugLine="MainForm.RootPane.LoadLayout(\"1\") 'Load the layou";
Debug.ShouldStop(128);
main._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("1")));
 BA.debugLineNum = 41;BA.debugLine="MainForm.Resizable=True";
Debug.ShouldStop(256);
main._mainform.runMethod(true,"setResizable",main.__c.getField(true,"True"));
 BA.debugLineNum = 42;BA.debugLine="menulist.Initialize";
Debug.ShouldStop(512);
main._menulist.runVoidMethod ("Initialize");
 BA.debugLineNum = 43;BA.debugLine="CMenu.Initialize(\"CM\")";
Debug.ShouldStop(1024);
main._cmenu.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("CM")));
 BA.debugLineNum = 44;BA.debugLine="prop.Initialize(\"prop\")";
Debug.ShouldStop(2048);
main._prop.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("prop")));
 BA.debugLineNum = 45;BA.debugLine="If File.Exists(dir,\"logs.txt\") Then";
Debug.ShouldStop(4096);
if (main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main._dir),(Object)(RemoteObject.createImmutable("logs.txt"))).<Boolean>get().booleanValue()) { 
 }else {
 BA.debugLineNum = 48;BA.debugLine="File.MakeDir(\"C:\\Users\\Public\\Documents\",\"SmartO";
Debug.ShouldStop(32768);
main.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(BA.ObjectToString("C:\\Users\\Public\\Documents")),(Object)(RemoteObject.createImmutable("SmartOffice\\Projects\\Web")));
 BA.debugLineNum = 49;BA.debugLine="File.MakeDir(\"C:\\\",\"SmartOffice\\core\\data\")";
Debug.ShouldStop(65536);
main.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(BA.ObjectToString("C:\\")),(Object)(RemoteObject.createImmutable("SmartOffice\\core\\data")));
 BA.debugLineNum = 50;BA.debugLine="File.MakeDir(\"C:\\\",\"SmartOffice\\Projects\")";
Debug.ShouldStop(131072);
main.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(BA.ObjectToString("C:\\")),(Object)(RemoteObject.createImmutable("SmartOffice\\Projects")));
 BA.debugLineNum = 51;BA.debugLine="File.WriteList(dir,\"setlist.txt\",menulist)";
Debug.ShouldStop(262144);
main.__c.getField(false,"File").runVoidMethod ("WriteList",(Object)(main._dir),(Object)(BA.ObjectToString("setlist.txt")),(Object)(main._menulist));
 BA.debugLineNum = 53;BA.debugLine="File.WriteString(dir,\"log.txt\",\"Willkommen\")";
Debug.ShouldStop(1048576);
main.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main._dir),(Object)(BA.ObjectToString("log.txt")),(Object)(RemoteObject.createImmutable("Willkommen")));
 BA.debugLineNum = 54;BA.debugLine="File.WriteString(dir,\"new.txt\",\"Welcome this is";
Debug.ShouldStop(2097152);
main.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main._dir),(Object)(BA.ObjectToString("new.txt")),(Object)(RemoteObject.createImmutable("Welcome this is a New Texted file.")));
 };
 BA.debugLineNum = 56;BA.debugLine="menulist.Clear";
Debug.ShouldStop(8388608);
main._menulist.runVoidMethod ("Clear");
 BA.debugLineNum = 58;BA.debugLine="mi.Initialize(\"Html Code\",\"mi\")";
Debug.ShouldStop(33554432);
main._mi.runVoidMethod ("Initialize",main.ba,(Object)(BA.ObjectToString("Html Code")),(Object)(RemoteObject.createImmutable("mi")));
 BA.debugLineNum = 59;BA.debugLine="CMenu.MenuItems.Add(mi)";
Debug.ShouldStop(67108864);
main._cmenu.runMethod(false,"getMenuItems").runVoidMethod ("Add",(Object)((main._mi.getObject())));
 BA.debugLineNum = 60;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
Debug.ShouldStop(134217728);
main.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 61;BA.debugLine="time=DateTime.Time(DateTime.Now)";
Debug.ShouldStop(268435456);
main._time = main.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(main.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 BA.debugLineNum = 62;BA.debugLine="date=DateTime.Date(DateTime.Now)";
Debug.ShouldStop(536870912);
main._date = main.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(main.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 BA.debugLineNum = 63;BA.debugLine="timer1.Initialize(\"timer1\", 1000)";
Debug.ShouldStop(1073741824);
main._timer1.runVoidMethod ("Initialize",main.ba,(Object)(BA.ObjectToString("timer1")),(Object)(BA.numberCast(long.class, 1000)));
 BA.debugLineNum = 64;BA.debugLine="timer1.Enabled = True";
Debug.ShouldStop(-2147483648);
main._timer1.runMethod(true,"setEnabled",main.__c.getField(true,"True"));
 BA.debugLineNum = 65;BA.debugLine="manager.Initialize(GetState)";
Debug.ShouldStop(1);
main._manager.runClassMethod (b4j.example.undomanager.class, "_initialize",main.ba,(Object)((_getstate())));
 BA.debugLineNum = 66;BA.debugLine="cho.Initialize";
Debug.ShouldStop(2);
main._cho.runVoidMethod ("Initialize");
 BA.debugLineNum = 67;BA.debugLine="save1.Initialize";
Debug.ShouldStop(4);
main._save1.runVoidMethod ("Initialize");
 BA.debugLineNum = 68;BA.debugLine="cho.InitialDirectory=dir1&\"\\Projects\"";
Debug.ShouldStop(8);
main._cho.runMethod(true,"setInitialDirectory",RemoteObject.concat(main._dir1,RemoteObject.createImmutable("\\Projects")));
 BA.debugLineNum = 69;BA.debugLine="save1.InitialDirectory=dir1&\"\\Projects\"";
Debug.ShouldStop(16);
main._save1.runMethod(true,"setInitialDirectory",RemoteObject.concat(main._dir1,RemoteObject.createImmutable("\\Projects")));
 BA.debugLineNum = 70;BA.debugLine="RedirectOutput(dir, \"logs.txt\")";
Debug.ShouldStop(32);
_redirectoutput(main._dir,RemoteObject.createImmutable("logs.txt"));
 BA.debugLineNum = 73;BA.debugLine="MainForm.Show";
Debug.ShouldStop(256);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("btnredo_Action (main) ","main",0,main.ba,main.mostCurrent,149);
if (RapidSub.canDelegate("btnredo_action")) return b4j.example.main.remoteMe.runUserSub(false, "main","btnredo_action");
RemoteObject _ud = RemoteObject.declareNull("b4j.example.main._undodata");
 BA.debugLineNum = 149;BA.debugLine="Sub btnredo_Action";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="Dim ud As UndoData = manager.Redo";
Debug.ShouldStop(2097152);
_ud = (main._manager.runClassMethod (b4j.example.undomanager.class, "_redo"));Debug.locals.put("ud", _ud);Debug.locals.put("ud", _ud);
 BA.debugLineNum = 151;BA.debugLine="If ud <> Null Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("N",_ud)) { 
 BA.debugLineNum = 152;BA.debugLine="SetState(ud)";
Debug.ShouldStop(8388608);
_setstate(_ud);
 BA.debugLineNum = 153;BA.debugLine="StatusBar1.Progress=100";
Debug.ShouldStop(16777216);
main._statusbar1.runMethod(true,"setProgress",BA.numberCast(double.class, 100));
 BA.debugLineNum = 154;BA.debugLine="StatusBar1.Text=\"ReDone @\"&time";
Debug.ShouldStop(33554432);
main._statusbar1.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("ReDone @"),main._time));
 };
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("btnundo_Action (main) ","main",0,main.ba,main.mostCurrent,142);
if (RapidSub.canDelegate("btnundo_action")) return b4j.example.main.remoteMe.runUserSub(false, "main","btnundo_action");
RemoteObject _ud = RemoteObject.declareNull("b4j.example.main._undodata");
 BA.debugLineNum = 142;BA.debugLine="Sub btnundo_Action";
Debug.ShouldStop(8192);
 BA.debugLineNum = 143;BA.debugLine="Dim ud As UndoData = manager.Undo";
Debug.ShouldStop(16384);
_ud = (main._manager.runClassMethod (b4j.example.undomanager.class, "_undo"));Debug.locals.put("ud", _ud);Debug.locals.put("ud", _ud);
 BA.debugLineNum = 144;BA.debugLine="SetState(ud)";
Debug.ShouldStop(32768);
_setstate(_ud);
 BA.debugLineNum = 145;BA.debugLine="StatusBar1.Progress=100";
Debug.ShouldStop(65536);
main._statusbar1.runMethod(true,"setProgress",BA.numberCast(double.class, 100));
 BA.debugLineNum = 146;BA.debugLine="StatusBar1.Text=\"UnDone @\"&time";
Debug.ShouldStop(131072);
main._statusbar1.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("UnDone @"),main._time));
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Button1_Action (main) ","main",0,main.ba,main.mostCurrent,180);
if (RapidSub.canDelegate("button1_action")) return b4j.example.main.remoteMe.runUserSub(false, "main","button1_action");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
 BA.debugLineNum = 180;BA.debugLine="Sub Button1_Action";
Debug.ShouldStop(524288);
 BA.debugLineNum = 181;BA.debugLine="save1.setExtensionFilter(\"TextFile\", Array As Str";
Debug.ShouldStop(1048576);
main._save1.runVoidMethod ("SetExtensionFilter",(Object)(BA.ObjectToString("TextFile")),(Object)(main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("*.txt")})))));
 BA.debugLineNum = 182;BA.debugLine="save1.InitialFileName=\"default.txt\"";
Debug.ShouldStop(2097152);
main._save1.runMethod(true,"setInitialFileName",BA.ObjectToString("default.txt"));
 BA.debugLineNum = 183;BA.debugLine="save1.Title=\"Save File\"";
Debug.ShouldStop(4194304);
main._save1.runMethod(true,"setTitle",BA.ObjectToString("Save File"));
 BA.debugLineNum = 184;BA.debugLine="Dim filename As String = save1.ShowSave(MainForm)";
Debug.ShouldStop(8388608);
_filename = main._save1.runMethodAndSync(true,"ShowSave",(Object)(main._mainform));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 185;BA.debugLine="If filename <> \"\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("!",_filename,BA.ObjectToString(""))) { 
 BA.debugLineNum = 186;BA.debugLine="If filename.ToLowerCase.EndsWith(\".txt\") = False";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_filename.runMethod(true,"toLowerCase").runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".txt"))),main.__c.getField(true,"False"))) { 
_filename = RemoteObject.concat(_filename,RemoteObject.createImmutable(".txt"));Debug.locals.put("filename", _filename);};
 BA.debugLineNum = 187;BA.debugLine="Dim out As OutputStream = File.OpenOutput(\"\", fil";
Debug.ShouldStop(67108864);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = main.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(BA.ObjectToString("")),(Object)(_filename),(Object)(main.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 188;BA.debugLine="File.Delete(dir,\"nosave.txt\")";
Debug.ShouldStop(134217728);
main.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main._dir),(Object)(RemoteObject.createImmutable("nosave.txt")));
 BA.debugLineNum = 189;BA.debugLine="File.WriteString(\"\",filename,edit.HtmlText)";
Debug.ShouldStop(268435456);
main.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(BA.ObjectToString("")),(Object)(_filename),(Object)(main._edit.runMethod(true,"getHtmlText")));
 BA.debugLineNum = 190;BA.debugLine="MainForm.Title=filename";
Debug.ShouldStop(536870912);
main._mainform.runMethod(true,"setTitle",_filename);
 BA.debugLineNum = 191;BA.debugLine="menulist.Add(filename)";
Debug.ShouldStop(1073741824);
main._menulist.runVoidMethod ("Add",(Object)((_filename)));
 BA.debugLineNum = 192;BA.debugLine="new_file(filename)";
Debug.ShouldStop(-2147483648);
_new_file(_filename);
 BA.debugLineNum = 193;BA.debugLine="out.Close";
Debug.ShouldStop(1);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 194;BA.debugLine="Log(\"File saved: \" & filename)";
Debug.ShouldStop(2);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("File saved: "),_filename)));
 };
 BA.debugLineNum = 197;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("GetState (main) ","main",0,main.ba,main.mostCurrent,99);
if (RapidSub.canDelegate("getstate")) return b4j.example.main.remoteMe.runUserSub(false, "main","getstate");
RemoteObject _ud = RemoteObject.declareNull("b4j.example.main._undodata");
 BA.debugLineNum = 99;BA.debugLine="Sub GetState As UndoData";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="Dim ud As UndoData";
Debug.ShouldStop(8);
_ud = RemoteObject.createNew ("b4j.example.main._undodata");Debug.locals.put("ud", _ud);
 BA.debugLineNum = 101;BA.debugLine="ud.Initialize";
Debug.ShouldStop(16);
_ud.runVoidMethod ("Initialize");
 BA.debugLineNum = 102;BA.debugLine="ud.Text = edit.HtmlText";
Debug.ShouldStop(32);
_ud.setField ("Text",main._edit.runMethod(true,"getHtmlText"));
 BA.debugLineNum = 104;BA.debugLine="Return ud";
Debug.ShouldStop(128);
if (true) return _ud;
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Mainform_CloseRequest (main) ","main",0,main.ba,main.mostCurrent,203);
if (RapidSub.canDelegate("mainform_closerequest")) return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_closerequest", _eventdata);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 203;BA.debugLine="Sub Mainform_CloseRequest (EventData As Event)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 204;BA.debugLine="If File.Exists(dir,\"nosave.txt\") Then";
Debug.ShouldStop(2048);
if (main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main._dir),(Object)(RemoteObject.createImmutable("nosave.txt"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 206;BA.debugLine="If fx.Msgbox2(MainForm,\"You apear to close witho";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",main._fx.runMethodAndSync(true,"Msgbox2",(Object)(main._mainform),(Object)(BA.ObjectToString("You apear to close without Saving the File! would you like to Save the current document?")),(Object)(BA.ObjectToString("Save?!")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)(main._fx.getField(false,"MSGBOX_WARNING"))),BA.numberCast(double.class, main._fx.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 207;BA.debugLine="Button1_Action";
Debug.ShouldStop(16384);
_button1_action();
 }else {
 BA.debugLineNum = 209;BA.debugLine="File.WriteString(dir,\"nosave.txt\",\"true\")";
Debug.ShouldStop(65536);
main.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main._dir),(Object)(BA.ObjectToString("nosave.txt")),(Object)(RemoteObject.createImmutable("true")));
 };
 }else {
 BA.debugLineNum = 212;BA.debugLine="EventData.Consume";
Debug.ShouldStop(524288);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 213;BA.debugLine="MainForm.Close";
Debug.ShouldStop(1048576);
main._mainform.runVoidMethod ("Close");
 };
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("MenuBar1_Action (main) ","main",0,main.ba,main.mostCurrent,112);
if (RapidSub.canDelegate("menubar1_action")) return b4j.example.main.remoteMe.runUserSub(false, "main","menubar1_action");
 BA.debugLineNum = 112;BA.debugLine="Sub MenuBar1_Action";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="mi = Sender";
Debug.ShouldStop(65536);
main._mi.setObject(main.__c.runMethod(false,"Sender",main.ba));
 BA.debugLineNum = 114;BA.debugLine="If mi.Text=\"_Close\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",main._mi.runMethod(true,"getText"),BA.ObjectToString("_Close"))) { 
 BA.debugLineNum = 115;BA.debugLine="MainForm.Close";
Debug.ShouldStop(262144);
main._mainform.runVoidMethod ("Close");
 BA.debugLineNum = 116;BA.debugLine="Log(\"close..\")";
Debug.ShouldStop(524288);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("close..")));
 };
 BA.debugLineNum = 118;BA.debugLine="If mi.Text=\"_New\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",main._mi.runMethod(true,"getText"),BA.ObjectToString("_New"))) { 
 BA.debugLineNum = 119;BA.debugLine="new_file(\"New Text\")";
Debug.ShouldStop(4194304);
_new_file(RemoteObject.createImmutable("New Text"));
 };
 BA.debugLineNum = 121;BA.debugLine="If mi.Text=\"_Show Code\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",main._mi.runMethod(true,"getText"),BA.ObjectToString("_Show Code"))) { 
 BA.debugLineNum = 122;BA.debugLine="show_su";
Debug.ShouldStop(33554432);
_show_su();
 };
 BA.debugLineNum = 124;BA.debugLine="If mi.Text=\"_Open\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",main._mi.runMethod(true,"getText"),BA.ObjectToString("_Open"))) { 
 BA.debugLineNum = 125;BA.debugLine="open_new";
Debug.ShouldStop(268435456);
_open_new();
 };
 BA.debugLineNum = 127;BA.debugLine="If mi.Text=\"_Undo\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",main._mi.runMethod(true,"getText"),BA.ObjectToString("_Undo"))) { 
 BA.debugLineNum = 128;BA.debugLine="btnundo_Action";
Debug.ShouldStop(-2147483648);
_btnundo_action();
 };
 BA.debugLineNum = 130;BA.debugLine="If mi.Text=\"_Redo\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",main._mi.runMethod(true,"getText"),BA.ObjectToString("_Redo"))) { 
 BA.debugLineNum = 131;BA.debugLine="btnredo_Action";
Debug.ShouldStop(4);
_btnredo_action();
 };
 BA.debugLineNum = 133;BA.debugLine="If mi.Text=\"_Save\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",main._mi.runMethod(true,"getText"),BA.ObjectToString("_Save"))) { 
 BA.debugLineNum = 134;BA.debugLine="Button1_Action";
Debug.ShouldStop(32);
_button1_action();
 };
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("MenuBar1_SelectedChange (main) ","main",0,main.ba,main.mostCurrent,199);
if (RapidSub.canDelegate("menubar1_selectedchange")) return b4j.example.main.remoteMe.runUserSub(false, "main","menubar1_selectedchange", _selected);
Debug.locals.put("Selected", _selected);
 BA.debugLineNum = 199;BA.debugLine="Sub MenuBar1_SelectedChange (Selected As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _new_file(RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("new_file (main) ","main",0,main.ba,main.mostCurrent,171);
if (RapidSub.canDelegate("new_file")) return b4j.example.main.remoteMe.runUserSub(false, "main","new_file", _text);
Debug.locals.put("text", _text);
 BA.debugLineNum = 171;BA.debugLine="Sub new_file(text As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 172;BA.debugLine="File.WriteString(dir,\"new.txt\",text)";
Debug.ShouldStop(2048);
main.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main._dir),(Object)(BA.ObjectToString("new.txt")),(Object)(_text));
 BA.debugLineNum = 173;BA.debugLine="read_file";
Debug.ShouldStop(4096);
_read_file();
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _open_new() throws Exception{
try {
		Debug.PushSubsStack("open_new (main) ","main",0,main.ba,main.mostCurrent,158);
if (RapidSub.canDelegate("open_new")) return b4j.example.main.remoteMe.runUserSub(false, "main","open_new");
RemoteObject _filen = RemoteObject.createImmutable("");
 BA.debugLineNum = 158;BA.debugLine="Sub open_new";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="Dim filen As String = save1.ShowOpen(MainForm)";
Debug.ShouldStop(1073741824);
_filen = main._save1.runMethodAndSync(true,"ShowOpen",(Object)(main._mainform));Debug.locals.put("filen", _filen);Debug.locals.put("filen", _filen);
 BA.debugLineNum = 162;BA.debugLine="save1.Title=\"Open File\"";
Debug.ShouldStop(2);
main._save1.runMethod(true,"setTitle",BA.ObjectToString("Open File"));
 BA.debugLineNum = 163;BA.debugLine="If filen <> \"\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("!",_filen,BA.ObjectToString(""))) { 
 BA.debugLineNum = 164;BA.debugLine="menulist.Clear";
Debug.ShouldStop(8);
main._menulist.runVoidMethod ("Clear");
 BA.debugLineNum = 165;BA.debugLine="menulist.Add(filen)";
Debug.ShouldStop(16);
main._menulist.runVoidMethod ("Add",(Object)((_filen)));
 BA.debugLineNum = 166;BA.debugLine="edit.HtmlText=File.ReadString(filen,\"\")";
Debug.ShouldStop(32);
main._edit.runMethod(true,"setHtmlText",main.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(_filen),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 167;BA.debugLine="File.WriteString(dir,\"new.txt\",filen)";
Debug.ShouldStop(64);
main.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main._dir),(Object)(BA.ObjectToString("new.txt")),(Object)(_filen));
 };
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pan1_resize(RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("pan1_Resize (main) ","main",0,main.ba,main.mostCurrent,219);
if (RapidSub.canDelegate("pan1_resize")) return b4j.example.main.remoteMe.runUserSub(false, "main","pan1_resize", _width, _height);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 219;BA.debugLine="Sub pan1_Resize (Width As Double, Height As Double";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 220;BA.debugLine="Pane1.PrefHeight=-1";
Debug.ShouldStop(134217728);
main._pane1.runMethod(true,"setPrefHeight",BA.numberCast(double.class, -(double) (0 + 1)));
 BA.debugLineNum = 221;BA.debugLine="pane1.PrefWidth=-1";
Debug.ShouldStop(268435456);
main._pane1.runMethod(true,"setPrefWidth",BA.numberCast(double.class, -(double) (0 + 1)));
 BA.debugLineNum = 222;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
modalform.myClass = BA.getDeviceClass ("b4j.example.modalform");
		
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
 //BA.debugLineNum = 20;BA.debugLine="Dim save1 As FileChooser";
main._save1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.FileChooserWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim time, date As String";
main._time = RemoteObject.createImmutable("");
main._date = RemoteObject.createImmutable("");
 //BA.debugLineNum = 22;BA.debugLine="Dim mi As MenuItem";
main._mi = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private edit As HTMLEditor";
main._edit = RemoteObject.createNew ("anywheresoftware.b4j.objects.HTMLEditorWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private StatusBar1 As StatusBar";
main._statusbar1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.StatusBarWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim tr As TextReader";
main._tr = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.TextReaderWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Pane1 As Pane";
main._pane1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private TextArea1 As TextArea";
main._textarea1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private CMenu As ContextMenu";
main._cmenu = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.ContextMenuWrapper");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _read_file() throws Exception{
try {
		Debug.PushSubsStack("read_file (main) ","main",0,main.ba,main.mostCurrent,176);
if (RapidSub.canDelegate("read_file")) return b4j.example.main.remoteMe.runUserSub(false, "main","read_file");
 BA.debugLineNum = 176;BA.debugLine="Sub read_file";
Debug.ShouldStop(32768);
 BA.debugLineNum = 177;BA.debugLine="edit.HtmlText=File.ReadString(dir,\"new.txt\")";
Debug.ShouldStop(65536);
main._edit.runMethod(true,"setHtmlText",main.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main._dir),(Object)(RemoteObject.createImmutable("new.txt"))));
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _redirectoutput(RemoteObject _dir2,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("RedirectOutput (main) ","main",0,main.ba,main.mostCurrent,87);
if (RapidSub.canDelegate("redirectoutput")) return b4j.example.main.remoteMe.runUserSub(false, "main","redirectoutput", _dir2, _filename);
Debug.locals.put("dir2", _dir2);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 87;BA.debugLine="Sub RedirectOutput (dir2 As String, FileName As St";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstate(RemoteObject _ud) throws Exception{
try {
		Debug.PushSubsStack("SetState (main) ","main",0,main.ba,main.mostCurrent,107);
if (RapidSub.canDelegate("setstate")) return b4j.example.main.remoteMe.runUserSub(false, "main","setstate", _ud);
Debug.locals.put("ud", _ud);
 BA.debugLineNum = 107;BA.debugLine="Sub SetState (ud As UndoData)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="edit.HtmlText = ud.Text";
Debug.ShouldStop(2048);
main._edit.runMethod(true,"setHtmlText",_ud.getField(true,"Text"));
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
public static RemoteObject  _show_su() throws Exception{
try {
		Debug.PushSubsStack("show_su (main) ","main",0,main.ba,main.mostCurrent,81);
if (RapidSub.canDelegate("show_su")) return b4j.example.main.remoteMe.runUserSub(false, "main","show_su");
RemoteObject _mf = RemoteObject.declareNull("b4j.example.modalform");
 BA.debugLineNum = 81;BA.debugLine="Sub show_su";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="Dim mf As ModalForm";
Debug.ShouldStop(131072);
_mf = RemoteObject.createNew ("b4j.example.modalform");Debug.locals.put("mf", _mf);
 BA.debugLineNum = 83;BA.debugLine="mf.Initialize(MainForm)";
Debug.ShouldStop(262144);
_mf.runClassMethod (b4j.example.modalform.class, "_initialize",main.ba,(Object)(main._mainform));
 BA.debugLineNum = 84;BA.debugLine="mf.read_file";
Debug.ShouldStop(524288);
_mf.runClassMethod (b4j.example.modalform.class, "_read_file");
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Timer1_Tick (main) ","main",0,main.ba,main.mostCurrent,138);
if (RapidSub.canDelegate("timer1_tick")) return b4j.example.main.remoteMe.runUserSub(false, "main","timer1_tick");
 BA.debugLineNum = 138;BA.debugLine="Sub Timer1_Tick";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="manager.AddState(GetState) 'nothing will happen i";
Debug.ShouldStop(1024);
main._manager.runClassMethod (b4j.example.undomanager.class, "_addstate",(Object)((_getstate())));
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}