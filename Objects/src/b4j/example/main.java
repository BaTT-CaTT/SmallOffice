package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 600, 600);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4j.objects.ChoiceBoxWrapper _choicebox1 = null;
public static anywheresoftware.b4j.objects.ColorPickerWrapper _colorpicker1 = null;
public static anywheresoftware.b4j.objects.ComboBoxWrapper _combobox1 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _label2 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _label3 = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper _menubar1 = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pane1 = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper _textarea1 = null;
public static String _dir = "";
public static anywheresoftware.b4a.objects.collections.List _colorlist = null;
public static anywheresoftware.b4a.objects.collections.List _fontlist = null;
public static anywheresoftware.b4a.objects.collections.List _sizelist = null;
public static anywheresoftware.b4a.objects.collections.List _editor = null;
public static anywheresoftware.b4a.objects.collections.List _menulist = null;
public static b4j.example.textflow _ts = null;
public static anywheresoftware.b4j.objects.BreadCrumbBarWrapper _bbar = null;
public static anywheresoftware.b4j.objects.JFX _control = null;
public static anywheresoftware.b4j.object.JavaObject _jo = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _textfield1 = null;
public static anywheresoftware.b4j.objects.PropertySheetWrapper _prop = null;
public static anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _rechtanglemain = null;
public static anywheresoftware.b4a.objects.Timer _timer1 = null;
public static b4j.example.undomanager _manager = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnundo = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnredo = null;
public static anywheresoftware.b4j.objects.DirectoryChooserWrapper _cho = null;
public static anywheresoftware.b4j.objects.FileChooserWrapper _save = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _button1 = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _button2 = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
public static anywheresoftware.b4j.objects.ComboBoxWrapper _combobox2 = null;
public static b4j.example.cssutils _cssutils = null;
public static class _record{
public boolean IsInitialized;
public String Text;
public double Number;
public anywheresoftware.b4j.objects.JFX.PaintWrapper Color;
public anywheresoftware.b4j.objects.JFX.FontWrapper Fnt;
public String Choices;
public boolean YesNo;
public void Initialize() {
IsInitialized = true;
Text = "";
Number = 0;
Color = new anywheresoftware.b4j.objects.JFX.PaintWrapper();
Fnt = new anywheresoftware.b4j.objects.JFX.FontWrapper();
Choices = "";
YesNo = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _undodata{
public boolean IsInitialized;
public String Text;
public int clr;
public void Initialize() {
IsInitialized = true;
Text = "";
clr = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 88;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return false;
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
int _s = 0;
int _d = 0;
 //BA.debugLineNum = 43;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 44;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 45;BA.debugLine="MainForm.RootPane.LoadLayout(\"1\") 'Load the layou";
_mainform.getRootPane().LoadLayout(ba,"1");
 //BA.debugLineNum = 46;BA.debugLine="MainForm.Resizable=False";
_mainform.setResizable(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 47;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 48;BA.debugLine="prop.Initialize(\"prop\")";
_prop.Initialize(ba,"prop");
 //BA.debugLineNum = 49;BA.debugLine="If File.Exists(\"C:\\SmartOffice\\Files\",\"log.txt\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists("C:\\SmartOffice\\Files","log.txt")) { 
 }else {
 //BA.debugLineNum = 52;BA.debugLine="File.MakeDir(\"C:\\\",\"SmartOffice\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir("C:\\","SmartOffice");
 //BA.debugLineNum = 53;BA.debugLine="File.WriteString(dir,\"log.txt\",\"Willkommen\")";
anywheresoftware.b4a.keywords.Common.File.WriteString(_dir,"log.txt","Willkommen");
 };
 //BA.debugLineNum = 55;BA.debugLine="colorlist.Initialize";
_colorlist.Initialize();
 //BA.debugLineNum = 56;BA.debugLine="menulist.Initialize";
_menulist.Initialize();
 //BA.debugLineNum = 57;BA.debugLine="menulist.AddAll(MenuBar1.Menus)";
_menulist.AddAll(_menubar1.getMenus());
 //BA.debugLineNum = 59;BA.debugLine="sizelist.Initialize";
_sizelist.Initialize();
 //BA.debugLineNum = 60;BA.debugLine="editor.Initialize";
_editor.Initialize();
 //BA.debugLineNum = 61;BA.debugLine="editor.AddAll(TextArea1.StyleClasses)";
_editor.AddAll(_textarea1.getStyleClasses());
 //BA.debugLineNum = 62;BA.debugLine="Label1.Initialize(\"label1\")";
_label1.Initialize(ba,"label1");
 //BA.debugLineNum = 63;BA.debugLine="Label1.Enabled=True";
_label1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 64;BA.debugLine="TextArea1.Text=Label1.Text";
_textarea1.setText(_label1.getText());
 //BA.debugLineNum = 65;BA.debugLine="For s = 0 To editor.Size-1";
{
final int step20 = 1;
final int limit20 = (int) (_editor.getSize()-1);
_s = (int) (0) ;
for (;(step20 > 0 && _s <= limit20) || (step20 < 0 && _s >= limit20) ;_s = ((int)(0 + _s + step20))  ) {
 //BA.debugLineNum = 66;BA.debugLine="Log(editor.Get(s))";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_editor.Get(_s)));
 }
};
 //BA.debugLineNum = 68;BA.debugLine="fontlist.Initialize";
_fontlist.Initialize();
 //BA.debugLineNum = 69;BA.debugLine="fontlist.Clear";
_fontlist.Clear();
 //BA.debugLineNum = 70;BA.debugLine="fontlist.AddAll(control.GetAllFontFamilies)";
_fontlist.AddAll(_control.GetAllFontFamilies());
 //BA.debugLineNum = 71;BA.debugLine="ComboBox2.Items.AddAll(fontlist)";
_combobox2.getItems().AddAll(_fontlist);
 //BA.debugLineNum = 72;BA.debugLine="sizelist.Clear";
_sizelist.Clear();
 //BA.debugLineNum = 73;BA.debugLine="For d = 4 To 55";
{
final int step28 = 1;
final int limit28 = (int) (55);
_d = (int) (4) ;
for (;(step28 > 0 && _d <= limit28) || (step28 < 0 && _d >= limit28) ;_d = ((int)(0 + _d + step28))  ) {
 //BA.debugLineNum = 74;BA.debugLine="sizelist.Add(d)";
_sizelist.Add((Object)(_d));
 }
};
 //BA.debugLineNum = 76;BA.debugLine="ComboBox1.Items.AddAll(sizelist)";
_combobox1.getItems().AddAll(_sizelist);
 //BA.debugLineNum = 77;BA.debugLine="timer1.Initialize(\"timer1\", 1000)";
_timer1.Initialize(ba,"timer1",(long) (1000));
 //BA.debugLineNum = 78;BA.debugLine="timer1.Enabled = True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 79;BA.debugLine="manager.Initialize(GetState)";
_manager._initialize(ba,(Object)(_getstate()));
 //BA.debugLineNum = 80;BA.debugLine="cho.Initialize";
_cho.Initialize();
 //BA.debugLineNum = 81;BA.debugLine="save.Initialize";
_save.Initialize();
 //BA.debugLineNum = 82;BA.debugLine="cho.InitialDirectory=dir";
_cho.setInitialDirectory(_dir);
 //BA.debugLineNum = 83;BA.debugLine="save.InitialDirectory=cho.InitialDirectory";
_save.setInitialDirectory(_cho.getInitialDirectory());
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public static String  _btnredo_action() throws Exception{
b4j.example.main._undodata _ud = null;
 //BA.debugLineNum = 160;BA.debugLine="Sub btnredo_Action";
 //BA.debugLineNum = 161;BA.debugLine="Dim ud As UndoData = manager.Redo";
_ud = (b4j.example.main._undodata)(_manager._redo());
 //BA.debugLineNum = 162;BA.debugLine="If ud <> Null Then";
if (_ud!= null) { 
 //BA.debugLineNum = 163;BA.debugLine="SetState(ud)";
_setstate(_ud);
 };
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public static String  _btnundo_action() throws Exception{
b4j.example.main._undodata _ud = null;
 //BA.debugLineNum = 155;BA.debugLine="Sub btnundo_Action";
 //BA.debugLineNum = 156;BA.debugLine="Dim ud As UndoData = manager.Undo";
_ud = (b4j.example.main._undodata)(_manager._undo());
 //BA.debugLineNum = 157;BA.debugLine="SetState(ud)";
_setstate(_ud);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public static String  _button1_action() throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Sub Button1_Action";
 //BA.debugLineNum = 172;BA.debugLine="save.setExtensionFilter(\"TextFile\", Array As Stri";
_save.SetExtensionFilter("TextFile",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"*.txt","*.doc","*.html"}));
 //BA.debugLineNum = 173;BA.debugLine="save.Title=\"Speichern\"";
_save.setTitle("Speichern");
 //BA.debugLineNum = 174;BA.debugLine="save.ShowSave(MainForm)";
_save.ShowSave(_mainform);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public static String  _button2_action() throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Sub Button2_Action";
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return "";
}
public static String  _colorpicker1_valuechanged(anywheresoftware.b4j.objects.JFX.PaintWrapper _value) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub ColorPicker1_ValueChanged (Value As Paint)";
 //BA.debugLineNum = 133;BA.debugLine="CSSUtils.SetStyleProperty(TextArea1, \"-fx-text-fi";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_textarea1.getObject())),"-fx-text-fill",_cssutils._colortohex(_value));
 //BA.debugLineNum = 134;BA.debugLine="TextArea1.SelectAll";
_textarea1.SelectAll();
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public static String  _combobox1_selectedindexchanged(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub ComboBox1_SelectedIndexChanged(Index As Int, V";
 //BA.debugLineNum = 118;BA.debugLine="ComboBox1.SelectedIndex=Index";
_combobox1.setSelectedIndex(_index);
 //BA.debugLineNum = 119;BA.debugLine="Log(Index)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_index));
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public static String  _combobox1_valuechanged(Object _value) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub ComboBox1_ValueChanged (Value As Object)";
 //BA.debugLineNum = 113;BA.debugLine="CSSUtils.SetStyleProperty(TextArea1, \"-fx-font-si";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_textarea1.getObject())),"-fx-font-size",BA.ObjectToString(_combobox1.getItems().Get((int)(BA.ObjectToNumber(_value)))));
 //BA.debugLineNum = 114;BA.debugLine="Log(Value)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_value));
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public static String  _combobox2_selectedindexchanged(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub ComboBox2_SelectedIndexChanged(Index As Int, V";
 //BA.debugLineNum = 130;BA.debugLine="ComboBox2.SelectedIndex=Index";
_combobox2.setSelectedIndex(_index);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public static String  _combobox2_valuechanged(Object _value) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub ComboBox2_ValueChanged (Value As Object)";
 //BA.debugLineNum = 122;BA.debugLine="Try";
try { //BA.debugLineNum = 123;BA.debugLine="CSSUtils.SetStyleProperty(TextArea1, \"-fx-font-fam";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_textarea1.getObject())),"-fx-font-family",BA.ObjectToString(_value));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 125;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public static b4j.example.main._undodata  _getstate() throws Exception{
b4j.example.main._undodata _ud = null;
 //BA.debugLineNum = 91;BA.debugLine="Sub GetState As UndoData";
 //BA.debugLineNum = 92;BA.debugLine="Dim ud As UndoData";
_ud = new b4j.example.main._undodata();
 //BA.debugLineNum = 93;BA.debugLine="ud.Initialize";
_ud.Initialize();
 //BA.debugLineNum = 94;BA.debugLine="ud.Text = TextArea1.Text";
_ud.Text = _textarea1.getText();
 //BA.debugLineNum = 95;BA.debugLine="ud.clr = fx.Colors.To32Bit(ColorPicker1.SelectedC";
_ud.clr = _fx.Colors.To32Bit(_colorpicker1.getSelectedColor());
 //BA.debugLineNum = 96;BA.debugLine="Return ud";
if (true) return _ud;
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return null;
}
public static String  _menubar1_action() throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub MenuBar1_Action";
 //BA.debugLineNum = 105;BA.debugLine="mi = Sender";
_mi.setObject((javafx.scene.control.MenuItem)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
 //BA.debugLineNum = 106;BA.debugLine="If mi.Text=\"_Close\" Then";
if ((_mi.getText()).equals("_Close")) { 
 //BA.debugLineNum = 107;BA.debugLine="MainForm.Close";
_mainform.Close();
 //BA.debugLineNum = 108;BA.debugLine="Log(\"close..\")";
anywheresoftware.b4a.keywords.Common.Log("close..");
 };
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public static String  _menubar1_selectedchange(boolean _selected) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub MenuBar1_SelectedChange (Selected As Boolean)";
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public static String  _mi_action() throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub mi_Action";
 //BA.debugLineNum = 182;BA.debugLine="mi = Sender";
_mi.setObject((javafx.scene.control.MenuItem)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
 //BA.debugLineNum = 183;BA.debugLine="If mi.Text=\"_Kopieren\" Then";
if ((_mi.getText()).equals("_Kopieren")) { 
 //BA.debugLineNum = 185;BA.debugLine="Log(\"close..\")";
anywheresoftware.b4a.keywords.Common.Log("close..");
 };
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
cssutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 9;BA.debugLine="Private ChoiceBox1 As ChoiceBox";
_choicebox1 = new anywheresoftware.b4j.objects.ChoiceBoxWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private ColorPicker1 As ColorPicker";
_colorpicker1 = new anywheresoftware.b4j.objects.ColorPickerWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private ComboBox1 As ComboBox";
_combobox1 = new anywheresoftware.b4j.objects.ComboBoxWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private Label2 As Label";
_label2 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private MenuBar1 As MenuBar";
_menubar1 = new anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private Pane1 As Pane";
_pane1 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private TextArea1 As TextArea";
_textarea1 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim dir As String=\"C:\\SmartOffice\"";
_dir = "C:\\SmartOffice";
 //BA.debugLineNum = 19;BA.debugLine="Dim colorlist,fontlist,sizelist,editor,menulist A";
_colorlist = new anywheresoftware.b4a.objects.collections.List();
_fontlist = new anywheresoftware.b4a.objects.collections.List();
_sizelist = new anywheresoftware.b4a.objects.collections.List();
_editor = new anywheresoftware.b4a.objects.collections.List();
_menulist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 20;BA.debugLine="Dim ts As TextFlow";
_ts = new b4j.example.textflow();
 //BA.debugLineNum = 21;BA.debugLine="Dim bbar As BreadCrumbBar";
_bbar = new anywheresoftware.b4j.objects.BreadCrumbBarWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Dim control As JFX";
_control = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 23;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 24;BA.debugLine="Private TextField1 As TextField";
_textfield1 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Dim prop As PropertySheet";
_prop = new anywheresoftware.b4j.objects.PropertySheetWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Type Record(Text As String, Number As Double, _";
;
 //BA.debugLineNum = 29;BA.debugLine="Private rechtangleMain As Node";
_rechtanglemain = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Type UndoData (Text As String, clr As Int)";
;
 //BA.debugLineNum = 31;BA.debugLine="Private timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 32;BA.debugLine="Private manager As UndoManager";
_manager = new b4j.example.undomanager();
 //BA.debugLineNum = 33;BA.debugLine="Private btnundo As Button";
_btnundo = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private btnredo As Button";
_btnredo = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private cho As DirectoryChooser";
_cho = new anywheresoftware.b4j.objects.DirectoryChooserWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Dim save As FileChooser";
_save = new anywheresoftware.b4j.objects.FileChooserWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private Button2 As Button";
_button2 = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Dim mi As MenuItem";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private ComboBox2 As ComboBox";
_combobox2 = new anywheresoftware.b4j.objects.ComboBoxWrapper();
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public static String  _setstate(b4j.example.main._undodata _ud) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetState (ud As UndoData)";
 //BA.debugLineNum = 100;BA.debugLine="TextArea1.text = ud.Text";
_textarea1.setText(_ud.Text);
 //BA.debugLineNum = 101;BA.debugLine="ColorPicker1.SelectedColor = fx.Colors.From32Bit(";
_colorpicker1.setSelectedColor((javafx.scene.paint.Paint)(_fx.Colors.From32Bit(_ud.clr)));
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public static String  _textarea1_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub TextArea1_MouseClicked (EventData As MouseEven";
 //BA.debugLineNum = 138;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
 };
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public static String  _textarea1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub TextArea1_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 147;BA.debugLine="File.WriteString(dir,\"new.txt\",New)";
anywheresoftware.b4a.keywords.Common.File.WriteString(_dir,"new.txt",_new);
 //BA.debugLineNum = 148;BA.debugLine="File.WriteString(dir,\"old.txt\",Old)";
anywheresoftware.b4a.keywords.Common.File.WriteString(_dir,"old.txt",_old);
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return "";
}
public static String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub Timer1_Tick";
 //BA.debugLineNum = 152;BA.debugLine="manager.AddState(GetState) 'nothing will happen i";
_manager._addstate((Object)(_getstate()));
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
}
