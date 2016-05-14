package matlab.syntax;

import dl.syntax.*;
import java.util.*;

public class MatlabConditional extends MatlabProgram {

	private final List<dLFormula> conditions;
	private final List<MatlabProgram> subPrograms;
	
	public MatlabConditional() {
		this.conditions = new ArrayList<>();
		this.subPrograms = new ArrayList<>();
	}
	
	public MatlabConditional( List<dLFormula> conditions, List<MatlabProgram> subPrograms) {
		this.conditions = conditions;
		this.subPrograms = subPrograms;
	}
	
	public MatlabConditional( dLFormula condition, MatlabProgram program ) {
		conditions = new ArrayList<>();
		conditions.add( condition );
		
		subPrograms = new ArrayList<>();
		subPrograms.add( program );
	}
	
	public List<dLFormula> getConditions() {
		return conditions;
	}
	
	public List<MatlabProgram> getPrograms() {
		return subPrograms;
	}
	
	public MatlabConditional appendCase( dLFormula condition, MatlabProgram program ) {
		
		List<dLFormula> newConditions = new ArrayList<>(); 
		newConditions.addAll( getConditions() );
		newConditions.add( condition );
		
		List<MatlabProgram> newPrograms = new ArrayList<>();
		newPrograms.addAll( getPrograms() );
		newPrograms.add( program );
		
		return new MatlabConditional( newConditions, newPrograms );
	}
	
	public MatlabConditional prependCase( dLFormula condition, MatlabProgram program ) {
		
		List<dLFormula> newConditions = new ArrayList<>(); 
		newConditions.add( condition );
		newConditions.addAll( getConditions() );

		List<MatlabProgram> newPrograms = new ArrayList<>();
		newPrograms.add( program );
		newPrograms.addAll( getPrograms() );

		return new MatlabConditional( newConditions, newPrograms );
	}
	
	public MatlabConditional replace( Replacement replacement ) {
		List<dLFormula> newConditions = new ArrayList<>();
		List<MatlabProgram> newPrograms = new ArrayList<>();
		
		for ( dLFormula condition : this.getConditions() ) {
			newConditions.add( condition.replace( replacement ));
		}
		for ( MatlabProgram program : this.getPrograms() ) {
			newPrograms.add( program.replace( replacement ));
		}
		
		return new MatlabConditional( newConditions, newPrograms );
	}
	
	
}