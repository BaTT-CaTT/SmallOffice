package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class undomanager_subs_0 {


public static RemoteObject  _addstate(RemoteObject __ref,RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("AddState (undomanager) ","undomanager",2,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("addstate")) return __ref.runUserSub(false, "undomanager","addstate", __ref, _state);
RemoteObject _b = null;
int _i = 0;
Debug.locals.put("state", _state);
 BA.debugLineNum = 14;BA.debugLine="Public Sub AddState (state As Object)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Dim b() As Byte = ser.ConvertObjectToBytes(state)";
Debug.ShouldStop(16384);
_b = __ref.getField(false,"_ser").runMethod(false,"ConvertObjectToBytes",(Object)(_state));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 16;BA.debugLine="If DifferentThanPrevState(b) Then";
Debug.ShouldStop(32768);
if (__ref.runClassMethod (b4j.example.undomanager.class, "_differentthanprevstate",(Object)(_b)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 17;BA.debugLine="If index < stack.Size - 1 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_index"),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_stack").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 19;BA.debugLine="For i = stack.Size - 1 To index + 1 Step - 1";
Debug.ShouldStop(262144);
{
final int step4 = (int) (0 + -(double) (0 + 1));
final int limit4 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_index"),RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue();
_i = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_stack").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 20;BA.debugLine="stack.RemoveAt(i)";
Debug.ShouldStop(524288);
__ref.getField(false,"_stack").runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 23;BA.debugLine="stack.Add(b)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_stack").runVoidMethod ("Add",(Object)((_b)));
 BA.debugLineNum = 24;BA.debugLine="If stack.Size >= MAX_STACK_SIZE Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("g",__ref.getField(false,"_stack").runMethod(true,"getSize"),BA.numberCast(double.class, __ref.getField(true,"_max_stack_size")))) { 
 BA.debugLineNum = 25;BA.debugLine="stack.RemoveAt(1) 'keep the initial state";
Debug.ShouldStop(16777216);
__ref.getField(false,"_stack").runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 1)));
 };
 BA.debugLineNum = 27;BA.debugLine="index = stack.Size - 1";
Debug.ShouldStop(67108864);
__ref.setField ("_index",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_stack").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1));
 };
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private stack As List";
undomanager._stack = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_stack",undomanager._stack);
 //BA.debugLineNum = 3;BA.debugLine="Private ser As B4XSerializator";
undomanager._ser = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.B4XSerializator");__ref.setField("_ser",undomanager._ser);
 //BA.debugLineNum = 4;BA.debugLine="Private index As Int";
undomanager._index = RemoteObject.createImmutable(0);__ref.setField("_index",undomanager._index);
 //BA.debugLineNum = 5;BA.debugLine="Private const MAX_STACK_SIZE As Int = 100";
undomanager._max_stack_size = BA.numberCast(int.class, 100);__ref.setField("_max_stack_size",undomanager._max_stack_size);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _comparearrays(RemoteObject __ref,RemoteObject _a1,RemoteObject _a2) throws Exception{
try {
		Debug.PushSubsStack("CompareArrays (undomanager) ","undomanager",2,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("comparearrays")) return __ref.runUserSub(false, "undomanager","comparearrays", __ref, _a1, _a2);
int _i = 0;
Debug.locals.put("a1", _a1);
Debug.locals.put("a2", _a2);
 BA.debugLineNum = 52;BA.debugLine="Private Sub CompareArrays(a1() As Byte, a2() As By";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="If a1.Length <> a2.Length Then Return False";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("!",_a1.getField(true,"length"),BA.numberCast(double.class, _a2.getField(true,"length")))) { 
if (true) return undomanager.__c.getField(true,"False");};
 BA.debugLineNum = 54;BA.debugLine="For i = 0 To a1.Length - 1";
Debug.ShouldStop(2097152);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_a1.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 55;BA.debugLine="If a1(i) <>  a2(i) Then Return False";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("!",_a1.getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(double.class, _a2.getArrayElement(true,BA.numberCast(int.class, _i))))) { 
if (true) return undomanager.__c.getField(true,"False");};
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 57;BA.debugLine="Return True";
Debug.ShouldStop(16777216);
if (true) return undomanager.__c.getField(true,"True");
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _differentthanprevstate(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("DifferentThanPrevState (undomanager) ","undomanager",2,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("differentthanprevstate")) return __ref.runUserSub(false, "undomanager","differentthanprevstate", __ref, _b);
RemoteObject _prev = null;
Debug.locals.put("b", _b);
 BA.debugLineNum = 46;BA.debugLine="Private Sub DifferentThanPrevState(b() As Byte) As";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="If index = -1 Then Return True";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_index"),BA.numberCast(double.class, -(double) (0 + 1)))) { 
if (true) return undomanager.__c.getField(true,"True");};
 BA.debugLineNum = 48;BA.debugLine="Dim prev() As Byte = stack.Get(index)";
Debug.ShouldStop(32768);
_prev = (__ref.getField(false,"_stack").runMethod(false,"Get",(Object)(__ref.getField(true,"_index"))));Debug.locals.put("prev", _prev);Debug.locals.put("prev", _prev);
 BA.debugLineNum = 49;BA.debugLine="Return Not(CompareArrays(prev, b))";
Debug.ShouldStop(65536);
if (true) return undomanager.__c.runMethod(true,"Not",(Object)(__ref.runClassMethod (b4j.example.undomanager.class, "_comparearrays",(Object)(_prev),(Object)(_b))));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _initialstate) throws Exception{
try {
		Debug.PushSubsStack("Initialize (undomanager) ","undomanager",2,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "undomanager","initialize", __ref, _ba, _initialstate);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("InitialState", _initialstate);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize (InitialState As Object)";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="stack.Initialize";
Debug.ShouldStop(256);
__ref.getField(false,"_stack").runVoidMethod ("Initialize");
 BA.debugLineNum = 10;BA.debugLine="index = -1";
Debug.ShouldStop(512);
__ref.setField ("_index",BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 11;BA.debugLine="AddState(InitialState)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.undomanager.class, "_addstate",(Object)(_initialstate));
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _redo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Redo (undomanager) ","undomanager",2,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("redo")) return __ref.runUserSub(false, "undomanager","redo", __ref);
 BA.debugLineNum = 38;BA.debugLine="Public Sub Redo As Object";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="If index < stack.Size - 1 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_index"),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_stack").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 40;BA.debugLine="index = index + 1";
Debug.ShouldStop(128);
__ref.setField ("_index",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_index"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 41;BA.debugLine="Return ser.ConvertBytesToObject(stack.Get(index)";
Debug.ShouldStop(256);
if (true) return __ref.getField(false,"_ser").runMethod(false,"ConvertBytesToObject",(Object)((__ref.getField(false,"_stack").runMethod(false,"Get",(Object)(__ref.getField(true,"_index"))))));
 };
 BA.debugLineNum = 43;BA.debugLine="Return Null";
Debug.ShouldStop(1024);
if (true) return undomanager.__c.getField(false,"Null");
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _undo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Undo (undomanager) ","undomanager",2,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("undo")) return __ref.runUserSub(false, "undomanager","undo", __ref);
 BA.debugLineNum = 32;BA.debugLine="Public Sub Undo As Object";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="If index > 0 Then index = index - 1";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_index"),BA.numberCast(double.class, 0))) { 
__ref.setField ("_index",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_index"),RemoteObject.createImmutable(1)}, "-",1, 1));};
 BA.debugLineNum = 34;BA.debugLine="Return ser.ConvertBytesToObject(stack.Get(index))";
Debug.ShouldStop(2);
if (true) return __ref.getField(false,"_ser").runMethod(false,"ConvertBytesToObject",(Object)((__ref.getField(false,"_stack").runMethod(false,"Get",(Object)(__ref.getField(true,"_index"))))));
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}