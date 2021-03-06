/**
 * @author Nikos Arechiga
 * @author Anuradha Vakil
 * Toyota InfoTechnology Center, USA
 * 465 N Bernardo Ave, Mountain View, CA 94043
 */
package dl.semantics;

import java.util.*;

import dl.syntax.*;

public class UpdateRuleList {

	ArrayList<UpdateRule> updateRuleList;

	public UpdateRuleList () {
		updateRuleList = new ArrayList<UpdateRule>();
	}

	public UpdateRuleList ( ArrayList<UpdateRule> updateRuleList ) {
		this.updateRuleList = updateRuleList;
	}

	public void add( UpdateRule valuation  ) {
		this.updateRuleList.add( valuation );
	}

	public void addAll( UpdateRuleList valuation  ) {
		this.updateRuleList.addAll( valuation.updateRuleList );
	}

	public UpdateRule get( int whichUpdateRule ) {
		return this.updateRuleList.get( whichUpdateRule );
	}

	public Iterator<UpdateRule> iterator () {
		return updateRuleList.iterator();
	}

	public int size() {
		return updateRuleList.size();
	}

	public String toString() {
		return updateRuleList.toString();
	}

	public UpdateRuleList clone() {
		UpdateRuleList newUpdateRuleList = new UpdateRuleList();

		Iterator<UpdateRule> valIterator = updateRuleList.iterator();

		UpdateRule thisUpdateRule;
		while( valIterator.hasNext() ) {
			thisUpdateRule = valIterator.next();
			newUpdateRuleList.add( thisUpdateRule.clone() );
		}

		return newUpdateRuleList;
	}

}
