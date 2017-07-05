package cfi.v2015;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import cfi.Category;
import cfi.CodeSet;

public class CFICodeSet extends CodeSet {


	public CFICodeSet() {
		super("CFI", "CFI Codeset");
		this.list = new ArrayList<Category>();
		list.add(new CategoryEEquity());
		list.add(new CategoryCCollectiveInvestmentVehicle());
		list.add(new CategoryDDebtInstrument());
		list.add(new CategoryREntitlementRights());
		list.add(new CategoryOOptions());
		list.add(new CategoryFFutures());
		list.add(new CategoryMMiscellaneous());
	}

	public static void main(String[] args) {
		
		//System.out.println("CFI" + String.format("%07d", 9));
		
		CodeSet cfiCodeSet = new CFICodeSet();
		File file = new File("cficodes.full.0629.txt");
		try {
			file.createNewFile();
			//cfiCodeSet.dumpINCLInsertStatement(file);
			//cfiCodeSet.dumpCodes(file);
			cfiCodeSet.dumpCodeDescription(file);
			//cfiCodeSet.dumpCodeDescription(file);
			System.out.println(cfiCodeSet.count());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
