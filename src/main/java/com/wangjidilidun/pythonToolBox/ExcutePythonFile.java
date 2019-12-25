package com.wangjidilidun.pythonToolBox;

import org.python.util.PythonInterpreter;

public class ExcutePythonFile {
	public void executePyFile() {
		PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.exec("days=('mod','Tue','Wed','Thu','Fri','Sat','Sun'); ");
        interpreter.exec("print days[1];");
	}
}
