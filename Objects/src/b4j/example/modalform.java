package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class modalform extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.modalform", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.modalform.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper _textarea1 = null;
public String _dir = "";
public anywheresoftware.b4j.objects.SegmentedButtonWrapper _segmentedbutton1 = null;
public anywheresoftware.b4j.objects.SegmentedButtonWrapper _segmentedbutton2 = null;
public anywheresoftware.b4j.objects.SegmentedButtonWrapper _segmentedbutton3 = null;
public anywheresoftware.b4j.objects.SegmentedButtonWrapper _segmentedbutton4 = null;
public anywheresoftware.b4a.objects.collections.List _sublist = null;
public b4j.example.main _main = null;
public b4j.example.cssutils _cssutils = null;
public String  _initialize(b4j.example.modalform __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="modalform";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent});
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Public Sub Initialize (Parent As Form)";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="frm.Initialize(\"frm\", 600dip, 800dip)";
__ref._frm.Initialize(ba,"frm",__c.DipToCurrent((int) (600)),__c.DipToCurrent((int) (800)));
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="frm.Title = \"Html Viewer\"";
__ref._frm.setTitle("Html Viewer");
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="frm.SetFormStyle(\"DECORATED\")";
__ref._frm.SetFormStyle("DECORATED");
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="frm.RootPane.LoadLayout(\"2\")";
__ref._frm.getRootPane().LoadLayout(ba,"2");
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="frm.SetOwner(Parent)";
__ref._frm.SetOwner(_parent);
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="sublist=File.ReadList(dir,\"setlist.txt\")";
__ref._sublist = __c.File.ReadList(__ref._dir,"setlist.txt");
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="End Sub";
return "";
}
public String  _read_file(b4j.example.modalform __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="modalform";
if (Debug.shouldDelegate(ba, "read_file"))
	return (String) Debug.delegate(ba, "read_file", null);
String _text = "";
int _i = 0;
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub read_file";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Dim text As String";
_text = "";
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="For i = 0 To sublist.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._sublist.getSize()-1);
_i = (int) (0) ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Log(sublist.Get(i))";
__c.Log(BA.ObjectToString(__ref._sublist.Get(_i)));
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="text=sublist.Get(i)";
_text = BA.ObjectToString(__ref._sublist.Get(_i));
 }
};
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="frm.ShowAndWait";
__ref._frm.ShowAndWait();
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="TextArea1.Text=File.ReadString(dir,\"new.txt\")";
__ref._textarea1.setText(__c.File.ReadString(__ref._dir,"new.txt"));
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.modalform __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="modalform";
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="Private TextArea1 As TextArea";
_textarea1 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper();
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="Dim dir As String=\"C:\\SmartOffice\\core\\data\"";
_dir = "C:\\SmartOffice\\core\\data";
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="Private SegmentedButton1 As SegmentedButton";
_segmentedbutton1 = new anywheresoftware.b4j.objects.SegmentedButtonWrapper();
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="Private SegmentedButton2 As SegmentedButton";
_segmentedbutton2 = new anywheresoftware.b4j.objects.SegmentedButtonWrapper();
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="Private SegmentedButton3 As SegmentedButton";
_segmentedbutton3 = new anywheresoftware.b4j.objects.SegmentedButtonWrapper();
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="Private SegmentedButton4 As SegmentedButton";
_segmentedbutton4 = new anywheresoftware.b4j.objects.SegmentedButtonWrapper();
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="Private sublist As List";
_sublist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="End Sub";
return "";
}
public String  _segmentedbutton1_valuechanged(b4j.example.modalform __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="modalform";
if (Debug.shouldDelegate(ba, "segmentedbutton1_valuechanged"))
	return (String) Debug.delegate(ba, "segmentedbutton1_valuechanged", new Object[] {_value});
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub SegmentedButton1_ValueChanged (Value As String";
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="End Sub";
return "";
}
public String  _segmentedbutton2_valuechanged(b4j.example.modalform __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="modalform";
if (Debug.shouldDelegate(ba, "segmentedbutton2_valuechanged"))
	return (String) Debug.delegate(ba, "segmentedbutton2_valuechanged", new Object[] {_value});
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub SegmentedButton2_ValueChanged (Value As String";
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="End Sub";
return "";
}
public String  _segmentedbutton3_valuechanged(b4j.example.modalform __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="modalform";
if (Debug.shouldDelegate(ba, "segmentedbutton3_valuechanged"))
	return (String) Debug.delegate(ba, "segmentedbutton3_valuechanged", new Object[] {_value});
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub SegmentedButton3_ValueChanged (Value As String";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="End Sub";
return "";
}
public String  _segmentedbutton4_valuechanged(b4j.example.modalform __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="modalform";
if (Debug.shouldDelegate(ba, "segmentedbutton4_valuechanged"))
	return (String) Debug.delegate(ba, "segmentedbutton4_valuechanged", new Object[] {_value});
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub SegmentedButton4_ValueChanged (Value As String";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="End Sub";
return "";
}
public String  _textarea1_textchanged(b4j.example.modalform __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="modalform";
if (Debug.shouldDelegate(ba, "textarea1_textchanged"))
	return (String) Debug.delegate(ba, "textarea1_textchanged", new Object[] {_old,_new});
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub TextArea1_TextChanged (Old As String, New As S";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="If New <> \"\" Then";
if ((_new).equals("") == false) { 
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="File.WriteString(dir,\"new.txt\",New)";
__c.File.WriteString(__ref._dir,"new.txt",_new);
 };
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="End Sub";
return "";
}
}