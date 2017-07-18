Type=StaticCode
Version=5.51
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
	Private Mainfo As Form
End Sub

Sub AppStart (Form1 As Form, Args() As String)
	Mainfo=Form1
	Mainfo.SetFormStyle("DECORATED")
	Mainfo.Title="Html Code Viewer"
	Mainfo.WindowWidth = fx.PrimaryScreen.MaxX - fx.PrimaryScreen.MinX
	Mainfo.WindowLeft = fx.PrimaryScreen.MinX
	Mainfo.WindowHeight = fx.PrimaryScreen.MaxY - fx.PrimaryScreen.MinY
	Mainfo.WindowTop = fx.PrimaryScreen.MinY
	Mainfo.RootPane.LoadLayout("2") 'Load the layout file.
	Mainfo.Resizable=True
	Mainfo.Show
End Sub

Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Return True
End Sub