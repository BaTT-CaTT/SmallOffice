package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class textflow extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.textflow", this);
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4a.objects.collections.List _texts = null;
public anywheresoftware.b4j.object.JavaObject _lastitem = null;
public b4j.example.main _main = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.textflow  _addtext(String _text) throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Public Sub AddText(text As String) As TextFlow";
 //BA.debugLineNum = 13;BA.debugLine="Dim lastItem As JavaObject";
_lastitem = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 14;BA.debugLine="lastItem.InitializeNewInstance(\"javafx.scene.text";
_lastitem.InitializeNewInstance("javafx.scene.text.Text",new Object[]{(Object)(_text)});
 //BA.debugLineNum = 15;BA.debugLine="texts.Add(lastItem)";
_texts.Add((Object)(_lastitem.getObject()));
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return (b4j.example.textflow)(this);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Private texts As List";
_texts = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 5;BA.debugLine="Private lastItem As JavaObject";
_lastitem = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _createtextflow() throws Exception{
anywheresoftware.b4j.object.JavaObject _tf = null;
 //BA.debugLineNum = 41;BA.debugLine="Public Sub CreateTextFlow As Pane";
 //BA.debugLineNum = 42;BA.debugLine="Dim tf As JavaObject";
_tf = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 43;BA.debugLine="tf.InitializeNewInstance(\"javafx.scene.text.TextF";
_tf.InitializeNewInstance("javafx.scene.text.TextFlow",(Object[])(__c.Null));
 //BA.debugLineNum = 44;BA.debugLine="tf.RunMethodJO(\"getChildren\", Null).RunMethod(\"ad";
_tf.RunMethodJO("getChildren",(Object[])(__c.Null)).RunMethod("addAll",new Object[]{(Object)(_texts.getObject())});
 //BA.debugLineNum = 45;BA.debugLine="Return tf";
if (true) return (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_tf.getObject()));
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 9;BA.debugLine="texts.Initialize";
_texts.Initialize();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.textflow  _setcolor(anywheresoftware.b4j.objects.JFX.PaintWrapper _color) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Public Sub SetColor(Color As Paint) As TextFlow";
 //BA.debugLineNum = 25;BA.debugLine="lastItem.RunMethod(\"setFill\", Array(Color))";
_lastitem.RunMethod("setFill",new Object[]{(Object)(_color.getObject())});
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (b4j.example.textflow)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public b4j.example.textflow  _setfont(anywheresoftware.b4j.objects.JFX.FontWrapper _font) throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Public Sub SetFont(Font As Font) As TextFlow";
 //BA.debugLineNum = 20;BA.debugLine="lastItem.RunMethod(\"setFont\", Array(Font))";
_lastitem.RunMethod("setFont",new Object[]{(Object)(_font.getObject())});
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.textflow)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public b4j.example.textflow  _setstrikethrough(boolean _strikethrough) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Public Sub SetStrikethrough(Strikethrough As Boole";
 //BA.debugLineNum = 35;BA.debugLine="lastItem.RunMethod(\"setStrikethrough\", Array(Stri";
_lastitem.RunMethod("setStrikethrough",new Object[]{(Object)(_strikethrough)});
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.textflow)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.textflow  _setunderline(boolean _underline) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Public Sub SetUnderline(Underline As Boolean) As T";
 //BA.debugLineNum = 30;BA.debugLine="lastItem.RunMethod(\"setUnderline\", Array(Underlin";
_lastitem.RunMethod("setUnderline",new Object[]{(Object)(_underline)});
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.textflow)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
