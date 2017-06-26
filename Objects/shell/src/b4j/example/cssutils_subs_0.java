package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cssutils_subs_0 {


public static RemoteObject  _colortohex(RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("ColorToHex (cssutils) ","cssutils",3,cssutils.ba,cssutils.mostCurrent,18);
if (RapidSub.canDelegate("colortohex")) return b4j.example.cssutils.remoteMe.runUserSub(false, "cssutils","colortohex", _color);
RemoteObject _c = RemoteObject.createImmutable(0);
RemoteObject _alpha = RemoteObject.createImmutable(0);
RemoteObject _red = RemoteObject.createImmutable(0);
RemoteObject _green = RemoteObject.createImmutable(0);
RemoteObject _blue = RemoteObject.createImmutable(0);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
Debug.locals.put("Color", _color);
 BA.debugLineNum = 18;BA.debugLine="Public Sub ColorToHex(Color As Paint) As String";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Dim c As Int  = fx.Colors.To32Bit(Color)";
Debug.ShouldStop(262144);
_c = cssutils._fx.getField(false,"Colors").runMethod(true,"To32Bit",(Object)((_color.getObject())));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 20;BA.debugLine="Dim alpha As Int = Bit.UnsignedShiftRight(c, 24)";
Debug.ShouldStop(524288);
_alpha = cssutils.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(_c),(Object)(BA.numberCast(int.class, 24)));Debug.locals.put("alpha", _alpha);Debug.locals.put("alpha", _alpha);
 BA.debugLineNum = 21;BA.debugLine="Dim red As Int = Bit.And(Bit.UnsignedShiftRight(c";
Debug.ShouldStop(1048576);
_red = cssutils.__c.getField(false,"Bit").runMethod(true,"And",(Object)(cssutils.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(_c),(Object)(BA.numberCast(int.class, 16)))),(Object)(BA.numberCast(int.class, 0xff)));Debug.locals.put("red", _red);Debug.locals.put("red", _red);
 BA.debugLineNum = 22;BA.debugLine="Dim green As Int = Bit.And(Bit.UnsignedShiftRight";
Debug.ShouldStop(2097152);
_green = cssutils.__c.getField(false,"Bit").runMethod(true,"And",(Object)(cssutils.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(_c),(Object)(BA.numberCast(int.class, 8)))),(Object)(BA.numberCast(int.class, 0xff)));Debug.locals.put("green", _green);Debug.locals.put("green", _green);
 BA.debugLineNum = 23;BA.debugLine="Dim blue As Int = Bit.And(c, 0xFF)";
Debug.ShouldStop(4194304);
_blue = cssutils.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_c),(Object)(BA.numberCast(int.class, 0xff)));Debug.locals.put("blue", _blue);Debug.locals.put("blue", _blue);
 BA.debugLineNum = 24;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(8388608);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 25;BA.debugLine="sb.Initialize";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 26;BA.debugLine="sb.Append(\"rgba(\").Append(red).Append(\",\").Append";
Debug.ShouldStop(33554432);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("rgba("))).runMethod(false,"Append",(Object)(BA.NumberToString(_red))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(","))).runMethod(false,"Append",(Object)(BA.NumberToString(_green))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(","))).runMethod(false,"Append",(Object)(BA.NumberToString(_blue))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(",")));
 BA.debugLineNum = 27;BA.debugLine="sb.Append(NumberFormat2(alpha / 255, 1, 2, 2, Fal";
Debug.ShouldStop(67108864);
_sb.runMethod(false,"Append",(Object)(cssutils.__c.runMethod(true,"NumberFormat2",(Object)(RemoteObject.solve(new RemoteObject[] {_alpha,RemoteObject.createImmutable(255)}, "/",0, 0)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(cssutils.__c.getField(true,"False"))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 28;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(134217728);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstyleproperty(RemoteObject _node,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("GetStyleProperty (cssutils) ","cssutils",3,cssutils.ba,cssutils.mostCurrent,50);
if (RapidSub.canDelegate("getstyleproperty")) return b4j.example.cssutils.remoteMe.runUserSub(false, "cssutils","getstyleproperty", _node, _key);
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
Debug.locals.put("Node", _node);
Debug.locals.put("Key", _key);
 BA.debugLineNum = 50;BA.debugLine="Public Sub GetStyleProperty (Node As Node, Key As";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="Dim m As Matcher = Regex.Matcher($\"${Key}:([^;]+)";
Debug.ShouldStop(262144);
_m = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
_m = cssutils.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),cssutils.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_key))),RemoteObject.createImmutable(":([^;]+);")))),(Object)(_node.runMethod(true,"getStyle")));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 52;BA.debugLine="If m.Find Then";
Debug.ShouldStop(524288);
if (_m.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 53;BA.debugLine="Return m.Group(1)";
Debug.ShouldStop(1048576);
if (true) return _m.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1)));
 }else {
 BA.debugLineNum = 55;BA.debugLine="Return \"\"";
Debug.ShouldStop(4194304);
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
cssutils._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setbackgroundcolor(RemoteObject _node,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundColor (cssutils) ","cssutils",3,cssutils.ba,cssutils.mostCurrent,7);
if (RapidSub.canDelegate("setbackgroundcolor")) return b4j.example.cssutils.remoteMe.runUserSub(false, "cssutils","setbackgroundcolor", _node, _color);
Debug.locals.put("Node", _node);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 7;BA.debugLine="Public Sub SetBackgroundColor(Node As Node, Color";
Debug.ShouldStop(64);
 BA.debugLineNum = 8;BA.debugLine="SetStyleProperty(Node, \"-fx-background-color\", Co";
Debug.ShouldStop(128);
_setstyleproperty(_node,BA.ObjectToString("-fx-background-color"),_colortohex(_color));
 BA.debugLineNum = 9;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbackgroundimage(RemoteObject _node,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundImage (cssutils) ","cssutils",3,cssutils.ba,cssutils.mostCurrent,31);
if (RapidSub.canDelegate("setbackgroundimage")) return b4j.example.cssutils.remoteMe.runUserSub(false, "cssutils","setbackgroundimage", _node, _dir, _filename);
RemoteObject _uri = RemoteObject.createImmutable("");
Debug.locals.put("Node", _node);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 31;BA.debugLine="Public Sub SetBackgroundImage(Node As Node, Dir As";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Dim uri As String = File.GetUri(Dir, FileName)";
Debug.ShouldStop(-2147483648);
_uri = cssutils.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(_dir),(Object)(_filename));Debug.locals.put("uri", _uri);Debug.locals.put("uri", _uri);
 BA.debugLineNum = 33;BA.debugLine="SetStyleProperty(Node, \"-fx-background-image\", $\"";
Debug.ShouldStop(1);
_setstyleproperty(_node,BA.ObjectToString("-fx-background-image"),(RemoteObject.concat(RemoteObject.createImmutable("url("),cssutils.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uri))),RemoteObject.createImmutable(")"))));
 BA.debugLineNum = 34;BA.debugLine="SetStyleProperty(Node, \"-fx-background-size\", \"st";
Debug.ShouldStop(2);
_setstyleproperty(_node,BA.ObjectToString("-fx-background-size"),RemoteObject.createImmutable("stretch"));
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setborder(RemoteObject _node,RemoteObject _width,RemoteObject _color,RemoteObject _cornerradius) throws Exception{
try {
		Debug.PushSubsStack("SetBorder (cssutils) ","cssutils",3,cssutils.ba,cssutils.mostCurrent,11);
if (RapidSub.canDelegate("setborder")) return b4j.example.cssutils.remoteMe.runUserSub(false, "cssutils","setborder", _node, _width, _color, _cornerradius);
Debug.locals.put("Node", _node);
Debug.locals.put("Width", _width);
Debug.locals.put("Color", _color);
Debug.locals.put("CornerRadius", _cornerradius);
 BA.debugLineNum = 11;BA.debugLine="Public Sub SetBorder(Node As Node, Width As Double";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="SetStyleProperty(Node, \"-fx-border-color\", ColorT";
Debug.ShouldStop(2048);
_setstyleproperty(_node,BA.ObjectToString("-fx-border-color"),_colortohex(_color));
 BA.debugLineNum = 13;BA.debugLine="SetStyleProperty(Node, \"-fx-border-width\", Width)";
Debug.ShouldStop(4096);
_setstyleproperty(_node,BA.ObjectToString("-fx-border-width"),BA.NumberToString(_width));
 BA.debugLineNum = 14;BA.debugLine="SetStyleProperty(Node, \"-fx-border-radius\", Corne";
Debug.ShouldStop(8192);
_setstyleproperty(_node,BA.ObjectToString("-fx-border-radius"),BA.NumberToString(_cornerradius));
 BA.debugLineNum = 15;BA.debugLine="SetStyleProperty(Node, \"-fx-background-radius\", C";
Debug.ShouldStop(16384);
_setstyleproperty(_node,BA.ObjectToString("-fx-background-radius"),BA.NumberToString(_cornerradius));
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyleproperty(RemoteObject _node,RemoteObject _key,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetStyleProperty (cssutils) ","cssutils",3,cssutils.ba,cssutils.mostCurrent,37);
if (RapidSub.canDelegate("setstyleproperty")) return b4j.example.cssutils.remoteMe.runUserSub(false, "cssutils","setstyleproperty", _node, _key, _value);
RemoteObject _att = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
RemoteObject _newstyle = RemoteObject.createImmutable("");
Debug.locals.put("Node", _node);
Debug.locals.put("Key", _key);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 37;BA.debugLine="Public Sub SetStyleProperty (Node As Node, Key As";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Dim att As String = Key & \":\" & Value & \";\"";
Debug.ShouldStop(32);
_att = RemoteObject.concat(_key,RemoteObject.createImmutable(":"),_value,RemoteObject.createImmutable(";"));Debug.locals.put("att", _att);Debug.locals.put("att", _att);
 BA.debugLineNum = 39;BA.debugLine="Dim m As Matcher = Regex.Matcher($\"${Key}:[^;]+;\"";
Debug.ShouldStop(64);
_m = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
_m = cssutils.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),cssutils.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_key))),RemoteObject.createImmutable(":[^;]+;")))),(Object)(_node.runMethod(true,"getStyle")));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 40;BA.debugLine="Dim newStyle As String";
Debug.ShouldStop(128);
_newstyle = RemoteObject.createImmutable("");Debug.locals.put("newStyle", _newstyle);
 BA.debugLineNum = 41;BA.debugLine="If m.Find Then";
Debug.ShouldStop(256);
if (_m.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 42;BA.debugLine="newStyle = Node.Style.SubString2(0, m.GetStart(0";
Debug.ShouldStop(512);
_newstyle = _node.runMethod(true,"getStyle").runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_m.runMethod(true,"GetStart",(Object)(BA.numberCast(int.class, 0)))));Debug.locals.put("newStyle", _newstyle);
 BA.debugLineNum = 43;BA.debugLine="newStyle = newStyle & att & Node.Style.SubString";
Debug.ShouldStop(1024);
_newstyle = RemoteObject.concat(_newstyle,_att,_node.runMethod(true,"getStyle").runMethod(true,"substring",(Object)(_m.runMethod(true,"GetEnd",(Object)(BA.numberCast(int.class, 0))))));Debug.locals.put("newStyle", _newstyle);
 }else {
 BA.debugLineNum = 45;BA.debugLine="newStyle = Node.Style & att";
Debug.ShouldStop(4096);
_newstyle = RemoteObject.concat(_node.runMethod(true,"getStyle"),_att);Debug.locals.put("newStyle", _newstyle);
 };
 BA.debugLineNum = 47;BA.debugLine="Node.Style = newStyle";
Debug.ShouldStop(16384);
_node.runMethod(true,"setStyle",_newstyle);
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}