package b4j.example.designerscripts;
import anywheresoftware.b4a.BA;


public class LS_1{

public static void LS_general(anywheresoftware.b4j.objects.LayoutBuilder.LayoutData views, int width, int height, float scale) {
;
//BA.debugLineNum = 2;BA.debugLine="MenuBar1.Top=0dip"[1/General script]
views.get("menubar1").setTop((int)((0d * scale)));
//BA.debugLineNum = 3;BA.debugLine="MenuBar1.SetLeftAndRight(0dip,100%x)"[1/General script]
views.get("menubar1").setLeft((int)((0d * scale)));
views.get("menubar1").setPrefWidth((int)((100d / 100 * width) - ((0d * scale))));
//BA.debugLineNum = 4;BA.debugLine="edit.SetLeftAndRight(0dip,100%x)"[1/General script]
views.get("edit").setLeft((int)((0d * scale)));
views.get("edit").setPrefWidth((int)((100d / 100 * width) - ((0d * scale))));
//BA.debugLineNum = 5;BA.debugLine="Pane1.SetLeftAndRight(0dip,100%x)"[1/General script]
views.get("pane1").setLeft((int)((0d * scale)));
views.get("pane1").setPrefWidth((int)((100d / 100 * width) - ((0d * scale))));
//BA.debugLineNum = 6;BA.debugLine="Pane1.SetTopAndBottom(0dip,100%y)"[1/General script]
views.get("pane1").setTop((int)((0d * scale)));
views.get("pane1").setPrefHeight((int)((100d / 100 * height) - ((0d * scale))));
//BA.debugLineNum = 7;BA.debugLine="edit.SetTopAndBottom(40%y,100%y)"[1/General script]
views.get("edit").setTop((int)((40d / 100 * height)));
views.get("edit").setPrefHeight((int)((100d / 100 * height) - ((40d / 100 * height))));
//BA.debugLineNum = 8;BA.debugLine="ColorPicker1.Right=100%x"[1/General script]
views.get("colorpicker1").setLeft((int)((100d / 100 * width) - (views.get("colorpicker1").getPrefWidth())));
//BA.debugLineNum = 9;BA.debugLine="StatusBar1.Bottom=0dip"[1/General script]
views.get("statusbar1").setTop((int)((0d * scale) - (views.get("statusbar1").getPrefHeight())));
//BA.debugLineNum = 10;BA.debugLine="StatusBar1.Top=98%y"[1/General script]
views.get("statusbar1").setTop((int)((98d / 100 * height)));
//BA.debugLineNum = 11;BA.debugLine="StatusBar1.SetLeftAndRight(0dip,100%x)"[1/General script]
views.get("statusbar1").setLeft((int)((0d * scale)));
views.get("statusbar1").setPrefWidth((int)((100d / 100 * width) - ((0d * scale))));

}
}