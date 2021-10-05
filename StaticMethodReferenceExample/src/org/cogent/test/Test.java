package org.cogent.test;

import org.cogent.staticmethodreference.NoteClass;
import org.cogent.staticmethodreference.Noteable;

public class Test {
	
	public static void main(String[]args) {
		Noteable note=NoteClass::noteSomthing;
		note.note("lecture");
		
	}
	

}
