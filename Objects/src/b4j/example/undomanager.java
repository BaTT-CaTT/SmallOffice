package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class undomanager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.undomanager", this);
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.List _stack = null;
public anywheresoftware.b4a.randomaccessfile.B4XSerializator _ser = null;
public int _index = 0;
public int _max_stack_size = 0;
public b4j.example.main _main = null;
public b4j.example.cssutils _cssutils = null;
public String  _addstate(Object _state) throws Exception{
byte[] _b = null;
int _i = 0;
 //BA.debugLineNum = 14;BA.debugLine="Public Sub AddState (state As Object)";
 //BA.debugLineNum = 15;BA.debugLine="Dim b() As Byte = ser.ConvertObjectToBytes(state)";
_b = _ser.ConvertObjectToBytes(_state);
 //BA.debugLineNum = 16;BA.debugLine="If DifferentThanPrevState(b) Then";
if (_differentthanprevstate(_b)) { 
 //BA.debugLineNum = 17;BA.debugLine="If index < stack.Size - 1 Then";
if (_index<_stack.getSize()-1) { 
 //BA.debugLineNum = 19;BA.debugLine="For i = stack.Size - 1 To index + 1 Step - 1";
{
final int step4 = (int) (-1);
final int limit4 = (int) (_index+1);
_i = (int) (_stack.getSize()-1) ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
 //BA.debugLineNum = 20;BA.debugLine="stack.RemoveAt(i)";
_stack.RemoveAt(_i);
 }
};
 };
 //BA.debugLineNum = 23;BA.debugLine="stack.Add(b)";
_stack.Add((Object)(_b));
 //BA.debugLineNum = 24;BA.debugLine="If stack.Size >= MAX_STACK_SIZE Then";
if (_stack.getSize()>=_max_stack_size) { 
 //BA.debugLineNum = 25;BA.debugLine="stack.RemoveAt(1) 'keep the initial state";
_stack.RemoveAt((int) (1));
 };
 //BA.debugLineNum = 27;BA.debugLine="index = stack.Size - 1";
_index = (int) (_stack.getSize()-1);
 };
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private stack As List";
_stack = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 3;BA.debugLine="Private ser As B4XSerializator";
_ser = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
 //BA.debugLineNum = 4;BA.debugLine="Private index As Int";
_index = 0;
 //BA.debugLineNum = 5;BA.debugLine="Private const MAX_STACK_SIZE As Int = 100";
_max_stack_size = (int) (100);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public boolean  _comparearrays(byte[] _a1,byte[] _a2) throws Exception{
int _i = 0;
 //BA.debugLineNum = 52;BA.debugLine="Private Sub CompareArrays(a1() As Byte, a2() As By";
 //BA.debugLineNum = 53;BA.debugLine="If a1.Length <> a2.Length Then Return False";
if (_a1.length!=_a2.length) { 
if (true) return __c.False;};
 //BA.debugLineNum = 54;BA.debugLine="For i = 0 To a1.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (_a1.length-1);
_i = (int) (0) ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
 //BA.debugLineNum = 55;BA.debugLine="If a1(i) <>  a2(i) Then Return False";
if (_a1[_i]!=_a2[_i]) { 
if (true) return __c.False;};
 }
};
 //BA.debugLineNum = 57;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return false;
}
public boolean  _differentthanprevstate(byte[] _b) throws Exception{
byte[] _prev = null;
 //BA.debugLineNum = 46;BA.debugLine="Private Sub DifferentThanPrevState(b() As Byte) As";
 //BA.debugLineNum = 47;BA.debugLine="If index = -1 Then Return True";
if (_index==-1) { 
if (true) return __c.True;};
 //BA.debugLineNum = 48;BA.debugLine="Dim prev() As Byte = stack.Get(index)";
_prev = (byte[])(_stack.Get(_index));
 //BA.debugLineNum = 49;BA.debugLine="Return Not(CompareArrays(prev, b))";
if (true) return __c.Not(_comparearrays(_prev,_b));
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _initialstate) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize (InitialState As Object)";
 //BA.debugLineNum = 9;BA.debugLine="stack.Initialize";
_stack.Initialize();
 //BA.debugLineNum = 10;BA.debugLine="index = -1";
_index = (int) (-1);
 //BA.debugLineNum = 11;BA.debugLine="AddState(InitialState)";
_addstate(_initialstate);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public Object  _redo() throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Public Sub Redo As Object";
 //BA.debugLineNum = 39;BA.debugLine="If index < stack.Size - 1 Then";
if (_index<_stack.getSize()-1) { 
 //BA.debugLineNum = 40;BA.debugLine="index = index + 1";
_index = (int) (_index+1);
 //BA.debugLineNum = 41;BA.debugLine="Return ser.ConvertBytesToObject(stack.Get(index)";
if (true) return _ser.ConvertBytesToObject((byte[])(_stack.Get(_index)));
 };
 //BA.debugLineNum = 43;BA.debugLine="Return Null";
if (true) return __c.Null;
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public Object  _undo() throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Public Sub Undo As Object";
 //BA.debugLineNum = 33;BA.debugLine="If index > 0 Then index = index - 1";
if (_index>0) { 
_index = (int) (_index-1);};
 //BA.debugLineNum = 34;BA.debugLine="Return ser.ConvertBytesToObject(stack.Get(index))";
if (true) return _ser.ConvertBytesToObject((byte[])(_stack.Get(_index)));
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
