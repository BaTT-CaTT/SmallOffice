package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class cssutils extends Object{
public static cssutils mostCurrent = new cssutils();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.cssutils", null);
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
RDebugUtils.currentModule="cssutils";
if (Debug.shouldDelegate(ba, "colortohex"))
	return (String) Debug.delegate(ba, "colortohex", new Object[] {_color});
int _c = 0;
int _alpha = 0;
int _red = 0;
int _green = 0;
int _blue = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub ColorToHex(Color As Paint) As String";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Dim c As Int  = fx.Colors.To32Bit(Color)";
_c = _fx.Colors.To32Bit((javafx.scene.paint.Paint)(_color.getObject()));
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Dim alpha As Int = Bit.UnsignedShiftRight(c, 24)";
_alpha = anywheresoftware.b4a.keywords.Common.Bit.UnsignedShiftRight(_c,(int) (24));
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="Dim red As Int = Bit.And(Bit.UnsignedShiftRight(c";
_red = anywheresoftware.b4a.keywords.Common.Bit.And(anywheresoftware.b4a.keywords.Common.Bit.UnsignedShiftRight(_c,(int) (16)),(int) (0xff));
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="Dim green As Int = Bit.And(Bit.UnsignedShiftRight";
_green = anywheresoftware.b4a.keywords.Common.Bit.And(anywheresoftware.b4a.keywords.Common.Bit.UnsignedShiftRight(_c,(int) (8)),(int) (0xff));
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="Dim blue As Int = Bit.And(c, 0xFF)";
_blue = anywheresoftware.b4a.keywords.Common.Bit.And(_c,(int) (0xff));
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="sb.Append(\"rgba(\").Append(red).Append(\",\").Append";
_sb.Append("rgba(").Append(BA.NumberToString(_red)).Append(",").Append(BA.NumberToString(_green)).Append(",").Append(BA.NumberToString(_blue)).Append(",");
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="sb.Append(NumberFormat2(alpha / 255, 1, 2, 2, Fal";
_sb.Append(anywheresoftware.b4a.keywords.Common.NumberFormat2(_alpha/(double)255,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)).Append(")");
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="End Sub";
return "";
}
public static String  _getstyleproperty(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _node,String _key) throws Exception{
RDebugUtils.currentModule="cssutils";
if (Debug.shouldDelegate(ba, "getstyleproperty"))
	return (String) Debug.delegate(ba, "getstyleproperty", new Object[] {_node,_key});
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub GetStyleProperty (Node As Node, Key As";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Dim m As Matcher = Regex.Matcher($\"${Key}:([^;]+)";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_key))+":([^;]+);"),_node.getStyle());
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="If m.Find Then";
if (_m.Find()) { 
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Return m.Group(1)";
if (true) return _m.Group((int) (1));
 }else {
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="End Sub";
return "";
}
public static String  _setbackgroundcolor(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _node,anywheresoftware.b4j.objects.JFX.PaintWrapper _color) throws Exception{
RDebugUtils.currentModule="cssutils";
if (Debug.shouldDelegate(ba, "setbackgroundcolor"))
	return (String) Debug.delegate(ba, "setbackgroundcolor", new Object[] {_node,_color});
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Public Sub SetBackgroundColor(Node As Node, Color";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="SetStyleProperty(Node, \"-fx-background-color\", Co";
_setstyleproperty(_node,"-fx-background-color",_colortohex(_color));
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="End Sub";
return "";
}
public static String  _setstyleproperty(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _node,String _key,String _value) throws Exception{
RDebugUtils.currentModule="cssutils";
if (Debug.shouldDelegate(ba, "setstyleproperty"))
	return (String) Debug.delegate(ba, "setstyleproperty", new Object[] {_node,_key,_value});
String _att = "";
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
String _newstyle = "";
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Public Sub SetStyleProperty (Node As Node, Key As";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Dim att As String = Key & \":\" & Value & \";\"";
_att = _key+":"+_value+";";
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Dim m As Matcher = Regex.Matcher($\"${Key}:[^;]+;\"";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_key))+":[^;]+;"),_node.getStyle());
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Dim newStyle As String";
_newstyle = "";
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="If m.Find Then";
if (_m.Find()) { 
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="newStyle = Node.Style.SubString2(0, m.GetStart(0";
_newstyle = _node.getStyle().substring((int) (0),_m.GetStart((int) (0)));
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="newStyle = newStyle & att & Node.Style.SubString";
_newstyle = _newstyle+_att+_node.getStyle().substring(_m.GetEnd((int) (0)));
 }else {
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="newStyle = Node.Style & att";
_newstyle = _node.getStyle()+_att;
 };
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="Node.Style = newStyle";
_node.setStyle(_newstyle);
RDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="End Sub";
return "";
}
public static String  _setbackgroundimage(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _node,String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="cssutils";
if (Debug.shouldDelegate(ba, "setbackgroundimage"))
	return (String) Debug.delegate(ba, "setbackgroundimage", new Object[] {_node,_dir,_filename});
String _uri = "";
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub SetBackgroundImage(Node As Node, Dir As";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Dim uri As String = File.GetUri(Dir, FileName)";
_uri = anywheresoftware.b4a.keywords.Common.File.GetUri(_dir,_filename);
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="SetStyleProperty(Node, \"-fx-background-image\", $\"";
_setstyleproperty(_node,"-fx-background-image",("url("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_uri))+")"));
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="SetStyleProperty(Node, \"-fx-background-size\", \"st";
_setstyleproperty(_node,"-fx-background-size","stretch");
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="End Sub";
return "";
}
public static String  _setborder(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _node,double _width,anywheresoftware.b4j.objects.JFX.PaintWrapper _color,double _cornerradius) throws Exception{
RDebugUtils.currentModule="cssutils";
if (Debug.shouldDelegate(ba, "setborder"))
	return (String) Debug.delegate(ba, "setborder", new Object[] {_node,_width,_color,_cornerradius});
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub SetBorder(Node As Node, Width As Double";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="SetStyleProperty(Node, \"-fx-border-color\", ColorT";
_setstyleproperty(_node,"-fx-border-color",_colortohex(_color));
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="SetStyleProperty(Node, \"-fx-border-width\", Width)";
_setstyleproperty(_node,"-fx-border-width",BA.NumberToString(_width));
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="SetStyleProperty(Node, \"-fx-border-radius\", Corne";
_setstyleproperty(_node,"-fx-border-radius",BA.NumberToString(_cornerradius));
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="SetStyleProperty(Node, \"-fx-background-radius\", C";
_setstyleproperty(_node,"-fx-background-radius",BA.NumberToString(_cornerradius));
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="End Sub";
return "";
}
}