Type=Class
Version=5.51
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'Class module
Sub Class_Globals
	Private fx As JFX
	Private frm As Form
	Private TextArea1 As TextArea
	Dim dir As String="C:\SmartOffice\core\data"
	Private SegmentedButton1 As SegmentedButton
	Private SegmentedButton2 As SegmentedButton
	Private SegmentedButton3 As SegmentedButton
	Private SegmentedButton4 As SegmentedButton
	Private sublist As List 
End Sub

Public Sub Initialize (Parent As Form)
	frm.Initialize("frm", 600dip, 800dip)
	frm.Title = "Html Viewer"
	frm.SetFormStyle("DECORATED")
	frm.RootPane.LoadLayout("2")
	frm.SetOwner(Parent)
	sublist=File.ReadList(dir,"setlist.txt")
	
End Sub

Sub read_file
	Dim text As String 
	For i = 0 To sublist.Size-1
		Log(sublist.Get(i))
		text=sublist.Get(i)
	Next
	frm.ShowAndWait 
	TextArea1.Text=File.ReadString(dir,"new.txt")
End Sub


Sub TextArea1_TextChanged (Old As String, New As String)
	If New <> "" Then 
	File.WriteString(dir,"new.txt",New)
	End If 
End Sub

Sub SegmentedButton4_ValueChanged (Value As String)
	
End Sub

Sub SegmentedButton3_ValueChanged (Value As String)
	
End Sub

Sub SegmentedButton2_ValueChanged (Value As String)
	
End Sub

Sub SegmentedButton1_ValueChanged (Value As String)
	
End Sub