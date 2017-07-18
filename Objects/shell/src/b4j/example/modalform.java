
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class modalform {
    public static RemoteObject myClass;
	public modalform() {
	}
    public static PCBA staticBA = new PCBA(null, modalform.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _frm = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _textarea1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");
public static RemoteObject _dir = RemoteObject.createImmutable("");
public static RemoteObject _segmentedbutton1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.SegmentedButtonWrapper");
public static RemoteObject _segmentedbutton2 = RemoteObject.declareNull("anywheresoftware.b4j.objects.SegmentedButtonWrapper");
public static RemoteObject _segmentedbutton3 = RemoteObject.declareNull("anywheresoftware.b4j.objects.SegmentedButtonWrapper");
public static RemoteObject _segmentedbutton4 = RemoteObject.declareNull("anywheresoftware.b4j.objects.SegmentedButtonWrapper");
public static RemoteObject _sublist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static b4j.example.main _main = null;
public static b4j.example.cssutils _cssutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"dir",_ref.getField(false, "_dir"),"frm",_ref.getField(false, "_frm"),"fx",_ref.getField(false, "_fx"),"SegmentedButton1",_ref.getField(false, "_segmentedbutton1"),"SegmentedButton2",_ref.getField(false, "_segmentedbutton2"),"SegmentedButton3",_ref.getField(false, "_segmentedbutton3"),"SegmentedButton4",_ref.getField(false, "_segmentedbutton4"),"sublist",_ref.getField(false, "_sublist"),"TextArea1",_ref.getField(false, "_textarea1")};
}
}