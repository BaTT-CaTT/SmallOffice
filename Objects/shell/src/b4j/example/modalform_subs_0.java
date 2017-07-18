package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class modalform_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
modalform._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",modalform._fx);
 //BA.debugLineNum = 4;BA.debugLine="Private frm As Form";
modalform._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",modalform._frm);
 //BA.debugLineNum = 5;BA.debugLine="Private TextArea1 As TextArea";
modalform._textarea1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");__ref.setField("_textarea1",modalform._textarea1);
 //BA.debugLineNum = 6;BA.debugLine="Dim dir As String=\"C:\\SmartOffice\\core\\data\"";
modalform._dir = BA.ObjectToString("C:\\SmartOffice\\core\\data");__ref.setField("_dir",modalform._dir);
 //BA.debugLineNum = 7;BA.debugLine="Private SegmentedButton1 As SegmentedButton";
modalform._segmentedbutton1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SegmentedButtonWrapper");__ref.setField("_segmentedbutton1",modalform._segmentedbutton1);
 //BA.debugLineNum = 8;BA.debugLine="Private SegmentedButton2 As SegmentedButton";
modalform._segmentedbutton2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SegmentedButtonWrapper");__ref.setField("_segmentedbutton2",modalform._segmentedbutton2);
 //BA.debugLineNum = 9;BA.debugLine="Private SegmentedButton3 As SegmentedButton";
modalform._segmentedbutton3 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SegmentedButtonWrapper");__ref.setField("_segmentedbutton3",modalform._segmentedbutton3);
 //BA.debugLineNum = 10;BA.debugLine="Private SegmentedButton4 As SegmentedButton";
modalform._segmentedbutton4 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SegmentedButtonWrapper");__ref.setField("_segmentedbutton4",modalform._segmentedbutton4);
 //BA.debugLineNum = 11;BA.debugLine="Private sublist As List";
modalform._sublist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_sublist",modalform._sublist);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("Initialize (modalform) ","modalform",4,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "modalform","initialize", __ref, _ba, _parent);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize (Parent As Form)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="frm.Initialize(\"frm\", 600dip, 800dip)";
Debug.ShouldStop(16384);
__ref.getField(false,"_frm").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, modalform.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, modalform.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 800))))));
 BA.debugLineNum = 16;BA.debugLine="frm.Title = \"Html Viewer\"";
Debug.ShouldStop(32768);
__ref.getField(false,"_frm").runMethod(true,"setTitle",BA.ObjectToString("Html Viewer"));
 BA.debugLineNum = 17;BA.debugLine="frm.SetFormStyle(\"DECORATED\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_frm").runVoidMethod ("SetFormStyle",(Object)(RemoteObject.createImmutable("DECORATED")));
 BA.debugLineNum = 18;BA.debugLine="frm.RootPane.LoadLayout(\"2\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_frm").runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("2")));
 BA.debugLineNum = 19;BA.debugLine="frm.SetOwner(Parent)";
Debug.ShouldStop(262144);
__ref.getField(false,"_frm").runVoidMethod ("SetOwner",(Object)(_parent));
 BA.debugLineNum = 20;BA.debugLine="sublist=File.ReadList(dir,\"setlist.txt\")";
Debug.ShouldStop(524288);
__ref.setField ("_sublist",modalform.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(__ref.getField(true,"_dir")),(Object)(RemoteObject.createImmutable("setlist.txt"))));
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read_file(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("read_file (modalform) ","modalform",4,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("read_file")) return __ref.runUserSub(false, "modalform","read_file", __ref);
RemoteObject _text = RemoteObject.createImmutable("");
int _i = 0;
 BA.debugLineNum = 24;BA.debugLine="Sub read_file";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="Dim text As String";
Debug.ShouldStop(16777216);
_text = RemoteObject.createImmutable("");Debug.locals.put("text", _text);
 BA.debugLineNum = 26;BA.debugLine="For i = 0 To sublist.Size-1";
Debug.ShouldStop(33554432);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sublist").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 27;BA.debugLine="Log(sublist.Get(i))";
Debug.ShouldStop(67108864);
modalform.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(__ref.getField(false,"_sublist").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 BA.debugLineNum = 28;BA.debugLine="text=sublist.Get(i)";
Debug.ShouldStop(134217728);
_text = BA.ObjectToString(__ref.getField(false,"_sublist").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("text", _text);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 30;BA.debugLine="frm.ShowAndWait";
Debug.ShouldStop(536870912);
__ref.getField(false,"_frm").runVoidMethodAndSync ("ShowAndWait");
 BA.debugLineNum = 31;BA.debugLine="TextArea1.Text=File.ReadString(dir,\"new.txt\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_textarea1").runMethod(true,"setText",modalform.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(__ref.getField(true,"_dir")),(Object)(RemoteObject.createImmutable("new.txt"))));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _segmentedbutton1_valuechanged(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SegmentedButton1_ValueChanged (modalform) ","modalform",4,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("segmentedbutton1_valuechanged")) return __ref.runUserSub(false, "modalform","segmentedbutton1_valuechanged", __ref, _value);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 53;BA.debugLine="Sub SegmentedButton1_ValueChanged (Value As String";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _segmentedbutton2_valuechanged(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SegmentedButton2_ValueChanged (modalform) ","modalform",4,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("segmentedbutton2_valuechanged")) return __ref.runUserSub(false, "modalform","segmentedbutton2_valuechanged", __ref, _value);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 49;BA.debugLine="Sub SegmentedButton2_ValueChanged (Value As String";
Debug.ShouldStop(65536);
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _segmentedbutton3_valuechanged(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SegmentedButton3_ValueChanged (modalform) ","modalform",4,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("segmentedbutton3_valuechanged")) return __ref.runUserSub(false, "modalform","segmentedbutton3_valuechanged", __ref, _value);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 45;BA.debugLine="Sub SegmentedButton3_ValueChanged (Value As String";
Debug.ShouldStop(4096);
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _segmentedbutton4_valuechanged(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SegmentedButton4_ValueChanged (modalform) ","modalform",4,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("segmentedbutton4_valuechanged")) return __ref.runUserSub(false, "modalform","segmentedbutton4_valuechanged", __ref, _value);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 41;BA.debugLine="Sub SegmentedButton4_ValueChanged (Value As String";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _textarea1_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("TextArea1_TextChanged (modalform) ","modalform",4,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("textarea1_textchanged")) return __ref.runUserSub(false, "modalform","textarea1_textchanged", __ref, _old, _new);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 35;BA.debugLine="Sub TextArea1_TextChanged (Old As String, New As S";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="If New <> \"\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("!",_new,BA.ObjectToString(""))) { 
 BA.debugLineNum = 37;BA.debugLine="File.WriteString(dir,\"new.txt\",New)";
Debug.ShouldStop(16);
modalform.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(__ref.getField(true,"_dir")),(Object)(BA.ObjectToString("new.txt")),(Object)(_new));
 };
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}