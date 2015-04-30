package org.core.syntax.expressions;

import org.core.env.Number;
import org.core.env.ValueEnvionment;
import org.core.syntax.Expression;

public class Variable extends Expression {
	
	private String name;
	
	public Variable(String name) {
		this.name = name;
	}
	
	@Override
	public Number eval() throws Exception {
		return ValueEnvionment.getValue(this.name);
	}

}
