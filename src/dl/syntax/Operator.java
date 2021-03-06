/**
 * @author Nikos Arechiga
 * @author Anuradha Vakil
 * Toyota InfoTechnology Center, USA
 * 465 N Bernardo Ave, Mountain View, CA 94043
 */
package dl.syntax;

import dl.semantics.*;

public class Operator {

	public String operator;
	public int arity;
	public boolean infix;

	public Operator () { }

	public Operator ( String operator ) {
		this.operator = operator.trim();
		this.arity = 2; //default
		this.infix = false; //default is prefix
	}

	public Operator ( String operator, boolean infix ) {
		this.operator = operator.trim();
		this.arity = 2;
		this.infix = infix;
	}

	public Operator ( String operator, int arity ) {
		this.operator = operator.trim();
		this.arity = arity;
		this.infix = false;
	}

	public Operator ( String operator, int arity, boolean infix ) {
		this.operator = operator.trim();
		this.arity = arity;
		this.infix = infix;
	}

	public Operator ( String operator, boolean infix, int arity ) {
		this.operator = operator.trim();
		this.arity = arity;
		this.infix = infix;
	}
	
	public Operator clone() {
		return new Operator( this.operator, this.arity, this.infix );
	}
	
	public boolean equals( Object otherObject ) {
		if ( otherObject instanceof Operator ) {
			return operator.equals( ((Operator)otherObject).operator );
//		} else if ( otherObject instanceof String ) {
//			return operator.equals( (String)otherObject );
		} else {
			return false;
		}
	}

	public int hashCode() {
		return operator.toString().hashCode();
	}


	public String toString() {
		return operator;
	}


	public String toManticoreString() {
		return operator;
	}

	public String toMathematicaString() {
		return operator;
	}

	public String todRealString() {
		return operator;
	}

}
