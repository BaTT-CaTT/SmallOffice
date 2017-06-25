package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class cssutils extends Object{
public static cssutils mostCurrent = new cssutils();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.cssutils", null);
		ba.loadHtSubs(cssutils.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.cssutils", ba);
		}
	}
    public static Class<?> getObject() {
		return cssutils.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.main _main = null;
public static String  _colortohex(anywheresoftware.b4j.objects.JFX.PaintWrapper _color) throws Exception{
int _c = 0;
int _alpha = 0;
int _red = 0;
int _green = 0;
int _blue = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 18;BA.debugLine="Public Sub ColorToHex(Color As Paint) As String";
 //BA.debugLineNum = 19;BA.debugLine="Dim c As Int  = fx.Colors.To32Bit(Color)";
_c = _fx.Colors.To32Bit((javafx.scene.paint.Paint)(_color.getObject()));
 //BA.debugLineNum = 20;BA.debugLine="Dim alpha As Int = Bit.UnsignedShiftRight(c, 24)";
_alpha = anywheresoftware.b4a.keywords.Common.Bit.UnsignedShiftRight(_c,(int) (24));
 //BA.debugLineNum = 21;BA.debugLine="Dim red As Int = Bit.And(Bit.UnsignedShiftRight(c";
_red = anywheresoftware.b4a.keywords.Common.Bit.And(anywheresoftware.b4a.keywords.Common.Bit.UnsignedShiftRight(_c,(int) (16)),(int) (0xff));
 //BA.debugLineNum = 22;BA.debugLine="Dim green As Int = Bit.And(Bit.UnsignedShiftRight";
_green = anywheresoftware.b4a.keywords.Common.Bit.And(anywheresoftware.b4a.keywords.Common.Bit.UnsignedShiftRight(_c,(int) (8)),(int) (0xff));
 //BA.debugLineNum = 23;BA.debugLine="Dim blue As Int = Bit.And(c, 0xFF)";
_blue = anywheresoftware.b4a.keywords.Common.Bit.And(_c,(int) (0xff));
 //BA.debugLineNum = 24;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 25;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 26;BA.debugLine="sb.Append(\"rgba(\").Append(red).Append(\",\").Append";
_sb.Append("rgba(").Append(BA.NumberToString(_red)).Append(",").Append(BA.NumberToString(_green)).Append(",").Append(BA.NumberToString(_blue)).Append(",");
 //BA.debugLineNum = 27;BA.debugLine="sb.Append(NumberFormat2(alpha / 255, 1, 2, 2, Fal";
_sb.Append(anywheresoftware.b4a.keywords.Common.NumberFormat2(_alpha/(double)255,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)).Append(")");
 //BA.debugLineNum = 28;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public static String  _getstyleproperty(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _node,String _key) throws Exception{
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
 //BA.debugLineNum = 50;BA.debugLine="Public Sub GetStyleProperty (Node As Node, Key As";
 //BA.debugLineNum = 51;BA.debugLine="Dim m As Matcher = Regex.Matcher($\"${Key}:([^;]+)";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_key))+":([^;]+);"),_node.getStyle());
 //BA.debugLineNum = 52;BA.debugLine="If m.Find Then";
if (_m.Find()) { 
 //BA.debugLineNum = 53;BA.debugLine="Return m.Group(1)";
if (true) return _m.Group((int) (1));
 }else {
 //BA.debugLineNum = 55;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public static String  _setbackgroundcolor(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _node,anywheresoftware.b4j.objects.JFX.PaintWrapper _color) throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Public Sub SetBackgroundColor(Node As Node, Color";
 //BA.debugLineNum = 8;BA.debugLine="SetStyleProperty(Node, \"-fx-background-color\", Co";
_setstyleproperty(_node,"-fx-background-color",_colortohex(_color));
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public static String  _setbackgroundimage(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _node,String _dir,String _filename) throws Exception{
String _uri = "";
 //BA.debugLineNum = 31;BA.debugLine="Public Sub SetBackgroundImage(Node As Node, Dir As";
 //BA.debugLineNum = 32;BA.debugLine="Dim uri As String = File.GetUri(Dir, FileName)";
_uri = anywheresoftware.b4a.keywords.Common.File.GetUri(_dir,_filename);
 //BA.debugLineNum = 33;BA.debugLine="SetStyleProperty(Node, \"-fx-background-image\", $\"";
_setstyleproperty(_node,"-fx-background-image",("url("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_uri))+")"));
 //BA.debugLineNum = 34;BA.debugLine="SetStyleProperty(Node, \"-fx-background-size\", \"st";
_setstyleproperty(_node,"-fx-background-size","stretch");
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public static String  _setborder(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _node,double _width,anywheresoftware.b4j.objects.JFX.PaintWrapper _color,double _cornerradius) throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Public Sub SetBorder(Node As Node, Width As Double";
 //BA.debugLineNum = 12;BA.debugLine="SetStyleProperty(Node, \"-fx-border-color\", ColorT";
_setstyleproperty(_node,"-fx-border-color",_colortohex(_color));
 //BA.debugLineNum = 13;BA.debugLine="SetStyleProperty(Node, \"-fx-border-width\", Width)";
_setstyleproperty(_node,"-fx-border-width",BA.NumberToString(_width));
 //BA.debugLineNum = 14;BA.debugLine="SetStyleProperty(Node, \"-fx-border-radius\", Corne";
_setstyleproperty(_node,"-fx-border-radius",BA.NumberToString(_cornerradius));
 //BA.debugLineNum = 15;BA.debugLine="SetStyleProperty(Node, \"-fx-background-radius\", C";
_setstyleproperty(_node,"-fx-background-radius",BA.NumberToString(_cornerradius));
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public static String  _setstyleproperty(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _node,String _key,String _value) throws Exception{
String _att = "";
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
String _newstyle = "";
 //BA.debugLineNum = 37;BA.debugLine="Public Sub SetStyleProperty (Node As Node, Key As";
 //BA.debugLineNum = 38;BA.debugLine="Dim att As String = Key & \":\" & Value & \";\"";
_att = _key+":"+_value+";";
 //BA.debugLineNum = 39;BA.debugLine="Dim m As Matcher = Regex.Matcher($\"${Key}:[^;]+;\"";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_key))+":[^;]+;"),_node.getStyle());
 //BA.debugLineNum = 40;BA.debugLine="Dim newStyle As String";
_newstyle = "";
 //BA.debugLineNum = 41;BA.debugLine="If m.Find Then";
if (_m.Find()) { 
 //BA.debugLineNum = 42;BA.debugLine="newStyle = Node.Style.SubString2(0, m.GetStart(0";
_newstyle = _node.getStyle().substring((int) (0),_m.GetStart((int) (0)));
 //BA.debugLineNum = 43;BA.debugLine="newStyle = newStyle & att & Node.Style.SubString";
_newstyle = _newstyle+_att+_node.getStyle().substring(_m.GetEnd((int) (0)));
 }else {
 //BA.debugLineNum = 45;BA.debugLine="newStyle = Node.Style & att";
_newstyle = _node.getStyle()+_att;
 };
 //BA.debugLineNum = 47;BA.debugLine="Node.Style = newStyle";
_node.setStyle(_newstyle);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
}
