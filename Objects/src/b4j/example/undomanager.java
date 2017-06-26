package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class undomanager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.undomanager", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.undomanager.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List _stack = null;
public anywheresoftware.b4a.randomaccessfile.B4XSerializator _ser = null;
public int _index = 0;
public int _max_stack_size = 0;
public b4j.example.main _main = null;
public b4j.example.cssutils _cssutils = null;
public String  _initialize(b4j.example.undomanager __ref,anywheresoftware.b4a.BA _ba,Object _initialstate) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="undomanager";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba,_initialstate});
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub Initialize (InitialState As Object)";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="stack.Initialize";
__ref._stack.Initialize();
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="index = -1";
__ref._index = (int) (-1);
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="AddState(InitialState)";
__ref._addstate(null,_initialstate);
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="End Sub";
return "";
}
public Object  _redo(b4j.example.undomanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="undomanager";
if (Debug.shouldDelegate(ba, "redo"))
	return (Object) Debug.delegate(ba, "redo", null);
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub Redo As Object";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="If index < stack.Size - 1 Then";
if (__ref._index<__ref._stack.getSize()-1) { 
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="index = index + 1";
__ref._index = (int) (__ref._index+1);
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="Return ser.ConvertBytesToObject(stack.Get(index)";
if (true) return __ref._ser.ConvertBytesToObject((byte[])(__ref._stack.Get(__ref._index)));
 };
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="Return Null";
if (true) return __c.Null;
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="End Sub";
return null;
}
public Object  _undo(b4j.example.undomanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="undomanager";
if (Debug.shouldDelegate(ba, "undo"))
	return (Object) Debug.delegate(ba, "undo", null);
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Public Sub Undo As Object";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="If index > 0 Then index = index - 1";
if (__ref._index>0) { 
__ref._index = (int) (__ref._index-1);};
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="Return ser.ConvertBytesToObject(stack.Get(index))";
if (true) return __ref._ser.ConvertBytesToObject((byte[])(__ref._stack.Get(__ref._index)));
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="End Sub";
return null;
}
public String  _addstate(b4j.example.undomanager __ref,Object _state) throws Exception{
__ref = this;
RDebugUtils.currentModule="undomanager";
if (Debug.shouldDelegate(ba, "addstate"))
	return (String) Debug.delegate(ba, "addstate", new Object[] {_state});
byte[] _b = null;
int _i = 0;
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Public Sub AddState (state As Object)";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Dim b() As Byte = ser.ConvertObjectToBytes(state)";
_b = __ref._ser.ConvertObjectToBytes(_state);
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="If DifferentThanPrevState(b) Then";
if (__ref._differentthanprevstate(null,_b)) { 
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="If index < stack.Size - 1 Then";
if (__ref._index<__ref._stack.getSize()-1) { 
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="For i = stack.Size - 1 To index + 1 Step - 1";
{
final int step4 = (int) (-1);
final int limit4 = (int) (__ref._index+1);
_i = (int) (__ref._stack.getSize()-1) ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="stack.RemoveAt(i)";
__ref._stack.RemoveAt(_i);
 }
};
 };
RDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="stack.Add(b)";
__ref._stack.Add((Object)(_b));
RDebugUtils.currentLine=1966090;
 //BA.debugLineNum = 1966090;BA.debugLine="If stack.Size >= MAX_STACK_SIZE Then";
if (__ref._stack.getSize()>=__ref._max_stack_size) { 
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="stack.RemoveAt(1) 'keep the initial state";
__ref._stack.RemoveAt((int) (1));
 };
RDebugUtils.currentLine=1966093;
 //BA.debugLineNum = 1966093;BA.debugLine="index = stack.Size - 1";
__ref._index = (int) (__ref._stack.getSize()-1);
 };
RDebugUtils.currentLine=1966096;
 //BA.debugLineNum = 1966096;BA.debugLine="End Sub";
return "";
}
public boolean  _differentthanprevstate(b4j.example.undomanager __ref,byte[] _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="undomanager";
if (Debug.shouldDelegate(ba, "differentthanprevstate"))
	return (Boolean) Debug.delegate(ba, "differentthanprevstate", new Object[] {_b});
byte[] _prev = null;
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Private Sub DifferentThanPrevState(b() As Byte) As";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="If index = -1 Then Return True";
if (__ref._index==-1) { 
if (true) return __c.True;};
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Dim prev() As Byte = stack.Get(index)";
_prev = (byte[])(__ref._stack.Get(__ref._index));
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="Return Not(CompareArrays(prev, b))";
if (true) return __c.Not(__ref._comparearrays(null,_prev,_b));
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.example.undomanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="undomanager";
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Private stack As List";
_stack = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Private ser As B4XSerializator";
_ser = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Private index As Int";
_index = 0;
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="Private const MAX_STACK_SIZE As Int = 100";
_max_stack_size = (int) (100);
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="End Sub";
return "";
}
public boolean  _comparearrays(b4j.example.undomanager __ref,byte[] _a1,byte[] _a2) throws Exception{
__ref = this;
RDebugUtils.currentModule="undomanager";
if (Debug.shouldDelegate(ba, "comparearrays"))
	return (Boolean) Debug.delegate(ba, "comparearrays", new Object[] {_a1,_a2});
int _i = 0;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Private Sub CompareArrays(a1() As Byte, a2() As By";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="If a1.Length <> a2.Length Then Return False";
if (_a1.length!=_a2.length) { 
if (true) return __c.False;};
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="For i = 0 To a1.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (_a1.length-1);
_i = (int) (0) ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="If a1(i) <>  a2(i) Then Return False";
if (_a1[_i]!=_a2[_i]) { 
if (true) return __c.False;};
 }
};
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="End Sub";
return false;
}
}