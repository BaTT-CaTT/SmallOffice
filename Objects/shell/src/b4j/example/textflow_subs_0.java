package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class textflow_subs_0 {


public static RemoteObject  _addtext(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("AddText (textflow) ","textflow",1,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("addtext")) return __ref.runUserSub(false, "textflow","addtext", __ref, _text);
Debug.locals.put("text", _text);
 BA.debugLineNum = 12;BA.debugLine="Public Sub AddText(text As String) As TextFlow";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="Dim lastItem As JavaObject";
Debug.ShouldStop(4096);
textflow._lastitem = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_lastitem",textflow._lastitem);
 BA.debugLineNum = 14;BA.debugLine="lastItem.InitializeNewInstance(\"javafx.scene.text";
Debug.ShouldStop(8192);
__ref.getField(false,"_lastitem").runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.text.Text")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_text)})));
 BA.debugLineNum = 15;BA.debugLine="texts.Add(lastItem)";
Debug.ShouldStop(16384);
__ref.getField(false,"_texts").runVoidMethod ("Add",(Object)((__ref.getField(false,"_lastitem").getObject())));
 BA.debugLineNum = 16;BA.debugLine="Return Me";
Debug.ShouldStop(32768);
if (true) return (__ref);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
textflow._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",textflow._fx);
 //BA.debugLineNum = 4;BA.debugLine="Private texts As List";
textflow._texts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_texts",textflow._texts);
 //BA.debugLineNum = 5;BA.debugLine="Private lastItem As JavaObject";
textflow._lastitem = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_lastitem",textflow._lastitem);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createtextflow(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateTextFlow (textflow) ","textflow",1,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("createtextflow")) return __ref.runUserSub(false, "textflow","createtextflow", __ref);
RemoteObject _tf = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 41;BA.debugLine="Public Sub CreateTextFlow As Pane";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="Dim tf As JavaObject";
Debug.ShouldStop(512);
_tf = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("tf", _tf);
 BA.debugLineNum = 43;BA.debugLine="tf.InitializeNewInstance(\"javafx.scene.text.TextF";
Debug.ShouldStop(1024);
_tf.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.text.TextFlow")),(Object)((textflow.__c.getField(false,"Null"))));
 BA.debugLineNum = 44;BA.debugLine="tf.RunMethodJO(\"getChildren\", Null).RunMethod(\"ad";
Debug.ShouldStop(2048);
_tf.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getChildren")),(Object)((textflow.__c.getField(false,"Null")))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addAll")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(false,"_texts").getObject())})));
 BA.debugLineNum = 45;BA.debugLine="Return tf";
Debug.ShouldStop(4096);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), _tf.getObject());
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (textflow) ","textflow",1,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "textflow","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="texts.Initialize";
Debug.ShouldStop(256);
__ref.getField(false,"_texts").runVoidMethod ("Initialize");
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("SetColor (textflow) ","textflow",1,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("setcolor")) return __ref.runUserSub(false, "textflow","setcolor", __ref, _color);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 24;BA.debugLine="Public Sub SetColor(Color As Paint) As TextFlow";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="lastItem.RunMethod(\"setFill\", Array(Color))";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lastitem").runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setFill")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_color.getObject())})));
 BA.debugLineNum = 26;BA.debugLine="Return Me";
Debug.ShouldStop(33554432);
if (true) return (__ref);
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfont(RemoteObject __ref,RemoteObject _font) throws Exception{
try {
		Debug.PushSubsStack("SetFont (textflow) ","textflow",1,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("setfont")) return __ref.runUserSub(false, "textflow","setfont", __ref, _font);
Debug.locals.put("Font", _font);
 BA.debugLineNum = 19;BA.debugLine="Public Sub SetFont(Font As Font) As TextFlow";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="lastItem.RunMethod(\"setFont\", Array(Font))";
Debug.ShouldStop(524288);
__ref.getField(false,"_lastitem").runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setFont")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_font.getObject())})));
 BA.debugLineNum = 21;BA.debugLine="Return Me";
Debug.ShouldStop(1048576);
if (true) return (__ref);
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstrikethrough(RemoteObject __ref,RemoteObject _strikethrough) throws Exception{
try {
		Debug.PushSubsStack("SetStrikethrough (textflow) ","textflow",1,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("setstrikethrough")) return __ref.runUserSub(false, "textflow","setstrikethrough", __ref, _strikethrough);
Debug.locals.put("Strikethrough", _strikethrough);
 BA.debugLineNum = 34;BA.debugLine="Public Sub SetStrikethrough(Strikethrough As Boole";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="lastItem.RunMethod(\"setStrikethrough\", Array(Stri";
Debug.ShouldStop(4);
__ref.getField(false,"_lastitem").runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setStrikethrough")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_strikethrough)})));
 BA.debugLineNum = 36;BA.debugLine="Return Me";
Debug.ShouldStop(8);
if (true) return (__ref);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setunderline(RemoteObject __ref,RemoteObject _underline) throws Exception{
try {
		Debug.PushSubsStack("SetUnderline (textflow) ","textflow",1,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("setunderline")) return __ref.runUserSub(false, "textflow","setunderline", __ref, _underline);
Debug.locals.put("Underline", _underline);
 BA.debugLineNum = 29;BA.debugLine="Public Sub SetUnderline(Underline As Boolean) As T";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="lastItem.RunMethod(\"setUnderline\", Array(Underlin";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lastitem").runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setUnderline")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_underline)})));
 BA.debugLineNum = 31;BA.debugLine="Return Me";
Debug.ShouldStop(1073741824);
if (true) return (__ref);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}