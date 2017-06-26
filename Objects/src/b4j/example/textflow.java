package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class textflow extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.textflow", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.textflow.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4a.objects.collections.List _texts = null;
public anywheresoftware.b4j.object.JavaObject _lastitem = null;
public b4j.example.main _main = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.textflow  _addtext(b4j.example.textflow __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="textflow";
if (Debug.shouldDelegate(ba, "addtext"))
	return (b4j.example.textflow) Debug.delegate(ba, "addtext", new Object[] {_text});
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub AddText(text As String) As TextFlow";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Dim lastItem As JavaObject";
_lastitem = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="lastItem.InitializeNewInstance(\"javafx.scene.text";
__ref._lastitem.InitializeNewInstance("javafx.scene.text.Text",new Object[]{(Object)(_text)});
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="texts.Add(lastItem)";
__ref._texts.Add((Object)(__ref._lastitem.getObject()));
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="Return Me";
if (true) return (b4j.example.textflow)(this);
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.textflow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="textflow";
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Private texts As List";
_texts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="Private lastItem As JavaObject";
_lastitem = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _createtextflow(b4j.example.textflow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="textflow";
if (Debug.shouldDelegate(ba, "createtextflow"))
	return (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "createtextflow", null);
anywheresoftware.b4j.object.JavaObject _tf = null;
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub CreateTextFlow As Pane";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Dim tf As JavaObject";
_tf = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="tf.InitializeNewInstance(\"javafx.scene.text.TextF";
_tf.InitializeNewInstance("javafx.scene.text.TextFlow",(Object[])(__c.Null));
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="tf.RunMethodJO(\"getChildren\", Null).RunMethod(\"ad";
_tf.RunMethodJO("getChildren",(Object[])(__c.Null)).RunMethod("addAll",new Object[]{(Object)(__ref._texts.getObject())});
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="Return tf";
if (true) return (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_tf.getObject()));
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.textflow __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="textflow";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="texts.Initialize";
__ref._texts.Initialize();
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
public b4j.example.textflow  _setcolor(b4j.example.textflow __ref,anywheresoftware.b4j.objects.JFX.PaintWrapper _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="textflow";
if (Debug.shouldDelegate(ba, "setcolor"))
	return (b4j.example.textflow) Debug.delegate(ba, "setcolor", new Object[] {_color});
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub SetColor(Color As Paint) As TextFlow";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="lastItem.RunMethod(\"setFill\", Array(Color))";
__ref._lastitem.RunMethod("setFill",new Object[]{(Object)(_color.getObject())});
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="Return Me";
if (true) return (b4j.example.textflow)(this);
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="End Sub";
return null;
}
public b4j.example.textflow  _setfont(b4j.example.textflow __ref,anywheresoftware.b4j.objects.JFX.FontWrapper _font) throws Exception{
__ref = this;
RDebugUtils.currentModule="textflow";
if (Debug.shouldDelegate(ba, "setfont"))
	return (b4j.example.textflow) Debug.delegate(ba, "setfont", new Object[] {_font});
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub SetFont(Font As Font) As TextFlow";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="lastItem.RunMethod(\"setFont\", Array(Font))";
__ref._lastitem.RunMethod("setFont",new Object[]{(Object)(_font.getObject())});
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Return Me";
if (true) return (b4j.example.textflow)(this);
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="End Sub";
return null;
}
public b4j.example.textflow  _setstrikethrough(b4j.example.textflow __ref,boolean _strikethrough) throws Exception{
__ref = this;
RDebugUtils.currentModule="textflow";
if (Debug.shouldDelegate(ba, "setstrikethrough"))
	return (b4j.example.textflow) Debug.delegate(ba, "setstrikethrough", new Object[] {_strikethrough});
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub SetStrikethrough(Strikethrough As Boole";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="lastItem.RunMethod(\"setStrikethrough\", Array(Stri";
__ref._lastitem.RunMethod("setStrikethrough",new Object[]{(Object)(_strikethrough)});
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Return Me";
if (true) return (b4j.example.textflow)(this);
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="End Sub";
return null;
}
public b4j.example.textflow  _setunderline(b4j.example.textflow __ref,boolean _underline) throws Exception{
__ref = this;
RDebugUtils.currentModule="textflow";
if (Debug.shouldDelegate(ba, "setunderline"))
	return (b4j.example.textflow) Debug.delegate(ba, "setunderline", new Object[] {_underline});
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub SetUnderline(Underline As Boolean) As T";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="lastItem.RunMethod(\"setUnderline\", Array(Underlin";
__ref._lastitem.RunMethod("setUnderline",new Object[]{(Object)(_underline)});
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Return Me";
if (true) return (b4j.example.textflow)(this);
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="End Sub";
return null;
}
}