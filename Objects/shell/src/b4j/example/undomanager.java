
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class undomanager {
    public static RemoteObject myClass;
	public undomanager() {
	}
    public static PCBA staticBA = new PCBA(null, undomanager.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _stack = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _ser = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.B4XSerializator");
public static RemoteObject _index = RemoteObject.createImmutable(0);
public static RemoteObject _max_stack_size = RemoteObject.createImmutable(0);
public static b4j.example.main _main = null;
public static b4j.example.cssutils _cssutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"index",_ref.getField(false, "_index"),"MAX_STACK_SIZE",_ref.getField(false, "_max_stack_size"),"ser",_ref.getField(false, "_ser"),"stack",_ref.getField(false, "_stack")};
}
}