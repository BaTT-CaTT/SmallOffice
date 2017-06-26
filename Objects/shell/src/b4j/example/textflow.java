
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class textflow {
    public static RemoteObject myClass;
	public textflow() {
	}
    public static PCBA staticBA = new PCBA(null, textflow.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _texts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lastitem = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static b4j.example.main _main = null;
public static b4j.example.cssutils _cssutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"fx",_ref.getField(false, "_fx"),"lastItem",_ref.getField(false, "_lastitem"),"texts",_ref.getField(false, "_texts")};
}
}