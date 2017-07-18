package b4j.example.designerscripts;
import anywheresoftware.b4a.BA;


public class LS_2{

public static void LS_general(anywheresoftware.b4j.objects.LayoutBuilder.LayoutData views, int width, int height, float scale) {
;
views.get("textarea1").setLeft((int)((0d * scale)));
views.get("textarea1").setPrefWidth((int)((100d / 100 * width) - ((0d * scale))));
views.get("textarea1").setTop((int)((5d / 100 * height)));
views.get("textarea1").setPrefHeight((int)((100d / 100 * height) - ((5d / 100 * height))));
views.get("pane1").setTop((int)((0d * scale)));
views.get("pane1").setLeft((int)((0d * scale)));
views.get("pane1").setPrefWidth((int)((100d / 100 * width) - ((0d * scale))));

}
}